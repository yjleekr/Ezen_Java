<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String name=request.getParameter("name");
	String studentnum=request.getParameter("studentnum");
	String gender=request.getParameter("gender");
	String major=request.getParameter("major");
	
	if(gender.equals("man")){
		gender="남자";
	} else {
		gender="여자";
	}
	%>
	
	<h1> 설문 결과 </h1>
	성명 : <%= name %>
	학번 : <%= studentnum %>
	성별 : <%= gender %>
	전공 : <%= major %>
	<hr>
	<%
		// 서버의 정보를 가져 올 수 있는 객체
		out.print("프로토콜 : "+request.getProtocol()+"<br>");
		out.print("서버이름 : "+request.getServerName()+"<br>");
		out.print("서버포트 : "+request.getServerPort()+"<br>");
		out.print("컴퓨터주소 : "+request.getRemoteHost()+"<br>");
		out.print("컴퓨터이름 : "+request.getRemoteAddr()+"<br>");
		out.print("메소드 : "+request.getMethod()+"<br>");
		out.print("요청경로 : "+request.getRequestURI()+"<br>");
		out.print("현재브라우저 : "+request.getHeader("User-Agent")+"<br>");
	%>
	
</body>
</html>