package com.tekorero.attendance.mapper;

import java.util.Date;

public class UserDetails {
	
	private String firstName;
	private String middelName;
	private String lastName;
	private String emailId;
	private String phoneNumber;
	private String alternateMobileNumber;
	private Long psNumber;
	private String immediateSupervisorName;
	private String immediateSupervisorPsNo;
	private String nextSupervisorName;
	private String nextSupervisorPsNo;
	private Date dateOfJoin;
	private String govIdNo;
	private String govIdType;
	private String profileImageUrl;
	private String designation;
	private String employeesGrade;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddelName() {
		return middelName;
	}

	public void setMiddelName(String middelName) {
		this.middelName = middelName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}

	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}

	public Long getPsNumber() {
		return psNumber;
	}

	public void setPsNumber(Long psNumber) {
		this.psNumber = psNumber;
	}

	public String getImmediateSupervisorName() {
		return immediateSupervisorName;
	}

	public void setImmediateSupervisorName(String immediateSupervisorName) {
		this.immediateSupervisorName = immediateSupervisorName;
	}

	public String getImmediateSupervisorPsNo() {
		return immediateSupervisorPsNo;
	}

	public void setImmediateSupervisorPsNo(String immediateSupervisorPsNo) {
		this.immediateSupervisorPsNo = immediateSupervisorPsNo;
	}

	public String getNextSupervisorName() {
		return nextSupervisorName;
	}

	public void setNextSupervisorName(String nextSupervisorName) {
		this.nextSupervisorName = nextSupervisorName;
	}

	public String getNextSupervisorPsNo() {
		return nextSupervisorPsNo;
	}

	public void setNextSupervisorPsNo(String nextSupervisorPsNo) {
		this.nextSupervisorPsNo = nextSupervisorPsNo;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getGovIdNo() {
		return govIdNo;
	}

	public void setGovIdNo(String govIdNo) {
		this.govIdNo = govIdNo;
	}

	public String getGovIdType() {
		return govIdType;
	}

	public void setGovIdType(String govIdType) {
		this.govIdType = govIdType;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmployeesGrade() {
		return employeesGrade;
	}

	public void setEmployeesGrade(String employeesGrade) {
		this.employeesGrade = employeesGrade;
	}

}
