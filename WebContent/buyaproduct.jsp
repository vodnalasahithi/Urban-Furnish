<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Product Order Form Widget Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- fonts  -->
<link href="//fonts.googleapis.com/css?family=Metrophobic" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Nova+Flat" rel="stylesheet">
<!-- /fonts -->
<!-- css -->
<link href="css/style1.css" rel='stylesheet' type='text/css' media="all" /> 
<!-- /css -->
</head>
<body>



<h1 class="header-agileits w3layouts w3 w3l w3ls">Product Order Form</h1>
<div class="content-w3ls agileits agileinfo wthree">
	<!-- <form action="buying_a_product" method="post">-->
	  <form action="sendemail.jsp" method="post">
		<div class="form-wthree1 agileits agileinfo wthree">
		<div class="well">
		
		
				
		
			
		
			<div class="form-control"> 
				<label class="header">First Name <span>:</span></label>
				<input type="text" id="firstname" name="firstname" placeholder="Your First Name" title="Please enter your First Name" required="">
			</div>
			</div>
			
			<div class="form-wthree2 w3-agileits agileits-w3layouts agile">
			
			<div class="form-control"> 
				<label class="header">Last Name <span>:</span></label>
				<input type="text" id="lastname" name="lastname" placeholder="Your Last Name" title="Please enter your Last Name" required="">
			</div>
		
		</div>
			
			
			
			<div class="form-wthree3 w3-agileits agileits-w3layouts agile">
			<div class="form-control">	
				<label class="header">Email Address <span>:</span></label>
				<input type="email" id="email" name="email" placeholder="Mail@example.com" title="Please enter a Valid Email Address" required="">
			</div>
			</div>
			<div class="form-wthree3 w3-agileits agileits-w3layouts agile">
			<div class="form-control">	
				<label class="header">Phone Number <span>:</span></label>	
				
				<input type="tel" id="usrtel2" name="phonenumber" placeholder="????????" title="Please enter Your Phone Number" required="">
			</div>
		
		</div>
		
		
		<div class="form-wthree3 w3-agileits agileits-w3layouts agile">
		<div class="clear"></div>
				<div class="form-control2"> 
			<label class="header"> Address <span>:</span></label>
			<input type="text" id="address2" name="address" placeholder="Your Address" title="Please enter Your Address" required="">
		</div>
		</div>
		
		<div class="form-wthree3 w3-agileits agileits-w3layouts agile">
		<div class="clear"></div>
		
			<div class="form-control"> 
				<label class="header">City <span>:</span></label>
				<input type="text" id="city" name="city" placeholder="Your City" title="Please enter your City" required="">
			</div>
			</div>
		<div class="form-wthree4 w3-agile w3-agileits agileits-w3layouts">
			<div class="form-control"> 
				<label class="header">Zip Code <span>:</span></label>
				<input type="text" id="zip" name="zipcode" placeholder="Zip Code" title="Please enter your Zip Code" required="">
			</div>
		</div>
		
		<div class="form-wthree4 w3-agile w3-agileits agileits-w3layouts">
			<div class="form-control"> 
				<label class="header">State/Province <span>:</span></label>
				<input type="text" id="state" name="state" placeholder="Your State or Province" title="Please enter your State Or Province" required="">
			</div>
		
		</div>
		<div class="clear"></div>
		
		<div class="form-control last">
					<!--  <li><a href="sendemail.jsp">Place Order</a></li>-->
					
					<div class="form-control"> 
				<label class="header" > Product Name <span>:</span></label>
					<input type="text" id="product_name" name = "product_name" value = "<%= request.getParameter("product_name")%>" ></b></h1>
	  					</div>	
		
		
			<input type="submit" class="email" value="Place Order"> 
			<div class="clear"></div>
		</div>	
	</form>
</div>
</body>
</html>