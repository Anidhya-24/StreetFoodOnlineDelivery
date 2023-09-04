package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import booking.Item;
import booking.ShopingCart;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/connectme.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/streetfood.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Fonts -->\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        ");

String user = null;
try{
user = session.getAttribute("foodcorner").toString();
String fc=request.getParameter("foodcorner");

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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      out.write('\n');

    
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","streetfood","nitin");
    
      
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<div class=\"brand\">StReEt FoOd</div>\n");
      out.write("    <div class=\"address-bar\">Taste of delicious food at your home.</div>");
      out.write("\n");
      out.write("        <form action=\"order.jsp\">\n");
      out.write("       <table border=\"0\" width=\"50%\" cellpadding=\"0\" cellspacing=\"0\" id=\"product-table\">\n");
      out.write("\t\t\t\t");

                                System.out.println(user);
                                PreparedStatement ps=conn.prepareStatement("select * from menu where fc_id=?");
                                ps.setString(1,user);
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
      out.write("                                        <td>\n");
      out.write("                                            <a href=\"add.jsp?id=1&name=");
      out.print( rs.getString(2) );
      out.write("&price=");
      out.print( rs.getString(3));
      out.write("\">add</a>\n");
      out.write("                                                \n");
      out.write("                                        </td>\n");
      out.write("                                </tr>\n");
      out.write("                                        ");
 } 
      out.write("\n");
      out.write("                                               \n");
      out.write("                                                ");

            float total=0;

            ShopingCart mycart = (ShopingCart) session.getAttribute("cart");
            ArrayList<Item> itemList = mycart.getItems();
            
            for(Item i:itemList)
            {
              out.println(i.getId()+" : "+i.getName()+" : "+i.getPrice());
              total=total+i.getPrice();
            }

            out.println(total);

        
      out.write("\n");
      out.write("        <tr><td>Address:<textarea name=\"address\"></textarea></td></tr>\n");
      out.write("        <tr><td><input type=\"text\" name=\"foodcorner\" value=\"\"></td></tr>\n");
      out.write("         <tr><td><input type=\"submit\"  value=\"placeorder\"></td></tr>\n");
      out.write("\t\t\t\t</table></form>\n");
      out.write("         <br></br>\n");
      out.write("         <br></br>\n");
      out.write("         <br></br>\n");
      out.write("         <br></br>\n");
      out.write("         <br></br>\n");
      out.write("         <br></br>\n");
      out.write("         <br></br>\n");
      out.write("         <br></br>\n");
      out.write("         <br></br>\n");
      out.write("        ");
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
      out.write("    </body>\n");
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
