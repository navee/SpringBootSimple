<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User</title>
<jsp:include page="layout/head.jsp"></jsp:include>
<script>
	$(document).ready(function(){
		$("#nav-user").addClass("active")
		$("#user-form").validate();
	});
</script>
</head>
<body>
	<jsp:include page="layout/header.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<form:form modelAttribute="user" id="user-form" action="${ctx }/user/update" role="form" method="post">
					<input type="hidden" name="id" value="${id }" />
					<div class="form-group">
						<label for="username-input">姓名</label>
						<input name="name" type="text" class="form-control" id="username-input" placeholder="姓名" value="${user.name }" required/>
						<form:errors path="name"></form:errors>
					</div>
					<div class="form-group">
						<label for="username-input">部门</label>
						<select class="form-control" id="user-dept-input" name="department.id">
							<c:forEach items="${depts }" var="dept">
								<option value="${dept.id }" <c:if test="${dept.id == user.department.id }">selected="selected"</c:if>>${dept.name }</option>
							</c:forEach>
						</select>
					</div>
					<input type="submit" value="提交" class="btn btn-default" />
				</form:form>
			</div>
		</div>
		
	</div>
	
</body>
</html>