<%-- 
    Document   : travelDetail
    Created on : Oct 26, 2018, 2:58:13 AM
    Author     : Nguyen Ngoc Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="assets/css/main.css" />
        <title>Travel</title>
    </head>
    <body>
        <!--        <h1 class="text-center">{detail.name}</h1>
                <div class="container">
                    <p class="lead">{detail.content}</p>
                    <div class="embed-responsive embed-responsive-21by9">
                        <iframe width="560" height="315" src="https://www.youtube.com/embed/{detail.video}?autoplay=1" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
        
                    </div>
                </div>-->

        <jsp:include page="navbar1.jsp"/>
        <section id="One" class="wrapper style3" style="background-image: url('${imageBackground}');">
            <div class="inner">
                <header class="align-center">
                    <p>${city}</p>
                    <h2>${detail.name}</h2>
                </header>
            </div>
        </section>

        <!-- Two -->
        <section id="two" class="wrapper style2">
            <div class="inner">
                <div class="box">
                    <div class="content">
                        <header class="align-center">
                            <p>Thành phố ${city}</p>
                            <h2>${detail.name}</h2>
                        </header>
                        <p>${travel.desc}</p>
                        <div class="embed-responsive embed-responsive-21by9">
                            <iframe width="560" height="315" src="https://www.youtube.com/embed/${detail.video}?autoplay=1" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
                        </div>
                        <br><br><br>
                        <p>${detail.content}</p>
                        <c:if test="${empty images}">
                            <p>img</p>
                        </c:if>
                        <c:if test="${not empty images}">
                            <c:forEach var="x" items = "${images}">
                                <div class="text-center">
                                    <img src="${x.linkImage}" class="img-fluid rounded" alt="1">
                                </div>
                                <p class="text-center">${x.name}</p>
                                <p class="text-center">${x.imgDecs}</p>
                            </c:forEach>
                        </c:if>

                    </div>
                </div>
            </div>
        </section>
        <jsp:include page="footer.jsp"/>
        <!-- Scripts -->
<!--        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/jquery.scrollex.min.js"></script>
        <script src="assets/js/skel.min.js"></script>
        <script src="assets/js/util.js"></script>
        <script src="assets/js/main.js"></script>-->
    </body>
</html>
