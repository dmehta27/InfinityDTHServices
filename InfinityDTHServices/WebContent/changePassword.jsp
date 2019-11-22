<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="styles.css">
<title>Change Password</title>
</head>
<body>
	<div class="container">
		<h1>Change Password</h1>
		<div class="row">
			<img src="2.jpg" class="bird" alt="Bird image">
		</div>
		<form onSubmit="return checkPassword(this)" name="form1"
			action="<%=request.getContextPath()%>/LoginServlet" method="post">
			<input type="hidden" name="operator" value="passowrdManagement" />
			<div class="form-group">
				<label for="password">New Password</label> <input type="password"
					class="form-control" name="pwd1" id="pass"
					placeholder="********" required>
			</div>
			<div class="form-group">
				<label for="password">Confirm New Password</label> <input
					type="password" class="form-control" id="pass" name="pwd2"
					placeholder="********" required>
			</div>

			<button type="submit" id="registbut" class="btn btn-outline-dark">Update</button>

		</form>


	</div>

	<script type="text/javascript">
		function checkPassword(form) {
			if (form.pwd1.value != "" && form.pwd1.value == form.pwd2.value) {
				if (form.pwd1.value.length < 6) {
					alert("Error: Password must contain at least six characters!");
					form.pwd1.focus();
					return false;
				}
				re = /[0-9]/;
				if (!re.test(form.pwd1.value)) {
					alert("Error: password must contain at least one number (0-9)!");
					form.pwd1.focus();
					return false;
				}
				re = /[a-z]/;
				if (!re.test(form.pwd1.value)) {
					alert("Error: password must contain at least one lowercase letter (a-z)!");
					form.pwd1.focus();
					return false;
				}
				re = /[A-Z]/;
				if (!re.test(form.pwd1.value)) {
					alert("Error: password must contain at least one uppercase letter (A-Z)!");
					form.pwd1.focus();
					return false;
				}
			} else {
				alert("Error: Please check that you've entered and confirmed your password!");
				form.pwd1.focus();
				return false;
			}

		}
	</script>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>