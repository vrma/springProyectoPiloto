<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-color: #B9C6CA !important;
}

.row {
	padding-top: 125px;
}

.login {
	border: 2px solid grey;
	padding-bottom: 30px;
	padding-right: 15px;
	padding-left: 15px;
	border-radius: 5px;
	background-color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>Login</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery-3.3.1.js">
	
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.js">
	
</script>

<link
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css"
	rel="stylesheet" type="text/css" />
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-4 col-xs-4"></div>
			<div class="col-md-4 col-xs-4 login">
				<form:form modelAttribute="login" mehtod="post">
					<h3 class="text-center">Login de Usuario</h3>
					<div class="form-group">
						<label for="userInput">Usuario: </label>
						<form:input type="user" class="form-control" id="userInput"
							path="login" placeholder="Usuario" />
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Contraseņa: </label>
						<form:input type="password" class="form-control"
							id="exampleInputPassword1" path="password"
							placeholder="Contraseņa" />
					</div>
					<form:button type="submit" class="btn btn-danger">Entrar</form:button>
				</form:form>
			</div>
			<div class="col-md-4 col-xs-4"></div>
		</div>
	</div>
</body>
</html>

