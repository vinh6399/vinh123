package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header1.jsp", out, false);
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("        <section id=\"one\" class=\"wrapper style2\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <div class=\"grid-style\">\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"box\">\n");
      out.write("                            <div class=\"image fit\">\n");
      out.write("                                <img src=\"images/pic02.jpg\" alt=\"\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <header class=\"align-center\">\n");
      out.write("                                    <p>111111maecenas sapien feugiat ex purus</p>\n");
      out.write("                                    <h2>Lorem ipsum dolor</h2>\n");
      out.write("                                </header>\n");
      out.write("                                <p> Cras aliquet urna ut sapien tincidunt, quis malesuada elit facilisis. Vestibulum sit amet tortor velit. Nam elementum nibh a libero pharetra elementum. Maecenas feugiat ex purus, quis volutpat lacus placerat malesuada.</p>\n");
      out.write("                                <footer class=\"align-center\">\n");
      out.write("                                    <a href=\"#\" class=\"button alt\">Learn More</a>\n");
      out.write("                                </footer>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"box\">\n");
      out.write("                            <div class=\"image fit\">\n");
      out.write("                                <img src=\"images/pic03.jpg\" alt=\"\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <header class=\"align-center\">\n");
      out.write("                                    <p>mattis elementum sapien pretium tellus</p>\n");
      out.write("                                    <h2>Vestibulum sit amet</h2>\n");
      out.write("                                </header>\n");
      out.write("                                <p> Cras aliquet urna ut sapien tincidunt, quis malesuada elit facilisis. Vestibulum sit amet tortor velit. Nam elementum nibh a libero pharetra elementum. Maecenas feugiat ex purus, quis volutpat lacus placerat malesuada.</p>\n");
      out.write("                                <footer class=\"align-center\">\n");
      out.write("                                    <a href=\"#\" class=\"button alt\">Learn More</a>\n");
      out.write("                                </footer>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Two -->\n");
      out.write("        <section id=\"two\" class=\"wrapper style3\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <header class=\"align-center\">\n");
      out.write("                    <p>22222222222Nam vel ante sit amet libero scelerisque facilisis eleifend vitae urna</p>\n");
      out.write("                    <h2>Morbi maximus justo</h2>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Three -->\n");
      out.write("        <section id=\"three\" class=\"wrapper style2\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <header class=\"align-center\">\n");
      out.write("                    <p class=\"special\">333333333Nam vel ante sit amet libero scelerisque facilisis eleifend vitae urna</p>\n");
      out.write("                    <h2>Morbi maximus justo</h2>\n");
      out.write("                </header>\n");
      out.write("                <div class=\"gallery\">\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"image fit\">\n");
      out.write("                            <a href=\"#\"><img src=\"images/pic01.jpg\" alt=\"\" /></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"image fit\">\n");
      out.write("                            <a href=\"#\"><img src=\"images/pic02.jpg\" alt=\"\" /></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"image fit\">\n");
      out.write("                            <a href=\"#\"><img src=\"images/pic03.jpg\" alt=\"\" /></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"image fit\">\n");
      out.write("                            <a href=\"#\"><img src=\"images/pic04.jpg\" alt=\"\" /></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.scrollex.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/skel.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/util.js\"></script>\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
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
