<%@page import="Dto.Login"%>
<%@page import="Dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	 String password = request.getParameter("password");
	
	// 로그인을 아이디[세션]
	Login Login = (Login)session.getAttribute("login");
	String id = Login.getM_id();
	
		// 현재 세션에 있는 로그인 정보와 패스워드가 동일하면
	boolean result = MemberDao.getmemberDao().delete(id, password);
		if(result){out.print("1");}
		else{out.print("0");}
		
		/* if(result){ // 탈퇴성공시
			// 세션 초기화
			session.setAttribute("loginid", null);
		// js
			out.print("<script>alert('회원탈퇴 되었습니다.');</script>");
			out.print("<script>location.href='../view/main.jsp';</script>");
		} else { // 탈퇴 실패시
			out.print("<script>alert('회원정보가 다릅니다.');</script>");
			out.print("<script>location.href='../view/member/memberinfo.jsp';</script>");
		} */
%>