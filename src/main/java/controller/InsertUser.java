package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.UserDao;
import dto.RegisterUser;

public class InsertUser extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		long phone=Long.parseLong(req.getParameter("phone"));
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		RegisterUser user =new RegisterUser();
		user.setUserName(name);
		user.setUserAge(age);
		user.setUserPhone(phone);
		user.setUserAddress(address);
		user.setUserEmail(email);
		user.setUserPassword(password);
		
		UserDao userDao=new UserDao();
		userDao.insertUser(user);
		
		
		
		PrintWriter printWriter=res.getWriter();
		printWriter.print("Successfully Inserted");
	}

	

}
