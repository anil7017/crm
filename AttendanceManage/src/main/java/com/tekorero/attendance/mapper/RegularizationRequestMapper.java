package com.tekorero.attendance.mapper;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class RegularizationRequestMapper {

	private String psNo;
	private LocalDate attendanceDate;
	private AttendanceStatus status;
	private LocalDateTime inTime;
	private LocalDateTime outTime;
	private AttendanceStatus overAllStatus;
	private RegularizationReason regularizationReason;
	private LocalDateTime adjustedInTime;
	private LocalDateTime adjustedOutTime;

	public RegularizationRequestMapper() {
		super();
	}

	public String getPsNo() {
		return psNo;
	}

	public void setPsNo(String psNo) {
		this.psNo = psNo;
	}

	public LocalDate getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(LocalDate attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public AttendanceStatus getStatus() {
		return status;
	}

	public void setStatus(AttendanceStatus status) {
		this.status = status;
	}

	public LocalDateTime getInTime() {
		return inTime;
	}

	public void setInTime(LocalDateTime inTime) {
		this.inTime = inTime;
	}

	public LocalDateTime getOutTime() {
		return outTime;
	}

	public void setOutTime(LocalDateTime outTime) {
		this.outTime = outTime;
	}

	public AttendanceStatus getOverAllStatus() {
		return overAllStatus;
	}

	public void setOverAllStatus(AttendanceStatus overAllStatus) {
		this.overAllStatus = overAllStatus;
	}

	public RegularizationReason getRegularizationReason() {
		return regularizationReason;
	}

	public void setRegularizationReason(RegularizationReason regularizationReason) {
		this.regularizationReason = regularizationReason;
	}

	public LocalDateTime getAdjustedInTime() {
		return adjustedInTime;
	}

	public void setAdjustedInTime(LocalDateTime adjustedInTime) {
		this.adjustedInTime = adjustedInTime;
	}

	public LocalDateTime getAdjustedOutTime() {
		return adjustedOutTime;
	}

	public void setAdjustedOutTime(LocalDateTime adjustedOutTime) {
		this.adjustedOutTime = adjustedOutTime;
	}

}
