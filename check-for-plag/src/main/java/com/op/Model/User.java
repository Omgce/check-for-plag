package com.op.Model;

public class User {

	private int id;
	private String fullname;
	private String email;
	private int phone;
	private String smsalert;
	private String password;

	public User() {

	}

	public User(String fullname, String email, int phone, String smsalert, String password) {

		this.fullname = fullname;
		this.email = email;
		this.phone = phone;
		this.smsalert = smsalert;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getSmsalert() {
		return smsalert;
	}

	public void setSmsalert(String smsalert) {
		this.smsalert = smsalert;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
