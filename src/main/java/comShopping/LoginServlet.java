package comShopping;

import jakarta.servlet.RequestDispatcher;
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
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Connection c=null;
		try{
			
		String loginInput = request.getParameter("email"); 
		String password=request.getParameter("password");
		c=(Connection) ConnectionProvider.getConnection();
		
		PreparedStatement ps;
		 
		if (loginInput.contains("@")) {
            // Login using email
            ps = c.prepareStatement(
                "SELECT * FROM userregister WHERE email=? AND password=?"
            );
            ps.setString(1, loginInput);
            ps.setString(2, password);
        } else {
            // Login using phone
            ps = c.prepareStatement(
                "SELECT * FROM userregister WHERE MobileNumber=? AND password=?"
            );
            ps.setString(1, loginInput);
            ps.setString(2, password);
        }
		
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeServ");
			rd.forward(request, response);
		}
		else
		{
			out.println("<script>alert('Invalid Email/PhoneNumber or Password');</script>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		 
	}
}







