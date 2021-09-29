<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/view/layout/header.jsp" />
<%-- <jsp:include page="/WEB-INF/view/layout/sessionInfo.jsp" /> --%>
<body id="page-top">
    <!-- Page Wrapper -->
    <div id="wrapper">
 		
 		<!-- Sidebar -->
        <jsp:include page="/WEB-INF/view/layout/sideMenu.jsp" /> 
		<!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                 <jsp:include page="/WEB-INF/view/layout/topBar.jsp" /> 
                <!-- End of Topbar -->
                
				<!-- Begin Page Content -->
				<jsp:include page="/WEB-INF/view/layout/content.jsp" /> 
				<!-- /.container-fluid -->
				
            </div>
            <!-- End of Main Content -->
			
            <!-- Footer -->
            <jsp:include page="/WEB-INF/view/layout/footer.jsp" />
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
   	<a class="scroll-to-top rounded" href="#page-top" style="align-items: center;justify-content: center;display: flex;">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">LOGOUT</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">로그아웃 하시겠습니까?</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">취소</button>
                    <a class="btn btn-primary" href="#" onclick="logout_ADM()">로그아웃</a>
                </div>
            </div>
        </div>
    </div>
</body>
<jsp:include page="/WEB-INF/view/layout/header2.jsp" />