<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int i=Integer.parseInt(request.getParameter("f"));
int j=Integer.parseInt(request.getParameter("s"));
String btn = request.getParameter("btn");
int r = 0;
if(btn.equals("add")){
	r=i+j;
}else{
	r=i-j;
}
out.print(r);
%>

