<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>University Enrollments</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>

<!-- Se crea esta tabla para ver el listado de propiedades, se creara el diseño por separado y cuando se pruebe
que sale toda la información correctamente se implementara aqui -->
<body>
	<h2>Listado de Propiedades</h2>	
	<table>
		<c:forEach items="${propiedades}" var="propiedades">
			<tr>
			<td>${propiedades.direccion}</td>
			<td>${propiedades.nombre}</td>
			<td> 
				<c:forEach items="${propiedades.ubicacion}" var="ubicacion">
            		${ubicacion.ubicacion}
     			</c:forEach>
     		</td>
     		<td> 
				<c:forEach items="${propiedades.tipo_propiedad}" var="tipo">
            		${tipo.descripcion}
     			</c:forEach>
     		</td>
			
			</tr>
		</c:forEach>
	</table>
	<br/>
	
</body>
</html>