<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<!-- 最新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap-theme.min.css">
<script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand">Spring Boot</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="/user">User</a></li>
		</ul>
	</div>
</nav>
<div class="container">
	<table class="table">
		<tr>
			<td>ID</td>
			<td>NAME</td>
			<td>DEPARTMENT</td>
		</tr>
		<c:forEach items="${users.content }" var="user">
			<tr><td>${user.id }</td><td><a href="/users/${user.id }">${user.name }</a></td><td>${user.department.name }</td>
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