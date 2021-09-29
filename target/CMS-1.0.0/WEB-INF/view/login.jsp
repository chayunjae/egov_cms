<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/view/layout/header.jsp" />

<%
String loginFailed = (String) session.getAttribute("LOGIN_STATUS");
String loginRetry = (String) session.getAttribute("ID_SAVE");

if (loginFailed != null) {
	if (loginFailed == "FAILED") {
%>
<script>
	alert("아이디 또는 비밀번호가 일치하지 않습니다.")
</script>
<%
} else if (loginFailed == "NONEAUTH") {
%>
<script>
	alert("로그인이 필요한 서비스 입니다.")
</script>
<%
}
session.setAttribute("LOGIN_STATUS", null);
}
%>
<section class="login-wrap flex-center-row">
	<div class="login-form-box default-box flex-center-col">
		<h2>LOGIN</h2>
		<form action="/cms/login" id="loginForm" method="post"
			onsubmit="return login_ADM(true);">
			<div class="mb-10">
				<input onkeydown="loginEnter()" type="text" name="id" id="id"
					value="${ID_SAVE}" autocomplete="off" autofocus placeholder="ID" />
			</div>
			<div class="mb-10">
				<input onkeydown="loginEnter()" type="password" name="password"
					id="password" autocomplete="off" placeholder="PASSWORD" />
			</div>
			<button type="button" class="login-btn" onclick="login_ADM(true)">LOGIN</button>
		</form>
	</div>
</section>