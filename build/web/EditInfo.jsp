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
        <link rel="stylesheet"  href="./css/login.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                            <h1 class="myh1"><strong>THAY ĐỔI THÔNG TIN</strong></h1>
                            <p>Xin hãy nhập Họ Tên và email</p>
                        </div>
                        <form id="" action="edit" method="post">
                            <div class="form-group">
                                <input type="text" name="name" class="form-control" id="" value="${sessionScope.user.accountName}" placeholder="name" required>
                            </div>

                            <div class="form-group">
                                <input type="email" name="email" class="form-control" id="" value="${sessionScope.user.email}" placeholder="email" required>
                            </div>
                            <div class="forgot">
                            </div>
                            <p style="color: green">
                               ${success}
                            </p>
                            
                                 <%--<c:if test="${loginErr==null }">--%>
                                      <!--{sessionScope.loginAdminErr}-->
                                 <%--</c:if>--%>
                            
                                 <button type="submit" class="btn btn-primary" name="submit" value="ok" >GỬI</button>
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
