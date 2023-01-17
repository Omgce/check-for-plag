package com.op.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserLogout
 */
@WebServlet("/logout")
public class UserLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserLogout() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession(false);
		System.out.println(session);
		if (session != null) {
			session.removeAttribute("user");

			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
	
//		if(session.getAttribute("user") != null) {
//			session.removeAttribute("user");
//				response.sendRedirect("login.jsp");
//		}
		
	}

}
