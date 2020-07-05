<%@page import="site.itwill.bean.Hewon"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 클라이언트에서 공유된 인스턴스를 반환 받아 응답하는 jsp 문서 --%>
<%
	/*
	// 1.
	// 비정상적인 요청에 대한 응답 처리(공유 인스턴스가 없는 경우가 비정상적인 요청)
	if(session.getAttribute("hewon")==null) {
		response.sendError(HttpServletResponse.SC_BAD_REQUEST);
		return;
	}
	
	// 공유 인스턴스를 반환받아 저장
	Hewon hewon=(Hewon)session.getAttribute("hewon");
	// 다른 jsp 문서에서 사용할 수 없도록 공유 인스턴스 제거
	session.removeAttribute("hewon"); // 다른 jsp 문서에서 공유 인스턴스 사용시 회원정보가 유출되므로 제거! 
	*/
	
	
	// 2.
	// 비정상적인 요청에 대한 응답 처리
	if(request.getAttribute("hewon")==null) {
		response.sendError(HttpServletResponse.SC_BAD_REQUEST);
		return;
	}
	
	// 공유 인스턴스를 반환받아 저장
	Hewon hewon=(Hewon)request.getAttribute("hewon"); // request scope이므로 요청과 응답 문서만 공유하는 인스턴스 >> 제거할 필요가 없다.
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<h1>회원정보 ㅎㅗㅏㄱㅇㅣㄴ</h1>
	<hr>
	<ul>
		<li>이름 = <%=hewon.getName() %></li>
		<li>번호 = <%=hewon.getPhone() %></li>
		<li>주소 = <%=hewon.getAddress() %></li>
	</ul>
</body>
</html>