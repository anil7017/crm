package com.tekorero.attendance.controller;

import java.time.Month;
import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendanceDataPushController {

	public ResponseEntity<?> getSingleDayData(Date date){
		// return one day data for all employee 
		return null;
	}
	
	public ResponseEntity<?> getSingleMonthData(Integer year ,Integer month){
		// return one day data for single employee 
		return null;
	}		
}
