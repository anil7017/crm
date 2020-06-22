package com.tekorero.attendance.mapper;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.tekorero.attendance.model.AttendanceStatus;



public class AttendanceDetails {
	
	private LocalDate attendanceDate;
	private AttendanceStatus status;
	private LocalDateTime inTime;
	private LocalDateTime outTime;
	private Double totalTime;
	private LocalDateTime adjustedInTime;
	private LocalDateTime adjustedOutTime;
	private LocalDateTime adjustedTotalTime;
	private RegularizationReason regularizationReason;
	private String reasonForRejection;

	public AttendanceDetails() {}

	public AttendanceDetails(LocalDate attendanceDate, AttendanceStatus status, LocalDateTime inTime,
			LocalDateTime outTime, Double totalTime, LocalDateTime adjustedInTime, LocalDateTime adjustedOutTime,
			LocalDateTime adjustedTotalTime, RegularizationReason regularizationReason, String reasonForRejection) {
		super();
		this.attendanceDate = attendanceDate;
		this.status = status;
		this.inTime = inTime;
		this.outTime = outTime;
		this.totalTime = totalTime;
		this.adjustedInTime = adjustedInTime;
		this.adjustedOutTime = adjustedOutTime;
		this.adjustedTotalTime = adjustedTotalTime;
		this.regularizationReason = regularizationReason;
		this.reasonForRejection = reasonForRejection;
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

	public Double getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(Double totalTime) {
		this.totalTime = totalTime;
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

	public LocalDateTime getAdjustedTotalTime() {
		return adjustedTotalTime;
	}

	public void setAdjustedTotalTime(LocalDateTime adjustedTotalTime) {
		this.adjustedTotalTime = adjustedTotalTime;
	}

	public RegularizationReason getRegularizationReason() {
		return regularizationReason;
	}

	public void setRegularizationReason(RegularizationReason regularizationReason) {
		this.regularizationReason = regularizationReason;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

}
