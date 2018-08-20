<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<link
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" />
</head>
<body>

<form:form modelAttribute="login" mehtod="post">
<h3>Bootstrap no rula</h3>
  <div class="form-group">
    <label for="userInput">Usuario: </label>
    <form:input type="user" class="form-control" id="userInput" path="login" placeholder="Usuario"/>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Contraseña: </label>
    <form:input type="password" class="form-control" id="exampleInputPassword1" path="password" placeholder="Contraseña"/>
  </div>
  <form:button type="submit" class="btn btn-danger">Entrar</form:button>
</form:form>
	<script type="text/javascript" src="/resources/js/jquery-3.3.1.js">
	</script>
	<script type="text/javascript" src="/resources/js/bootstrap.js">
	</script>
</body>
</html>

