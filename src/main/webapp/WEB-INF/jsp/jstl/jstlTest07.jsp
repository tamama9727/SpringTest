<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 연습문제 기상청</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  
</head>
<body>
	<div class = "container">
<!-- 		<nav class ="bg-warning">
			<div>기상청</div>
			<a></a>
			<a></a>
			<a></a>
			<a></a>
		</nav> -->
		<main>
			<h2>과거 날씨</h2>
			<table class = "table">
				<thead>
					<tr>
						<th>날짜</th>	
						<th>날씨</th>	
						<th>기온</th>	
						<th>강수량</th>	
						<th>미세먼지</th>	
						<th>풍속</th>	
					</tr>
				</thead>
				
				<tbody>
					<tr>
						<td>2015년 6월 1일</td>
						<td>좋음</td>
						<td>21.9도</td>
						<td>81.1mm</td>
						<td>보통</td>
						<td>2.9km/h</td>
					</tr>
				</tbody>
			</table>
		</main>
	</div>

</body>
</html>