<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UserList</title>
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
	<div class="btn-toolbar" style="padding-bottom:15px;">
		<a href="/user/add" class="btn btn-default" role="button">新增</a>
	</div>
	<table class="table">
		<tr>
			<td>ID</td>
			<td>NAME</td>
			<td>DEPARTMENT</td>
			<td></td>
		</tr>
		<c:forEach items="${users.content }" var="user">
			<tr>
				<td>${user.id }</td>
				<td><a href="/user/${user.id }">${user.name }</a></td>
				<td>${user.department.name }</td>
				<td><a href="/user/update/${user.id }">修改</a> / <a href="/user/delete/${user.id }">删除</a></td>
		</c:forEach>
	</table>
	<ul class="pagination">
	    <li class="<c:if test='${users.firstPage}'>disabled</c:if>">
			<a href="<c:if test='${!users.firstPage}'>?size=${users.size }&page=${users.number-1 }</c:if>">&laquo;</a>
		</li>
	    <c:forEach begin="1" end="${users.totalPages }" var="p">
		    <li class="<c:if test='${users.number == p-1 }'>active</c:if>"><a href="?size=${users.size }&page=${p-1 }">${p }</a></li>
	    </c:forEach>
	    <li class="<c:if test='${users.lastPage}'>disabled</c:if>">
	    	<a href="<c:if test='${!users.lastPage}'>?size=${users.size }&page=${users.number + 1 }</c:if>">&raquo;</a>
	    </li>
	</ul>
</div>
</body>
</html>