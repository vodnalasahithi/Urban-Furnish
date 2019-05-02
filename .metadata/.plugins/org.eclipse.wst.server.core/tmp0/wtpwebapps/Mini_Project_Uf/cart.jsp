<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>     
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Message</title>
    </head>
    <body>
        <%
        	Integer cartId = Integer.parseInt(request.getParameter("id"));
        	String name = (String)request.getParameter("name");
        	String price = (String)request.getParameter("price");
        	Integer quantity = Integer.parseInt(request.getParameter("quantity"));
        	
        	HashMap<Integer,Integer> cartItems = (HashMap)session.getAttribute("cartItems");
        	if(cartItems == null) {
        		HashMap<Integer, Integer> item = new HashMap();
        		item.put(cartId, quantity);
        	} else {
        		cartItems.put(cartId, quantity);
        	}
        	
        	Float totalPrice = (Float)session.getAttribute("totalPrice");
        	if(totalPrice != null) {
        		totalPrice = Float.parseFloat(price) + totalPrice;
        	}
        	session.setAttribute("totalPrice", totalPrice);
        %>
    </body>
</html>
