package com.supplier;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SupplierInsert")
public class SupplierInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String fname= request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String mobile = request.getParameter("mobile");
		String cname = request.getParameter("companyname");
		String cid = request.getParameter("companyID");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = SupplierDBUtil.insertSupplier(fname, lname, mobile, cname, cid, email, password);
		
		if(isTrue == true) {
			/*RequestDispatcher dis = request.getRequestDispatcher("supplierlogin.jsp");
			dis.forward(request, response); */
			out.println("<script type='text/javascript'>");
			out.println("alert('account created successfully')");
			out.println("location = 'supplierlogin.jsp'");
			out.println("</script>");
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
