<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://fonts.googleapis.com/css?family=Pattaya&amp;subset=vietnamese" rel="stylesheet">

        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body>
        <section class="banner full">
            <c:forEach var="x" items="${city}">
                <article>
                    <c:url  var="citys" value="TravelServlet">
                        <c:param name="id" value="${x.city_id}"/>
                    </c:url>
                    <img src="${x.imgCity}" alt="" />
                    <div class="inner">
                        <header>
                            <p>Du lịch thành phố ${x.city_name}</p>
                            <a href="${citys}"><h2 style="font-family: 'Pattaya', sans-serif;">${x.city_name}</h2></a>
                        </header>
                    </div>
                </article>
            </c:forEach>
        </section>


        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/jquery.scrollex.min.js"></script>
        <script src="assets/js/skel.min.js"></script>
        <script src="assets/js/util.js"></script>
        <script src="assets/js/main.js"></script>
    </body>
</html>
