function f_addAdmin() {
	var admForm = document.getElementById("createAdm");
//	var req =
		//	var actionPath = "/cms/admin?a_mode=create";
		//	var testResult = CREATE_AJAX(actionPath,req);
	$.ajax({
		url: "/cms/test",
		type: "POST",
		data: JSON.stringify({
			"id": "222"
		}),
		contentType: "application/json",
		success: function(val) {
			console.log(val)
			return "OK!"
		},
		error: function(e) {
			console.log(e)
			return "NO!"
		}
	})
}