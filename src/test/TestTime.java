package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016年4月8日 上午9:21:10
 * <p>
 * Company: 苏州宽连信息技术有限公司
 * <p>
 * @author luhy@c-platform.com
 * @version 1.0.0
 */
public class TestTime {
	
	/**
     * main函数.
     * @param args
     *            启动参数
     * @throws Exception
     *             Exception
     */
    public static void main(String... args) throws Exception {
	    while (true) {
	    	Calendar time = Calendar.getInstance();
	    	DateFormat myDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:ss");
	    	Date newDate = myDateFormat.parse("2016-04-07 23:14:22:24");
	    	
	    	Calendar cal = Calendar.getInstance();
	    	cal.add(Calendar.DATE, -1);
	    	Date date = cal.getTime();
	    	String yesterday = new SimpleDateFormat("yyyyMMdd").format(date);
	    	//System.out.println(newDate);
	    	
	    	System.out.println(yesterday);
//	    	int miltime = time.get(14);
//	    	int second = time.get(13);
//	    	int minute = time.get(12);
//	    	int hour = time.get(11);
//	    	int day = time.get(5);
//	    	int month = time.get(2) + 1;
//	    	int year = time.get(1);
	    	Thread.sleep(1000);
//	    	System.out.print("@YEAR:" + time.get(Calendar.YEAR));
//	    	System.out.print("@MONTH:" + (time.get(Calendar.MONTH) + 1));
//	    	System.out.println("@DATE:" + time.get(Calendar.DATE));
//	    	System.out.print("@HOUR:" + time.get(Calendar.HOUR));
//	    	System.out.print("@HOUR_OF_DAY:" + time.get(Calendar.HOUR_OF_DAY));
//	    	System.out.print("@MINUTE:" + time.get(Calendar.MINUTE));
//	    	System.out.println("@SECOND:" + time.get(Calendar.SECOND));
//	    	System.out.print("@MILLISECOND:" + time.get(Calendar.MILLISECOND));
//	    	System.out.print("@WEEK_OF_MONTH:" + time.get(Calendar.WEEK_OF_MONTH));
//	    	System.out.print("@WEEK_OF_YEAR:" + time.get(Calendar.WEEK_OF_YEAR));
//	    	System.out.print("@DAY_OF_WEEK:" + time.get(Calendar.DAY_OF_WEEK));
	    	
//	    	System.out.print(year + "年");
//	    	System.out.print("@3:" + time.get(3));
//	    	System.out.print("@4:" + time.get(4));
//	    	System.out.print(month + "月");
//	    	System.out.print("@6:" + time.get(6));
//	    	System.out.print("@7:" + time.get(7));
//	    	System.out.print(day + "日");
//	    	System.out.print(hour + ":");
//	    	System.out.print(minute + ":");
//	    	System.out.print(second + ":");
//	    	System.out.println(miltime);
	    	
        }
    }

}
