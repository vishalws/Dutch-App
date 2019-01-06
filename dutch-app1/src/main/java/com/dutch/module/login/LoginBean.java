package com.dutch.module.login;

import java.util.Date;

public class LoginBean {
private int id;
private String email;
private String password;
private int roll;
private int active;
private String first_name;
private String last_name;
private String mobile_number;
private Date created_date;
private Date modified_date;

public LoginBean(int id, String email, String password, int roll, int active, String first_name, String last_name,
		String mobile_number, Date created_date, Date modified_date) {
	super();
	this.id = id;
	this.email = email;
	this.password = password;
	this.roll = roll;
	this.active = active;
	this.first_name = first_name;
	this.last_name = last_name;
	this.mobile_number = mobile_number;
	this.created_date = created_date;
	this.modified_date = modified_date;
}
public LoginBean() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getMobile_number() {
	return mobile_number;
}
public void setMobile_number(String mobile_number) {
	this.mobile_number = mobile_number;
}
public Date getCreated_date() {
	return created_date;
}
public void setCreated_date(Date created_date) {
	this.created_date = created_date;
}
public Date getModified_date() {
	return modified_date;
}
public void setModified_date(Date modified_date) {
	this.modified_date = modified_date;
}
@Override
public String toString() {
	return "LoginBean [id=" + id + ", email=" + email + ", password=" + password + ", roll=" + roll + ", active="
			+ active + ", first_name=" + first_name + ", last_name=" + last_name + ", mobile_number=" + mobile_number
			+ ", created_date=" + created_date + ", modified_date=" + modified_date + "]";
}

}
