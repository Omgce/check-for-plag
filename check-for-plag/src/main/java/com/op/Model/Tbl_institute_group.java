package com.op.Model;

public class Tbl_institute_group {
	
	private int id;
	private String group_type;
	private String group_name;
	private String admin_name;
	private String group_email;
	private String username;
	private String group_password;
	private int total_uploads;
	private String status;
	private String sub_start_date;
	private String sub_end_date;
	//private String createdAt;
	public Tbl_institute_group() {
		
	}
	public Tbl_institute_group( String group_type, String group_name, String admin_name, String group_email,
			String username, String group_password, int total_uploads, String status, String sub_start_date,
			String sub_end_date) {
		
		this.group_type = group_type;
		this.group_name = group_name;
		this.admin_name = admin_name;
		this.group_email = group_email;
		this.username = username;
		this.group_password = group_password;
		this.total_uploads = total_uploads;
		this.status = status;
		this.sub_start_date = sub_start_date;
		this.sub_end_date = sub_end_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroup_type() {
		return group_type;
	}
	public void setGroup_type(String group_type) {
		this.group_type = group_type;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getGroup_email() {
		return group_email;
	}
	public void setGroup_email(String group_email) {
		this.group_email = group_email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGroup_password() {
		return group_password;
	}
	public void setGroup_password(String group_password) {
		this.group_password = group_password;
	}
	
	public int getTotal_uploads() {
		return total_uploads;
	}
	public void setTotal_uploads(int total_uploads) {
		this.total_uploads = total_uploads;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSub_start_date() {
		return sub_start_date;
	}
	public void setSub_start_date(String sub_start_date) {
		this.sub_start_date = sub_start_date;
	}
	public String getSub_end_date() {
		return sub_end_date;
	}
	public void setSub_end_date(String sub_end_date) {
		this.sub_end_date = sub_end_date;
	}
	
}
