package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hearder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css\">\n");
      out.write("        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.5.9/slick.min.css'>\n");
      out.write("        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.5.9/slick-theme.min.css'>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/header.css\">\n");
      out.write("\n");
      out.write("        <title id=\"ok\">JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"slider slider-for\">\n");
      out.write("                <div><img src=\"img/1.jpg\" alt=\"...\" class=\"img-thumbnail\"></div>\n");
      out.write("                <div><img src=\"img/2.jpg\" alt=\"...\" class=\"img-thumbnail\"></div>\n");
      out.write("                <div><img src=\"img/3.jpg\" alt=\"...\" class=\"img-thumbnail\"></div>\n");
      out.write("                <div><img src=\"img/4.jpg\" alt=\"...\" class=\"img-thumbnail\"></div>\n");
      out.write("                <div><img src=\"img/4.jpg\" alt=\"...\" class=\"img-thumbnail\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"slider slider-nav\">\n");
      out.write("                <div><img src=\"img/1.jpg\" alt=\"...\" class=\"img-thumbnail\"></div>\n");
      out.write("                <div><h3>HA NOI</h3></div>\n");
      out.write("                <div><img src=\"img/3.jpg\" alt=\"...\" class=\"img-thumbnail\"></div>\n");
      out.write("                <div><img src=\"img/4.jpg\" alt=\"...\" class=\"img-thumbnail\"></div>\n");
      out.write("                <div><img src=\"img/4.jpg\" alt=\"...\" class=\"img-thumbnail\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"action\">\n");
      out.write("                <a href=\"#\" data-slide=\"3\">go to slide 3</a>\n");
      out.write("                <a href=\"#\" data-slide=\"4\">go to slide 4</a>\n");
      out.write("                <a href=\"#\" data-slide=\"5\">go to slide 5</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("        <script src='https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.5.9/slick.min.js'></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script  src=\"js/headerjs.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
