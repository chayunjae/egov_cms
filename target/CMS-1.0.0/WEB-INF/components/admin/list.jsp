<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="flex-center">
	<button type="button" class="mr-10" onclick="formChange('list','form')">추가</button>
	<button type="button">삭제</button>
</div>
<table class="table-wrap mtb-10">
	<colgroup class="table-col-mobile">
		<col width="5%" />
		<col width="10%" />
		<col width="10%" />
		<col width="10%" />
		<col width="5%" />
	</colgroup>
	<thead class="table-header">
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>권한</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<c:set var="number" value="${totalCount - ((curpage-1) * 10)}" />
		<c:if test="${empty adminList && empty keyword}">
			<tr>
				<td colspan="5" class="ft-center">조회된 내용이 없습니다.</td>
			</tr>
		</c:if>
		<c:forEach var="row" items="${adminList}" varStatus="status">
			<tr>
				<td class="ft-center">${number-status.index}</td>
				<td class="ft-center">${row.id }</td>
				<td class="ft-center">${row.name }</td>
				<td class="ft-center">${row.roleCode }</td>
				<td class="ft-center"><button type="button">수정</button></td>
			</tr>
		</c:forEach>
	</tbody>
</table>