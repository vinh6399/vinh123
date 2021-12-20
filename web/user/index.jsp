<%-- 
    Document   : index
    Created on : Nov 2, 2018, 1:14:59 AM
    Author     : Nguyen Ngoc Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="../navBar.jsp"/>
        <h1>User index ( Authentication and Authorization required )</h1>
        <h1>Welcome user ${sessionScope.user.username}</h1>
        <h1>last accessed time </h1>
    </body>
</html>
