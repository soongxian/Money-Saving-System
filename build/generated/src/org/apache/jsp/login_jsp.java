package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("<html class=\"no-js\" lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Login - Money Manager</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/png\" href=\"assets/images/icon/favicon.ico\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/themify-icons.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/metisMenu.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/slicknav.min.css\">\n");
      out.write("    <!-- amchart css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.amcharts.com/lib/3/plugins/export/export.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("    <!-- others css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/typography.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/default-css.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/responsive.css\">\n");
      out.write("    <!-- modernizr css -->\n");
      out.write("    <script src=\"assets/js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("    <style>\n");
      out.write("        .login-area{\n");
      out.write("            background-image: url(\"assets/images/loginPage.png\");\n");
      out.write("            background-size: 100% 100%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!--[if lt IE 8]>\n");
      out.write("            <p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("    <!-- preloader area start -->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("        <div class=\"loader\"></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- preloader area end -->\n");
      out.write("    <!-- login area start -->\n");
      out.write("    <div class=\"login-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"login-box ptb--100\">\n");
      out.write("                 <form action=\"LoginServlet\" method=\"post\">\n");
      out.write("                    <div class=\"login-form-head\">\n");
      out.write("                        <img src=\"assets/images/icon/logo.png\" alt=\"\">\n");
      out.write("                        <h4>Sign In</h4>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"login-form-body\">\n");
      out.write("                        <div class=\"form-gp\">\n");
      out.write("                            <label for=\"username\">Username</label>\n");
      out.write("                            <input type=\"text\" name=\"username\" id=\"exampleInputEmail1\">\n");
      out.write("                            <i class=\"ti-user\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-gp\">\n");
      out.write("                            <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                            <input type=\"password\" name=\"password\" id=\"exampleInputPassword1\">\n");
      out.write("                            <i class=\"ti-lock\"></i>\n");
      out.write("                            <div class=\"text-danger\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row mb-4 rmber-area\">\n");
      out.write("                            <div class=\"col-6\">\n");
      out.write("                                <div class=\"custom-control custom-checkbox mr-sm-2\">\n");
      out.write("                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"customControlAutosizing\">\n");
      out.write("                                    <label class=\"custom-control-label\" for=\"customControlAutosizing\">Remember Me</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-6 text-right\">\n");
      out.write("                                <a href=\"#\">Forgot Password?</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"submit-btn-area\">\n");
      out.write("                            <button id=\"form_submit\" type=\"submit\">Submit <i class=\"ti-arrow-right\"></i></button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-footer text-center mt-5\">\n");
      out.write("                            <p class=\"text-muted\">Don't have an account? <a href=\"register.jsp\">Sign up</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- login area end -->\n");
      out.write("\n");
      out.write("    <!-- jquery latest version -->\n");
      out.write("    <script src=\"assets/js/vendor/jquery-2.2.4.min.js\"></script>\n");
      out.write("    <!-- bootstrap 4 js -->\n");
      out.write("    <script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/metisMenu.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.slimscroll.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.slicknav.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- others plugins -->\n");
      out.write("    <script src=\"assets/js/plugins.js\"></script>\n");
      out.write("    <script src=\"assets/js/scripts.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
