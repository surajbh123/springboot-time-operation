package com.demo.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String email;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(Integer id, String email) {
		super();
		this.id = id;
		this.email = email;
	}
	
	
	public User( String email) {
		this.email = email;
	}


	public Integer getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
