<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lab6</title>

</head>
<body>


<h2>Input data</h2><br />

<form method="post" action="">

    <label><input type="text" name="oper1"></label>Operand 1<br>

    <label><input type="text" name="oper2"></label>Operand 2<br>
    <h5>Select operation</h5>
    <select name="operation">
        <option value="plus">+</option>
        <option value="minus">-</option>
        <option value="multiplication">*</option>
        <option value="division">/</option>
    </select><br>

    <input type="submit" value="Ok" name="Ok"><br>
</form>
<h2>Output data</h2>
<c:forEach var="user" items="${requestScope.users}">
    <ul>

        <li>Operand 1: <c:out value="${user.oper1}"/></li>

        <li>Operand 2: <c:out value="${user.oper2}"/></li>
        <li>Operation: <c:out value="${user.operation}"/></li>
        <li>Result: <c:out value="${user.result}"/></li>
    </ul>
    <hr />

</c:forEach>
</body>
</html>
