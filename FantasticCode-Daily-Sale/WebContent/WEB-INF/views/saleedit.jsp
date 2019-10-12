<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Sale</title>
</head>
<body>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Edit Sale</h1>  
       <form:form method="POST" action="/SpringMVCCRUDSimple/editsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="idsale" /></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="nameSale"  /></td>  
         </tr>    
         <tr>    
          <td>Image Url: </td>    
          <td><form:input path="imageSale" /></td>  
         </tr>   
         <tr>    
          <td>Description Sale :</td>    
          <td><form:input path="descriptionSale" /></td>  
         </tr>  
         <tr>    
          <td>Normal Price :</td>    
          <td><form:input path="normalPriceSale" /></td>  
         </tr>   
         <tr>    
          <td>Discount Price :</td>    
          <td><form:input path="discPriceSale" /></td>  
         </tr>    
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form> 

</body>
</html>