<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Offer</title>
<link href="../resources/css/bootstrap.css" media="all" type="text/css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900"
	rel="stylesheet">
	<link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
	
<link rel="stylesheet" href="../resources/css/normalize.css">
<link rel="stylesheet" href="../resources/css/ofertasDia.css">
<link rel="stylesheet" href="../resources/css/specific_offer.css">
</head>
<body>
	<header class="site-header">
		<div class="contenedor contenido-header">
			<h2>FantasticCode</h2>
			<div>
				<nav id="navegacion" class="navegacion">
					<a href="nosotros.html">Nosotros</a> <a href="anuncios.html">Anuncios</a>
					<a href="blog.html">Blog</a> <a href="contacto.html">Contacto</a>
				</nav>
			</div>
		</div>
	</header>
	<div class="anuncio">
		<img alt="Anuncio 1" src="../resources/img/anuncio1.jpg"
			class="imageOfferSpecific">
		<div class="btn btn-outline-dark" style="display:block; font-size:20px; margin-left: 100px; margin-right: 100px;">
                  COMPARTE!!!! Con tu pareja un desayuno no tradicional en la playa ....... Para que lo disfrutes en grande.
           
              </div>
<div class="card shadow mb-4" style="margin-left: 100px; margin-right: 100px;">
                <div class="card-header py-3">
                  <h6 class="m-0 font-weight-bold text-primary" >
                  Descripcion de la Oferta</h6>
                </div>
                <div class="card-body">
                  The styling for this basic card example is created by using default Bootstrap utility classes. By using utility classes, the style of the card component can be easily modified with no need for any custom CSS!
                </div>
              </div>

		<div class="row" style="margin-left: 90px; margin-right: 90px ">

			<!-- Earnings (Monthly) Card Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-primary shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div
									class="text-xs font-weight-bold text-primary text-uppercase mb-1">Precio
								</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800">$40</div>
							</div>
							<div class="col-auto">
								<i class="fas fa-dollar-sign fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- Earnings (Monthly) Card Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-success shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div
									class="text-xs font-weight-bold text-success text-uppercase mb-1">Cupones Disponibles</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800">102</div>
							</div>
							<div class="col-auto">
								<i class="fas fa-comments fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- Earnings (Monthly) Card Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-info shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div
									class="text-xs font-weight-bold text-info text-uppercase mb-1">Rating</div>
								<div class="row no-gutters align-items-center">
									<div class="col-auto">
										<div class="h5 mb-0 mr-3 font-weight-bold text-gray-800">Recomendación 50%</div>
									</div>
									<div class="col">
										<div class="progress progress-sm mr-2">
											<div class="progress-bar bg-info" role="progressbar"
												style="width: 50%" aria-valuenow="50" aria-valuemin="0"
												aria-valuemax="100"></div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-auto">
								<i class="fas fa-clipboard-list fa-2x text-gray-300"></i>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- Pending Requests Card Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card border-left-warning shadow h-100 py-2">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div
									class="text-xs font-weight-bold text-warning text-uppercase mb-1">Tiempo restante</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800">10 días</div>
							</div>
							<div class="col-auto">
								<i class="fas fa-calendar fa-2x text-gray-300"></i>
							</div> 
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="card shadow mb-4" style="margin-left: 100px; margin-right: 100px ">
			<!-- Card Header - Accordion -->
			<a href="#collapseCardExample" class="d-block card-header py-3"
				data-toggle="collapse" role="button" aria-expanded="false"
				aria-controls="collapseCardExample">
				<h6 class=" font-weight-bold text-primary">Restricciones</h6>
			</a>
			<!-- Card Content - Collapse -->
			<div class="collapse show" id="collapseCardExample" style="">
				<div class="card-body">
					<ul>
						<li>No se permiten mas de 2 personas</li>
						<li>Sujeto a politicas del restaurante</li>
						<li>La orden debe de ir acompañada de un banquete individual</li>
						<li>Oferta sujeta a disponibilidad del establecimiento</li>
						<li>El uso de esta oferta esta sujeto a reservaciones del
							establecimiento, los beneficiarios deben realizar un cita
							previamente.</li>
					</ul>


				</div>
			</div>
		</div>
		<a href="${pageContext.request.contextPath}/show_offer/1"
			class="boton boton-amarillo" style="display: block; margin-left: 100px;margin-right: 100px; margin-bottom: 30px; border-radius: 10px">Reservar</a>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"
	integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
	crossorigin="anonymous" type="text/javascript"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.bundle.min.js"
	integrity="sha384-zDnhMsjVZfS3hiP7oCBRmfjkQC4fzxVxFhBx8Hkz2aZX8gEvA/jsP3eXRCvzTofP"
	crossorigin="anonymous" type="text/javascript"></script>
<script src="https://kit.fontawesome.com/38aafe1360.js" crossorigin="anonymous"></script>
</html>