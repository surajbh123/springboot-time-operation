package com.demo.demo.controller;

import java.time.Instant;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.demo.demo.entity.User;

public class BookingDto {



	private Integer userId;	

	private Instant fromDate;

	private Instant toDate;

	
	
	public BookingDto() {
		super();
	}

	public BookingDto(Integer userId, Instant fromDate, Instant toDate) {
		super();
		this.userId = userId;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public Instant getFromDate() {
		return fromDate;
	}

	public Instant getToDate() {
		return toDate;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setFromDate(Instant fromDate) {
		this.fromDate = fromDate;
	}

	public void setToDate(Instant toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "BookingDto [userId=" + userId + ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
	
	
}
