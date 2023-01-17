package com.op.Model;

public class Tbl_institute_list {

	private int institute_id;
	private String ins_group;
	private String institute_name;
	private String tbl_arr_ins_name;
	private String ins_admin_email;
	private String username;
	private String password;
	private String admin_password;
	/*
	 * private String quotes_exclude; private String exclude; private String
	 * applied; private String exc_less_one;
	 */
	private String upload_count_type;
	private int no_of_users;
	private int max_upload;
	private int upload_per_login;
//	private String total_uploads;
//	private int max_img_uploads;
//	private int total_img_uploads;
	private String images_path;
	private String submission_date;
	private String s_end_date;
	private String status;

	public Tbl_institute_list() {

	}

	public Tbl_institute_list(String ins_group, String institute_name, String tbl_arr_ins_name, String ins_admin_email,
			String username, String password, String admin_password, String upload_count_type, int no_of_users,
			int max_upload, int upload_per_login, String images_path, String submission_date, String s_end_date,
			String status) {

		this.ins_group = ins_group;
		this.institute_name = institute_name;
		this.tbl_arr_ins_name = tbl_arr_ins_name;
		this.ins_admin_email = ins_admin_email;
		this.username = username;
		this.password = password;
		this.admin_password = admin_password;
		this.upload_count_type = upload_count_type;
		this.no_of_users = no_of_users;
		this.max_upload = max_upload;
		this.upload_per_login = upload_per_login;
		this.images_path = images_path;
		this.submission_date = submission_date;
		this.s_end_date = s_end_date;
		this.status = status;
	}

	public int getInstitute_id() {
		return institute_id;
	}

	public void setInstitute_id(int institute_id) {
		this.institute_id = institute_id;
	}

	public String getIns_group() {
		return ins_group;
	}

	public void setIns_group(String ins_group) {
		this.ins_group = ins_group;
	}

	public String getInstitute_name() {
		return institute_name;
	}

	public void setInstitute_name(String institute_name) {
		this.institute_name = institute_name;
	}

	public String getTbl_arr_ins_name() {
		return tbl_arr_ins_name;
	}

	public void setTbl_arr_ins_name(String tbl_arr_ins_name) {
		this.tbl_arr_ins_name = tbl_arr_ins_name;
	}

	public String getIns_admin_email() {
		return ins_admin_email;
	}

	public void setIns_admin_email(String ins_admin_email) {
		this.ins_admin_email = ins_admin_email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public String getUpload_count_type() {
		return upload_count_type;
	}

	public void setUpload_count_type(String upload_count_type) {
		this.upload_count_type = upload_count_type;
	}

	public int getNo_of_users() {
		return no_of_users;
	}

	public void setNo_of_users(int no_of_users) {
		this.no_of_users = no_of_users;
	}

	public int getMax_upload() {
		return max_upload;
	}

	public void setMax_upload(int max_upload) {
		this.max_upload = max_upload;
	}

	public int getUpload_per_login() {
		return upload_per_login;
	}

	public void setUpload_per_login(int upload_per_login) {
		this.upload_per_login = upload_per_login;
	}

	public String getImages_path() {
		return images_path;
	}

	public void setImages_path(String images_path) {
		this.images_path = images_path;
	}

	public String getSubmission_date() {
		return submission_date;
	}

	public void setSubmission_date(String submission_date) {
		this.submission_date = submission_date;
	}

	public String getS_end_date() {
		return s_end_date;
	}

	public void setS_end_date(String s_end_date) {
		this.s_end_date = s_end_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
