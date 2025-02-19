<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form action="register" method="post">
	Name:<input type="text" name="name" /> <br/>
	Email:<input type="email" name="email"/><br>
	Password:<input type="password" name="password"/><br>
	<input type="submit" name="Submit"/><br>
</form>
${param.error}