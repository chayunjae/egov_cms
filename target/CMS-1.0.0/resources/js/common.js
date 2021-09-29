// 로그인 엔터 
function loginEnter() {
	if (event.keyCode == 13) {
		login_ADM(true);
	}
}

function login_ADM(bool) {
	var form = document.getElementById("loginForm");
	if (form.id.value === null || form.id.value === "") {
		alert("아이디를 입력해 주세요.")
		return;
	}
	if (form.password.value === null || form.password.value === "") {
		alert("패스워드를 입력해 주세요.")
		return;
	}
	form.submit();
	return bool;
}

function logout_ADM() {
	window.location.href = "/cms/logout"
}

function formChange(prev, next) {
	document.getElementById("component-adm-" + prev).className = "view-component";
	document.getElementById("component-adm-" + next).className = "view-component view-on";
}

//AJAX 통신 재사용
//CREATE
function CREATE_AJAX(path, req) {
	 $.ajax({
		url: path,
		type: "POST",
		data: JSON.stringify(req),
		contentType: "application/json;charset=UTF-8",
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
//READ

//UPDATE

//DELETE