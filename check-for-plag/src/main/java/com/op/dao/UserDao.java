package com.op.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.op.Model.Tbl_institute_group;
import com.op.Model.Tbl_institute_list;
import com.op.Model.User;

public class UserDao {

	private String dburl = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String dbuname = "system";
	private String dbpassword = "welcome";
	private String dbdriver = "oracle.jdbc.driver.OracleDriver";

	static Connection con;

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {

		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public User checkLogin(String email, String password) throws SQLException, ClassNotFoundException {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "SELECT * FROM users WHERE email = ? and password = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, email);
		statement.setString(2, password);
		ResultSet result = statement.executeQuery();
		User user = null;
		if (result.next()) {
			user = new User();
			user.setFullname(result.getString("fullname"));
			user.setEmail(email);
		}
		con.close();
		return user;
	}

	public String userRegister(User user) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "insert into users(fullname,email,phone,smsalert,password) values(?,?,?,?,?)";
		String result = "Data Entered Successfully";
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, user.getFullname());
			ps.setString(2, user.getEmail());
			ps.setInt(3, user.getPhone());
			ps.setString(4, user.getSmsalert());
			ps.setString(5, user.getPassword());

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result = "Data Not Entered Successfully";
			e.printStackTrace();
		}
		return result;
	}

	public String institute_group_register(Tbl_institute_group institute_group) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "insert into tbl_institute_group(group_type, group_name, admin_name, group_email, username, group_password, total_uploads, status, sub_start_date, sub_end_date) values(?,?,?,?,?,?,?,?,?,?)";
		String result = "Data Entered Successfully";
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, institute_group.getGroup_type());
			ps.setString(2, institute_group.getGroup_name());
			ps.setString(3, institute_group.getAdmin_name());
			ps.setString(4, institute_group.getGroup_email());
			ps.setString(5, institute_group.getUsername());
			ps.setString(6, institute_group.getGroup_password());
			ps.setInt(7, institute_group.getTotal_uploads());
			ps.setString(8, institute_group.getStatus());
			ps.setString(9, institute_group.getSub_start_date());
			ps.setString(10, institute_group.getSub_end_date());

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result = "Data Not Entered Successfully";
			e.printStackTrace();
		}
		return result;
	}

	public String institute_list_register(Tbl_institute_list instituteList) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "insert into tbl_institute_list(ins_group, institute_name, tbl_arr_ins_name, ins_admin_email, username, password, admin_password, upload_count_type, no_of_users, max_upload, upload_per_login, images_path, submission_date, s_end_date, status) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String result = "Data Entered Successfully";
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, instituteList.getIns_group());
			ps.setString(2, instituteList.getInstitute_name());
			ps.setString(3, instituteList.getTbl_arr_ins_name());
			ps.setString(4, instituteList.getIns_admin_email());
			ps.setString(5, instituteList.getUsername());
			ps.setString(6, instituteList.getPassword());
			ps.setString(7, instituteList.getAdmin_password());
			/*
			 * ps.setString(8, instituteList.getQuotes_exclude()); ps.setString(9,
			 * instituteList.getExclude()); ps.setString(10, instituteList.getApplied());
			 * ps.setString(11, instituteList.getExc_less_one());
			 */
			ps.setString(8, instituteList.getUpload_count_type());
			ps.setInt(9, instituteList.getNo_of_users());
			ps.setInt(10, instituteList.getMax_upload());
			ps.setInt(11, instituteList.getUpload_per_login());
			/*
			 * ps.setString(16, instituteList.getTotal_uploads()); ps.setInt(17,
			 * instituteList.getMax_img_uploads()); ps.setInt(18,
			 * instituteList.getTotal_img_uploads());
			 */
			ps.setString(12, instituteList.getImages_path());
			ps.setString(13, instituteList.getSubmission_date());
			ps.setString(14, instituteList.getS_end_date());
			ps.setString(15, instituteList.getStatus());

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result = "Data Not Entered Successfully";
			e.printStackTrace();
		}
		return result;
	}

}
