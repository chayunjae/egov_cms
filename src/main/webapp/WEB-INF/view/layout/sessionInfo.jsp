<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div
	style="position: absolute; z-index: 1; box-shadow: 0 3px 7px rgba(0, 0, 0, 0.16); padding: 15px; background-color: rgba(255, 255, 255, 0.4); bottom: 0;">
	<span>세션 정보</span> <br> isNew :
	<%=session.isNew()%><br> Session ID :
	<%=session.getId()%><br> Session Created :
	<%=new java.util.Date(session.getCreationTime())

		.toString()%><br> Session Last Access Time :
	<%=new java.util.Date(session.

		getLastAccessedTime()).toString()%><br> Session Active Time :
	<%=session.getMaxInactiveInterval()%>
	sec<br>

</div>