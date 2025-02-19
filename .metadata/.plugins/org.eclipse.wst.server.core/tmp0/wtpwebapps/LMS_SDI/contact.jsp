<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sum.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c: set var="salary" scope="session"s value="${2000*2 }"/>
	<p>Your salary is: <c:out value="${salary }"/></p>
	<c: choose>
	<c:when test="${salary <=20000 }">
	salary is very low to survive.
	</c:when>
	
	<c:forEach var="i" begin="1" end="10" step="1">
	<c:out value="${i }"/>
	<br/>
	</c:forEach>
	<c:forTokens items="raja, aja,maza" delims=","var="name">
	<c:out value="${name }"/><P></P></c:forTokens>
	<form method="get" action="calc">
	</form>
	
</body>
</html>