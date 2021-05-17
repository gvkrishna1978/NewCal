<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Error</title>
  <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
 </head>
 <body>
 <div class="container">
  Some Error in the process
  <br><br>
  
  <table border='1' width="70%">
  <tr>
	<td>Date</td>
	<td th:text=${timestamp}>${timestamp}></td>
  </tr>
  <tr>
	<td>Status</td>
	<td th:text=${status}>${status}</td>
  </tr>
  <tr>
	<td>Error</td>
	<td th:text=${error}>${error}</td>
  </tr>
  <tr>
	<td>Path</td>
	<td th:text=${path}> ${path}</td>
  </tr>
  <tr>
	<td>Trace</td>
	<td th:text=${trace}>${trace}</td>
  </tr>
  </table>
  </div>
 </body>
</html>
