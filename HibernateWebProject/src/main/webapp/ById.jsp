<%@ page import="com.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<a href="index.html"></a>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h1>Student Detail</h1>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Course</th>
							<th scope="col">Name</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><%=request.getAttribute("sid")%></td>
							<td><%=request.getAttribute("course")%></td>
							<td><%=request.getAttribute("name") %></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>