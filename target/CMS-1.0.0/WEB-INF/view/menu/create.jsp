<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<jsp:include page="/WEB-INF/view/layout/header.jsp" />
<jsp:include page="/WEB-INF/view/layout/sideMenu.jsp" />
<div class="contents-wrap">

	<h1>메뉴 생성하기</h1>
	<form method="POST">
		<p class="font-test">
			메뉴코드 : <input type="text" name="muSeq" />
		</p>
		<p>
			메뉴명(KR) : <input type="text" name="munmKr" />
		</p>
		<p>
			메뉴명(EN) : <input type="text" name="munmEn" />
		</p>
		<p>
			메뉴 순서 : <input type="text" name="muOrdr" />
		</p>
		<p>
			메뉴 링크 : <input type="text" name="muPath" />
		</p>
		<p>
			<input type="submit" value="저장" />
	</form>
</div>
