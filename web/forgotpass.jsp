<%-- 
    Document   : forgotpass
    Created on : Nov 6, 2018, 12:38:24 AM
    Author     : Nguyen Ngoc Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  href="./css/login.css"/>

        <title>Reset Password</title>
    </head>
    <body id="ForgotPass">
        <jsp:include page="navbar1.jsp"/>
        <div class="mywrapper " >
            <!--<div class="wrapper style2" >-->
            <div class="container">
                <div class="login-form">
                    <div class="main-div">
                        <div class="panel">
                            <h1 class="myh1">Khôi phục mật khẩu!</h1>
                            <p>Xin hãy nhập tên đăng nhập và email</p>
                        </div>
                        <form id="" action="ResetPassServlet" method="post">
                            <div class="form-group">
                                <input type="text" name="username" class="form-control" placeholder="Username" required>
                            </div>

                            <div class="form-group">
                                <input type="email" name="email" class="form-control" placeholder="Email" required>
                            </div>
                            <p style="color: green">${success}</p>
                            <p style="color: red">${error}</p>
                            <button type="submit" class="btn btn-primary">Reset Password</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="myfooter">
            <jsp:include page="footer.jsp"/>
        </div>
    </body>
</html>
