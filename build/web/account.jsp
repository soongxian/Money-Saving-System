

<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<!doctype html>
<html class="no-js" lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Money Manager</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href="assets/images/icon/favicon.ico">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/themify-icons.css">
        <link rel="stylesheet" href="assets/css/metisMenu.css">
        <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
        <link rel="stylesheet" href="assets/css/slicknav.min.css">
        <!-- amchart css -->
        <link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />
        <!-- others css -->
        <link rel="stylesheet" href="assets/css/typography.css">
        <link rel="stylesheet" href="assets/css/default-css.css">
        <link rel="stylesheet" href="assets/css/styles.css">
        <link rel="stylesheet" href="assets/css/responsive.css">
        <link rel="stylesheet" href="assets/css/sendiritambah.css">
        <script>

        </script>
        <!-- modernizr css -->
    <button></button>
    <script src="assets/js/vendor/modernizr-2.8.3.min.js"></script>
</head>
<%

    String username = (String) session.getAttribute("username");
    String name = (String) session.getAttribute("name");
    session.setAttribute("username", username);
%>

<body>
    <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
    <!-- preloader area start -->
    <div id="preloader">
        <div class="loader"></div>
    </div>
    <!-- preloader area end -->
    <!-- page container area start -->
    <div class="page-container">
        <!-- sidebar menu area start -->
        <div class="sidebar-menu">
            <div class="sidebar-header">
                <div class="logo">
                    <a href="index.jsp"><img src="assets/images/icon/logo.png" alt="logo"></a>
                </div>
            </div>
            <div class="main-menu">
                <div class="menu-inner">
                    <nav>
                        <ul class="metismenu" id="menu">
                            <li><a href="http://localhost:8080/Money_Saving_System/Index?username=${username}" aria-expanded="true"><i class="ti-dashboard"></i><span>Home</span></a></li>
                            <li  class="active"><a href="http://localhost:8080/Money_Saving_System/Account?username=${username}" aria-expanded="true"><i class="ti-slice"></i><span>Source</span></a></li>
                            <li>
                                <a href="javascript:void(0)" aria-expanded="true"><i class="fa fa-table"></i> <span>Finance</span></a>
                                <ul class="collapse">
                                    <li><a href="http://localhost:8080/Money_Saving_System/ListTransactionServlet?month=0&year=0&username=${username}">Manage Financial Statement</a></li>
                                    <li><a href="http://localhost:8080/Money_Saving_System/ShowNewIncomeFormServlet?username=${username}">Add Income</a></li>
                                    <li><a href="http://localhost:8080/Money_Saving_System/ShowNewExpenseFormServlet?username=${username}">Add Expense</a></li>
                                    <li><a href="http://localhost:8080/Money_Saving_System/ShowNewTransferFormServlet?username=${username}">Add Transfer</a></li>
                                    
                                </ul>
                            </li>
                            <li><a href="http://localhost:8080/Money_Saving_System/ListBudgetServlet?username=${username}"><i class="ti-pie-chart"></i><span>Budget</span></a></li>
                            <li>
                                <a href="javascript:void(0)" aria-expanded="true"><i class="fa fa-align-left"></i> <span>Additional Information</span></a>
                                <ul class="collapse">
                                    <li><a href="http://localhost:8080/Money_Saving_System/ListFinancialAdvisorServlet?username=${username}">Financial Advisor</a></li>
                                </ul>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
        <!-- sidebar menu area end -->
        <!-- main content area start -->
        <div class="main-content">
            <!-- header area start -->
            <div class="header-area">
                <div class="col-md-6 col-sm-8 clearfix">
                    <div class="nav-btn pull-left">
                        <span></span>
                        <span></span>
                        <span></span>
                    </div>

                </div>
                <div class="row align-items-center">

                    <div class="col-md-6 col-sm-8 clearfix">
                    </div>
                    <!-- profile info & task notification -->
                    <div class="col-md-6 col-sm-4 clearfix">
                        <ul class="notification-area pull-right">
                            <li id="full-view"><i class="ti-fullscreen"></i></li>
                            <li id="full-view-exit"><i class="ti-zoom-out"></i></li>

                        </ul>
                    </div>
                </div>
            </div>
            <!-- header area end -->

            <!-- page title area start -->
            <div class="page-title-area">
                <div class="row align-items-center">
                    <div class="col-sm-6">
                        <div class="breadcrumbs-area clearfix">
                            <h4 class="page-title pull-left">Account</h4>
                            <ul class="breadcrumbs pull-left">
                                <li><a href="index.jsp">Home</a></li>
                                <li><a href="account.jsp">Account</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-sm-6 clearfix">
                        <div class="user-profile pull-right">
                            <img class="avatar user-thumb" src="assets/images/author/avatar.png" alt="avatar">
                            <h4 class="user-name dropdown-toggle" data-toggle="dropdown"><%=name%><i class="fa fa-angle-down"></i></h4>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" href="ShowEditUserServlet?username=${username}">Edit Info</a>
                                <a class="dropdown-item" href="login.jsp">Log Out</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- page title area end -->
            <div class="main-content-inner">
                <div class="col-12 mt-5">
                    <div class="card">
                        <div class="card-body">
                            <table class="table text-center">
                                <thead class="text-uppercase bg-primary">
                                    <tr class="text-white">
                                        <th scope="col">Asset</th>
                                        <th style="background-color: red;" scope="col">Liability</th>
                                        <th style="background-color: rgb(221, 136, 25);" scope="col">Total</th>

                                    </tr>
                                </thead>
                                <tbody>
                                    <tr style="background-color: rgb(250, 250, 250);" scope="row">
                                        <%
                                            Connection con;

                                            ResultSet rs;
                                            Class.forName("com.mysql.jdbc.Driver");
                                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moneysavingsystem", "root", "admin");

                                            Statement st = con.createStatement();

                                            String query = "select sum(amount) from transaction where transaction_type = 'Expense' and username=" + "\'" + username + "\'";
                                            String realQuery = query;
                                            double liability = 0;
                                            rs = st.executeQuery(realQuery);

                                            while (rs.next()) {
                                                if (rs.getString(1) == null) {
                                                    liability = 0;
                                                } else {
                                                    liability = Double.parseDouble(rs.getString(1));
                                                }
                                            }

                                            double asset = 0;

                                            String query1 = "select sum(amount) from transaction where transaction_type = 'Income' and username=" + "\'" + username + "\'";
                                            String realQuery1 = query1;
                                            rs = st.executeQuery(realQuery1);

                                            while (rs.next()) {
                                                if (rs.getString(1) == null) {
                                                    asset = 0;
                                                } else {
                                                    asset = Double.parseDouble(rs.getString(1));
                                                }
                                            }
                                            NumberFormat formatter = NumberFormat.getCurrencyInstance();

                                            Double total = asset - liability;

                                            out.println("<td>" + formatter.format(asset) + "</td>");
                                            out.println("<td>" + formatter.format(liability) + "</td>");
                                            out.println("<td>" + formatter.format(total) + "</td>");

                                        %>
                                    </tr>

                                </tbody>
                            </table>         
                        </div>
                    </div>

                    <div class="card">
                        <div class="card-body">
                            <div class="single-table">
                                <div class="table-responsive">
                                    <table class="table text-center">
                                        <thead class="text-uppercase bg-dark">
                                            <tr class="text-white">
                                                <th scope="col">Source</th>
                                                <th scope="col">Balance</th>
                                            </tr>
                                        </thead>
                                        <tbody>

                                            <%                                                
                                                Class.forName("com.mysql.jdbc.Driver");
                                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moneysavingsystem", "root", "admin");

                                                Statement state = con.createStatement();

                                                String cashSqlIncome = "(select sum(amount) from transaction where source_name='Cash' and transaction_type='Income' and username=" + "\'" + username + "\'" + ")";
                                                String cashSqlIncomeReal = cashSqlIncome;
                                                rs = state.executeQuery(cashSqlIncomeReal);
                                                double cashSourceIncome = 0;
                                                while (rs.next()) {
                                                    if (rs.getString(1) == null) {
                                                        cashSourceIncome = 0;
                                                    } else {
                                                        cashSourceIncome = Double.parseDouble(rs.getString(1));
                                                    }
                                                }
                                                String cashSqlExpense = "(select sum(amount) from transaction where source_name='Cash' and transaction_type='Expense' and username=" + "\'" + username + "\'" + ")";
                                                String cashSqlExpenseReal = cashSqlExpense;
                              
                                                rs = state.executeQuery(cashSqlExpenseReal);
                                                double cashSourceExpense = 0;
                                                while (rs.next()) {
                                                    if (rs.getString(1) == null) {
                                                        cashSourceExpense = 0;
                                                    } else {
                                                        cashSourceExpense = Double.parseDouble(rs.getString(1));
                                                    }
                                                }

                                                double cashSource = cashSourceIncome - cashSourceExpense;

                                                String accountSqlIncome = "(select sum(amount) from transaction where source_name='Account' and transaction_type='Income' and username=" + "\'" + username + "\'" + ")";
                                                String accountSqlIncomeReal = accountSqlIncome;
                                                rs = state.executeQuery(accountSqlIncomeReal);
                                                double accountSourceIncome = 0;
                                                while (rs.next()) {
                                                    if (rs.getString(1) == null) {
                                                        accountSourceIncome = 0;
                                                    } else {
                                                        accountSourceIncome = Double.parseDouble(rs.getString(1));
                                                    }
                                                }
                                                String accountSqlExpense = "(select sum(amount) from transaction where source_name='Account' and transaction_type='Expense' and username=" + "\'" + username + "\'" + ")";
                                                String accountSqlExpenseReal = accountSqlExpense;
                                                rs = state.executeQuery(accountSqlExpenseReal);
                                                double accountSourceExpense = 0;
                                                while (rs.next()) {
                                                    if (rs.getString(1) == null) {
                                                        accountSourceExpense = 0;
                                                    } else {
                                                        accountSourceExpense = Double.parseDouble(rs.getString(1));
                                                    }
                                                }

                                                double accountSource = accountSourceIncome - accountSourceExpense;

                                                String cardSqlIncome = "(select sum(amount) from transaction where source_name='Card' and transaction_type='Income' and username=" + "\'" + username + "\'" + ")";
                                                String cardSqlIncomeReal = cardSqlIncome;
                                                rs = state.executeQuery(cardSqlIncomeReal);
                                                double cardSourceIncome = 0;
                                                while (rs.next()) {
                                                    if (rs.getString(1) == null) {
                                                        cardSourceIncome = 0;
                                                    } else {
                                                        cardSourceIncome = Double.parseDouble(rs.getString(1));
                                                    }
                                                }
                                                String cardSqlExpense = "(select sum(amount) from transaction where source_name='Card' and transaction_type='Expense' and username=" + "\'" + username + "\'" + ")";
                                                String cardSqlExpenseReal = cardSqlExpense;
                                                rs = state.executeQuery(cardSqlExpenseReal);
                                                double cardSourceExpense = 0;
                                                while (rs.next()) {
                                                    if (rs.getString(1) == null) {
                                                        cardSourceExpense = 0;
                                                    } else {
                                                        cardSourceExpense = Double.parseDouble(rs.getString(1));
                                                    }
                                                }

                                                double cardSource = cardSourceIncome - cardSourceExpense;

                                                con.close();
                                            %>

                                            <%
                                                if (cashSource > 0) {
                                                    out.println("<tr class='earning-total'>");
                                                } else {
                                                    out.println("<tr class='spending-total'>");
                                                }
                                            %> 

                                        <th>Cash</th>
                                        <td><%=formatter.format(cashSource)%></td>

                                        </tr>

                                        <%
                                            if (accountSource > 0) {
                                                out.println("<tr class='earning-total'>");
                                            } else {
                                                out.println("<tr class='spending-total'>");
                                            }
                                        %>   
                                        <th>Account</th>
                                        <td><%=formatter.format(accountSource)%></td>
                                        </tr>
                                        <%
                                            if (cardSource > 0) {
                                                out.println("<tr class='earning-total'>");
                                            } else {
                                                out.println("<tr class='spending-total'>");
                                            }
                                        %>   
                                        <th class="spending-total">Card</th>
                                        <td><%=formatter.format(cardSource)%></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>




                <!-- row area start-->
            </div>
        </div>
        <!-- main content area end -->
        <!-- footer area start-->
        <footer>
            <div class="footer-area">
                <p>© Copyright 2021. All right reserved. Template by Group 2</p>
            </div>
        </footer>
        <!-- footer area end-->
    </div>
    <!-- page container area end -->

    <!-- jquery latest version -->
    <script src="assets/js/vendor/jquery-2.2.4.min.js"></script>
    <!-- bootstrap 4 js -->
    <script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/owl.carousel.min.js"></script>
    <script src="assets/js/metisMenu.min.js"></script>
    <script src="assets/js/jquery.slimscroll.min.js"></script>
    <script src="assets/js/jquery.slicknav.min.js"></script>

    <!-- start chart js -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js"></script>
    <!-- start highcharts js -->
    <script src="https://code.highcharts.com/highcharts.js"></script>
    <!-- start zingchart js -->
    <script src="https://cdn.zingchart.com/zingchart.min.js"></script>
    <script>
            zingchart.MODULESDIR = "https://cdn.zingchart.com/modules/";
            ZC.LICENSE = ["569d52cefae586f634c54f86dc99e6a9", "ee6b7db5b51705a13dc2339db3edaf6d"];
    </script>
    <!-- all line chart activation -->
    <script src="assets/js/line-chart.js"></script>
    <!-- all pie chart -->
    <script src="assets/js/pie-chart.js"></script>
    <!-- others plugins -->
    <script src="assets/js/plugins.js"></script>
    <script src="assets/js/scripts.js"></script>
</body>

</html>
