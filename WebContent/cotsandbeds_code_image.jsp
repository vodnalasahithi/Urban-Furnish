<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Urban Furnish</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Trendy Designs web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web Designs" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--// Meta tag Keywords -->
<!-- css files -->
<link rel="stylesheet" href="css/bootstrap.css">
<!-- Bootstrap-Core-CSS -->
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<!-- Style-CSS -->
<link rel="stylesheet" href="css/font-awesome.css">
<!-- Font-Awesome-Icons-CSS -->
<link rel="stylesheet" href="css/owl.carousel.css" type="text/css"
	media="all" />
<!-- Owl-Carousel-CSS -->
<!-- pop-up-box -->
<link href="css/popuo-box.css" rel="stylesheet" type="text/css"
	media="all" />
<!-- //pop-up-box -->
<!-- For-Gallery-CSS -->
<link href="css/viewbox.css" rel="stylesheet" type="text/css"
	media="all" />
<!-- //For-Gallery-CSS -->
<!-- //css files -->
<!-- web-fonts -->
<link
	href="//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
	rel="stylesheet">
<link
	href="//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext"
	rel="stylesheet">
<!-- //web-fonts -->


<style>
* {
	box-sizing: border-box;
}

.column {
	float: left;
	width: 33.33%;
	padding: 5px;
}

/* Clearfix (clear floats) */
.row::after {
	content: "";
	clear: both;
	display: table;
}
</style>



</head>


<!--  <head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>-->



<head>
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <!--   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">-->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>




<body>
<!--
	Show message to user that order has been placed
	 
 -->
 
 	<%
 		if(request.getParameter("emailStatus") != null) {
 			%>
 			
 			
 			<div class="container">
    <div class="alert alert-success alert-dismissible">
    <button type="button" class="close" data-dismiss="alert">X</button>
    <strong>Your order has been placed.Please check your email for payment process.</strong> 
  </div>
</div>
 			
 				<!--  <div class="container">
  
  <div class="alert alert-success">
    <strong>Success!</strong> This alert box could indicate a successful or positive action.
  </div>
  </div>-->
 					
 				  <!--  alert('You order has been placed. Please check your email for payment process');-->
 			<%
 		}
 	%>

	<div class="main-agile" id="home">
		<!-- header -->
		<div class="header">
			<div class="container">

				<div class="col-md-4 w3l_header_center">
					<div class="logo">
						<h1>
							<a class="navbar-brand" href="index.html"><span>URBAN
									FURNISH</span></a>
						</h1>
					</div>
				</div>
				<div class="col-md-4 w3l_header_right w3l-r">
					<ul>
						<form action="logout" method="get">
						<li><a href="Welcome.jsp">Back</a></li>
												<li><a href="Home.html">Logout</a></li>
						
							<!--  <li><a href="" class="">Logout</a></li>-->

						</form>
						<div class="login">

							<li><a
								class="ui-btn ui-corner-all ui-shadow ui-icon-home ui-btn-icon-left">Welcome
									<%=session.getAttribute("name")%></a></li>

						</div>



					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="header-bottom"></div>
</body>
<!--  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>-->
<body bgcolor="white">
	<%@ page import="java.sql.*"%>
	<%
Connection con = null;
Statement st = null;
try {
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/urban_furnish", "root", "root");
st=con.createStatement();
String query="select Product_Id,image,product_name,description,price from productdetails where category='cots and beds'";
ResultSet rs=st.executeQuery(query);
StringBuffer sb=new StringBuffer();
sb.append("D://Mini_Project_Uf//");
sb.append("image");
String path;
%>
	<!--    
    
    <div class="w3-content w3-margin-top" style="max-width: 3600px;">
		<div class="row">
		<div class="col-sm-4">
          <div class="well">
          
                    
      -->


	<%
    while(rs.next())
    { 
        int count=1;
        String ProductId = rs.getString("Product_Id");
        sb.append(count);
        path="sample";
        /*Blob b=rs.getBlob("image");
        count+=1;
        path=sb.toString();
        byte baa[]=b.getBytes(1, (int)b.length());
        FileOutputStream fos=new FileOutputStream(path+".jpeg");
        fos.write(baa);
        fos.close();*/
        
        
        
        %>


	<b><%=rs.getString(1)%></b>
	<div class="row">
		<div class="column">
			<b><img alt="" src="codeandbedsreadImage.jsp?ProductId=<%=ProductId%>"
				align="center" height="300" width="300"></b>
		</div>
		<div class="well">

			<b>Name :</b>
			<%=rs.getString("product_name")%></br> <b>Description :</b>
			<%=rs.getString("description")%></br> <b>Price :</b>

			<%=rs.getString("price")%></br>
			

			<			<li><a href="buyaproduct.jsp?product_name=<%=rs.getString("product_name")%>">Buy Now</a></li>





			<!-- <div class="container">
								<div class="btn-group">
									  <%String cartURL =  "cart.jsp?id="+rs.getString(1)+"&name="+rs.getString("product_name")+"&price="+rs.getString("price");%>
									<a href="<%=cartURL%>"> <class="btn btn-info" role="button">Add To Cart</a>
		
								</div>
							</div> -->

		</div>
	</div>


		<% 
    }
} finally {
	if(st != null) {
		st.close();
	}
	if(con != null) {
		con.close();
	}
}
    %>
	
	</div>
	</div>
	</div>

</body>
</html>