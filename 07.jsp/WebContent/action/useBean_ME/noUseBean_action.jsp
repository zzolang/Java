<%@page import="site.itwill.bean.Hewon"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 입력페이지(noUseBean_form.jsp)에서 전달된 값을 반환받아 공유하고 응답페이지(noUseBean_print.jsp)로 이동하는 jsp 문서 --%>
<% 
	// 비정상적인 요청에 대한 응답 처리
	if(request.getMethod().equals("GET")) {
		response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
		return;
	}

	// 입력값을 전달받기 위해 캐릭터셋 변경
	request.setCharacterEncoding("utf-8");

	// 입력값을 반환받아 저장
	String name=request.getParameter("name");
	String phone=request.getParameter("phone");
	String address=request.getParameter("address");
	
	/* ③ Hewon.java 생성 */ 
	// ④ VO 클래스로 인스턴스 생성하여 전달값으로 필드값 변경
	Hewon hewon=new Hewon();
	hewon.setName(name);
	hewon.setPhone(phone);
	hewon.setAddress(address);
	
	
	
	// Java 명령을 이용한 페이지 이동방법
	//	=> 다른 jsp 문서에 응답 결과 제공
	
	//	1. 리다이렉트 이동 : 클라이언트에서 301 코드와 URL을 전달하여 다른 jsp 문서를 재요청하여 응답되도록 구현
	//	=> ① 클라이언트 브라우저의 URL 변경
	/* noUseBean 에게 줄 공유인스턴스를 만들기 위해서는 4가지 방법. include와 forward 만이 스레드 이동. ② 현재는 session 만 사용 가능?? */
	/*
	session.setAttribute("name", "name");
	session.setAttribute("phone", "phone");
	session.setAttribute("address", "address");  >> 일일히 다 적어야 하므로 번거로움 >> ③ 클래스 생성
	*/
	//	=> session 내장객체를 이용하여 인스턴스 공유(Session Scope)
	// session.setAttribute("hewon", hewon); /* ④-1) 인스턴스가 공유되어 필드값에 원하는 값 저장되어 있을 것임 */
	// response.sendRedirect("noUseBean_print.jsp"); /* ①-1) 클라이언트 url 변경 */
	//	=> **후에 클라이언트에게 결과 전달시 url에 noUseBean_print.jsp로 출력됨

	

	// 2. 포워드 이동 : 현재 jsp 문서(요청)에서 다른 jsp 문서(응답)로 스레드를 이동하여 응답되도록 구현(요청과 응답 분리)
	//	=> 클라이언트 브라우저의 URL 미변경
	//	=> ② request 내장객체를 이용하여 인스턴스 공유(Request Scope). 굳이 다른 문서에 인스턴스 공유할게 아니므로 request scope. forward와 같이 잘 사용한다
	request.setAttribute("hewon", hewon); // 스레드가 이동되어야 request 내장객체 사용 가능

	// ① request.getRequestDispatcher(String path) : 스레드 이동관련 정보를 저장하는 RequestDispatcher 인스턴스를 반환하는 메소드 
	// RequestDispatcher.forward(ServletRequest request, ServletResponse response) : RequestDispatcher 인스턴스에 저장된 jsp 문서로 스레드를 이동시키는 메소드
	request.getRequestDispatcher("noUseBean_print.jsp").forward(request, response); // 현재 액션태그<jsp:forward />가 아닌 자바 명령으로 작성 중이므로
	//	=> **스레드가 이동되긴 했으나 서버 자체에서만 이동했기 때문에 클라이언트에게 결과 전달시 url 변경x(noUseBean_action.jsp로 출력됨). 결과만 noUseBean_print임

%>