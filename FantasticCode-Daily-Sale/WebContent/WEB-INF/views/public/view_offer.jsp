<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Offer</title>
<link href="./resources/css/bootstrap.css" media="all" type="text/css"
	rel="stylesheet">
<style type="text/css">
<!--
///////////////////////////////
-->
.item1 {
	grid-area: header;
}

.item2 {
	grid-area: menu;
}

.item3 {
	grid-area: main;
}

.item4 {
	grid-area: right;
}

.item5 {
	grid-area: footer;
}

.grid-container {
	display: grid;
	grid-template-areas: 'header header header header header header'
		'menu main main main right right'
		'menu footer footer footer footer footer';
	grid-gap: 10px;
	background-color: #2196F3;
	padding: 10px;
}

.grid-container>div {
	background-color: rgba(255, 255, 255, 0.8);
	text-align: center;
	padding: 20px 0;
	font-size: 30px;
}
.img-header{
/* Add the blur effect */
  filter: blur(2px);
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}

<!--
///////////////////////////////
-->
.wraper {
	display: flex;
	align-content: center;
	justify-content: center;
	margin-top: 60px;
}

.container {
	margin-top: 50%;
}

.t {
	margin-top: 10px;
}

.e {
	margin-left: 80px;
}

body {
	background-position: center;
	background-image: url("./resources/prism.png");
}
</style>
</head>
<body>
	<h1>Grid Layout</h1>

	<p>This grid layout contains six columns and three rows:</p>

	<div class="grid-container">
		<div class="item1">
		<img class="img-header" alt="" src="https://9to5google.com/wp-content/uploads/sites/4/2019/02/Samsung-Galaxy-Tab-S5e-hands-on.jpg?quality=82&strip=all&w=1600">
		</div>
		<div class="item2">Menu</div>
		<div class="item3">Main</div>
		<div class="item4">Right</div>
		<div class="item5">Footer</div>
	</div>

	<div class="wraper">
		<a class="btn btn-outline-warning t"
			href="${pageContext.request.contextPath}/register">Registrarse</a>


	</div>
</body>
</html>