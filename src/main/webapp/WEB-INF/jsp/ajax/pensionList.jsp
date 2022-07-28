<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>통나무 펜션 예약 목록</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
	<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
	
</head>
<body>
	<div class = "container" >
            <header class="mt-4">
                <div class="text-center display-4">통나무 팬션</div>
                <nav class="mt-4 bg-warning">
                    <ul class="nav nav-fill">
                        <li class="nav-item"><a class="nav-link" href="#">팬션소개</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">객실보기</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">예약안내</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">커뮤니티</a></li>
                    </ul>
                </nav>
            </header>
                <div class = "text-center mt-4" ><h2>예약 목록 보기</h2></div>
                <table class = "table">
                	<thead>
                		<tr>
                			<th>이름</th>
                			<th>예약날짜</th>
                			<th>숙박일수</th>
                			<th>숙박인원</th>
                			<th>전화번호</th>
                			<th>예약상태</th>
                			<th>(삭제)</th>
                		</tr>
                	</thead>
                	
                	<tbody>
                	<c:forEach var = "booking" items = "${bookingList }" varStatus = "status">
                		<tr id = "no${status.count }tr">
                			<td>${booking.name }</td>
                			<td>${booking.yyyymmdd }</td>
                			<td>${booking.number }</td>
                			<td>${booking.personnel }</td>
                			<td>${booking.phoneNumber }</td>
                		
                				<c:choose>
                					<c:when test="${booking.situation eq '대기중' }">
                						<td class = "text-primary">${booking.situation }</td>
                					</c:when>
                					<c:when test = "${booking.situation eq '확정' }">
                						<td class = "text-success">${booking.situation }</td>
                					</c:when>
                					
                					<c:otherwise>
                						<td>${booking.situation }</td>
                					</c:otherwise>
                				</c:choose>
                			
                			<td><button type = "button" data-booking-id="${booking.id }" class = "delete-btn btn btn-danger btn-sm" >삭제</button></td>
                		</tr>
                	</c:forEach>
                	</tbody>
                </table>
                
            
	</div>
	
	<script>
		$(document).ready(function(){
			
			$(".delete-btn").on("click" , function(){
				
				//해당 행을 삭제 한다.
				//삭제할 대상의 id를 얻어내야한다.
				let bookingId= $(this).data("booking-id");
				//삭제 api를 호출한다.
				$.ajax({
					type:"get",
					url:"/ajax/booking/delete",
					data:{"id":bookingId},
					success:function(data){
						if(data.result == "success"){
							location.reload();
						}else{
							alert("삭제 실패");
						}
					},
					error:function(){
						alert("에러");
					}
				});
				
				
			});
		});
	
	
	</script>
	
	
	
</body>
</html>