<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:include page="/WEB-INF/view/layout/header.jsp" />
    <table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
        <tr>
            <td width="100%" height="100%" align="center" valign="middle" style="padding-top: 150px;"><table border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td class="<spring:message code='image.errorBg' />">
                            <span style="font-family: Tahoma; font-weight: bold; color: #000000; line-height: 150%; width: 440px; height: 70px;">
                            세션 만료
                            </span>
                            <button class="default-btn" type="button" onclick="return window.location.href='/cms'">LOGIN</button>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
