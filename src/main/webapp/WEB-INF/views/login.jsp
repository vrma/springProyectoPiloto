<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href='<c:url value="/resources/css/bootstrap.css"></c:url>'
	rel="stylesheet" type="text/css" />
</head>
<body>

<form>
<h3>bootstrap no rula</h3>
  <div class="form-group">
    <label for="userInput">Usuario: </label>
    <input type="user" class="form-control" id="userInput"  placeholder="Usuario">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Contraseña: </label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Contraseña">
  </div>
  <button type="submit" class="btn btn-danger">Entrar</button>
</form>
	<script type="text/javascript" src="/resources/js/jquery-3.3.1.js">
	</script>
	<script type="text/javascript" src="/resources/js/bootstrap.js">
	</script>
</body>
</html>