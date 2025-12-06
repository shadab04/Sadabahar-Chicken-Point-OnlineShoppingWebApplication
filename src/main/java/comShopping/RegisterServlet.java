package comShopping;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mysqlConnection.ConnectionProvider;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Connection c=null;
		try{
			
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String password=request.getParameter("password");
		c=(Connection) ConnectionProvider.getConnection();
		PreparedStatement ps=c.prepareStatement("insert into userRegister values(?,?,?,?,?)");
		response.setContentType("text/html");
		
		ps.setString(1,name);
		ps.setString(2, email);
		ps.setString(3, phone);
		ps.setString(4, address);
		ps.setString(5, password);
		
		int i=ps.executeUpdate();
		if(i>0) {
//			out.println("<html><body style=\"background-color:#05060a; font-family:'Poppins',sans-serif; "
//					+ "color:#f9f9fb;\"><h2 style=\"color:wheat;\">Registerd Successfully!!</h2>");
			response.sendRedirect("Home.html");
		}
		else
		{
//			out.println("<html><body style=\"background-color:#05060a; font-family:'Poppins',sans-serif; "
//					+ "color:#f9f9fb;\"><h2 style=\"color:wheat;\">Registerd Failed!!</h2>");
			out.println("Register Failed!!");
		}
//		out.println("<p class=\'back-home' class=\'bottom-text'> <a href='Home.html' style=\"color:wheat;\">← Back to Home</a></p></body></html>");
//		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		}
}
