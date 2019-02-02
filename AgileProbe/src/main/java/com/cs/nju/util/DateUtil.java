/**
 * created by 2010-7-2
 */
package com.cs.nju.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * ζ₯ζε·₯ε·η±?
 * 
 */
public class DateUtil {
	/**
	 * θ·εεδΈε€©ηζ₯ζ
	 * @return
	 */
	public static String getYesterday(){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE,-1);
		Date time=cal.getTime();
		return (new SimpleDateFormat("yyyyMMdd").format(time));
	}
	public static String getShortDate(String date){
		StringTokenizer st = new StringTokenizer(date, "-");
		String shortDate = "";
		while(st.hasMoreTokens()){
			shortDate +=st.nextToken();
		}
		return shortDate;
	}


}