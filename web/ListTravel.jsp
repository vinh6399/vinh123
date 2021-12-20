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
        <title>${citys.city_name}</title>
    </head>
    <body>
        <jsp:include page="navbar1.jsp"/>
            <!--<h1 class="text-center fontList">Thành phố {citys.city_name}</h1>-->
        <div class="wrapper style3 mywrapper" style="background-image: url('${citys.imgCity}');">
            <div class="inner">
                <header class="align-center">
                    <p>Thành phố ${citys.city_name}</p>
                    <h2>&nbsp;</h2>
                </header>
            </div>
        </div>
        <div class="container mt-5">
            <p class="lead">${citys.descriptions}</p>
            <!-- Content here -->
            <div class="row">
                <div class="col-8 mygrid">
                    <c:forEach var="x" items = "${travels}">
                        <div>
                            <div class="box mybox " style="">
                                <div class="image fit shadows" style="height: 400px; overflow: hidden;">
                                    <img src="${x.linkImage}" alt="sth" />
                                </div>
                                <div class="content">
                                    <header class="align-center">
                                        <h2 class="">${x.travelName}</h2>
                                    </header>
                                    <div class="descriptions" style="height: 110px;text-overflow: ellipsis;overflow: hidden;white-space: normal;margin-bottom: 2%;">
                                        <p > ${x.desc}</p>
                                    </div>
                                    <footer class="align-center mt-5">
                                        <a data-id="${x.travel_id}"  class="addbtn button alt mr-3">Lưu Địa Điểm</a>
                                        <c:url  var="detail" value="TravelDetailServlet">
                                            <c:param name="travelID" value="${x.travel_id}"/>
                                        </c:url>
                                        <a href="${detail}"class="button alt">Xem chi tiết</a>
                                    </footer>
                                </div>
                            </div>
                        </div>
                        <hr/>
                    </c:forEach>
                </div>
                <div class="col-4 mygrid">
                    <header class="align-center food title">
                        <h2 >Ẩm thực TP.${citys.city_name}</h2>
                    </header>
                    <hr>
                    <c:forEach var="x" items="${Foods}">
                        <span class="image left">
                            <img style="width: 100px;height: 100px" src="${x.imgFood}" alt="" />
                        </span>
                        <h2 class="food title">${x.foodName}</h2> 
                        <span class="food address">${x.address}</span></p>
                        <hr/>
                    </c:forEach>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <script>
        $('.addbtn').on('click', function (e) {
            let a = $(e.target).attr('data-id');
            console.log(a);
            $.ajax({
                url: "/TravelProject/AddListServlet",
                method: "post",
                data: {travelid: a},
                success: function (data, textStatus, jqXHR) {
                    console.log("data " + data);
                    if (data === 'loginnow') {
                        window.location.href = "/TravelProject/login.jsp";
                    }
                    console.log("okAdded");
                    $(e.target).html("Đã Lưu");
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    console.log(errorThrown + " loi roi");
                }
            });
        });
    </script>
</html>
