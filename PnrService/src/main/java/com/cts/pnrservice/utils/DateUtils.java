package com.cts.pnrservice.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	public static String getFormattedCurrentDate() throws ParseException {
        Date dateNow = new Date();
        SimpleDateFormat dtFormat = new SimpleDateFormat("YYYYMMDD");
        return dtFormat.format(dateNow);
	}
	
	public static Date getDateMMDDYYYY(String dateStr)throws Exception {
        Date date = null;
        try {
                        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
                        if (dateStr != null) {
                                        date = formatter.parse(dateStr);
                        }
        } catch (Exception e) {
                        throw e;
        }
        return date;
	}
	
	public static String getDateStringMMDDYYYY(Date date)throws Exception{
        String dateStr = null;
        try {
                        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
                        if (date != null) {
                                        dateStr = formatter.format(date);
                        }
        } catch (Exception e) {
        	 throw e;
        }
        return dateStr;
	}
	
	public static int compareDates(Date date) throws Exception{
        int result = 0;
        try {
                        result = date.compareTo(new Date());
        } catch (Exception e) {
        	 throw e;
        }
        return result;
	}
	
	public static java.sql.Timestamp getSqlTimeStampFromMMDDYYYY(String dateStr)throws Exception {
        java.sql.Timestamp timeStamp = null;
        try {
                        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
                        if (dateStr != null) {
                                        timeStamp = new java.sql.Timestamp(formatter.parse(dateStr)
                                                                        .getTime());
                        }
        } catch (Exception e) {
        	 throw e;
        }
        return timeStamp;
	}
	
	public static java.sql.Timestamp convertDateToSqlTimeStamp(Date date) throws Exception{
        java.sql.Timestamp timeStamp = null;
        try {
                        if (date != null) {
                                        timeStamp = new java.sql.Timestamp(date.getTime());
                        }
        } catch (Exception e) {
        	throw e;
        }
        return timeStamp;
	}
}
