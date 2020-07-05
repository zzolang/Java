<%@page import="site.itwill.bean.Hewon"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 입력페이지(useBean_form.jsp)에서 전달된 값을 반환받아 공유하고 응답페이지(useBean_print.jsp)로 이동하는 jsp 문서 --%>
<% 
	//비정상적인 요청에 대한 응답 처리
	if(request.getMethod().equals("GET")) {
		response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
		return;
	}

	// 입력값을 전달받기 위해 캐릭터셋 변경
	request.setCharacterEncoding("utf-8");
	
%>

<%-- noUseBean_action.jsp의 2. 포워드 방법과 비교 --%>


<%-- useBean 태그의 기능 --%>
<%--	=> 공유 인스턴스를 반환받아 저장하는 기능을 제공 --%>
<%--	=> 공유 인스턴스가 없는 경우 인스턴스를 **생성하여 공유**하는 기능을 제공 --%>
<%-- id 속성(필수) : 공유 인스턴스의 이름을 속성값으로 설정(고유값) - 참조변수 이름 사용 가능 --%>
<%-- class 속성(필수) : 공유 인스턴스의 클래스를 속성값으로 설정 - 패키지를 포함하여 클래스 표현 --%>
<%-- scope 속성(선택) : 공유 범위를 속성값으로 설정 - page(기본), request, session, application --%>
<jsp:useBean id="hewon" class="site.itwill.bean.Hewon" scope="page" />

<%-- setProperty 태그의 기능 --%>
<%--	=> useBean 태그로 제공된 인스턴스의 필드값을 변경하는 기능 제공 - Setter 메소드의 기능 --%>
<%-- name 속성(필수) : useBean 태그에 제공된 인스턴스의 이름(id)을 속성값으로 설정 --%>
<%-- property 속성(필수) : 인스턴스의 필드명을 속성값으로 설정 --%>
<%-- value 속성(선택) : 인스턴스 필드에 저장될 값을 속성값으로 설정 --%>
<%--	=> value 속성 생략시 jsp 문서의 전달값을 반환받아 필드값으로 변경 >> value 속성은 거의 사용하지 않음 --%>
<%--	=> 입력태그의 name 속성값과 인스턴스 필드명이 동일해야만 변경 가능 --%>
<jsp:setProperty name="hewon" property="name" />

<jsp:forward page="useBean_print.jsp" />