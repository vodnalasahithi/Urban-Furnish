/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.41
 * Generated at: 2019-03-15 18:00:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.*;

public final class sofa_005fcode_005fimage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.io.FileOutputStream");
    _jspx_imports_classes.add("java.io.InputStream");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Urban Furnish</title>\r\n");
      out.write("<!-- Meta tag Keywords -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("\tcontent=\"Trendy Designs web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web Designs\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\r\n");
      out.write("function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!--// Meta tag Keywords -->\r\n");
      out.write("<!-- css files -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("<!-- Bootstrap-Core-CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- Style-CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.css\">\r\n");
      out.write("<!-- Font-Awesome-Icons-CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.css\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"all\" />\r\n");
      out.write("<!-- Owl-Carousel-CSS -->\r\n");
      out.write("<!-- pop-up-box -->\r\n");
      out.write("<link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"all\" />\r\n");
      out.write("<!-- //pop-up-box -->\r\n");
      out.write("<!-- For-Gallery-CSS -->\r\n");
      out.write("<link href=\"css/viewbox.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"all\" />\r\n");
      out.write("<!-- //For-Gallery-CSS -->\r\n");
      out.write("<!-- //css files -->\r\n");
      out.write("<!-- web-fonts -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<!-- //web-fonts -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".column {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 33.33%;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Clearfix (clear floats) */\r\n");
      out.write(".row::after {\r\n");
      out.write("\tcontent: \"\";\r\n");
      out.write("\tclear: both;\r\n");
      out.write("\tdisplay: table;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--  <head>\r\n");
      out.write("  <title>Bootstrap Example</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  \r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write(" <!--   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">-->\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!--\r\n");
      out.write("\tShow message to user that order has been placed\r\n");
      out.write("\t \r\n");
      out.write(" -->\r\n");
      out.write(" \r\n");
      out.write(" \t");

 		if(request.getParameter("emailStatus") != null) {
 			
      out.write("\r\n");
      out.write(" \t\t\t\r\n");
      out.write(" \t\t\t\r\n");
      out.write(" \t\t\t<div class=\"container\">\r\n");
      out.write("    <div class=\"alert alert-success alert-dismissible\">\r\n");
      out.write("    <button type=\"button\" class=\"close\" data-dismiss=\"alert\">X</button>\r\n");
      out.write("    <strong>Your order has been placed.Please check your email for payment process.</strong> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write(" \t\t\t\r\n");
      out.write(" \t\t\t\t<!--  <div class=\"container\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"alert alert-success\">\r\n");
      out.write("    <strong>Success!</strong> This alert box could indicate a successful or positive action.\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>-->\r\n");
      out.write(" \t\t\t\t\t\r\n");
      out.write(" \t\t\t\t  <!--  alert('You order has been placed. Please check your email for payment process');-->\r\n");
      out.write(" \t\t\t");

 		}
 	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"main-agile\" id=\"home\">\r\n");
      out.write("\t\t<!-- header -->\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 w3l_header_center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"index.html\"><span>URBAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\tFURNISH</span></a>\r\n");
      out.write("\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 w3l_header_right w3l-r\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<form action=\"logout\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"Welcome.jsp\">Back</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"Home.html\">Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!--  <li><a href=\"\" class=\"\">Logout</a></li>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"login\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"ui-btn ui-corner-all ui-shadow ui-icon-home ui-btn-icon-left\">Welcome\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(session.getAttribute("name"));
      out.write("</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"header-bottom\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("<!--  <!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title></title>\r\n");
      out.write("</head>-->\r\n");
      out.write("<body bgcolor=\"white\">\r\n");
      out.write("\t\r\n");
      out.write("\t");

Connection con = null;
Statement st = null;
try {
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/urban_furnish", "root", "root");
st=con.createStatement();
String query="select Product_Id,image,product_name,description,price from productdetails where category='sofa'";
ResultSet rs=st.executeQuery(query);
StringBuffer sb=new StringBuffer();
sb.append("D://Mini_Project_Uf//");
sb.append("image");
String path;

      out.write("\r\n");
      out.write("\t<!--    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"w3-content w3-margin-top\" style=\"max-width: 3600px;\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-sm-4\">\r\n");
      out.write("          <div class=\"well\">\r\n");
      out.write("          \r\n");
      out.write("                    \r\n");
      out.write("      -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

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
        
        
        
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<b>");
      out.print(rs.getString(1));
      out.write("</b>\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"column\">\r\n");
      out.write("\t\t\t<b><img alt=\"\" src=\"sofareadImage.jsp?ProductId=");
      out.print(ProductId);
      out.write("\"\r\n");
      out.write("\t\t\t\talign=\"center\" height=\"300\" width=\"300\"></b>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"well\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<b>Name :</b>\r\n");
      out.write("\t\t\t");
      out.print(rs.getString("product_name"));
      out.write("</br> <b>Description :</b>\r\n");
      out.write("\t\t\t");
      out.print(rs.getString("description"));
      out.write("</br> <b>Price :</b>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      out.print(rs.getString("price"));
      out.write("</br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--  <li><a href=\"buyaproduct.jsp\">Buy Now</a></li>-->\r\n");
      out.write("\r\n");
      out.write("<li><a href=\"buyaproduct.jsp?product_name=");
      out.print(rs.getString("product_name"));
      out.write("\">Buy Now</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- <div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  ");
String cartURL =  "cart.jsp?id="+rs.getString(1)+"&name="+rs.getString("product_name")+"&price="+rs.getString("price");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"");
      out.print(cartURL);
      out.write("\"> <class=\"btn btn-info\" role=\"button\">Add To Cart</a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
 
    }
} finally {
	if(st != null) {
		st.close();
	}
	if(con != null) {
		con.close();
	}
}
    
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
