<%-- 
    Document   : body
    Created on : Oct 18, 2018, 10:55:34 PM
    Author     : Nguyen Ngoc Hieu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>


        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet"  href="./css/listTravel.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>review food</title>
    </head>
    <body>
        <jsp:include page="navbar1.jsp"/>
        <!--<h1 class="text-center fontList">Thành phố {citys.city_name}</h1>-->
        <div class="wrapper style3 mywrapper mb-5" style="background-image: url('https://cmkt-image-prd.global.ssl.fastly.net/0.1.0/ps/1975968/1360/906/m1/fpnw/wm1/u327jilz1k5qg9zkqrolwekuw4qqxhwr8olzyznr86nyq1ykghyev1zacxaz4uj3-.jpg?1480686447&s=c83588a72c0940648334b98b3194568b');">
            <div class="inner">
                <header class="align-center">
                    <p>CHUYÊN MỤC ẨM THỰC</p>
                    <h2>&nbsp;ĐỊA ĐIỂM ĂN UỐNG</h2>
                </header>
            </div>
        </div>

        <c:forEach var="x" items="${citys}">
            <%--<c:url  var="citys" value="TravelServlet">--%>
            <%--<c:param name="id" value="${x.city_id}"/>--%>
            <%--</c:url>--%>
            <div class="wrapper style3" style="background-image: url('${x.imgCity}');">
                <div class="inner">
                    <header class="align-center">
                        <p>Địa điểm ăn uống </p>
                        <h2>${x.city_name}</h2>
                    </header>
                </div>
            </div>
            <div class="wrapper style2" >
                <div class="inner">
                    <div class="grid-style">
                        <c:forEach var="i" items="${x.foods}">
                            <div>
                                <div class="box mybox" style="box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">
                                    <div class="image fit shadows" style="height: 350px; overflow: hidden;">
                                        <img src="${i.imgFood}" alt="123" />
                                    </div>
                                    <div class="content">
                                        <header class="align-center">
                                            <p>${i.address}</p>
                                            <h2 class="myfont">${i.foodName}</h2>
                                        </header>
                                        <div class="descriptions" style="height: 137px;text-overflow: ellipsis;overflow: hidden;white-space: normal;margin-bottom: 2%;">
                                            <p> ${i.descFood}</p>
                                        </div>
<!--                                        <footer class="align-center mt-5">
                                            <a href="{citys}" class="button alt">Xem Thêm</a>
                                        </footer>-->
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </c:forEach>

        <jsp:include page="footer.jsp"/>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</html>
