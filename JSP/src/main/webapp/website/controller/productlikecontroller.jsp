<%@page import="Dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int p_num=Integer.parseInt(request.getParameter("p_num"));
	int m_num=Integer.parseInt(request.getParameter("m_num"));
	
	// db처리
	out.print(ProductDao.getProductDao().plikeupdate(p_num, m_num));
	
	
%>