package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class uploadPic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <script type='text/javascript'>\n");
      out.write("function encodeImageFileAsURL(){\n");
      out.write("\n");
      out.write("    var filesSelected = document.getElementById(\"inputFileToLoad\").files;\n");
      out.write("    if (filesSelected.length > 0)\n");
      out.write("    {\n");
      out.write("        var fileToLoad = filesSelected[0];\n");
      out.write("\n");
      out.write("        var fileReader = new FileReader();\n");
      out.write("\n");
      out.write("        fileReader.onload = function(fileLoadedEvent) {\n");
      out.write("            var srcData = fileLoadedEvent.target.result; // <--- data: base64\n");
      out.write("\n");
      out.write("            var newImage = document.createElement('img');\n");
      out.write("            newImage.src = srcData;\n");
      out.write("\n");
      out.write("            document.getElementById(\"imgTest\").innerHTML = newImage.outerHTML;\n");
      out.write("          //  alert(\"Converted Base64 version is \"+document.getElementById(\"imgTest\").innerHTML);\n");
      out.write("            console.log(\"Converted Base64 version is \"+document.getElementById(\"imgTest\").innerHTML);\n");
      out.write("        }\n");
      out.write("        fileReader.readAsDataURL(fileToLoad);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<title>Admin Profile</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<meta name=\"keywords\" content=\"Flat Profile Menu Responsive Templates, Iphone Compatible Templates, Smartphone Compatible Templates, Ipad Compatible Templates, Flat Responsive Templates\"/>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"css/css\" media=\"all\" />\n");
      out.write("<script type=\"js/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Exo+2:400,700,100' rel='stylesheet' type='text/css'>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\t<body background=\"images/1421477.jpg\" width=\"100%\" height=\"100%\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("        <marquee style=\"color:red;font-size:25px;font-family:pristina\">Welcome To Admin Window</marquee>\n");
      out.write("<!--content-->\n");
      out.write("        \n");
      out.write("<a href=\"adminProfile.jsp\"><h1>Menu</h1></a><br/> \n");
      out.write("<h2>Upload Picture</h2><br/>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<form name=\"upload\" action=\"uploadCoding.jsp\" method=\"get\">\n");
      out.write("    <center>\n");
      out.write("    <lable>Id</lable>\n");
      out.write("    <input type=\"text\" name=\"t1\" value=\"addmin\" readonly>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <input id=\"inputFileToLoad\" type=\"file\" onchange=\"encodeImageFileAsURL();\" />\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <textarea id=\"imgTest\" name=\"t2\" class=\"hide\">\n");
      out.write("\n");
      out.write("\n");

//String userid=session.getAttribute("user");
//PreparedStatement ps=con.prepareStatement("select * form user_profile");
  // ResultSet rs=ps.executeQuery();
  

      out.write("\n");
      out.write("       <img src=\"\"/>\n");
      out.write("    </textarea></center>\n");
      out.write("<br>\n");
      out.write("<center>\n");
      out.write("<input type=\"submit\"value=\"Upload Picture\">\n");
      out.write("</center>\n");
      out.write("</form>\n");
      out.write("<!--/content-->\n");
      out.write("<!--copyrights-->\n");
      out.write("<!--<div class=\"copy-right\"style=\"background-color:black\">\n");
      out.write("    <p style=\"color:white;font-family: serif;font-size:20px\">all &copy; reserve for 2016 </p>\n");
      out.write("    <p style=\"color:red;align:right\">Design By | Amrita Chauhan</p>\n");
      out.write("</div>!>\n");
      out.write("<!--/copyrights-->\n");
      out.write("\t</body>\n");
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
