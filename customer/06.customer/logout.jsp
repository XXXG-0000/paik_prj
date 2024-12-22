<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
<%
	session.invalidate();
	response.sendRedirect("http://paiks.sist.co.kr/index.jsp");
%>