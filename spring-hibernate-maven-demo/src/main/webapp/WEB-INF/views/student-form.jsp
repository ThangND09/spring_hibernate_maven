<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="student" action="saveStudent" method="Post">
		<table>
			<tbody>
				<tr>
					<td><label>First name:</label></td>
					<td><form:input path="firstName" /></td>
				</tr>
			
				<tr>
					<td><label>Last name:</label></td>
					<td><form:input path="lastName" /></td>
				</tr>
	
				<tr>
					<td><label>Age:</label></td>
					<td><form:input path="age" /></td>
				</tr>
				
				<tr>
					<td><label>School ID:</label></td>
					<td><form:input path="schoolId" /></td>
				</tr>
	
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Save" class="save" /></td>
				</tr>
	
			
			</tbody>
		</table>
	</form:form>

</body>
</html>