package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import booking.ShopingCart;
import java.sql.*;

public final class customer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/title.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/streetfood.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Fonts -->\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <title>StreetFood | Customer</title>\n");
      out.write("        \n");
      out.write("        ");

            
           // ShopingCart myCart=new ShopingCart();
             ShopingCart mycart = (ShopingCart) session.getAttribute("cart");
            
            String user = null;
            
            try {
                user = session.getAttribute("user").toString();
                System.out.println("********************"+user);
                if (user == null) {
                    response.sendRedirect("signin.jsp");
                }
                else
                {
                    if(mycart==null)
                    {
                     ShopingCart myCart=new ShopingCart();
                     session.setAttribute("cart", myCart);
                      System.out.println("@@@@@@@@@@@@@@"+myCart);
                      //session.removeAttribute("cart");
                    }
                    
                }
            } catch (Exception ex) {
                out.println(ex);
//response.sendRedirect("login.jsp");
//ex.printStackTrace();
            }
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var http1, http2, http3, http4;\n");
      out.write("            function showcity(str)\n");
      out.write("            {\n");
      out.write("                http1 = new XMLHttpRequest();\n");
      out.write("                http1.open(\"GET\", \"citycheck.jsp?count=\" + str, true);\n");
      out.write("                http1.send();\n");
      out.write("                http1.onreadystatechange = show1;\n");
      out.write("                function show1()\n");
      out.write("                {\n");
      out.write("                    if (http1.readyState == 4 && http1.status == 200)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById('city').innerHTML = http1.responseText;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function showarea(str)\n");
      out.write("            {\n");
      out.write("                http2 = new XMLHttpRequest();\n");
      out.write("                http2.open(\"GET\", \"areacheck.jsp?count=\" + str, true);\n");
      out.write("                http2.send();\n");
      out.write("                http2.onreadystatechange = show2;\n");
      out.write("                function show2()\n");
      out.write("                {\n");
      out.write("                    if (http2.readyState == 4 && http2.status == 200)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById('area').innerHTML = http2.responseText;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function showfoodcorner(str)\n");
      out.write("            {\n");
      out.write("                http3 = new XMLHttpRequest();\n");
      out.write("                http3.open(\"GET\", \"foodcornercheck.jsp?count=\" + str, true);\n");
      out.write("                http3.send();\n");
      out.write("                http3.onreadystatechange = show3;\n");
      out.write("                function show3()\n");
      out.write("                {\n");
      out.write("                    if (http3.readyState == 4 && http3.status == 200)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById('foodcorner').innerHTML = http3.responseText;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<div class=\"brand\">StReEt FoOd</div>\n");
      out.write("    <div class=\"address-bar\">Taste of delicious food at your home.</div>");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"col-lg-12\"><div class=\"col-lg-4\"></div>\n");
      out.write("                        <div class=\"col-lg-4\">\n");
      out.write("        <form action=\"menu.jsp\" method=\"post\" >\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    State\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <select onchange=\"showcity(this.value)\" style=\"width: 152px;border: 1px solid; border-radius: 4px; padding: 5px 5px 6px 6px;\">\n");
      out.write("                        <option value=\"-1\">---Select---</option>\n");
      out.write("                        ");

                            try {
                                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "streetfood", "nitin");
                                PreparedStatement ps = conn.prepareStatement("Select * from state");
                                ResultSet rs = ps.executeQuery();
                                while (rs.next()) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print( rs.getString(2));
      out.write('"');
      out.write('>');
      out.print( rs.getString(2));
      out.write("</option>\n");
      out.write("                        ");

                                }
                            } catch (Exception ex) {

                            }
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr> <td>&nbsp;</td><td>&nbsp;</td></tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>City</td>\n");
      out.write("                <td>\n");
      out.write("                    <div id=\"city\">\n");
      out.write("                        <select style=\"width: 152px;border: 1px solid; border-radius: 4px; padding: 5px 5px 6px 6px;\">\n");
      out.write("                            <option value=\"-1\">---Select---</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr> <td>&nbsp;</td><td>&nbsp;</td></tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Area</td>\n");
      out.write("                <td>\n");
      out.write("                    <div id=\"area\">\n");
      out.write("                        <select style=\"width: 152px;border: 1px solid; border-radius: 4px; padding: 5px 5px 6px 6px;\">\n");
      out.write("                            <option value=\"-1\">---Select---</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr> <td>&nbsp;</td><td>&nbsp;</td></tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Foodcorner</td>\n");
      out.write("                <td>\n");
      out.write("                    <div id=\"foodcorner\">\n");
      out.write("                        <select name=\"foodcorner\" style=\"width: 152px;border: 1px solid; border-radius: 4px; padding: 5px 5px 6px 6px;\">\n");
      out.write("                            <option value=\"-1\">---Select---</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr> <td>&nbsp;</td><td>&nbsp;</td></tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"Check menu\" style=\"position: relative;left: 55px;top: 10px;border-radius: 2px;\">\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("                    </form>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("    </body>\n");
      out.write("    <br></br>\n");
      out.write("    <br></br>\n");
      out.write("    <br></br>\n");
      out.write("    <br></br>\n");
      out.write("    <br></br>\n");
      out.write("    <br></br>\n");
      out.write("    ");
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
      out.write(">\n");
      out.write("</html>\n");
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
