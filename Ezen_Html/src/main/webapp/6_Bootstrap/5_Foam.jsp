<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ include file="1_BootstrapStart.jsp" %>
<h3> 1. ��Ʈ��Ʈ�� ������ </h3>
<form>
	<label> �̸� </label>
	<input type="text" placeholder=�̸�>
	<label> �̸��� </label>
	<input type="text" placeholder=�̸���>
	<button type="submit"> Ȯ�� </button>
</form>

<h3> 2. �� �׷� </h3>
	<form>
		<div class="form-group">
			<label> �̸� </label>
			<input calss="form-control" type="text" placeholder="�̸�">
		</div>
		<div class="form-group">
			<label> �̸��� </label>
			<input calss="form-control" type="email" placeholder="�̸���">
		</div>
		<div class="form-group">
			<label> �̸� </label>
			<button type="button"> Ȯ�� </button>
		</div>
	</form>
</body>
</html>