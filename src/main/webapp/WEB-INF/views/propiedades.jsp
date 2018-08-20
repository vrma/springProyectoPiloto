<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>University Enrollments</title>
<script src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery-3.3.1.js" ></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap-theme.css">
<link href="/resources/css/proyecto.css" rel="stylesheet" type="text/css"/>
<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.js" ></script>
<LINK REL=StyleSheet HREF="${pageContext.request.contextPath}/resources/css/proyecto.css" TYPE="text/css" MEDIA=screen>

</head>

<!-- Se crea esta tabla para ver el listado de propiedades, se creara el diseño por separado y cuando se pruebe
que sale toda la información correctamente se implementara aqui -->
<body>
	<h2>Listado de Propiedades</h2>	
	<table>
		<c:forEach items="${propiedades}" var="propiedades">
			<div class="container margin_60">
    <div class="main_title">
			<h2>Listar Las Propiedades</h2>
			
	</div>
    <div class="row">
        <div class="col-md-4 col-sm-6">
    					<div class="crane_container">
    						<div class="ribbon_3 popular"><span>Imagenes de hoteles</span></div>
    						        <div class="carbox">
                                <a class="img-carbox">
                                <img src="{propiedades.imagen}" />
                               </a>
                              
                                <div class="carbox-content">
								 <h4 class="carbox-title">
                                       ${propiedades.nombre}
                                      
                                    </h4>
                                    <h4 class="carbox-title">
                                         ${propiedades.direccion}
                                      
                                    </h4>
                                    <p class="">
                                        {propiedades.descripcion}
                                    </p>
                                </div>
                                <div class="carbox-read-more">
                                    <a href={url} class="btn btn-link btn-block">
                                        Registro
                                    </a>
                                </div>
                            </div>
    						</div>
    					</div>
		</c:forEach>
	</table>
	<br/>
	
</body>
</html>