package com.demo.demo.entity;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne( optional = false)
    @JoinColumn(name = "user_id", nullable = false,referencedColumnName = "id")
	private User user;	

	private Instant fromDate;

	private Instant toDate;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}
	

	public Booking(Integer id, User user, Instant fromDate, Instant toDate) {
		super();
		this.id = id;
		this.user = user;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	
	public Booking( User user, Instant fromDate, Instant toDate) {
		super();
		this.user = user;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}


	public Integer getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public Instant getFromDate() {
		return fromDate;
	}

	public Instant getToDate() {
		return toDate;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setFromDate(Instant fromDate) {
		this.fromDate = fromDate;
	}

	public void setToDate(Instant toDate) {
		this.toDate = toDate;
	}
	
	

}
