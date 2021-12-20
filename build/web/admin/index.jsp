<%-- 
    Document   : index
    Created on : Nov 2, 2018, 1:15:10 AM
    Author     : Nguyen Ngoc Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>ADMIN</title>
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
        <div class="container mt-5">
            <br>
            <!--            <h1>Admin index ( Authentication and Authorization required )</h1>
                        <h1>Welcome user ${sessionScope.user.username}</h1>
                        <h1>last accessed time </h1>-->
            <!-- TAB BTN-->
            <div class="tab">
                <button class="tablinks" onclick="openCity(event, 'User management')" ${defaultB}${defaultB==null&&defaultH==null?"id='defaultOpen'":""}>User management</button>
                <button class="tablinks" onclick="openCity(event, 'City Management')" ${defaultH}>City Management</button>
            </div>
            <!-- TAB BTN-->
            <div id="User management" class="tabcontent">
                <form >
                    <table boder="1" cellspacing="0">
                        <th>Account Name</th><th>User Name</th> <th>Role</th><th>email</th><th>More</th>
                            <c:forEach var="x" items="${userList}">
                            <tr>
                                <td>${x.accountName}</td>
                                <td>${x.username}</td>
                                <td>${x.role==1?" Admin ":" Member "}</td>
                                <td>${x.email}</td>
                                <c:url var="block" value="adminblock"> 
                                    <c:param name="accountName" value="${x.username}"/>
                                    <c:param name="role" value="${x.role}"/>
                                </c:url>
                                <c:if test="${x.role!=1 && x.role==0}">
                                    <td><a  class="button alt" href="${block}"><small style="color: #d43f3a">Block</small></a></td>
                                </c:if>
                                <c:if test="${x.role!=1 && x.role!=0}">
                                    <td><a class="button alt" href="${block}"><small style="color: green">UnBlock</small></a></td>
                                </c:if>
                            </tr>
                        </c:forEach>
                    </table>
                </form>
            </div>

            <div id="City Management" class="tabcontent">
                <form>
                    <table boder="2" >
                        <th>City Name</th>
                        <th>Travel</th>
                            <c:forEach var="x" items="${cityList}">
                            <tr>
                                <td>${x.city_name}</td>
                                <td>
                                    <form>
                                        <table border="1">
                                            <th>Travel ID</th><th>City ID</th><th>Travel Name</th><th>More</th>
                                                <c:forEach var="t" items="${x.travels}">
                                                <tr>
                                                    <td>${t.travel_id}</td>
                                                    <td>${t.city_id}</td>
                                                    <td>${t.travelName}</td>
                                                    <c:url var="hide" value="hidetravel"> 
                                                        <c:param name="travelid" value="${t.travel_id}"/>
                                                        <c:param name="status" value="${t.status}"/>
                                                    </c:url>
                                                    <!--<td><a href="${hide}">Hide</a></td>-->

                                                    <c:if test="${t.status==1}">
                                                        <td><a  class="button alt" href="${hide}"><small style="color: #d43f3a">Ẩn</small></a></td>
                                                    </c:if>
                                                    <c:if test="${t.status==0}">
                                                        <td><a class="button alt" href="${hide}"><small style="color: green">Bỏ ẩn</small></a></td>
                                                    </c:if>

                                                <tr>
                                                </c:forEach>
                                        </table>
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </form>
            </div>
        </div>
        <jsp:include page="../footer.jsp"/>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <script>
                    function openCity(evt, cityName) {
                        var i, tabcontent, tablinks;
                        tabcontent = document.getElementsByClassName("tabcontent");
                        for (i = 0; i < tabcontent.length; i++) {
                            tabcontent[i].style.display = "none";
                        }
                        tablinks = document.getElementsByClassName("tablinks");
                        for (i = 0; i < tablinks.length; i++) {
                            tablinks[i].className = tablinks[i].className.replace(" active", "");
                        }
                        document.getElementById(cityName).style.display = "block";
                        evt.currentTarget.className += " active";
                    }

                    // Get the element with id="defaultOpen" and click on it
                    document.getElementById("defaultOpen").click();
                    
                    //hidden click
         
    </script>
</html>
