<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form id="createAdm" method="POST">
	<div class="flex-center mb-10">
		<button type="button" class="primary-btn-fill mr-10"
			onclick="f_addAdmin()">등록</button>
		<button type="button" class="none-btn"
			onclick="formChange('form','list')">취소</button>
	</div>
	<div class="form-wrap">
		<div class="flex-base">
			<div class="flex-1">
				<p class="flex-center h-la-s">ID</p>
				<p class="flex-center h-la-s">PW</p>
				<p class="flex-center h-la-s">NAME</p>
				<p class="flex-center h-la-s">AUTH</p>
				<p class="flex-center h-la-s">ROLE</p>
			</div>
			<div class="flex-3">
				<div class="flex-center h-la-s">
					<input type="text" id="admId" name="admId" />
				</div>
				<div class="flex-center h-la-s">
					<input type="text" id="admPw" name="admPw" />
				</div>
				<div class="flex-center h-la-s">
					<input type="text" id="admName" name="admName" />
				</div>
				<div class="flex-center h-la-s">
					<select id="admAuth" name="admAuth">
						<c:forEach var="auth" items="${authList}" varStatus="status">
							<option value="${auth.code }">${auth.name }</option>
						</c:forEach>
					</select>
				</div>
				<div class="flex-center h-la-s">
					<select id="admRole" id="admRole">
						<c:forEach var="role" items="${roleList}" varStatus="status">
							<option value="${role.roleCode }">${role.roleName }</option>
						</c:forEach>
					</select>
				</div>
			</div>
		</div>
	</div>
</form>