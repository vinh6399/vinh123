package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class travelDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("        <title>Travel</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 class=\"text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <p class=\"lead\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            <div class=\"embed-responsive embed-responsive-21by9\">\n");
      out.write("                <iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.video}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("?autoplay=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section id=\"One\" class=\"wrapper style3\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <header class=\"align-center\">\n");
      out.write("                    <p>Eleifend vitae urna</p>\n");
      out.write("                    <h2>Generic Page Template</h2>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Two -->\n");
      out.write("        <section id=\"two\" class=\"wrapper style2\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <header class=\"align-center\">\n");
      out.write("                            <p>maecenas sapien feugiat ex purus</p>\n");
      out.write("                            <h2>Lorem ipsum dolor</h2>\n");
      out.write("                        </header>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras at dignissim augue, in iaculis neque. Etiam bibendum felis ac vulputate pellentesque. Cras non blandit quam. Nunc porta, est non posuere sagittis, neque nunc pellentesque diam, a iaculis lacus urna vitae purus. In non dui vel est tempor faucibus. Aliquam erat volutpat. Quisque vel est vitae nibh laoreet auctor. In nec libero dui. Nulla ullamcorper, dolor nec accumsan viverra, libero eros rutrum metus, vel lacinia magna odio non nunc. Praesent semper felis eu rhoncus aliquam. Donec at quam ac libero vestibulum pretium. Nunc faucibus vel arcu in malesuada. Aenean at velit odio. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Maecenas commodo erat eget molestie sollicitudin. Donec imperdiet, ex sed blandit dictum, ipsum metus ultrices arcu, vitae euismod nisl sapien vitae tortor.</p>\n");
      out.write("\n");
      out.write("                        <p>Vivamus nec odio ac ligula congue feugiat at vitae leo. Aenean sem justo, finibus sed dui eu, accumsan facilisis dolor. Fusce quis dui eget odio iaculis aliquam vel sed velit. Nulla pellentesque posuere semper. Nulla eu sagittis lorem, a auctor nulla. Sed ac condimentum orci, ac varius ante. Nunc blandit quam sit amet sollicitudin sodales.</p>\n");
      out.write("\n");
      out.write("                        <p>Vivamus ultricies mollis mauris quis molestie. Quisque eu mi velit. In et cursus nibh. Donec facilisis, orci sed mollis hendrerit, nunc risus mattis odio, eget efficitur nisl orci a lectus. Aenean finibus neque convallis orci sollicitudin tincidunt. Vivamus lacinia facilisis diam, quis facilisis nisi luctus nec. Aliquam ac molestie enim, ut ultrices elit. Fusce laoreet vulputate risus in tincidunt. Sed commodo mollis maximus. Nullam varius laoreet nibh sit amet facilisis. Donec ac odio vehicula, consequat elit et, sodales justo. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nullam ac auctor mauris, in hendrerit libero. </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Scripts -->\n");
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
