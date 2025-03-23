package com.main.Lambda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class TimeExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Current time"+LocalTime.of(23,20));
		System.out.println("Current Date"+LocalDate.now());
		System.out.println("offsetDate"+OffsetDateTime.now());
		System.out.println("ZonedTime"+ZonedDateTime.now());
	}

}


