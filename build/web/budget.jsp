<%@page import="java.math.RoundingMode"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="Controller.BudgetDAO"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                            <li><a href="http://localhost:8080/Money_Saving_System/Index?username=" aria-expanded="true"><i class="ti-dashboard"></i><span>Home</span></a></li>
                            <li><a href="http://localhost:8080/Money_Saving_System/Account?username=${username}" aria-expanded="true"><i class="ti-slice"></i><span>Source</span></a></li>
                            <li>
                                <a href="javascript:void(0)" aria-expanded="true"><i class="fa fa-table"></i> <span>Finance</span></a>
                                <ul class="collapse">
                                    <li><a href="http://localhost:8080/Money_Saving_System/ListTransactionServlet?month=0&year=0&username=${username}">Manage Financial Statement</a></li>
                                    <li><a href="http://localhost:8080/Money_Saving_System/ShowNewIncomeFormServlet?username=${username}">Add Income</a></li>
                                    <li><a href="http://localhost:8080/Money_Saving_System/ShowNewExpenseFormServlet?username=${username}">Add Expense</a></li>
                                    <li><a href="http://localhost:8080/Money_Saving_System/ShowNewTransferFormServlet?username=${username}">Add Transfer</a></li>

                                </ul>
                            </li>
                            <li class="active"><a href="http://localhost:8080/Money_Saving_System/ListBudgetServlet?username=${username}"><i class="ti-pie-chart"></i><span>Budget</span></a></li>
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
                            <h4 class="page-title pull-left">Budget</h4>
                            <ul class="breadcrumbs pull-left">
                                <li><a href="index.jsp">Home</a></li>
                                <li><a href="budget.jsp">Budget</a></li>
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
                            <div class="single-table">
                                <div class="table-responsive">
                                    <table class="table text-center">
                                        <thead class="text-uppercase bg-dark">
                                            <tr class="text-white">
                                                <th scope="col">Category</th>
                                                <th scope="col">Limit</th>
                                                <th scope="col">Current</th>
                                                <th scope="col">Remaining</th>
                                                <th scope="col">Percentage</th>
                                                <th scope="col">Edit</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <tbody>
                                            <c:forEach var="budget" items="${listBudget}">
                                                <tr>
                                                    <td>
                                                        <c:out value="${budget.category_name}"/>                                       
                                                    </td>
                                                    <td>

                                                        <c:set var="limit" value="${budget.limit_amount}" scope="request" />
                                                        <%
                                                            Double limit_amount = (Double) request.getAttribute("limit");
                                                            NumberFormat formatter = NumberFormat.getCurrencyInstance();
                                                        %>
                                                        <%=formatter.format(limit_amount)%>  

                                                    </td>

                                                    <td>
                                                        <c:set var="category_name" value="${budget.category_name}" scope="request"/> 
                                                        <%
                                                            String category_name = (String) request.getAttribute("category_name");
                                                            Connection con;
                                                            ResultSet rs;

                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moneysavingsystem", "root", "admin");

                                                            Statement st = con.createStatement();
                                                            String GET_SUM_SQL = "SELECT sum(amount) FROM transaction inner join budget on transaction.category_name=budget.category_name where budget.category_name=" + "\'" + category_name + "\'" +"and transaction.username=" + "\'" + username + "\'";
                                                            String GET_SUM_REAL_SQL = GET_SUM_SQL;
                                                            rs = st.executeQuery(GET_SUM_REAL_SQL);

                                                            String current_amount = "0";
                                                            Double current_amount_value = 0.0;
                                                            while (rs.next()) {
                                                                if (rs.getString(1) != null) {
                                                                    current_amount = rs.getString(1);

                                                                } else {
                                                                    current_amount = "0";
                                                                }
                                                                current_amount_value = Double.parseDouble(current_amount);
                                                                out.println(formatter.format(current_amount_value));
                                                            }

                                                        %>
                                                    </td>
                                                    <td>
                                                        <%                                                            
                                                            Double remaining = limit_amount - current_amount_value;
                                                            out.println(formatter.format(remaining));
                                                        %>

                                                    </td>
                                                    <td>
                                                        <%
                                                            Double percentage = ((current_amount_value / limit_amount) * 100);
                                                            DecimalFormat df2 = new DecimalFormat("#.##");
                                                            df2.setRoundingMode(RoundingMode.UP);
                                                            
                                                            out.println(df2.format(percentage)+" %");
                                                        %>

                                                    </td>



                                                    <td>

                                                        <a href="ShowEditBudgetFormServlet?category_name=${budget.category_name}&username=<%=username%>"><i class="ti-settings"></i></a>

                                                    </td>


                                                    </c:forEach>
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
