package com.cs.nju.hdfs;

import java.io.IOException;
import java.net.URI;

import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HDFSWriter {
	FileSystem fs;
	String ip;

	public HDFSWriter(String ip) {
		this.ip = ip;
		System.out.println("start initial filesystem.ip is "+ip);
		init(ip);
	}

	public void init(String ip) {
		// 读取classpath下的xxx-site.xml 配置文件，并解析其内容，封装到conf对象中
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://localhost:9000/");

		// 根据配置信息，去获取一个具体文件系统的客户端操作实例对象
		try {
			fs = FileSystem.get(new URI(ip), conf, "hadoop");
		} catch (Exception e) {
			System.out.println("hdfs init fail!"+e);
		}
	}
	
	public void write(String msg) {
		long now = System.currentTimeMillis();
		try {
			String filename = ip+"/checkpoint/"+now+".txt";
			Path dst = new Path(filename);
			FSDataOutputStream os = fs.create(dst);
			IOUtils.write(msg, os, "utf-8");
			
		} catch (Exception e) {
			System.out.println("write hdfs file failure:"+e);
		}
		
	}
}
