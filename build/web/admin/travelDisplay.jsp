<%-- 
    Document   : travelDisplay
    Created on : Nov 6, 2018, 1:52:27 AM
    Author     : SomethingSpecial
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
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
                                            <c:url var="hide" value="HideTravelServlet"> 
                                                <c:param name="travel_id" value="${t.travel_id}"/>
                                                <c:param name="city_id" value="${t.city_id}"/>
                                            </c:url>
                                            <td><a href="${hide}">Hide</a></td>
                                        <tr>
                                        </c:forEach>
                                </table>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </form>
    </body>
</html>
