<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Offer</title>
<link href="../resources/css/bootstrap.css" media="all" type="text/css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900"
	rel="stylesheet">
<link rel="stylesheet"
	href="path/to/font-awesome/css/font-awesome.min.css">

<link rel="stylesheet" href="./resources/css/normalize.css">
<link rel="stylesheet" href="./resources/css/ofertasDia.css">
<link rel="stylesheet" href="./resources/css/specific_offer.css">
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
	<form action="${pageContext.request.contextPath}/admin/save_new_offer" method="post">
		<div class="anuncio">
			<div class="card shadow mb-4"
				style="margin-left: 100px; margin-right: 100px;">
				<div class="card-header py-3">
					<h6 class="m-0 font-weight-bold text-primary">Informacion
						general</h6>
				</div>
				<div class="card-body">
					<div class="form-group">
						<label for="inputPoster">(URL)</label> <input type="text"
							class="form-control" id="inputPoster" name="urlposter"
							aria-describedby="posterHelp" required> <small
							id="posterHelp" class="form-text text-muted">Ingresa la
							url de la imagen relacionada a la oferta.</small>
					</div>
					<div class="form-group">
						<label for="inputName">Nombre Oferta</label> <input type="text"
							class="form-control" id="inputName" name="offername"
							aria-describedby="nameHelp" required> <small
							id="nameHelp" class="form-text text-muted">Ingrese el
							nombre de la oferta.</small>
					</div>
					<div class="form-group">
						<label for="offer_type_list">Tipo de Oferta</label> <select
							id="offer_type_list" class="form-control" name="type" required>

							<c:forEach items="${offer_type_list}" var="offer_type_list">
								<option value="${offer_type_list.idtype}">${offer_type_list.type}</option>
							</c:forEach>
						</select>

					</div>
				</div>
			</div>
			<div class="card shadow mb-4"
				style="margin-left: 100px; margin-right: 100px;">
				<div class="card-header py-3">
					<h6 class="m-0 font-weight-bold text-primary">Descripcion de
						la oferta</h6>
				</div>
				<div class="card-body">
					<div class="form-group">
						<label for="inputName">Descripcion</label> <input type="text"
							class="form-control" id="inputName" name="description"
							aria-describedby="nameHelp" required> <small
							id="nameHelp" class="form-text text-muted">Ingrese
							descripcion detallada de la oferta</small>
					</div>
				</div>
			</div>

			<div class="row" style="margin-left: 90px; margin-right: 90px">

				<!-- Earnings (Monthly) Card Example -->
				<div class="col-xl-3 col-md-6 mb-4">
					<div class="card border-left-primary shadow h-100 py-2">
						<div class="card-body">
							<div class="row no-gutters align-items-center">
								<div class="col mr-2">
									<div
										class="text-xs font-weight-bold text-primary text-uppercase mb-1">
										Precio</div>
									<div class="h5 mb-0 font-weight-bold text-gray-800">
										<div class="form-group">
											<label for="inputName">Precio</label> <input type="number"
												class="form-control" id="inputName" name="price_range"
												aria-describedby="nameHelp" required> <small
												id="nameHelp" class="form-text text-muted">Ingrese
												el precio de la oferta.</small>
										</div>
									</div>
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
										class="text-xs font-weight-bold text-success text-uppercase mb-1">Disponibilidad</div>
									<div class="h5 mb-0 font-weight-bold text-gray-800">
										<div class="form-group">
											<label for="inputName">Limite de cupones</label> <input
												type="number" class="form-control" id="inputName"
												name="availability" aria-describedby="nameHelp" required>
											<small id="nameHelp" class="form-text text-muted">Ingrese
												la cantidad maxima de los cupones</small>
										</div>
									</div>
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
										class="text-xs font-weight-bold text-info text-uppercase mb-1">Fecha
										Inicio</div>
									<div class="row no-gutters align-items-center">
										<div class="col-auto">
											<div class="h5 mb-0 font-weight-bold text-gray-800">
												<div class="form-group">
													<input type="date" class="form-control" id="fechainc"
														min="2000-01-01" max="2100-12-31" name="startdate">
													<small id="nameHelp" class="form-text text-muted">Ingrese
														la fecha de inicio de la oferta</small>
												</div>
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

				<!-- Earnings (Monthly) Card Example -->
				<div class="col-xl-3 col-md-6 mb-4">
					<div class="card border-left-info shadow h-100 py-2">
						<div class="card-body">
							<div class="row no-gutters align-items-center">
								<div class="col mr-2">
									<div
										class="text-xs font-weight-bold text-info text-uppercase mb-1">Fecha
										Fin</div>
									<div class="row no-gutters align-items-center">
										<div class="col-auto">
											<div class="h5 mb-0 font-weight-bold text-gray-800">
												<div class="form-group">
													<input type="date" class="form-control" id="fechainc"
														min="2000-01-01" max="2100-12-31" name="enddate">
													<small id="nameHelp" class="form-text text-muted">Ingrese
														la fecha de fin de la oferta</small>
												</div>
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
										class="text-xs font-weight-bold text-warning text-uppercase mb-1">Codigo</div>
									<div class="h5 mb-0 font-weight-bold text-gray-800">
										<input type="text" class="form-control" id="inputName"
											name="offer_code" aria-describedby="nameHelp" required>
									</div>
								</div>
								<div class="col-auto">
									<i class="fas fa-qrcode fa-2x text-gray-300"></i>
								</div>
							</div>
						</div>
					</div>
				</div>


				<!--Agregando estado de la oferta  -->
				<div class="col-xl-3 col-md-6 mb-4">
					<div class="card border-left-warning shadow h-100 py-2">
						<div class="card-body">
							<div class="row no-gutters align-items-center">
								<div class="col mr-2">
									<div
										class="text-xs font-weight-bold text-success text-uppercase mb-1">Estado</div>
									<div class="h5 mb-0 font-weight-bold text-gray-800 ">
										<label class="switch align-items-center">
										 <c:set
												var="status" value="${offer_list.offer_state}" /> 
												<input type="checkbox" name="offer_state" value="1" checked>
												<span class="slider round"></span>
												<input type="hidden" name="offer_state" value="0" />
												<span class="slider round"></span>
										</label>
									</div>
								</div>
								<div class="col-auto">
									<i class="far fa-check-circle fa-2x text-gray-300"></i>
								</div>
							</div>
						</div>
					</div>
				</div>


			</div>
			<button type="submit" class="btn-outline-success btn " value="Submit"
				style="width: 500px; margin-right: 100px; margin-left: 100px">Guardar</button>

		</div>

	</form>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"
	integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
	crossorigin="anonymous" type="text/javascript"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.bundle.min.js"
	integrity="sha384-zDnhMsjVZfS3hiP7oCBRmfjkQC4fzxVxFhBx8Hkz2aZX8gEvA/jsP3eXRCvzTofP"
	crossorigin="anonymous" type="text/javascript"></script>
<script src="https://kit.fontawesome.com/38aafe1360.js"
	crossorigin="anonymous"></script>
</html>