package com.yeyintlwin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * This is the test area of Ye.
 * */
public class Main {

	public static void main(String[] args) {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		System.out.println(dateFormat.format(calendar.getTime()));
		// add comment
	}

}
