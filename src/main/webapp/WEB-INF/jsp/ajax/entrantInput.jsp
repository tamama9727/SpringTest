<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 추가하기</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  
</head>
<body>
	<div class = "container">
		<h2>즐겨찾기 추가하기</h2>
		<label>제목</label><br>
		<input type = "text" name="name" id = "nameInput"><br>
		<label>주소</label><br>
		<input type = "text" name = "license" id = "licenseInput"><br>
		<button type = "button" id="addBtn" >추가</button>
	</div>
	
	<%--모든 입력창의 유효성 검사를 수행하세요.
		주소 가 http:// 또는 https:// 로 시작하는지 유효성 검사를 수행하세요. --%>
	<script>
	$(document).ready(function(){
		$("#addBtn").on("click" , function(){
			let name = $("nameInput").val();
			let license = $("licenseInput").val();
			
			if(name == ""){
				alert("제목을 입력하세요");
				return false;
			}
			if(license == ""){
				alert("주소를 입력하세요");
				return false;
			}
			
			$.ajax({
				type:"post",
				url:"/ajax/entrant/insert",
				data:{"name":name , "license":license},
				success:function(data){
					if(data.result == "success"){
						location.href = "/ajax/entrant/list"
					}else{
						alert("삽입 실패")
					}
					alert(data.result)
				},
				error:function(){
					alert("에러발생");
				}
			})
			
		});
	});
	</script>	
	
	
</body>
</html>