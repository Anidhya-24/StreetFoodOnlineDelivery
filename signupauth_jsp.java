package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class signupauth_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/connectme.jsp");
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Signupauth</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("         ");
      out.write('\n');

    
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","streetfood","nitin");
    
      
      out.write("\n");
      out.write("       \n");
      out.write("        ");

        String m=null, mn=null;
        String s=request.getParameter("name");
        String s1=request.getParameter("contact");
        String s2=request.getParameter("email");
        String s3=request.getParameter("password");
        PreparedStatement ps;
        ResultSet rs= null;
        try
        {
            
          ps= conn.prepareStatement("insert into user_reg values (?,?,?,?)");
            ps.setString(2,s);
            ps.setString(3,s1);
            ps.setString(1,s2);
            ps.setString(4,s3);
           
               int insertResult = ps.executeUpdate();
             if (insertResult!=0)
            {
                

      out.write("\n");
      out.write("        \n");
      out.write("<script>\n");
      out.write("    alert(\"Signup Done!\");\n");
      out.write("    window.location=\"signin.jsp\";\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("        \n");
      out.write("        ");

                 //out.println("Successfully registered");
              // response.sendRedirect("signin.jsp" + "?success=1");
            }
        }catch(Exception e)
        {
            out.println(e);
        }
    
         
        
        
      out.write("\n");
      out.write("        \n");
      out.write("          \n");
      out.write("    </body>\n");
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
