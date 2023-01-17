package com.op.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.op.Model.Tbl_institute_group;
import com.op.Model.Tbl_institute_list;
import com.op.dao.UserDao;

/**
 * Servlet implementation class InstituteListRegister
 */

@WebServlet(name = "InstituteListRegister", urlPatterns = { "/instituteListRegister" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
		maxFileSize = 1024 * 1024 * 10, // 10 MB
		maxRequestSize = 1024 * 1024 * 100 // 100 MB
)
public class InstituteListRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InstituteListRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String ins_group = request.getParameter("ins_group");
		String institute_name = request.getParameter("institute_name");
		String tbl_arr_ins_name = request.getParameter("tbl_arr_ins_name");
		String ins_admin_email = request.getParameter("ins_admin_email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String admin_password = request.getParameter("admin_password");
		/*
		 * String quotes_exclude = request.getParameter("quotes_exclude"); String
		 * exclude = request.getParameter("exclude"); String applied =
		 * request.getParameter("applied"); String exc_less_one =
		 * request.getParameter("exc_less_one");
		 */
		String upload_count_type = request.getParameter("upload_count_type");
		int no_of_users = Integer.parseInt(request.getParameter("no_of_users"));
		int max_upload = Integer.parseInt(request.getParameter("max_upload"));
		int upload_per_login = Integer.parseInt(request.getParameter("upload_per_login"));
		/*
		 * String total_uploads = request.getParameter("total_uploads"); int
		 * max_img_uploads = Integer.parseInt(request.getParameter("max_img_uploads"));
		 * int total_img_uploads =
		 * Integer.parseInt(request.getParameter("total_img_uploads"));
		 */
		Part images_path = request.getPart("images_path");
		String submission_date = request.getParameter("submission_date");
		String s_end_date = request.getParameter("s_end_date");
		String status = request.getParameter("status");

		String fileName = images_path.getSubmittedFileName();
		for (Part part : request.getParts()) {
			part.write("F:\\upload\\" + fileName);
		}
		// response.getWriter().print("The file uploaded sucessfully.");

		Tbl_institute_list instituteList = new Tbl_institute_list(ins_group, institute_name, tbl_arr_ins_name,
				ins_admin_email, username, password, admin_password, upload_count_type, no_of_users, max_upload,
				upload_per_login, fileName, submission_date, s_end_date, status);
		UserDao dao = new UserDao();
		String result = dao.institute_list_register(instituteList);
		response.getWriter().println(result);

	}

}
