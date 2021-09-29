<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/view/layout/header.jsp" />
<jsp:include page="/WEB-INF/view/layout/sideMenu.jsp" />
<script src="/resources/js/adminUtil.js"></script>
<div class="main-wrap p-10">
	<div class="view-component " id="component-adm-list">
		<jsp:include page="/WEB-INF/components/admin/list.jsp" />
	</div>
	<div class="view-component view-on" id="component-adm-form">
		<jsp:include page="/WEB-INF/components/admin/form.jsp" />
	</div>
</div>