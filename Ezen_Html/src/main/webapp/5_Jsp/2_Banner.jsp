<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	.main_iamge img{max-width: 100%;}
	.banners{height: 200px;}
	.items{height: 200px;}
	
	/* ��� */
	.banner{padding: 15px;}
	.banner li{padding: 10px;}
	.banner img{max-width: 100%;}
	.banner p{margin-top: 10px; line-height: 150%;}
	
	/* ������ */
	.items{padding: 15px; background-color: #f9f9f9;}
	.items img{max-width: 100%;}
	.items ul{margin-bottom: 15px;}
	.items item li{padding: 10px;}
</style>
</head>
<body>
	<section class="main_iamge">
		<img alt="" src="Img/main.jpg">
	</section>
	
	<section class="banners">
		<div class="box">
			<div class="banner col_6 col_m_6"> <!-- 1��° ��� -->
				<ul>
					<li class="col_s_3"><img alt="" src="Img/icon1.png"></li>
					<li class="col_s_9">
					<h3> ���� �ȳ� </h3>
					<p> ��Ʃ��� �뿩�� ������ ���ͳ� ������ �ϼž� �մϴ�. ������ 1�� �������� �����մϴ�. </p>
					 </li>
				</ul>
			</div>
			
			<div class="banner col_6 col_m_6"> <!-- 2��° ��� -->
				<ul>
					<li class="col_3"><img alt="" src="Img/icon2.png"></li>
					<li class="col_9">
					<h3> ���� ������ </h3>
					<p> ��� ����, ���� ����, ������ ����, ���� ���� �� ���� �Ǵ� ��ü�� �̿� �� �� �ֽ��ϴ�. </p>
					 </li>
				</ul>
			</div>
		</div>
	</section>
	
	<section class="items">
		<div class="box">
			<div class="item col_3 col_m_6">
				<ul>
					<li><img alt="" src="Img/image1.jpg"> </li>
					<li> <h3> �Կ� ��Ʃ��� </h3> </li>
					<li> ī�޶�, ���� �� �Կ� ��� �Ϻ� </li>
				</ul>
			</div>
			
			<div class="item col_3 col_m_6">
				<ul>
					<li><img alt="" src="Img/image2.jpg"> </li>
					<li> <h3> �Կ� ��Ʃ��� </h3> </li>
					<li> ī�޶�, ���� �� �Կ� ��� �Ϻ� </li>
				</ul>
			</div>
			
			<div class="item col_3 col_m_6">
				<ul>
					<li><img alt="" src="Img/image3.jpg"> </li>
					<li> <h3> �Կ� ��Ʃ��� </h3> </li>
					<li> ī�޶�, ���� �� �Կ� ��� �Ϻ� </li>
				</ul>
			</div>
			
			<div class="item col_3 col_m_6">
				<ul>
					<li><img alt="" src="Img/image4.jpg"> </li>
					<li> <h3> �Կ� ��Ʃ��� </h3> </li>
					<li> ī�޶�, ���� �� �Կ� ��� �Ϻ� </li>
				</ul>
			</div>
		</div>
	</section>
</body>
</html>