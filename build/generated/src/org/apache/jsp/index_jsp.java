package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Locale;
import java.text.NumberFormat;
import java.sql.Statement;
import java.sql.DriverManager;
import java.text.DecimalFormat;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html class=\"no-js\" lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Money Manager</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"assets/images/icon/favicon.ico\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/themify-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/metisMenu.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/slicknav.min.css\">\n");
      out.write("        <!-- amchart css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.amcharts.com/lib/3/plugins/export/export.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- others css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/typography.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/default-css.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/sendiritambah.css\">\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <!-- modernizr css -->\n");
      out.write("    <button></button>\n");
      out.write("    <script src=\"assets/js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("</head>\n");

    String username = (String) session.getAttribute("username");
    String name = (String) session.getAttribute("name");
    session.setAttribute("username", username);

      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!--[if lt IE 8]>\n");
      out.write("            <p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("    <!-- preloader area start -->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("        <div class=\"loader\"></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- preloader area end -->\n");
      out.write("    <!-- page container area start -->\n");
      out.write("    <div class=\"page-container\">\n");
      out.write("        <!-- sidebar menu area start -->\n");
      out.write("        <div class=\"sidebar-menu\">\n");
      out.write("            <div class=\"sidebar-header\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"index.jsp\"><img src=\"assets/images/icon/logo.png\" alt=\"logo\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-menu\">\n");
      out.write("                <div class=\"menu-inner\">\n");
      out.write("                    <nav>\n");
      out.write("                        <ul class=\"metismenu\" id=\"menu\">\n");
      out.write("                            <li class=\"active\"><a href=http://localhost:8080/Money_Saving_System/Index?username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" aria-expanded=\"true\"><i class=\"ti-dashboard\"></i><span>Home</span></a></li>\n");
      out.write("                            <li><a href=\"http://localhost:8080/Money_Saving_System/Account?username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" aria-expanded=\"true\"><i class=\"ti-slice\"></i><span>Source</span></a></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"javascript:void(0)\" aria-expanded=\"true\"><i class=\"fa fa-table\"></i> <span>Finance</span></a>\n");
      out.write("                                <ul class=\"collapse\">\n");
      out.write("                                    <li><a href=\"http://localhost:8080/Money_Saving_System/ListTransactionServlet?month=0&year=0&username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Manage Financial Statement</a></li>\n");
      out.write("                                    <li><a href=\"http://localhost:8080/Money_Saving_System/ShowNewIncomeFormServlet?username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Add Income</a></li>\n");
      out.write("                                    <li><a href=\"http://localhost:8080/Money_Saving_System/ShowNewExpenseFormServlet?username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Add Expense</a></li>\n");
      out.write("                                    <li><a href=\"http://localhost:8080/Money_Saving_System/ShowNewTransferFormServlet?username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Add Transfer</a></li>\n");
      out.write("                                    \n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"http://localhost:8080/Money_Saving_System/ListBudgetServlet?username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><i class=\"ti-pie-chart\"></i><span>Budget</span></a></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"javascript:void(0)\" aria-expanded=\"true\"><i class=\"fa fa-align-left\"></i> <span>Additional Information</span></a>\n");
      out.write("                                <ul class=\"collapse\">\n");
      out.write("                                    <li><a href=\"http://localhost:8080/Money_Saving_System/ListFinancialAdvisorServlet?username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Financial Advisor</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- sidebar menu area end -->\n");
      out.write("        <!-- main content area start -->\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <!-- header area start -->\n");
      out.write("            <div class=\"header-area\">\n");
      out.write("                <div class=\"row align-items-center\">\n");
      out.write("                    <!-- nav and search button -->\n");
      out.write("                    <div class=\"col-md-6 col-sm-8 clearfix\">\n");
      out.write("                        <div class=\"nav-btn pull-left\">\n");
      out.write("                            <span></span>\n");
      out.write("                            <span></span>\n");
      out.write("                            <span></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- profile info & task notification -->\n");
      out.write("                    <div class=\"col-md-6 col-sm-4 clearfix\">\n");
      out.write("                        <ul class=\"notification-area pull-right\">\n");
      out.write("                            <li id=\"full-view\"><i class=\"ti-fullscreen\"></i></li>\n");
      out.write("                            <li id=\"full-view-exit\"><i class=\"ti-zoom-out\"></i></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- header area end -->\n");
      out.write("\n");
      out.write("            <!-- page title area start -->\n");
      out.write("            <div class=\"page-title-area\">\n");
      out.write("                <div class=\"row align-items-center\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <div class=\"breadcrumbs-area clearfix\">\n");
      out.write("                            <h4 class=\"page-title pull-left\">Home</h4>\n");
      out.write("                            <ul class=\"breadcrumbs pull-left\">\n");
      out.write("                                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6 clearfix\">\n");
      out.write("                        <div class=\"user-profile pull-right\">\n");
      out.write("                            <img class=\"avatar user-thumb\" src=\"assets/images/author/avatar.png\" alt=\"avatar\">\n");
      out.write("                            <h4 class=\"user-name dropdown-toggle\" data-toggle=\"dropdown\">");
      out.print(name);
      out.write("<i class=\"fa fa-angle-down\"></i></h4>\n");
      out.write("                            <div class=\"dropdown-menu\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"ShowEditUserServlet?username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Edit Info</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"login.jsp\">Log Out</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- page title area end -->\n");
      out.write("            <div class=\"main-content-inner\">\n");
      out.write("                <div class=\"col-12 mt-5\">\n");
      out.write("                    <img src=\"assets/images/banner.jpeg\" style=\"height: 1%;\" alt=\"Home\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h1 class=\"money_big\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");


                                    Connection con;
                                    ResultSet rs;

                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moneysavingsystem", "root", "admin");

                                    Statement st = con.createStatement();

                                    String query = "select sum(amount) from transaction where transaction_type = 'Expense' and username=" + "\'" + username + "\'";
                                    String realQuery = query;
                                    double expense = 0;
                                    rs = st.executeQuery(realQuery);

                                    while (rs.next()) {
                                        if (rs.getString(1) == null) {
                                            expense = 0;
                                        } else {
                                            expense = Double.parseDouble(rs.getString(1));
                                        }
                                    }

                                    double income = 0;

                                    String query1 = "select sum(amount) from transaction where transaction_type = 'Income' and username=" + "\'" + username + "\'";
                                    String realQuery1 = query1;
                                    rs = st.executeQuery(realQuery1);

                                    while (rs.next()) {
                                        if (rs.getString(1) == null) {
                                            income = 0;
                                        } else {
                                            income = Double.parseDouble(rs.getString(1));
                                        }
                                    }

                                    Double balance = income - expense;
                                    
                                    NumberFormat formatter = NumberFormat.getCurrencyInstance();
                                    
                                    out.println("<h1>Balance: " + formatter.format(balance) + "</h1>");
                                    con.close();
                                
      out.write("\n");
      out.write("                            </h1><br><br>\n");
      out.write("\n");
      out.write("                            <div class=\"money_small\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"box\">\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            ");

                                                out.println("<h3> Expense</h3>");
                                                out.println("<p>" + formatter.format(expense) + "</p>");
                                            
      out.write("\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"box\" >\n");
      out.write("                                        <div class=active>\n");
      out.write("                                            <div class=\"content\" id=\"totalIncome\" name=\"totalIncome\">\n");
      out.write("                                                ");

                                                    out.println("<h3> Income</h3>");
                                                    out.println("<p>" + formatter.format(income) + "</p>");
                                                
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div></div><br><br><br>\n");
      out.write("                            <span>Start something small today and someday it will expand like the ocean. Remember to start save money as early as possible.</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- row area start-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- main content area end -->\n");
      out.write("        <!-- footer area start-->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footer-area\">\n");
      out.write("                <p>Copyright 2021. All right reserved. Template by Group 2</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- footer area end-->\n");
      out.write("    </div>\n");
      out.write("    <!-- page container area end -->\n");
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
      out.write("\n");
      out.write("    <!-- start chart js -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js\"></script>\n");
      out.write("    <!-- start highcharts js -->\n");
      out.write("    <script src=\"https://code.highcharts.com/highcharts.js\"></script>\n");
      out.write("    <!-- start zingchart js -->\n");
      out.write("    <script src=\"https://cdn.zingchart.com/zingchart.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("            zingchart.MODULESDIR = \"https://cdn.zingchart.com/modules/\";\n");
      out.write("            ZC.LICENSE = [\"569d52cefae586f634c54f86dc99e6a9\", \"ee6b7db5b51705a13dc2339db3edaf6d\"];\n");
      out.write("    </script>\n");
      out.write("    <!-- all line chart activation -->\n");
      out.write("    <script src=\"assets/js/line-chart.js\"></script>\n");
      out.write("    <!-- all pie chart -->\n");
      out.write("    <script src=\"assets/js/pie-chart.js\"></script>\n");
      out.write("    <!-- others plugins -->\n");
      out.write("    <script src=\"assets/js/plugins.js\"></script>\n");
      out.write("    <script src=\"assets/js/scripts.js\"></script>\n");
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
