<%-- 
    Document   : listSave
    Created on : Nov 2, 2018, 2:32:24 AM
    Author     : Nguyen Ngoc Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>List Save</title>
        <style>
            .myh1{
                font-size: 2rem;
            }
            .myimg{
                width: 200px;
            }
        </style>
    </head>
    <body>
        <jsp:include page="../navbar1.jsp"/>
        <!--<h1 class="text-center" style="margin-top: 100px; font-size: xx-large">List Save of ${sessionScope.user.accountName}</h1>-->

        <div class="wrapper style2">
            <div class="inner">
                <div class="box myshadow">
                    <div class="content">
                        <header class="align-center">
                            <h2 class="myh1">DANH SÁCH YÊU THÍCH</h2>
                            <p>${sessionScope.user.accountName}</p>
                        </header>
                        <div id="main" class="container d-flex justify-content-center">
                            <div class="8u ">
                                <c:forEach var="x" items = "${list}">
                                    <div class="box mybox myshadow" style="">
                                        <div class="image fit shadows">
                                            <img src="${x.linkImage}" alt="sth" />
                                        </div>
                                        <div class="content">
                                            <header class="align-center">
                                                <h2 class="">${x.travelName}</h2>
                                            </header>
                                            <div class="descriptions" style="text-overflow: ellipsis;overflow: hidden;white-space: normal;margin-bottom: 2%;">
                                                <p> ${x.desc}</p>
                                            </div>
                                            <footer class="align-center mt-5">
                                                <c:url  var="dele" value="DeleListServlet">
                                                    <c:param name="travelID" value="${x.travel_id}"/>
                                                </c:url>
                                                <a href="${dele}" class="delebtn button alt">Xoá địa điểm</a>
                                                <c:url  var="detail" value="TravelDetailServlet">
                                                    <c:param name="travelID" value="${x.travel_id}"/>
                                                </c:url>
                                                <a href="${detail}"class="button alt">Xem Chi Tiết</a>
                                            </footer>
                                        </div>
                                        <hr/>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp"/>
    </body>
</html>
