<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Student Enquiry Form</h2>
	<p>
		<font color="Red">${msg}</font>
	</p>
	<form:form action="save" modelAttribute="student" method="POST">
		<table>
			Name:
			<form:input path="name" />
			<br />
			<br /> Email:
			<form:input path="email" />
			<br />
			<br /> Gender:
			<form:radiobutton path="gender" value="M" />
			Male
			<form:radiobutton path="gender" value="F" />
			Fe-Male
			<br />
			<br /> Courses:
			<form:select path="courses">
			<form:option value=" ">Select</form:option>
				<form:options items="${courses}"/>
			</form:select>

			<br />
			<br /> Timings:
			<form:checkboxes items="${prefTimings}" path="timings"/>

			<br />
			<br />
			<input type="submit" value="Save">



		</table>


	</form:form>
</body>
</html>