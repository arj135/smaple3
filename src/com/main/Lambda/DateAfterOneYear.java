package com.main.Lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateAfterOneYear {

	public static void main(String[] args) {
		/*
		 * Date d=new Date(2018,9,21); Date d2=new Date(1997,3,10);
		 * System.out.println("Date 'd' is after Date 'd2' : "+d.after(d2));
		 */ 

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");

        String date = "16-Aug-2021";

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);  //default, print ISO_LOCAL_DATE

        System.out.println(formatter.format(localDate)); // print formatter date

        LocalDate nextYear = localDate.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);
  		
        
        LocalDate currentDate =LocalDate.now();
        LocalDate currentDateMinus1year=currentDate.minusYears(1);
        
        if(localDate.isBefore(currentDateMinus1year)) {
        	System.out.println("date is older than one year");
        }
	}

}
