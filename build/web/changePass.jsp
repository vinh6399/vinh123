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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet"  href="./css/login.css"/>
        <title>Đổi mật khẩu</title>
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
                            <p>Thay đổi mật khẩu.</p>
                        </div>
                        <form id="" action="changepassword" method="post">
                            <div class="form-group">
                                <input type="password" name="curpass" class="form-control" id="" placeholder="Your password" required/>
                            </div>

                            <div class="form-group">
                                <input type="password" name="pass" class="pass form-control" id="" placeholder="New password" required/>
                            </div>
                            <div class="form-group">
                                <input type="password" name="repass" class="repass form-control" id="" placeholder="Re password" required/>
                            </div>
                            <p style="color: red">
                                ${error}
                            </p>
                            <span style="font-size: 2erm" id="mess"></span>
                            <p style="color: green">
                                ${success}
                            </p>

                            <%--<c:if test="${loginErr==null }">--%>
                            <!--{sessionScope.loginAdminErr}-->
                            <%--</c:if>--%>

                            <button   disabled   type="submit" class="btn btn-primary" name="submit" value="ok">Đổi mật khẩu</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div  class="myfooter">
            <jsp:include page="footer.jsp"/>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <script>
            $(".repass").on('input', function (e){
                console.log('123 :  '+$(".pass").val());
                if($(e.target).val() ===$('.pass').val()){
                    $('#mess').css("color","green");
                    $('#mess').html("Khớp mật khẩu");
                    $('.btn').prop("disabled",false);
                }else{
                     $('#mess').css("color","red");
                    $('#mess').html("Không khớp mật khẩu");
                    $('.btn').prop("disabled",true);
                }
            });
                $(".pass").on('input', function (e){
                if($(e.target).val() ===$('.repass').val()){
                    $('#mess').css("color","green");
                    $('#mess').html("Khớp mật khẩu");
                    $('.btn').prop("disabled",false);
                }else{
                     $('#mess').css("color","red");
                    $('#mess').html("Không khớp mật khẩu");
                    $('.btn').prop("disabled",true);
                }
            });
        </script>
    </body>
</html>
