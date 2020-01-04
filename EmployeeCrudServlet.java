package com.del.second2.Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.del.second2.dao.EmployeeDAO;
import com.del.second2.entity.Employee;
@WebServlet("/EmployeeCrudServlet")
public class EmployeeCrudServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String submit=request.getParameter("sub");
		EmployeeDAO edao=new EmployeeDAO();
		Employee e=new Employee();
		String message="Successfully";
		e.setEmpid(Integer.parseInt(request.getParameter("id")));
		RequestDispatcher rd=request.getRequestDispatcher("EmployeeCrud.jsp");
		if(submit.equals("add_Employee") || submit.equals("modify_Employee"))
		{
			e.setName(request.getParameter("ename"));
			e.setSalary(Double.parseDouble(request.getParameter("salary")));
			e.setDoj(Date.valueOf(request.getParameter("dob")));
			if(submit.equals("add_Employee"))
			{
				edao.insertEmployee(e);
				message=message+"Inserted Record";
			}
			else
			{
				edao.modifyEmployee(e);
				message=message+"modified Record";
				
		}
		}
		else if(submit.equals("delete_employee"))
		{
			if(edao.removeEmployee(e.getEmpid()))
				message=message+" Record deleted";
			else
				message="deletion failed";
		}
		else if(submit.equals("show_employee"))
		{
			e=edao.getEmployee(e.getEmpid());
			request.setAttribute("emp", e);
			
			}
		out.print("<h1><center>"+message+"</center></h1>");
		rd.include(request,response);
	}
}
			
			
		
		
		
	


