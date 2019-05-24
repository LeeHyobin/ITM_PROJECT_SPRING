<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		var noticeList = '${list}';
		console.log(noticeList[0]);
	})
</script>
<title>Insert title here</title>
</head>
<body>
<main class="app-content">
	<div class="app-title">
		<h3>공지사항</h3>
	</div>
	<div>
		<table id="noticeList">
			<tr>
				<td>제목</td>
				<td>작성자</td>
				<td>작성일</td>
			</tr>
		</table>
	</div>
</main>
</body>
</html>