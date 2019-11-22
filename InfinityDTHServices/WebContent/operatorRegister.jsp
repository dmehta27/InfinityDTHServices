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
<title>Operator</title>
</head>
<body>
	<div class="container">
		<h1>Operator Registration</h1>
		<label for="dpass" id="lpass"><h5>Default Password</h5></label>
		<h5 class="text-warning" id="dpass">Change@pwd</h5>
		<div class="row">
			<img src="2.jpg" class="bird" alt="Bird image">
		</div>
		<form>
			<div class="form-group">
				<label for="fname">First Name</label> <input type="text"
					class="form-control" id="mail" placeholder="First Name" required>
			</div>
			<div class="form-group">
				<label for="lname">Last Name</label> <input type="text"
					class="form-control" id="mail" placeholder="Last Name" required>
			</div>
			<div class="form-group">
				<label for="email">Email</label> <input type="email"
					class="form-control" id="mail" placeholder="Enter your email id"
					required>
			</div>
			<div class="form-group">
				<label for="pnumber">Phone Number</label> <input type="tel"
					pattern="[0-9]{3}-[0-9]{2}-[0-9]{3}" minlength="10" maxlength="10"
					class="form-control" id="mail" placeholder="xxx-xxx-xxxx" required>
			</div>

			<div class="form-group">
				<label for="sel1">Shift Time Start</label> <select
					class="form-control" id="dropdown1">
					<option>9:00 AM</option>
					<option>10:00 AM</option>
					<option>11:00 AM</option>
					<option>12:00 AM</option>
					<option>1:00 PM</option>
					<option>2:00 PM</option>
					<option>3:00 PM</option>
					<option>4:00 PM</option>
					<option>5:00 PM</option>
				</select>
			</div>
			<div class="form-group">
				<label for="sel1">Shift Time End</label> <select
					class="form-control" id="dropdown1">
					<option>9:00 AM</option>
					<option>10:00 AM</option>
					<option>11:00 AM</option>
					<option>12:00 AM</option>
					<option>1:00 PM</option>
					<option>2:00 PM</option>
					<option>3:00 PM</option>
					<option>4:00 PM</option>
					<option>5:00 PM</option>
				</select>
			</div>

			<div class="form-group">
				<label for="maxcust">Maximum no of customers</label> <input
					type="text" class="form-control" id="mail"
					placeholder="Maximum no of customers" required>
			</div>
			<div class="form-group">
				<label for="cdate">Creation Date</label> <input type="date"
					class="form-control" id="mail" placeholder="Creation Date" required>
			</div>
			<div class="form-group">
				<label for="oname">Total no of Active Customers</label> <input
					type="text" class="form-control" id="mail"
					placeholder="Total no of Active customers">
			</div>
			<button type="submit" id="registbut" class="btn btn-outline-light">Submit</button>

		</form>

		<br /> <br /> <br />


	</div>





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