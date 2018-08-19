<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> --%>
<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href='<c:url value="/resources/bootstrap/css/bootstrap.css"></c:url>'
	rel="stylesheet" type="text/css" />
<link
	href='<c:url value="/resources/bootstrap/css/bootstrap-theme.css"></c:url>'
	rel="stylesheet" type="text/css" />
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<title>Principal</title>
</head>
<body>
    <h1>Esta pagina es la que hice la otra vez con bootstrap y funcionaba, pero no me tira el servidor, cuando se arregle miramos si funcion, que las
    vistas es un momento hacerlas.</h1>
	<h1>Bienvenido a la Pagina principal de Iván</h1>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-md-12">Imagen</div>
		</div>
		<div class="row">
			<div class="col-md-12">
			<img src="<c:url value="/resources/images/imagen${id }.jpg"></c:url>" class="img-responsive"/>
			</div>
		</div>
	</div>
	<br>



	<script type="text/javascript"
		src="/resources/bootstrap/js/bootstrap.js">
		</script>
</body>

</html>