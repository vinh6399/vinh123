<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Pattaya&amp;subset=vietnamese" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/main.css" />
        <title>JSP Page</title>
        <style>
            .myfont{
                font-family: 'Pattaya', sans-serif;
                font-size: 25px !important;
            }
        </style>
    </head>
    <body>
        <header id="header" ${param.class}>
            <div class="logo">
                <a href="/TravelProject/CityServlet">
                    <span class="myfont">VietnamTravel</span> <span style="font-size: 0.8rem">by student in FPTU</span>
                </a>
            </div>


            <!--<a class="nav-link" href="/TravelProject/user/index.jsp">USER</a>-->
            <a class="nav-link" href="/TravelProject/city">DU LỊCH</a>
            <a class="nav-link" href="/TravelProject/food">ẨM THỰC</a>
            <a class="nav-link" href="/TravelProject/News.jsp">NEWS</a>
            <a class="nav-link disabled" href="/TravelProject/ListSaveServlet">ĐỊA ĐIỂM CỦA BẠN</a>
            <a> <form method="get" action="SearchServlet" class="form-inline my-2 my-lg-0">
                    <input name="searchfield" value="${param.searchfield}"  type="text" placeholder="Search..." aria-label="Search.." >
                    <!--<button  type="submit">Search</button>-->
                </form>
            </a>

            <c:if test="${empty sessionScope.user}">
                <a href="/TravelProject/login.jsp" class=""><h1 style="color: #ffffff">ĐĂNG NHẬP</h1></a>
            </c:if>
            <c:if test="${not empty sessionScope.user}">

                <a href="#menu" class="">${sessionScope.user.accountName} </a>
            </c:if>


        </header>

        <!-- Nav -->
        <nav id="menu">
            <ul class="links">
                <c:if test="${sessionScope.user.role == 1}">
                      <li><a  href="admin">ADMIN Managerment</a></li>
                </c:if>
                <c:if test="${sessionScope.user.role != 1}">
                      <li><a  href="/TravelProject/EditInfo.jsp">sửa thông tin</a></li>
                </c:if>
                      
                <li><a href="/TravelProject/changepassword">Đổi mật khẩu</a></li>
                <li><a href="/TravelProject/LogoutServlet">Đăng xuất</a></li>
                <!--<li><a href="generic.html">Generic</a></li>-->
                <!--<li><a href="elements.html">Elements</a></li>-->
            </ul>
        </nav>
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/jquery.scrollex.min.js"></script>
        <script src="assets/js/skel.min.js"></script>
        <script src="assets/js/util.js"></script>
        <script src="assets/js/main.js"></script>
    </body>
</html>
