package com.op.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.op.Model.Tbl_institute_group;
import com.op.Model.User;
import com.op.dao.UserDao;

/**
 * Servlet implementation class InstituteGroupRegister
 */
@WebServlet("/instituteGroupRegister")
public class InstituteGroupRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InstituteGroupRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String group_type = request.getParameter("group_type");
		String group_name = request.getParameter("group_name");
		String admin_name = request.getParameter("admin_name");
		String group_email = request.getParameter("group_email");
		String username = request.getParameter("username");
		String group_password = request.getParameter("group_password");
		int total_uploads = Integer.parseInt(request.getParameter("total_uploads"));
		String status = request.getParameter("status");
		String sub_start_date = request.getParameter("sub_start_date");
		String sub_end_date = request.getParameter("sub_end_date");

		Tbl_institute_group institute_group = new Tbl_institute_group(group_type, group_name, admin_name, group_email,
				username, group_password, total_uploads, status, sub_start_date, sub_end_date);
		UserDao dao = new UserDao();
		String result = dao.institute_group_register(institute_group);
		response.getWriter().println(result);
	}
}
