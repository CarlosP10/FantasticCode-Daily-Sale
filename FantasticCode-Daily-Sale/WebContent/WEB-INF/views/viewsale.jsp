<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Sale</title>
</head>
<body>

	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
	<h1>Sales </h1>  
	<table border="2" width="70%" cellpadding="2">  
	<tr><th>Id</th><th>Name</th><th>Image</th><th>Description</th><th>Normal Price</th><th>Discount Price Price</th><th>Edit</th><th>Delete</th></tr>  
	   <c:forEach var="sale" items="${list}">   
	   <tr>  
	   <td>${sale.idsale}</td>  
	   <td>${sale.nameSale}</td>  
	   <td>${sale.imageSale}</td>  
	   <td>${sale.descriptionSale}</td>    
	   <td>${sale.normalPriceSale}</td>  
	   <td>${sale.discPriceSale}</td>  
	   <td><a href="saleedit/${sale.idsale}">Edit</a></td>  
	   <td><a href="deletesale/${sale.idsale}">Delete</a></td>  
	   </tr>  
	   </c:forEach>  
	   </table>  
	   <br/>  
	   <a href="addsale">Add New Sale</a>  

</body>
</html>