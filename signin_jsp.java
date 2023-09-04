package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/title.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/emailcheck.jsp");
    _jspx_dependants.add("/connectme.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Street Food | SignIn</title>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /> \r\n");
      out.write("<meta name=\"keywords\" content=\"Creative Forms Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("\r\n");
      out.write("    <!--google fonts-->\r\n");
      out.write("    <link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,300,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <!--google fonts-->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"css/streetfood.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Fonts -->\r\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("            function Check()\r\n");
      out.write("            {\r\n");
      out.write("                var name=document.f1.email.value;\r\n");
      out.write("                var http;\r\n");
      out.write("                http=new XMLHttpRequest();\r\n");
      out.write("                http.open(\"GET\",\"emailcheck.jsp?email=\"+name,true);\r\n");
      out.write("                http.send();\r\n");
      out.write("                http.onreadystatechange=myFun;\r\n");
      out.write("                function myFun()\r\n");
      out.write("                {\r\n");
      out.write("                    if(http.readyState==4 && http.status==200)\r\n");
      out.write("                    {\r\n");
      out.write("                        document.getElementById('sp1').innerHTML=http.responseText;\r\n");
      out.write("                        document.getElementById('sp1').style.display='inline';\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        \r\n");
      out.write("        function validate() {\r\n");
      out.write("    if (document.f1.name.value == \"\") {\r\n");
      out.write("        alert(\"Enter a name\");\r\n");
      out.write("        document.f1.name.focus();\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    if (!/^[a-z A-Z]*$/g.test(document.f1.name.value)) {\r\n");
      out.write("        alert(\"Invalid characters\");\r\n");
      out.write("        document.f1.name.focus();\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("function isNumber(evt) {\r\n");
      out.write("    evt = (evt) ? evt : window.event;\r\n");
      out.write("    var charCode = (evt.which) ? evt.which : evt.keyCode;\r\n");
      out.write("    if (charCode > 31 && (charCode < 48 || charCode > 57)) {\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("function checkForm(form)\r\n");
      out.write("  {\r\n");
      out.write("      if(form.password.value.length < 6) {\r\n");
      out.write("        alert(\"Error: Password must contain at least six characters!\");\r\n");
      out.write("        form.password.focus();\r\n");
      out.write("        return false;\r\n");
      out.write("      }\r\n");
      out.write("      re = /[0-9]/;\r\n");
      out.write("      if(!re.test(form.password.value)) {\r\n");
      out.write("        alert(\"Error: password must contain at least one number (0-9)!\");\r\n");
      out.write("        form.password.focus();\r\n");
      out.write("        return false;\r\n");
      out.write("      }\r\n");
      out.write("      re = /[a-z]/;\r\n");
      out.write("      if(!re.test(form.password.value)) {\r\n");
      out.write("        alert(\"Error: password must contain at least one lowercase letter (a-z)!\");\r\n");
      out.write("        form.password.focus();\r\n");
      out.write("        return false;\r\n");
      out.write("      }\r\n");
      out.write("      re = /[A-Z]/;\r\n");
      out.write("      if(!re.test(form.password.value)) {\r\n");
      out.write("        alert(\"Error: password must contain at least one uppercase letter (A-Z)!\");\r\n");
      out.write("        form.password.focus();\r\n");
      out.write("        return false;\r\n");
      out.write("      }\r\n");
      out.write("  }  \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      out.write("<div class=\"brand\">StReEt FoOd</div>\n");
      out.write("    <div class=\"address-bar\">Taste of delicious food at your home.</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("<!-- Navigation -->\r\n");
      out.write("    <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("         <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1 cssmenu\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"index.jsp\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"about.jsp\">About</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"signin.jsp\">Sign In</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"contact.jsp\">Contact</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("                   <!-- /.navbar-collapse -->\r\n");
      out.write("        \r\n");
      out.write("    </nav>");
      out.write("\r\n");
      out.write("<!--Block start here-->\r\n");
      out.write("<div class=\"element\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"element-block2\">\r\n");
      out.write("\t\r\n");
      out.write("        <div class=\"element-block2-left\">\r\n");
      out.write("           \r\n");
      out.write("            <div class=\"signin\" id=\"loginbox\">\r\n");
      out.write("                <h3><b>Existing</b></h3>\r\n");
      out.write("                <h4><b>Customer/FoodCorner</b></h4>\r\n");
      out.write("                \r\n");
      out.write("                <form action=\"signauth.jsp\" method=\"post\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"mess\">\r\n");
      out.write("                        <input type=\"text\" class=\"user\" name=\"id\"  placeholder=\"Email\" required=\"\">\r\n");
      out.write("\t\t\t<span class=\"mess1\"> </span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mess\">\r\n");
      out.write("                        <input type=\"password\" class=\"lock\" name=\"password\" placeholder=\"Password\" required=\"\">\r\n");
      out.write("                        <span class=\"mess2\"> </span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div><center>\r\n");
      out.write("                            <input type=\"radio\" class=\"user\" name=\"checkuser\" value=\"customer\" checked=\"checked\" >Customer &nbsp;&nbsp;&nbsp; &nbsp;<input type=\"radio\" class=\"user\" name=\"checkuser\" value=\"foodcorner\">FoodCorner\r\n");
      out.write("                       </center> <span class=\"mess2\"> </span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"submit\" value=\"Log in\">\r\n");
      out.write("                    <div class=\"lost\">\r\n");
      out.write("                        <div class=\"lost-password\">\r\n");
      out.write("                            <a href=\"forgot.jsp\" class=\"lostp\">Lost Password?</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clear\"> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                </form>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"element-block2-right\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"signup\">\r\n");
      out.write("                <h3><b>Create An Account</b></h3>\r\n");
      out.write("                <h4><b>Register Customer</b></h4>\r\n");
      out.write("                \r\n");
      out.write("                <form action=\"signupauth.jsp\"method=\"post\" name=\"f1\" onsubmit=\"return checkForm(this);\">\r\n");
      out.write("                    <input class=\"user\" name=\"name\" type=\"text\" placeholder=\"Name\" required=\"\" onkeyup=\"validate()\">\r\n");
      out.write("                    <input class=\"user\" name=\"contact\" pattern=\"\\d{10}\" type=\"text\" placeholder=\"Mobile: 10 Digit Number\" required=\"\" onkeypress=\"return isNumber(event)\">\r\n");
      out.write("                    <input class=\"email\" name=\"email\"  type=\"text\" placeholder=\"Email: xyz@xyz.com\" required=\"\" onkeyup=\"Check()\"><span id=\"sp1\" style=\"display: none\">");
      out.write("\n");
      out.write("         ");
      out.write('\n');

    
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","streetfood","nitin");
    
      
      out.write("\n");
      out.write("         ");

             String name;
              name = request.getParameter("email");
          
        try {
            String q = "select * from user_reg where email=?";
            PreparedStatement ps = conn.prepareStatement(q);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                out.print("<font color='red'>Not Available</font>");
            } else {
                out.print("<font color='green'>Available</font>");
            }
        } catch (Exception e) {
            out.println("" + e);
        }
         
      out.write("</span>\r\n");
      out.write("                    <input class=\"lock\" name=\"password\" type=\"password\" placeholder=\"Password\" required=\"\">\r\n");
      out.write("                    <input type=\"submit\" value=\"Register\">\r\n");
      out.write("                </form>\r\n");
      out.write("\t\t\r\n");
      out.write("                <div class=\"clear\"> </div>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("\t\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"clear\"> </div>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!--Block end here-->\r\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 text-center\">\n");
      out.write("                    <p>Copyright &copy; Street Food | All rights reserved.</p>\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("<a href=\"logout.jsp\">Logout</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
