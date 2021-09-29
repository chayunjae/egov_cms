<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<ul
	class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
	id="accordionSidebar">

	<!-- Sidebar - Brand -->
	<a
		class="sidebar-brand d-flex align-items-center justify-content-center"
		href="/cms"> <span class="sidebar-brand-icon rotate-n-15">
			<i class="fas fa-laugh-wink"></i>
	</span> <span class="sidebar-brand-text mx-3">CMS - ADMIN</span>
	</a>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">

	<!-- Nav Item - Dashboard -->
	<li class="nav-item ${page_value eq 'dashboard' ? 'active' : ''}"
		id="dashboard"><a class="nav-link" href="/cms"> <i
			class="fas fa-fw fa-tachometer-alt"></i> <span>대시보드</span></a></li>


	<!-- Nav Item  -->
	<li class="nav-item ${page_value eq 'menu' ? 'active' : ''}" id="menu"><a
		class="nav-link" href="/cms?page=menu"> <i class="fas fa-th-list"></i>
			<span>메뉴 관리</span>
	</a></li>

	<li class="nav-item ${page_value eq 'contents' ? 'active' : ''}"
		id="contents"><a class="nav-link" href="/cms?page=contents">
			<i class="fas fa-folder"></i> <span>컨텐츠 관리</span>
	</a></li>

	<li class="nav-item ${page_value eq 'board' ? 'active' : ''}"
		id="board"><a class="nav-link" href="/cms?page=board"> <i
			class="fas fa-align-left"></i> <span>게시판 관리</span>
	</a></li>

	<!-- Nav Item - Utilities Collapse Menu 하위 드롭 메뉴-->
	<li
		class="nav-item ${page_value eq 'banner' ? 'active' : page_value eq 'popup' ? 'active' : ''}"
		id="flag"><a
		class="nav-link ${page_value eq 'banner' ? '' : page_value eq 'popup' ? '' : 'collapsed'}"
		href="#" data-toggle="collapse" data-target="#collapsePops"
		aria-expanded="true" aria-controls="collapsePops"> <i
			class="fas fa-users"></i> <span>배너/팝업 관리</span>
	</a>
		<div id="collapsePops" class="collapse ${page_value eq 'banner' ? 'show' : page_value eq 'popup' ? 'show' : ''}"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<a class="collapse-item ${page_value eq 'banner' ? 'active' :'' }" href="/cms?page=banner">배너</a> <a
					class="collapse-item ${page_value eq 'popup' ? 'active' :'' }" href="/cms?page=popup">팝업</a>
			</div>
		</div></li>


	<li
		class="nav-item ${page_value eq 'admin' ? 'active' : page_value eq 'user' ? 'active' : ''}"
		id="account"><a
		class="nav-link ${page_value eq 'admin' ? '' : page_value eq 'user' ? '' : 'collapsed'}"
		href="#" data-toggle="collapse" data-target="#collapseUsers"
		aria-expanded="true" aria-controls="collapseUsers"> <i
			class="fas fa-users"></i> <span>계정 관리</span>
	</a>
		<div id="collapseUsers" class="collapse ${page_value eq 'admin' ? 'show' : page_value eq 'user' ? 'show' : ''}"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<a class="collapse-item ${page_value eq 'admin' ? 'active' :'' }" href="/cms?page=admin">관리자</a> <a
					class="collapse-item ${page_value eq 'user' ? 'active' :'' }" href="/cms?page=user">회원</a>
			</div>
		</div></li>
	<!--  -->

	<li class="nav-item ${page_value eq 'rate' ? 'active' : ''}" id="rate"><a
		class="nav-link" href="/cms?page=rate"> <i
			class="fas fa-fw fa-chart-area"></i> <span>통계</span>
	</a></li>
	<!-- Divider -->
	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>
</ul>
