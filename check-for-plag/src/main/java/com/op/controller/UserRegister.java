package com.op.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.op.Model.User;
import com.op.dao.UserDao;

/**
 * Servlet implementation class UserRegister
 */
@WebServlet("/userRegister")
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String smsalert = request.getParameter("smsalert");
		String password = request.getParameter("password");

		User user = new User(fullname, email, phone, smsalert, password);
		UserDao dao = new UserDao();
		String result = dao.userRegister(user);
		response.getWriter().println(result);

	}

}
