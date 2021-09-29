function f_addAdmin() {
	var admForm = document.getElementById("createAdm");
	var actionPath = "/cms/admin?a_mode=create";
	var req = JSON.stringify({
		id: admForm.admId.value,
		password: admForm.admPw.value,
		name: admForm.admName.value,
		authCode: admForm.admAuth.value,
		roleCode: admForm.admRole.value
	})
	var testResult = CREATE_AJAX(actionPath, req);
	console.log(testResult)
}