<%-- 
    Document   : rusultSearch
    Created on : Nov 6, 2018, 12:18:20 AM
    Author     : Nguyen Ngoc Hieu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Kết quả tìm kiếm</title>
        <style>
            .myh1{
                font-size: 2rem;
            }
        </style>
    </head>
    <body>
        <jsp:include page="navbar1.jsp"/>
        <!--<h1 class="text-center">Kết quả tìm kiếm</h1>-->

        <div class="wrapper style2">
            <div class="inner">
                <div class="box myshadow">
                    <div class="content">
                        <header class="align-center">

                            <h2 class="myh1">KẾT QUẢ TÌM KIẾM</h2>
                            <p>Tìm thấy ${sizeSearch} kết quả</p>
                        </header>
                        <div id="main" class="container">
                            <!-- Content here -->
                            <div class="row 200%">
                                <c:if test="${empty result}">
                                    <header class="align-center food title">
                                        <br>
                                        <h2>Không tìm thấy!</h2>
                                    </header>
                                </c:if>
                                <c:if test="${not empty result}" >
                                    <!--                                    <header class="align-center food title">
                                                                            <br>
                                                                            <h2>Kết Quả :</h2>
                                                                        </header>-->
                                    <div id="main" class="container d-flex justify-content-center">
                                        <div class="8u 12u(medium)">
                                            <c:forEach var="x" items = "${result}">
                                                <a href="https://www.google.com/" target="_blank"> 
                                                    <img class="card-img-top" src="${x.linkImage}" alt="Card image cap">
                                                </a> 
                                                <div class="card-body">
                                                    <h1 class="card-title myh1">${x.travelName}</h1>
                                                    <p class="card-text">${x.desc}</p>
                                                    <a data-id="${x.travel_id}"  class="addbtn button alt mr-2">Lưu địa điểm</a>
                                                    <c:url  var="detail" value="TravelDetailServlet">
                                                        <c:param name="travelID" value="${x.travel_id}"/>
                                                    </c:url>
                                                    <a href="${detail}" class="button alt">Chi tiết</a>
                                                </div>
                                                <hr/>
                                            </c:forEach>

                                        </div>
                                    </div>

                                </c:if>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>


        <jsp:include page="footer.jsp"/>
    </body> 
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <script>

//        $(document).ready(function () {
        $('.addbtn').on('click', function (e) {
            let a = $(e.target).attr('data-id');
            console.log(a);

            $.ajax({
                url: "/TravelProject/AddListServlet",
                method: "post",
//                dataType: 'json',
                data: {travelid: a},
//                data: JSON.stringify({travelid: a}),

                success: function (data, textStatus, jqXHR) {
                    console.log("data " + data);
                    if (data === 'loginnow') {
                        window.location.href = "/TravelProject/login.jsp";
                    }
                    console.log("okAdded");
                    $(e.target).html("ĐÃ LƯU");
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    console.log(errorThrown + " loi roi");
                }
            });
        });
//        });
    </script>
</html>