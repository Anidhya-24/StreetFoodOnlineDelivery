package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Street Food</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/streetfood.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <!-- Fonts -->\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      out.write("<div class=\"brand\">StReEt FoOd</div>\n");
      out.write("    <div class=\"address-bar\">Taste of delicious food at your home.</div>");
      out.write("\n");
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
      out.write("    \n");
      out.write("    \n");
      out.write("   \n");
      out.write("     \n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"col-lg-12 text-center\">\n");
      out.write("                    <div id=\"carousel-example-generic\" class=\"carousel slide\">\n");
      out.write("                        <!-- Indicators -->\n");
      out.write("                        <ol class=\"carousel-indicators hidden-xs\">\n");
      out.write("                            <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                            <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\n");
      out.write("                            <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("                        </ol>\n");
      out.write("\n");
      out.write("                        <!-- Wrapper for slides -->\n");
      out.write("                        <div class=\"carousel-inner\">\n");
      out.write("                            <div class=\"item active\">\n");
      out.write("                                <img class=\"img-responsive img-full\" src=\"img/Slide1.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img class=\"img-responsive img-full\" src=\"img/Slide2.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img class=\"img-responsive img-full\" src=\"img/Slide3.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Controls -->\n");
      out.write("                        <a class=\"left carousel-control\" href=\"#carousel-example-generic\" data-slide=\"prev\">\n");
      out.write("                            <span class=\"icon-prev\"></span>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"right carousel-control\" href=\"#carousel-example-generic\" data-slide=\"next\">\n");
      out.write("                            <span class=\"icon-next\"></span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <h2 class=\"brand-before\">\n");
      out.write("                        <small>Welcome to</small>\n");
      out.write("                    </h2>\n");
      out.write("                    <h1 class=\"brand-name\">Street Food</h1>\n");
      out.write("                    <hr class=\"tagline-divider\">\n");
      out.write("                    <h2>\n");
      out.write("                        <small>\n");
      out.write("                            <strong>Ignite your taste buds.</strong>\n");
      out.write("                        </small>\n");
      out.write("                    </h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <hr>\n");
      out.write("                    <h2 class=\"intro-text text-center\">Delicious Local Food\n");
      out.write("                        <strong>At your Home</strong>\n");
      out.write("                    </h2>\n");
      out.write("                    <hr>\n");
      out.write("                    <img class=\"img-responsive img-border img-left\" src=\"img/introd.jpg\" alt=\"\">\n");
      out.write("                    <hr class=\"visible-xs\">\n");
      out.write("                    <p>Hitting the streets is the best way to discover a country's culture since you get to see everyday life. For the food factor, you could say that eating street food is a great way to immerse yourself in the country's culture<p>\n");
      out.write("                    <p>As we all know street food is much better than the food served in brand food corners or hotels. Every time its not possible to reach your favorite food corner due to shortage of time. To resolve that problem we get you a platform which allows you to know special food corners nearby you and order food from them. </p>\n");
      out.write("                    <p>That's why we allow you to order different varieties of food from food corners. </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Script to Activate the Carousel -->\n");
      out.write("    <script>\n");
      out.write("    $('.carousel').carousel({\n");
      out.write("        interval: 6000 //changes the speed\n");
      out.write("    })\n");
      out.write("    </script>\n");
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
