<%@ page import="java.util.List"%>
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
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h1>Students Details</h1>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Course</th>
							<th scope="col">Name</th>
						</tr>
					</thead>
					<tbody>
						<%
						List<Student> sList = (List<Student>) request.getAttribute("StudentList");
						for (Student St : sList) {
						%>
						<tr>
							<td><%=St.getStudentID()%></td>
							<td><%=St.getCourse()%></td>
							<td><%=St.getName()%></td>
						</tr>
						<%
						}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>