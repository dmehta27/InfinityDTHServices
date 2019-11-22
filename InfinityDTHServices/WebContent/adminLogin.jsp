<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="styles.css">
    <title>Admin</title>
</head>
<body>
        <div class="container">
        <div class="row">
                <h1>Welcome Admin !!</h1>
                <a href="logout.jsp" class="btn btn-outline-danger" role="button" id="logbut">Log out</a>
              </div>
        <div class="row"> 
                <img src="2.jpg" class="bird2" alt="Bird image">
               </div>
        <div class="row">
          <div class="col-sm-4">
            <h3>Customer Registration</h3>
            <a href="customerRegister.jsp" class="btn btn-outline-warning" role="button" id="acbut">Register</a>
            <img src="9.jpg" id="cimage" alt="Customer Image">
          </div>
          <div class="col-sm-4">
            <h3>Operator Registration</h3>
            <a href="operatorRegister.jsp" class="btn btn-outline-warning" role="button" id="acbut">Register</a>
            <img src="9.jpg" id="cimage" alt="Customer Image">
          </div>
          <div class="col-sm-4">
            <h3>Retailer Registration</h3>
            <a href="retailorRegister.jsp" class="btn btn-outline-warning" role="button" id="acbut">Register</a>
            <img src="9.jpg" id="cimage" alt="Customer Image">
          </div>
        </div>
      </div>

      <script src="app.js"></script>
      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>   
    </body>
</html>