<%-- 
    Document   : Login
    Created on : Nov 2, 2018, 1:07:27 AM
    Author     : Nguyen Ngoc Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  href="./css/login.css"/>
        <title>Sign Up</title>
    </head>
    <body id="LoginForm">
        <jsp:include page="navbar1.jsp"/>
        <div class="mywrapper " >
            <!--<div class="wrapper style2" >-->
            <div class="container">
                <div class="login-form">
                    <div class="main-div">
                        <div class="panel">
                            <h1 class="myh1"><strong>VIET TRAVEL</strong></h1>
                            <p>Đăng ký tài khoản</p>
                        </div>
                        <form id="" action="SignUpServlet" method="post">
                            <div class="form-group">
                                <input type="text" name="accname" class="form-control" id="" value="${signupsucces==null?param.accname:''}" placeholder="full name" required>
                            </div>
                            <div class="form-group">
                                <input type="text" name="username" class="form-control" value="${signupsucces==null?param.username:''}" id="" placeholder="Username" required>
                            </div>
                            <div class="form-group">
                                <input type="password" name="password" class="form-control"  id="" placeholder="Password" required>
                            </div>
                             <div class="form-group">
                                 <input type="email" name="email" class="form-control" value="${signupsucces==null?param.email:''}" id="" placeholder="email" required>
                            </div>
                            <div class="forgot">
                                <a name="login" href="login.jsp">Đăng nhập</a>
                            </div>
                            <p style="color: red">
                                ${signupErr}
                            </p>
                             <p style="color: green">
                                ${signupsucces}
                            </p>
                            <button type="submit" class="btn btn-primary">Đăng Ký</button>
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
