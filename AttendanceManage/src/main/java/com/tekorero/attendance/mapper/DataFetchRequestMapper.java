package com.tekorero.attendance.mapper;

public class DataFetchRequestMapper {

	private String psNo;
	private Integer year;
	private Integer month;

	public DataFetchRequestMapper() {
		super();
	}

	public String getPsNo() {
		return psNo;
	}

	public void setPsNo(String psNo) {
		this.psNo = psNo;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}
}
