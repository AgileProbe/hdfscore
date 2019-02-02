package com.cs.nju.controller;


import com.alibaba.fastjson.JSON;
import com.cs.nju.entity.Data;
import com.cs.nju.entity.DataGroup;
import com.cs.nju.hdfs.HDFSWriter;
import com.cs.nju.kafka.consumer.KafkaConsumerForHive;
import com.cs.nju.kafka.consumer.KafkaConsumers;
import com.cs.nju.kafka.producer.KafkaProducerForHive;
import com.cs.nju.kafka.producer.KafkaProducers;
import com.cs.nju.service.DataUploadService;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lch on 2017/5/3.
 */
@Controller
public class DataUploadController {
	@Autowired
	private DataUploadService dataUploadService;
	private static HDFSWriter Writer = new HDFSWriter("localhost:9000");
	@Resource(name = "kafkaProducers")
	KafkaProducers producers;
	@Resource(name = "kafkaConsumers")
	KafkaConsumers consumers;

	@Resource(name = "kafkaProducerForHive")
	KafkaProducerForHive producerForHive;
	@Resource(name = "kafkaConsumerForHive")
	KafkaConsumerForHive consumerForHive;

	/**
	 * @Name upload 鎺㈤拡涓婁紶鏁版嵁鎺ュ彛
	 * @param json
	 *            鎺ュ彈鐨勬暟鎹被鍨�?
	 * @describe 鎺ュ彈鎺㈤拡涓婁紶鐨勬暟鎹紝鐒跺悗灏嗘暟鎹繘琛岃ˉ鍏ㄤ究浜庡悗鏈熷垎鏋愶紝 鍚屾椂琛ュ叏鍚庣殑鏁版嵁鍒嗗彂鐨刱afka涓�
	 *
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object upload(@RequestBody String json) {
		System.out.println("-----------------<>");
		List<Data> dataList = new ArrayList<Data>();
		DataGroup group;
		String ujson = "";
		String res = "";

		try {
			ujson = new String(json.getBytes("ISO-8859-1"), "utf-8");
			res = URLDecoder.decode(ujson, "UTF-8");

			try {
				group = JSON.parseObject(res, DataGroup.class);
				dataList = group.getData();

				if (group.getAddr() == null) {
					group.setLat("30.55836");
					group.setLon("104.00285");
					group.setAddr("鍥涘窛鐪佹垚閮藉競鍙屾祦鍖哄窛澶ц�?2娈靛洓宸濆ぇ瀛︽睙�?�夋牎鍖鸿绠楁�?瀛﹂�?");
				}

				// System.err.println("resdata ---> " + JSON.toJSONString(group));

				for (Data data1 : dataList) {

					if (data1.getRouter() == null) {
						data1.setRouter("");
					}
					if (data1.getTc() == null) {
						data1.setTc("");
					}
					if (data1.getDs() == null) {
						data1.setDs("");
					}
					if (data1.getTs() == null) {
						data1.setTc("");
					}
					if (data1.getTmc() == null) {
						data1.setTmc("");
					}
				}
				dataUploadService.saveObject(group);
				String resJson = JSON.toJSONString(group);

				System.err.println("resJson ---> " + StringEscapeUtils.escapeJava(resJson));
				Writer.write(resJson);
				//producers.sendMessage(resJson);// 鍙戦�佹暟鎹埌kafka topic : test,杩涜鏁版嵁鍒嗘�?
				// producerForHive.sendMessage(resJson);//鍙戦�佹暟鎹埌topic : hiveData,瀛樻斁鍒癶ive涓�

			} catch (Exception e) {
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return "";
	}

	@RequestMapping(value = "/sendmessage", method = RequestMethod.POST)
	public ModelAndView sendMessage() {
		System.out.println("--------sendmessage--------");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(date);

		ModelAndView mv = new ModelAndView();
		mv.addObject("time", now);
		mv.setViewName("kafka_send");
		return mv;
	}

	@RequestMapping(value = "/receive", method = RequestMethod.GET)
	public ModelAndView receive() throws Exception {
		System.err.println("--------------> receive <----------------");
		List<String> msg = new ArrayList<String>();
		msg = consumers.receive();
		String msg1 = consumerForHive.receive();
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", msg);
		mv.setViewName("kafka_receive");
		return mv;
	}

}
