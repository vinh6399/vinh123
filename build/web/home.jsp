<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="assets/css/main.css" />
        <link href="https://fonts.googleapis.com/css?family=Pattaya&amp;subset=vietnamese" rel="stylesheet">
        <style>
            .myfont{
                font-family: 'Pattaya', sans-serif;
            }
        </style>
    </head>
    <body>
        <jsp:include page="navbar1.jsp">
            <jsp:param name="class" value="class='alt'"/>
        </jsp:include>
        <jsp:include page="header1.jsp"/>



        <!--<section id="one" class="wrapper style2">-->
        <div class="wrapper style2" >
            <div class="inner">
                <div class="grid-style">
                    <c:forEach var="x" items="${city}">
                        <c:url  var="citys" value="TravelServlet">
                            <c:param name="id" value="${x.city_id}"/>
                        </c:url>
                        <div>
                            <div class="box mybox" style="box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">
                                <div class="image fit shadows" style="height: 350px; overflow: hidden;">
                                    <img src="${x.imgCity}" alt="" />
                                </div>
                                <div class="content">
                                    <header class="align-center">
                                        <p>Du lịch thành phố ${x.city_name}</p>
                                        <h2 class="myfont">${x.city_name}</h2>
                                    </header>
                                    <div class="descriptions" style="height: 137px;text-overflow: ellipsis;overflow: hidden;white-space: normal;margin-bottom: 2%;">
                                        <p> ${x.descriptions}</p>
                                    </div>
                                    <footer class="align-center mt-5">
                                        <a href="${citys}" class="button alt">Xem Thêm</a>
                                    </footer>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <!--</section>-->
        <!-- Two -->
        <!--<section id="two" class="wrapper style3">-->
        <div class="wrapper style3">
            <div class="inner">
                <header class="align-center">
                    <p>Du lịch Việt Nam</p>
                    <h2>Hình Ảnh Nổi Bật</h2>
                </header>
            </div>
        </div>
        <!--</section>-->
        <!-- Three -->
        <!--<section id="three" class="wrapper style2">-->
        <div class="wrapper style2">
            <div class="inner">
                <header class="align-center">
                    <p class="special">Việt Nam - Vẻ đẹp bất tận</p>
                    <h2 class="myfont">WELCOME TO VIET NAM </h2>
                </header>
                <div class="gallery">
                    <c:forEach var="x" items="${imgSpecial}">
                        <div>
                            <div class="image fit">
                                <a href="#"><img src="images/${x}" alt="" /></a>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <!--</section>-->
        <!-- Footer -->
        <!--        <footer id="footer">
                    <div class="container">
                        <ul class="icons">
                            <li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
                            <li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
                            <li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
                            <li><a href="#" class="icon fa-envelope-o"><span class="label">Email</span></a></li>
                        </ul>
                    </div>
                    <div class="copyright">
                        &copy; 2018 #TravelVietnam. All rights reserved.
                    </div>
                </footer>-->
        <jsp:include page="footer.jsp"/>

        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/jquery.scrollex.min.js"></script>
        <script src="assets/js/skel.min.js"></script>
        <script src="assets/js/util.js"></script>
        <script src="assets/js/main.js"></script>
    </body>
</html>
