package com.supplier;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/UpdateSupplierServlet")
public class UpdateSupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String id = request.getParameter("supid");
		String firstname = request.getParameter("fname");
		String lastname = request.getParameter("lname");
		String mobile = request.getParameter("mobile");
		String companyName = request.getParameter("cname");
		String companyID = request.getParameter("cid");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = SupplierDBUtil.updateSupplier(id, firstname, lastname, mobile, companyName, companyID, email, password);
		
		if(isTrue == true) {
			
			List<Supplier> supDetails = SupplierDBUtil.getSupplierDetails(id);
			request.setAttribute("supDetails", supDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("supplieraccount.jsp");
			dis.forward(request, response);
			
		}
		else {
			
			List<Supplier> supDetails = SupplierDBUtil.getSupplierDetails(id);
			request.setAttribute("supDetails", supDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("supplieraccount.jsp");
			dis.forward(request, response);
		}
	
	}

}
