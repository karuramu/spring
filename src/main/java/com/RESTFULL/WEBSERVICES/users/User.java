package com.RESTFULL.WEBSERVICES.users;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class User {
	private Integer id;
	@Size(min = 2)
	private String name;
	@Past
	private Date dateofbirth;
		protected User() {
			
		}
	public User(Integer id, String name, Date dateofbirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateofbirth = dateofbirth;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dateofbirth=" + dateofbirth + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

}
