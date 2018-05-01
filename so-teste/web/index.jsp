<%-- 
    Document   : index
    Created on : 01/05/2018, 19:04:36
    Author     : lavinia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><a href="ListarUsuarios">Listar</a></h1>
        <table>
            <thead>
                <tr>
                    <th> Foto </th>
                    <th> Nome </th>
                    <th> E-mail </th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="c" items="${applicationScope.users}">
                    <tr>
                        <td><c:out value="${c.foto}"/></td>
                        <td><c:out value="${c.nome}"/></td>
                        <td><c:out value="${c.email}"/></td>
                    </tr>
                </c:forEach> 
            </tbody>
        </table>    
    </body>
</html>
