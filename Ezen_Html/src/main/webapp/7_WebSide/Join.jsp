<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Heder.jsp" %>
<div class="col-md-4 offset-4 my-5">
<h3>ȸ������</h3>
	<p> ��ĭ�� �Է��� �ּ��� </p>
</div>
<form>
<div class="col-md-4 offset-4 my-5">

	<div class="form-group">
		<label> ���̵� �Է� �� �ּ��� </label><br>
		<input calss="form-control" type="text" placeholder="���̵�"><br>
	</div>
	
	<div class="form-group">
		<label> ��й�ȣ�� �Է� �� �ּ��� </label><br>
		<input calss="form-control" type="password" placeholder="��й�ȣ"><br>
	</div>
	
	<div class="form-group">
		<label> �̸��� �Է� �� �ּ��� </label><br>
		<input calss="form-control" type="password" placeholder="�̸�"><br>
	</div>
	
	<div class="form-group mt-5">
		<label> ȸ�������� ������ ������ �Ϸ� �˴ϴ� </label>
		<button type="submit" class="btn btn-primary"> ȸ������ </button>
	</div>
</form>
</body>
</html>