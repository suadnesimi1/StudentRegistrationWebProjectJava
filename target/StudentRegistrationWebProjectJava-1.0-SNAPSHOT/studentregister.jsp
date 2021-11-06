<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student Registration Form</title>
</head>
<body>
<div align="center">
    <h1>Student Register Form</h1>
    <form action="<%= request.getContextPath() %>/registerStudent" method="post">
        <table style="with: 80%">
            <tr>
                <td>Student ID</td>
                <td><input type="text" name="studentID" /></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" /></td>
            </tr>
            <tr>
                <td>Surname</td>
                <td><input type="text" name="surname" /></td>
            </tr>
            <tr>
                <td>Department</td>
                <td><input type="text" name="department" /></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="email" name="email" /></td>
            </tr>
            <tr>
                <td>PhoneNumber</td>
                <td><input type="text" name="phoneNumber" /></td>
            </tr>
        </table>
        <button type="submit" value="Submit">Submit</button>
        <button type="reset" value="Reset">Reset</button>
    </form>
</div>
</body>
</html>