package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class foodcorner_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/title.jsp");
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

      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <!--Start of Zopim Live Chat Script-->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("window.$zopim||(function(d,s){var z=$zopim=function(c){z._.push(c)},$=z.s=\n");
      out.write("d.createElement(s),e=d.getElementsByTagName(s)[0];z.set=function(o){z.set.\n");
      out.write("_.push(o)};z._=[];z.set._=[];$.async=!0;$.setAttribute(\"charset\",\"utf-8\");\n");
      out.write("$.src=\"//v2.zopim.com/?3rcQv5vE8B8TKMwbOHaKXuNjVQIZdMeB\";z.t=+new Date;$.\n");
      out.write("type=\"text/javascript\";e.parentNode.insertBefore($,e)})(document,\"script\");\n");
      out.write("</script>\n");
      out.write("<!--End of Zopim Live Chat Script-->\n");
      out.write("<title>Street Food | FoodCorner</title>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /> \n");
      out.write("<meta name=\"keywords\" content=\"Creative Forms Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<!--google fonts-->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("<!--google fonts-->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/custom_jquery.min.js\"></script>\n");
      out.write("<script src=\"js/jquery-1.4.1.min.js\"></script>\n");
      out.write("<script src=\"js/jquery/jquery.pngFix.pack.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("$(document).pngFix( );\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/streetfood.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Fonts -->\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");

String user = null;
try{
user = session.getAttribute("foodcorner").toString();
if(user == null) {
      response.sendRedirect("signin.jsp");
   }
}
catch(Exception ex){
out.println(ex);
//response.sendRedirect("login.jsp");
//ex.printStackTrace();
}

      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("<div class=\"brand\">StReEt FoOd</div>\n");
      out.write("    <div class=\"address-bar\">Taste of delicious food at your home.</div>");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write('\n');

    
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","streetfood","nitin");
    
      
      out.write("\n");
      out.write("    \n");
      out.write("<!--Block start here-->\n");
      out.write("\n");
      out.write("            <div class=\"container\"><div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div><h3><u>Add Menu:</u></h3></div>\n");
      out.write("                        <div><form action=\"menuauth.jsp\" method=\"post\"><center>\n");
      out.write("                                <input type=\"text\" value=\"");
      out.print(user);
      out.write("\" name=\"foodcorner\" class=\"hide\">\n");
      out.write("                                <strong>Item Name:</strong><input type=\"text\" name=\"item\" >\n");
      out.write("                            <strong>Price:</strong><input type=\"text\" name=\"price\">\n");
      out.write("                            <input type=\"submit\" value=\"Add Item\">\n");
      out.write("                        </center></form></div>\n");
      out.write("                        <br>\n");
      out.write("                        <div>\n");
      out.write("                           \n");
      out.write("                            <center>\n");
      out.write("                            <table border=\"0\" width=\"50%\" cellpadding=\"0\" cellspacing=\"0\" id=\"product-table\">\n");
      out.write("\t\t\t\t");

                                System.out.println(user);
                                PreparedStatement ps=conn.prepareStatement("select * from menu where fc_id=?");
                                ps.setString(1,user.toUpperCase() );
                                ResultSet rs=ps.executeQuery();
                                
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("\t\t\t\t\t<th class=\"table-header-repeat line-left minwidth-1\"><a href=\"\">Item Name</a>\t</th>\n");
      out.write("\t\t\t\t\t<th class=\"table-header-repeat line-left minwidth-1\"><a href=\"\">Price</a></th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("                                    ");
 while(rs.next()){ 
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("                                        <td>Rs.&nbsp;");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                        ");
 } 
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</table>\n");
      out.write("                            </center>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div><h3><u>Add Location:</u></h3></div>\n");
      out.write("                        <div><form action=\"inputloc.jsp\" method=\"post\"><center>\n");
      out.write("                                    <input type=\"text\" value=\"");
      out.print(user);
      out.write("\" name=\"foodcorner\" class=\"hidden\">\n");
      out.write("                                    <b>city:</b><select name=\"city\">\n");
      out.write("                                     ");

                    Statement st1=conn.createStatement();
                    ResultSet rs1=st1.executeQuery("select name from city");
                        while(rs1.next()){
                                     
      out.write("\n");
      out.write("                                    <option>");
      out.print( rs1.getString(1) );
      out.write("</option>\n");
      out.write("                                    ");
 } 
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        \n");
      out.write("                        <b>Area:</b><select name=\"area\">\n");
      out.write("                                     ");

                    Statement st2=conn.createStatement();
                    ResultSet rs2=st2.executeQuery("select name from area");
                        while(rs2.next()){
                                     
      out.write("\n");
      out.write("                                    <option>");
      out.print( rs2.getString(1) );
      out.write("</option>\n");
      out.write("                                    ");
 } 
      out.write("\n");
      out.write("                        </select>      \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <input type=\"submit\" value=\"Add Area\">\n");
      out.write("                                \n");
      out.write("                        </center></form></div>\n");
      out.write("                        <br>\n");
      out.write("                         </div>\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div><h3><u>check orders:</u></h3></div>\n");
      out.write("                        <br>\n");
      out.write("                        <div>\n");
      out.write("                            <center>\n");
      out.write("                            <table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" id=\"product-table\">\n");
      out.write("\t\t\t\t");

                                Statement st3=conn.createStatement();
                                ResultSet rs3=st3.executeQuery("select name,contact,email from user_reg");
                                
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("\t\t\t\t\t<th class=\"table-header-repeat line-left minwidth-1\"><a href=\"\">Name</a></th>\n");
      out.write("\t\t\t\t\t<th class=\"table-header-repeat line-left minwidth-1\"><a href=\"\">Contact</a></th>\n");
      out.write("\t\t\t\t\t<th class=\"table-header-repeat line-left minwidth-1\"><a href=\"\">Address</a></th>\n");
      out.write("                                        <th class=\"table-header-repeat line-left minwidth-1\"><a href=\"\">F/C Name</a></th>\n");
      out.write("                                        <th class=\"table-header-repeat line-left minwidth-1\"><a href=\"\">Items</a></th>\n");
      out.write("                                        <th class=\"table-header-repeat line-left minwidth-1\"><a href=\"\">Bill Amount</a></th>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
 while(rs3.next()){ 
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<td>");
      out.print( rs3.getString(1) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( rs3.getString(2) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( rs3.getString(3) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("                                        ");
 } 
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</table>\n");
      out.write("                            </center>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div></div>\n");
      out.write("\n");
      out.write("<div class=\"clear\"> </div>\n");
      out.write("<!--Block end here-->\n");
      out.write("\n");
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
      out.write("\n");
      out.write("</body>\n");
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
