/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.41
 * Generated at: 2019-03-15 17:11:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buyaproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Product Order Form Widget Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!-- fonts  -->\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Metrophobic\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Nova+Flat\" rel=\"stylesheet\">\r\n");
      out.write("<!-- /fonts -->\r\n");
      out.write("<!-- css -->\r\n");
      out.write("<link href=\"css/style1.css\" rel='stylesheet' type='text/css' media=\"all\" /> \r\n");
      out.write("<!-- /css -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1 class=\"header-agileits w3layouts w3 w3l w3ls\">Product Order Form</h1>\r\n");
      out.write("<div class=\"content-w3ls agileits agileinfo wthree\">\r\n");
      out.write("\t<!-- <form action=\"buying_a_product\" method=\"post\">-->\r\n");
      out.write("\t  <form action=\"sendemail.jsp\" method=\"post\">\r\n");
      out.write("\t\t<div class=\"form-wthree1 agileits agileinfo wthree\">\r\n");
      out.write("\t\t<div class=\"well\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"form-control\"> \r\n");
      out.write("\t\t\t\t<label class=\"header\">First Name <span>:</span></label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"firstname\" name=\"firstname\" placeholder=\"Your First Name\" title=\"Please enter your First Name\" required=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-wthree2 w3-agileits agileits-w3layouts agile\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-control\"> \r\n");
      out.write("\t\t\t\t<label class=\"header\">Last Name <span>:</span></label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"lastname\" name=\"lastname\" placeholder=\"Your Last Name\" title=\"Please enter your Last Name\" required=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-wthree3 w3-agileits agileits-w3layouts agile\">\r\n");
      out.write("\t\t\t<div class=\"form-control\">\t\r\n");
      out.write("\t\t\t\t<label class=\"header\">Email Address <span>:</span></label>\r\n");
      out.write("\t\t\t\t<input type=\"email\" id=\"email\" name=\"email\" placeholder=\"Mail@example.com\" title=\"Please enter a Valid Email Address\" required=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-wthree3 w3-agileits agileits-w3layouts agile\">\r\n");
      out.write("\t\t\t<div class=\"form-control\">\t\r\n");
      out.write("\t\t\t\t<label class=\"header\">Phone Number <span>:</span></label>\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"tel\" id=\"usrtel2\" name=\"phonenumber\" placeholder=\"????????\" title=\"Please enter Your Phone Number\" required=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-wthree3 w3-agileits agileits-w3layouts agile\">\r\n");
      out.write("\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"form-control2\"> \r\n");
      out.write("\t\t\t<label class=\"header\"> Address <span>:</span></label>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"address2\" name=\"address\" placeholder=\"Your Address\" title=\"Please enter Your Address\" required=\"\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-wthree3 w3-agileits agileits-w3layouts agile\">\r\n");
      out.write("\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"form-control\"> \r\n");
      out.write("\t\t\t\t<label class=\"header\">City <span>:</span></label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"city\" name=\"city\" placeholder=\"Your City\" title=\"Please enter your City\" required=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-wthree4 w3-agile w3-agileits agileits-w3layouts\">\r\n");
      out.write("\t\t\t<div class=\"form-control\"> \r\n");
      out.write("\t\t\t\t<label class=\"header\">Zip Code <span>:</span></label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"zip\" name=\"zipcode\" placeholder=\"Zip Code\" title=\"Please enter your Zip Code\" required=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-wthree4 w3-agile w3-agileits agileits-w3layouts\">\r\n");
      out.write("\t\t\t<div class=\"form-control\"> \r\n");
      out.write("\t\t\t\t<label class=\"header\">State/Province <span>:</span></label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"state\" name=\"state\" placeholder=\"Your State or Province\" title=\"Please enter your State Or Province\" required=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-control last\">\r\n");
      out.write("\t\t\t\t\t<!--  <li><a href=\"sendemail.jsp\">Place Order</a></li>-->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"form-control\"> \r\n");
      out.write("\t\t\t\t<label class=\"header\" > Product Name <span>:</span></label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"product_name\" name = \"product_name\" value = \"");
      out.print( request.getParameter("product_name"));
      out.write("\" ></b></h1>\r\n");
      out.write("\t  \t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<input type=\"submit\" class=\"email\" value=\"Place Order\"> \r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
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
