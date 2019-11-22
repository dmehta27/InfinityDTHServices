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
    <title>Customer</title>
</head>
<body>
        <div class="container">
        <div class="row">
                <h1>Welcome User !!</h1>
                <a href="logout.jsp" class="btn btn-outline-danger" role="button" id="logbut">Log out</a>
              </div>
        <div class="row"> 
                <img src="2.jpg" class="bird2" alt="Bird image">
               </div>
               <div class="row">
                   <h4>Offers Like Never Before</h4>
               </div>
               <br/>
               <br/>
               <br/>
               <div class="row">
                <div id="demo" class="carousel slide" data-ride="carousel">

                    <!-- Indicators -->
                    <ul class="carousel-indicators">
                      <li data-target="#demo" data-slide-to="0" class="active"></li>
                      <li data-target="#demo" data-slide-to="1"></li>
                      <li data-target="#demo" data-slide-to="2"></li>
                    </ul>
                    
                    <!-- The slideshow -->
                    <div class="carousel-inner">
                      <div class="carousel-item active">
                        <img src="1.jpg" alt="Los Angeles" width="1100" height="500">
                        <div class="carousel-caption">
                            <h3>Standard HD</h3>
                            <p>Enroll for the standard HD ($9.99/ Month)</p>
                          </div>
                      </div>
                      <div class="carousel-item">
                        <img src="3.jpg" alt="Chicago" width="1100" height="500">
                        <div class="carousel-caption">
                            <h3>HD+</h3>
                            <p>Enroll for HD+ ($19.99/ Month)</p>
                          </div>
                      </div>
                      <div class="carousel-item">
                        <img src="4.jpg" alt="New York" width="1100" height="500">
                        <div class="carousel-caption">
                            <h3>HD + IPTV</h3>
                            <p>Enroll for HD + IPTV ($29.99/ Month)</p>
                          </div>
                      </div>
                    </div>
                    
                    <!-- Left and right controls -->
                    <a class="carousel-control-prev" href="#demo" data-slide="prev">
                      <span class="carousel-control-prev-icon"></span>
                    </a>
                    <a class="carousel-control-next" href="#demo" data-slide="next">
                      <span class="carousel-control-next-icon"></span>
                    </a>
                  </div>
               </div>
               <br/>
               <br/>
               <br/>
      </div>

      <script src="app.js"></script>
      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>   
    </body>
</html>