<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL test01</title>
</head>
<body>
	<h3>문제1</h3>
	<c:set var="number1" value = "36" />
	<h4>number1 : ${number1 }</h4>
	
	<c:set var = "number2" >3</c:set>
	<h4>number2 : ${number2 }</h4>
	
	<hr>
	
	<h3>문제2</h3>
	<h4>더하기 : ${number1 + number2 }</h4>
	<h4>뺴기 : ${number1 - number2 }</h4>
	<h4>나누기 : ${number1 / number2}</h4>
	<h4>곱하기 : ${number1 * number2 }</h4>
	
	<hr>
	
	<h3>문제3</h3>
	<c:out value="<title>Core Out</title>" />
	
	<hr>
	
	<h3>문제4</h3>
	<%--1 번문제에서 사용한 두 변수의 평균이 10 이상이면 평균 값을 <h1> 태그로 출력하고, 10 미만이면 <h3> 태그로 출력하세요. --%>
	<c:set var = "average" value = "${(number1 + number2) / 2}"/>
	
	<c:if test= "${average  > 10}">
		<h1>평균이 10 이상</h1>
	</c:if>
	<c:if test ="${average  < 10}"> 
		<h3>평균이 10이하</h3>
	</c:if>
	
	
	<%--1번 문제에서 사용한 두변수의 곱의 결과가 100 이 넘는다면 너무 큰 수입니다. 를 core out 을 통해서 alert창으로 출력하세요.--%>
	<c:if test="${(number1 * number2) > 100 }">
		<c:out value="<script>alert('문제5번 두 변수의 곱이 100보다 크다')</script>" escapeXml = "false"/>
	</c:if>
	
</body>
</html>