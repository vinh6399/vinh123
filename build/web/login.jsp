<%-- 
    Document   : Login
    Created on : Nov 2, 2018, 1:07:27 AM
    Author     : Nguyen Ngoc Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  href="./css/login.css"/>
        <title>Login</title>
    </head>
    <body id="LoginForm">
        <jsp:include page="navbar1.jsp"/>
        <div class="mywrapper " >
            <!--<div class="wrapper style2" >-->
            <div class="container">
                <div class="login-form">
                    <div class="main-div">
                        <div class="panel">
                            <h1 class="myh1"><strong>Xin Chào!</strong></h1>
                            <p>Xin hãy nhập tên đăng nhập và mật khẩu</p>
                        </div>
                        <form id="" action="LoginServlet" method="post">
                            <div class="form-group">
                                <input type="text" name="username" class="form-control" id="" placeholder="Username" required>
                            </div>

                            <div class="form-group">
                                <input type="password" name="password" class="form-control" id="" placeholder="Password" required>
                            </div>
                            <div class="forgot">
                                <a name="forgotpass" href="forgotpass.jsp">Quên mật khẩu?</a>
                                <p><a name="signup" href="SignUp.jsp">Đăng ký tài khoản.</a></p> 
                            </div>
                            <p style="color: red">
                               ${loginErr}
                            </p>
                            
                                 <%--<c:if test="${loginErr==null }">--%>
                                      <!--{sessionScope.loginAdminErr}-->
                                 <%--</c:if>--%>
                            
                            <button type="submit" class="btn btn-primary">Đăng Nhập</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div  class="myfooter">
            <jsp:include page="footer.jsp"/>
        </div>

    </body>
</html>
