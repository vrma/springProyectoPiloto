<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<style>
.reservas {
	border: 2px solid grey;
	padding-bottom: 30px;
	padding-right: 15px;
	padding-left: 15px;
	border-radius: 5px;
	background-color: white;
}
</style>
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
						<a class="navbar-brand" href="propiedades.jsp">Portal de
							Reservas</a>
					</div>
					<ul class="nav navbar-nav">
						<li><a href="#">Inicio</a></li>
						<li><a href="#">Hoteles</a></li>
						<li><a href="#">Casa Rural</a></li>
						<li><a href="#">Apartamento</a></li>
						<li><a href="#">Casa en la Playa</a></li>
					</ul>
				</div>
			</nav>



			<div class="row">
				<div class="col-md-12 col-sm-6">
					<div class="carbox-content">
						<h2>${propiedad.nombre}</h2>
						<p>${propiedad.direccion},${propiedad.ubicacion}</p>
					</div>
				</div>

			</div>
			<div class="row">
				<div class="col-md-12 col-sm-6">
					<div class="crane_container">
						<a class="img-carbox"> <img
							src="${pageContext.request.contextPath}/resources/images/${propiedad.imagen}" />
						</a>
					</div>
				</div>
			</div>




			<div class="col-md-12 col-xs-4 reservas">

				<form:form modelAttribute="reservas" mehtod="POST">
					<form:input type="hidden" value="${reservas.propiedad}"
						path="propiedad" />
					<h3 class="text-center">Reserva</h3>
					<div class="form-group">
						<label for="nombre">Nombre: </label>
						<form:input type="text" class="form-control" id="nombre"
							path="nombre" placeholder="Nombre" />
					</div>
					<div class="form-group">
						<label for="primerApellido">Primer Apellido: </label>
						<form:input type="text" class="form-control" id="primerApellido"
							path="PrimerApellido" placeholder="Primer Apellido" />
					</div>
					<div class="form-group">
						<label for="segundoApellido">Segundo Apellido: </label>
						<form:input type="text" class="form-control" id="segundoApellido"
							path="segundoApellido" placeholder="Segundo Apellido" />
					</div>
					<div class="form-group">
						<label for="DNI">DNI: </label>
						<form:input type="text" class="form-control" id="DNI" path="dni"
							placeholder="DNI" />
					</div>
					<div class="form-group">
						<label for="fechaEntrada">Fecha Inicio: </label>
						<form:input class="form-control" id="fechaEntrada" path="fechaEntrada"
							placeholder="dd/mm/yyyy" />
					</div>
					<div class="form-group">
						<label for="fechaSalida">Fecha Salida: </label>
						<form:input class="form-control" id="fechaSalida" path="fechaSalida"
							placeholder="dd/mm/yyyy" />
					</div>


					<div class="form-group">
						<label for="correo">Correo: </label>
						<form:input type="text" class="form-control" id="correo"
							path="correo" placeholder="correo" />
					</div>
					<div class="form-group">
						<label for="telefono">Telefono: </label>
						<form:input type="text" class="form-control" id="telefono"
							path="telefono" placeholder="Telefono" />
					</div>
					<form:button type="submit" class="btn btn-danger">Reservar</form:button>
				</form:form>
			</div>
		</div>
		<br> <br>
	</div>

</body>
</html>