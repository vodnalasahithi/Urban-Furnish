package controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;


import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.servlet.http.*;
import javax.servlet.*;

import dao.buyingdao;

/**
 * Servlet implementation class email
 */
@WebServlet("/buying_a_product")
public class buying_a_product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buying_a_product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
      
String firstname= request.getParameter("firstname");
String lastname= request.getParameter("lastname");
String email= request.getParameter("email");
String phonenumber = request.getParameter("phonenumber"); 
String address = request.getParameter("address");
String city = request.getParameter("city");
String zipcode = request.getParameter("zipcode");
String state = request.getParameter("state");
String product_name= request.getParameter("product_name");



String userEmailAddress = (String)request.getParameter("email");
String result;

// Recipient's email ID needs to be mentioned.
//String to = "vodnalasahithi66@gmail.com,sahithivodnala66@gmail.com";


// Sender's email ID needs to be mentioned
final String from = "urbanfurnish123@gmail.com";
final String password = "urban_furnish"; 

//you can try providing correct user / password and try again


// Assuming you are sending email from localhost
//String host = "smtp.gmail.com";

// Get system properties object
//Properties properties = System.getProperties();
//
//// Setup mail server
////properties.setProperty("mail.smtp.host", host);
//
//properties.setProperty("mail.smtp.host", "smtp.gmail.com");    
//properties.setProperty("mail.smtp.socketFactory.port", "465");    
//properties.setProperty("mail.smtp.socketFactory.class",    
//          "javax.net.ssl.SSLSocketFactory");    
//properties.setProperty("mail.smtp.auth", "true");    
//properties.setProperty("mail.smtp.port", "465");    


        
buyingdao bdao = new buyingdao();
//try {
//	bdao.buying_a_product(firstname, lastname, email, phonenumber, address, city, zipcode, state);
//} catch (SQLException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
		System.out.println("sucessfully registered");
	}
	
//	Session mailSession = Session.getInstance(properties,
//			  new javax.mail.Authenticator() {
//				protected PasswordAuthentication getPasswordAuthentication() {
//					return new PasswordAuthentication(from, password);
//				}
//			  });
//
//			try {
//
//				MimeMessage message = new MimeMessage(mailSession);
//				message.setFrom(new InternetAddress("urbanfurnish123@gmail.com"));
//				message.setRecipients(Message.RecipientType.TO,
//					InternetAddress.parse(userEmailAddress));
//				message.setSubject("Urban Furnish");
//				message.setText("Dear Customer,"
//					+ "\n\n Your Order has been Confirmed, Thank You!"+"\n\n Your Order will be delivered to you within 7-15 days  and do ensure you collect the bill and pay the  amount by hand cash." );
//
//				Transport.send(message);
//
//				
//
//			} catch (MessagingException e) {
//				throw new RuntimeException(e);
//			}

}
