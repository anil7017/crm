package com.tekorero.attendance.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity(name="attendance_details")
public class AttendanceDetails {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "attendance_date")
	private LocalDate attendanceDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private AttendanceStatus status;
	
	@Column(name = "in_time")
	private LocalDateTime inTime;
	
	@Column(name = "out_time")
	private LocalDateTime outTime;
	
	@Column(name = "total_time")
	private Double totalTime;
	
	@Column(name = "adjusted_in_time")
	private LocalDateTime adjustedInTime;
	
	@Column(name = "adjusted_out_time")
	private LocalDateTime adjustedOutTime;
	
	@Column(name = "adjusted_total_time")
	private LocalDateTime adjustedTotalTime;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "regularization_reason")
	private RegularizationReason regularizationReason;
	
	@Column(name = "reason_for_rejection")
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
