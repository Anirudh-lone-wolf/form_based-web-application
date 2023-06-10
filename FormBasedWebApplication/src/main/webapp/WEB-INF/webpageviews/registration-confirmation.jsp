<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Confirmation</title>
</head>
<body>
	The registration of the employee is confirmed :
	${employee_registration_details.firstName}
	${employee_registration_details.lastName}
	<br>
	<br> The Department assigned to this employee is :
	${employee_registration_details.department}
	<br>
	<br> The Technologies the employee specializes in are :
	<!-- ${employee_registration_details.technologies}-->
	<ul>
		<c:forEach var="temp" items="${employee_registration_details.technologies}">
		<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>