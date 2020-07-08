package com.tekorero.attendance.mapper;

import java.time.LocalDate;

public class HolidayMapper {

	private String name;
	private Integer holidayDuration;
	private LocalDate startDate;
	private LocalDate endDate;
	private boolean occurrence;
	private Religion religion;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHolidayDuration() {
		return holidayDuration;
	}

	public void setHolidayDuration(Integer holidayDuration) {
		this.holidayDuration = holidayDuration;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public boolean isOccurrence() {
		return occurrence;
	}

	public void setOccurrence(boolean occurrence) {
		this.occurrence = occurrence;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

}
