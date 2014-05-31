<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User</title>
<jsp:include page="layout/head.jsp"></jsp:include>
<script>
	$(document).ready(function(){
		$("#nav-user").addClass("active")
	});
</script>
</head>
<body>
	<jsp:include page="layout/header.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<table class="table table-bordered">
					<tr>
						<td width="30%">ID</td>
						<td>${user.id }</td>
					</tr>
					<tr>
						<td>Name</td>
						<td>${user.name }</td>
					</tr>
					<tr>
						<td>Department</td>
						<td>${user.department.name }</td>
					</tr>
				</table>
			</div>
		</div>
		
	</div>
	
</body>
</html>