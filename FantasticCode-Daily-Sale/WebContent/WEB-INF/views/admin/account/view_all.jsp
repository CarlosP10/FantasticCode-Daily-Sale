<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<!-- Custom fonts for this template-->
<link href="./../resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">

<!-- Page level plugin CSS-->
<link href="./../resources/vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="./../resources/css/sb-admin.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body id="page-top">

	<nav class="navbar navbar-expand navbar-dark bg-dark static-top">

		<a class="navbar-brand mr-1">Dashboard</a>

		<button class="btn btn-link btn-sm text-white order-1 order-sm-0"
			id="sidebarToggle" href="#">
			<i class="fas fa-bars"></i>
		</button>

		<!-- Navbar -->
		<ul class="navbar-nav ml-auto ml-md-0">
			<a class="nav-link " href="${pageContext.request.contextPath}/logout">
				<button class="btn btn-outline-danger btn-sm btn-block">Logout</button>
			</a>
		</ul>

	</nav>

	<div id="wrapper">

		<!-- Sidebar -->
		<ul class="sidebar navbar-nav">
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/admin/view_offers"> <i
					class="fas fa-fw fa-users"></i> <span>Ofertas</span>
			</a></li>
<li class="nav-item active"><a class="nav-link"
				href="${pageContext.request.contextPath}/account/list"> <i
					class="fas fa-fw fa-users"></i> <span>Cuentas</span>
			</a></li>
		</ul>

		<div id="content-wrapper">

			<div class="container-fluid">
				<!-- DataTables Example -->
				<div
					class="col-sm-10 col-md-10 col-lg-10 offset-sm-1 offset-md-1 offset-lg-1">
					<div
						class="col-sm-10 col-md-10 col-lg-10 offset-sm-1 offset-md-1 offset-lg-1">
						<h1>Ver Todos</h1>
						<div class="btn-toolbar justify-content-between" role="toolbar"
							aria-label="Toolbar with button groups">

							<div class="btn-group align-right" role="group"
								aria-label="Button group with nested dropdown">
								<c:if test="${pagina > 1}">
									<a
										href=" ${pageContext.request.contextPath}/film/list?page=${pagina-2}"
										class="btn btn-secondary">Anterior</a>
								</c:if>

								<c:if test="${pagina < total/10}">
									<a
										href=" ${pageContext.request.contextPath}/film/list?page=${pagina}"
										class="btn btn-secondary">Siguiente</a>
								</c:if>
							</div>
						</div>
						<br />
						<table class="table">
							<thead>
								<tr>
									<th scope="col">Accion</th>
									<th scope="col">Codigo</th>
									<th scope="col">Nombre</th>
									<th scope="col">Contrasena</th>
									<th scope="col">Online</th>
									<th scope="col">Estado</th>
									<th scope="col"></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${accounts}" var="account">
									<tr>
										<td>
											<div class="btn-group">
												<a
													href="${pageContext.request.contextPath}/account/view/${account.idaccount}"
													class="btn btn-primary">Ver</a>

											</div>
										</td>
										<td>${account.idaccount}</td>
										<td>${account.username}</td>
										<td>${account.password}</td>

										<c:set var="online" value="${account.onlinestatus}" />
										<c:if test="${online<1}">
											<td><a class="btn btn-danger btn-sm">Offline</a></td>
										</c:if>
										<c:if test="${online>0}">
											<td><a class="btn btn-success btn-sm">Online</a></td>
										</c:if>
										<c:set var="active" value="${account.activestate}" />
										<c:if test="${active<1}">
											<td><a class="btn btn-danger btn-sm"
												href="${pageContext.request.contextPath}/account/enable/${account.idaccount}">Inactivo</a></td>
										</c:if>
										<c:if test="${active>0}">
											<td><a class="btn btn-success btn-sm"
												href="${pageContext.request.contextPath}/account/disable/${account.idaccount}"">Activo</a></td>
										</c:if>
										<td></td>

									</tr>
								</c:forEach>
							</tbody>


						</table>
						<p class="text-right">Mostrando ${actual}/${total}</p>

					</div>


				</div>
				<!-- /.container-fluid -->

				<!-- Sticky Footer -->
				<footer class="sticky-footer">
					<div class="container my-auto">
						<div class="copyright text-center my-auto">
							<span>Copyright © Ingenieria de Software 2019</span>
						</div>
					</div>
				</footer>

			</div>
			<!-- /.content-wrapper -->

		</div>
		<!-- /#wrapper -->

		<!-- Scroll to Top Button-->
		<a class="scroll-to-top rounded" href="#page-top"> <i
			class="fas fa-angle-up"></i>
		</a>

		<!-- Logout Modal-->
		<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">Ready to
							Leave?</h5>
						<button class="close" type="button" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">×</span>
						</button>
					</div>
					<div class="modal-body">Select "Logout" below if you are
						ready to end your current session.</div>
					<div class="modal-footer">
						<button class="btn btn-secondary" type="button"
							data-dismiss="modal">Cancel</button>
						<a class="btn btn-primary" href="login.html">Logout</a>
					</div>
				</div>
			</div>
		</div>

		<!-- Bootstrap core JavaScript-->
		<script src="vendor/jquery/jquery.min.js" type="text/javascript"></script>
		<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"
			type="text/javascript"></script>



		<!-- Custom scripts for all pages-->
		<script src="js/sb-admin.min.js" type="text/javascript"></script>
</body>

</html>