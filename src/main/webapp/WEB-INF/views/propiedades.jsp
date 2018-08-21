<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Propiedades</title>
<script
	src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery-3.3.1.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css"
	rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/bootstrap/bootstrap/css/bootstrap-theme.css">
<script
	src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.js"></script>
<LINK REL=StyleSheet
	HREF="${pageContext.request.contextPath}/resources/css/proyecto.css"
	TYPE="text/css" MEDIA=screen>
<LINK REL=StyleSheet
	HREF="${pageContext.request.contextPath}/resources/css/custom.css"
	TYPE="text/css" MEDIA=screen>
</head>
<!-- Se crea esta tabla para ver el listado de propiedades, se creara el diseño por separado y cuando se pruebe
que sale toda la información correctamente se implementara aqui -->
<body>

<div class="container-fluid color_fondo">
	<div class="container">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">Portal de Reservas</a>
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Inicio</a></li>
					<li><a href="#">Hoteles</a></li>
					<li><a href="#">Casa Rural</a></li>
					<li><a href="#">Apartamento</a></li>
					<li><a href="#">Casa en la Playa</a></li>
				</ul>
			</div>
		</nav>
		<div class="row">
			<c:forEach items="${propiedades}" var="propiedades">
				<div class="col-md-4 col-sm-5">
					<div class="crane_container">
						<div class="ribbon_3 popular"><span>${propiedades.tipoPropiedad}</span></div>
						<a class="img-carbox"> <img src="${pageContext.request.contextPath}/resources/images/${propiedades.imagen}"/>
						</a>

						<div class="carbox-content">
							<h2>${propiedades.nombre}</h2>
							<h4>${propiedades.direccion}</h4>
							<h4>${propiedades.ubicacion}</h4>

						</div>
						<div class="carbox-read-more">
							<a href="reservar-${propiedades.direccion}" class="btn btn-link btn-block"> Reservar </a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	</div>

	<br />

</body>
</html>