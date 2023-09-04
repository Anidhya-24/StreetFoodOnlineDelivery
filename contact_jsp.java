package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/title.jsp");
    _jspx_dependants.add("/header.jsp");
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Contact Street Food</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/streetfood.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Fonts -->\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("<div class=\"brand\">StReEt FoOd</div>\n");
      out.write("    <div class=\"address-bar\">Taste of delicious food at your home.</div>");
      out.write("\n");
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
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <hr>\n");
      out.write("                    <h2 class=\"intro-text text-center\">Contact\n");
      out.write("                        <strong>Street Food</strong>\n");
      out.write("                    </h2>\n");
      out.write("                    <hr>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <!-- Embedded Google Map using an iframe - to select your location find it on Google maps and paste the link as the iframe src. If you want to use the Google Maps API instead then have at it! -->\n");
      out.write("                    <!--<iframe width=\"100%\" height=\"400\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" src=\"http://maps.google.com/maps?hl=en&amp;ie=UTF8&amp;ll=37.0625,-95.677068&amp;spn=56.506174,79.013672&amp;t=m&amp;z=4&amp;output=embed\"></iframe>! -->\n");
      out.write("                    <img width=\"100%\" height=\"400\" src=\"img/contact.jpg\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <p>Contact:\n");
      out.write("                        <strong>8109066354</strong>\n");
      out.write("                    </p>\n");
      out.write("                    <p>Email:\n");
      out.write("                        <strong><a href=\"\">nitinsen142@yahoo.com</a></strong>\n");
      out.write("                    </p>\n");
      out.write("                    <p>Address:\n");
      out.write("                        <strong>Bhopal\n");
      out.write("                            <br></strong>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <hr>\n");
      out.write("                    <h2 class=\"intro-text text-center\">Contact\n");
      out.write("                        <strong>form</strong>\n");
      out.write("                    </h2>\n");
      out.write("                    <hr>\n");
      out.write("                    <p>To register your food corner or you want us to include any food corner that we have left so enter the details we will contact soon.</p>\n");
      out.write("                    <form method=\"post\" action=\"contactauth.jsp\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"form-group col-lg-4\">\n");
      out.write("                                <label>Name</label>\n");
      out.write("                                <input type=\"text\" name=\"name\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-lg-4\">\n");
      out.write("                                <label>Email Address</label>\n");
      out.write("                                <input type=\"email\" name=\"email\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-lg-4\">\n");
      out.write("                                <label>Phone Number</label>\n");
      out.write("                                <input type=\"text\" name=\"contact\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                            <div class=\"form-group col-lg-12\">\n");
      out.write("                                <label>Message</label>\n");
      out.write("                                <textarea class=\"form-control\" name=\"message\" rows=\"6\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-lg-12\">\n");
      out.write("                                <input type=\"hidden\" name=\"save\" value=\"contact\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
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
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
