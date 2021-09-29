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
<!-- <section class="login-wrap flex-center-row"> -->
<!-- 	<div class="login-form-box default-box flex-center-col"> -->
<!-- 		<h2>LOGIN</h2> -->
<!-- 		<form action="/cms/login" id="loginForm" method="post" -->
<!-- 			onsubmit="return login_ADM(true);"> -->
<!-- 			<div class="mb-10"> -->
<!-- 				<input onkeydown="loginEnter()" type="text" name="id" id="id" -->
<%-- 					value="${ID_SAVE}" autocomplete="off" autofocus placeholder="ID" /> --%>
<!-- 			</div> -->
<!-- 			<div class="mb-10"> -->
<!-- 				<input onkeydown="loginEnter()" type="password" name="password" -->
<!-- 					id="password" autocomplete="off" placeholder="PASSWORD" /> -->
<!-- 			</div> -->
<!-- 			<button type="button" class="login-btn" onclick="login_ADM(true)">LOGIN</button> -->
<!-- 		</form> -->
<!-- 	</div> -->
<!-- </section> -->
<body class="bg-gradient-primary d-flex align-items-center ">

	<div class="container">

		<!-- Outer Row -->
		<div class="row justify-content-center">

			<div class="col-xl-10 col-lg-12 col-md-9">

				<div class="card o-hidden border-0 shadow-lg my-5">
					<div class="card-body p-0">
						<!-- Nested Row within Card Body -->
						<div class="row">
							<div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
							<div class="col-lg-6">
								<div class="p-5">
									<div class="text-center">
										<h1 class="h4 text-gray-900 mb-4">CMS - INNOVERGENCE</h1>
									</div>
									<form class="user" action="/cms/login" id="loginForm"
										method="post" onsubmit="return login_ADM(true);">
										<div class="form-group">
											<input type="text" class="form-control form-control-user"
												id="id" name="id" value="${ID_SAVE}" aria-describedby="idInput"
												onkeydown="loginEnter()" placeholder="ID" autofocus>
										</div>
										<div class="form-group">
											<input type="password" class="form-control form-control-user"
												id="password" name="password" onkeydown="loginEnter()"
												placeholder="PASSWORD">
										</div>
										<%-- <div class="form-group">
											<div class="custom-control custom-checkbox small">
												<input type="checkbox" class="custom-control-input"
													id="customCheck"> <label
													class="custom-control-label" for="customCheck">Remember
													Me</label>
											</div>
										</div> --%>
										<a href="#" onclick="login_ADM(true)"
											class="btn btn-primary btn-user btn-block"> LOGIN </a>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<jsp:include page="/WEB-INF/view/layout/header2.jsp" />