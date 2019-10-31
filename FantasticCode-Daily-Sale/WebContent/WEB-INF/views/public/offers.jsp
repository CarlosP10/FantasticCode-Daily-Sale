<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ofertas</title>
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
<link rel="stylesheet" href="./resources/css/normalize.css">
<link rel="stylesheet" href="./resources/css/ofertasDia.css">
</head>
<body>
	
	
	<header class="site-header">
		<div class="contenedor contenido-header">	
					<h2>FantasticCode</h2>	
					<div>
						<nav id="navegacion" class="navegacion">
						<a href="nosotros.html">Nosotros</a>
                    	<a href="anuncios.html">Anuncios</a>
                    	<a href="blog.html">Blog</a>
                    	<a href="contacto.html">Contacto</a>
						</nav>
					</div>
		</div>
	</header>
	
	<main class="seccion contenedor">
	<h2 class="fw-300 centrar-texto">OFERTAS DEL DÍA</h2>
		<div class="contenedor-anuncios">
			<div class="anuncio">
				<img alt="Anuncio 1" src="./resources/img/anuncio1.jpg" >
				<div class="contenido-anuncio">
					<h3>Primer anuncio</h3>
					<p>Primer anuncio Primer anuncio Primer anuncio</p>
					<a href="${pageContext.request.contextPath}/show_offer/1" class="boton boton-amarillo d-block">Ver Información</a>
				</div>
			</div>
			<div class="anuncio">
				<img alt="Anuncio 1" src="./resources/img/anuncio1.jpg">
				<div class="contenido-anuncio">
					<h3>Primer anuncio</h3>
					<p>Primer anuncio Primer anuncio Primer anuncio</p>
					<a href="login.jsp" class="boton boton-amarillo d-block">Ver Información</a>
				</div>
			</div>
			<div class="anuncio">
				<img alt="Anuncio 1" src="./resources/img/anuncio1.jpg">
				<div class="contenido-anuncio">
					<h3>Primer anuncio</h3>
					<p>Primer anuncio Primer anuncio Primer anuncio</p>
					<a href="login.jsp" class="boton boton-amarillo d-block">Ver Información</a>
				</div>
			</div>
		</div>
		<div class="contenedor-anuncios">
			<div class="anuncio">
				<img alt="Anuncio 1" src="./resources/img/anuncio1.jpg">
				<div class="contenido-anuncio">
					<h3>Primer anuncio</h3>
					<p>Primer anuncio Primer anuncio Primer anuncio</p>
					<a href="login.jsp" class="boton boton-amarillo d-block">Ver Información</a>
				</div>
			</div>
			<div class="anuncio">
				<img alt="Anuncio 1" src="./resources/img/anuncio1.jpg">
				<div class="contenido-anuncio">
					<h3>Primer anuncio</h3>
					<p>Primer anuncio Primer anuncio Primer anuncio</p>
					<a href="login.jsp" class="boton boton-amarillo d-block">Ver Información</a>
				</div>
			</div>
			<div class="anuncio">
				<img alt="Anuncio 1" src="./resources/img/anuncio1.jpg">
				<div class="contenido-anuncio">
					<h3>Primer anuncio</h3>
					<p>Primer anuncio Primer anuncio Primer anuncio</p>
					<a href="login.jsp" class="boton boton-amarillo d-block">Ver Información</a>
				</div>
			</div>
		</div>
	</main>

</body>
</html>