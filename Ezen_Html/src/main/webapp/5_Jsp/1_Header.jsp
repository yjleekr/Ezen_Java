<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	header{height: 70px;}
	/* 기본값 설정 */
	*{margin: 0; padding: 0; box-sizing: border-box; font-family: "돋움"}
	li{list-style-type: none;}
	header{position: relative; height: 70px;}
	header .logo{position: absolute; top: 25px; left: 20px;}
	header .logo span{color: blue; font-weight: bold;}
	header .menu{display: none; position: absolute; top: 25px; right: 20px;}
	
	a{text-decoration: none; color: black;}
	
	/* 메뉴 슘김 버튼 */
	header .menu_btn{width: 20px; position: absolute; top: 20px; right: 20px;}
	header .menu_btn li{border-bottom: solid 2px black; padding: 3px 0px;}
	
	
	/* 그리드 */
	[class*="col_"]{float: left;} /* 와일드 카드(*) */
	.col_s_1{width: 8.33%;} .col_s_2{width: 16.66%;} /* 기본, 스마트 용 */
	.col_s_3{width: 25%;} .col_s_4{width: 33.33%;}
	.col_s_5{width: 41.66%;} .col_s_6{width: 50%;}
	.col_s_7{width: 58.33%;} .col_s_8{width: 66.66%;}
	.col_s_9{width: 75%;} .col_s_10{width: 83.33%;}
	.col_s_11{width: 91.66%;} .col_s_12{width: 100%;}
	
	/* 미디어 쿼리 */
	@media only screen and(min-width:770px;){ /* 태블릿 용 */
	.col_m_1{width: 8.33%;} .col_m_2{width: 16.66%;}
	.col_m_3{width: 25%;} .col_m_4{width: 33.33%;}
	.col_m_5{width: 41.66%;} .col_m_6{width: 50%;}
	.col_m_7{width: 58.33%;} .col_m_8{width: 66.66%;}
	.col_m_9{width: 75%;} .col_m_10{width: 83.33%;}
	.col_m_11{width: 91.66%;} .col_m_12{width: 100%;}
	.box{max-width: 1200px; margin: 0 auto; position: relative;}
	}
	
	@media only screen and(min-width:1200px;){ /* Pc용 */
	.col_1{width: 8.33%;} .col_2{width: 16.66%;}
	.col_3{width: 25%;} .col_4{width: 33.33%;}
	.col_5{width: 41.66%;} .col_6{width: 50%;}
	.col_7{width: 58.33%;} .col_8{width: 66.66%;}
	.col_9{width: 75%;} .col_10{width: 83.33%;}
	.col_11{width: 91.66%;} .col_12{width: 100%;}
	.box{max-width: 1200px; margin: 0 auto; position: relative;}
	
	header .menu_btn{display: none;} /* 1200px 이상이면 메뉴 버튼 숨기기 */
	header menu{display: block;}
	header .menu li{display: inline; margin: 5px 0 0 50px;}
	
	}
</style>
</head>
<body>
	<header>
		<div class="box"> 
		<h1 class="logo"><a href="Index.jsp"><span> The </span> 스튜디오</h1>
			<ul class="menu">
				<li><a href="#"> 스튜디오 소개 </li></a>
				<li><a href="#"> 스튜디오 예약 </li></a>
				<li><a href="#"> 블로그 </li></a>
				<li><a href="#"> 포토 갤러리 </li></a>
				<li><a href="#"> 오시는 길 </li></a>
			</ul>
			
			<!-- 메뉴 숨기기 → -->
			<ul class="menu_btn">
				<li>  </li>
				<li>  </li>
				<li>  </li>
			</ul>
		</div>
	</header>
</body>
</html>