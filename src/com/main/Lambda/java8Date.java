package com.main.Lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class java8Date {

	public static void main(String[] args) {
		LocalDate date =  LocalDate.now();
		LocalTime time= LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("date "+ date);
		System.out.println("Time Now  "+ time);
		System.out.println("Date and time now  "+dateTime);
		
		ZonedDateTime ztime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(ztime);
		
		/*
		 * for(String s : TimeZone.getAvailableIDs()) { System.out.println(s);
		 * 
		 * }
		 */
		 
	}

}
