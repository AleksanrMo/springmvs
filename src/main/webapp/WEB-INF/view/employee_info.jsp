<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="saveEmp" modelAttribute="employee">
    <form:hidden path = "id"/>
Name <form:input path="name"/>
Surname <form:input path="surname"/>
Department<form:input path="department"/>
Salary<form:input path="salary"/>
<input type="submit" value="OK"/>
    </form:form>
</body>
</html>
