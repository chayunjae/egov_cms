<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<ul
	class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
	id="accordionSidebar">

	<!-- Sidebar - Brand -->
	<a
		class="sidebar-brand d-flex align-items-center justify-content-center"
		href="/cms" > <span
		class="sidebar-brand-icon rotate-n-15"> <i
			class="fas fa-laugh-wink"></i>
	</span> <span class="sidebar-brand-text mx-3">CMS - ADMIN</span>
	</a>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">

	<!-- Nav Item - Dashboard -->
	<li class="nav-item active"><a class="nav-link" href="/cms"> <i
			class="fas fa-fw fa-tachometer-alt"></i> <span>대시보드</span></a></li>

	<!-- Divider -->
	<!--             <hr class="sidebar-divider"> -->

	<!-- Heading -->
	<!--             <li class="sidebar-heading"> -->
	<!--                 컨텐츠 -->
	<!--             </li> -->

	<!-- Nav Item  -->
	<li class="nav-item"><a class="nav-link"
		href="/cms?page=menu"> <i class="fas fa-th-list"></i> <span>메뉴
				관리</span></a></li>

	<li class="nav-item"><a class="nav-link"
		href="/cms?page=contents"> <i class="fas fa-folder"></i> <span>컨텐츠
				관리</span></a></li>

	<li class="nav-item"><a class="nav-link"
		href="/cms?page=board"> <i class="fas fa-align-left"></i> <span>게시판
				관리</span></a></li>

	<li class="nav-item"><a class="nav-link"
		href="/cms?page=popup"> <i class="fas fa-flag"></i> <span>배너/팝업
				관리</span></a></li>

	<li class="nav-item"><a class="nav-link"
		href="/cms?page=user"> <i class="fas fa-users"></i> <span>사용자
				관리</span></a></li>

	<li class="nav-item"><a class="nav-link"
		href="/cms?page=rate"> <i class="fas fa-fw fa-chart-area"></i>
			<span>통계</span></a></li>
	<!-- Nav Item - Utilities Collapse Menu 하위 드롭 메뉴-->
	<!--             <li class="nav-item"> -->
	<!--                 <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" -->
	<!--                     aria-expanded="true" aria-controls="collapseUtilities"> -->
	<!--                     <i class="fas fa-fw fa-wrench"></i> -->
	<!--                     <span>컨텐츠 관리</span> -->
	<!--                 </a> -->
	<!--                 <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" -->
	<!--                     data-parent="#accordionSidebar"> -->
	<!--                     <div class="bg-white py-2 collapse-inner rounded"> -->
	<!--                         <h6 class="collapse-header">Custom Utilities:</h6> -->
	<!--                         <a class="collapse-item" href="utilities-color.html">Colors</a> -->
	<!--                         <a class="collapse-item" href="utilities-border.html">Borders</a> -->
	<!--                         <a class="collapse-item" href="utilities-animation.html">Animations</a> -->
	<!--                         <a class="collapse-item" href="utilities-other.html">Other</a> -->
	<!--                     </div> -->
	<!--                 </div> -->
	<!--             </li> -->

	<!-- Divider -->
	<hr class="sidebar-divider d-none d-md-block">

	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>

</ul>
