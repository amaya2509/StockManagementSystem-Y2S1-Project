package com.supplier;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//fetch data from user login
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isTrue;
		
		isTrue = SupplierDBUtil.validate(username, password);
		
		if(isTrue == true) {
			List<Supplier> supDetails = SupplierDBUtil.getSupplier(username);
			request.setAttribute("supDetails", supDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("supplieraccount.jsp");
			dis.forward(request, response);
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('invalid username or password')");
			out.println("location = 'supplierlogin.jsp'");
			out.println("</script>");
		}
		
	}
	

}
