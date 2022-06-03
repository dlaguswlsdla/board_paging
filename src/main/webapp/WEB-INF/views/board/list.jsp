<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="jumbotron">
	<h3>게시판 페이징 연습</h3>
</div>

<div class="container">
<table class="table">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>등록일</th>
		<th>수정일</th>
	</tr>
	<c:forEach items="${list}" var="b">
	<tr>
		<td>${b.bno}</td>
		<td>${b.title}</td>
		<td>${b.writer}</td>
		<td>${b.regDate}</td>
		<td>${b.updateDate}</td>
	</tr>
	</c:forEach>
</table>
<div>
<c:if test="${pageMaker.prev}">
	<a href="?page=${pageMaker.startPage-1}">[이전]</a>
</c:if>
	<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="pageNum">
		<a href="?page=${pageNum}" class="${param.page == pageNum ? 'on':''}">[${pageNum}]</a>
	</c:forEach>
	<c:if test="${pageMaker.next}">
	<a href="?page=${pageMaker.endPage+1}">[다음]</a>
</c:if>
</div>


</div>

</body>
<style>
.on {
	font-weight: 700;
	color: red;}
</style>
</html>