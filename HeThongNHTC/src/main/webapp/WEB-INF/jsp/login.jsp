<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng nhập</title>
    <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="resources/css/fontawesome-all.min.css">
    <link rel="stylesheet" type="text/css" href="resources/css/iofrm-style.css">
    <link rel="stylesheet" type="text/css" href="resources/css/iofrm-theme5.css">
</head>
<body>
    
    <c:url value="/login" var="action" />
    
    <div class="form-body" class="container-fluid">
        <div class="website-logo">
            <a>
                <div class="logo">
                    <img class="logo-size" src="resources/images/logo-light.svg" alt="">
                </div>
            </a>
        </div>
        <div class="row">
            <div class="img-holder">
                <div class="bg"></div>
                <div class="info-holder">
                    <img src="resources/images/graphic2.svg" alt="">
                </div>
            </div>
            <div class="form-holder">
                <div class="form-content">
                    <div class="form-items">
                        <h3>Get more things done with Loggin platform.</h3>
                        <p>Access to the most powerfull tool in the entire design and web industry.</p>
                        <div class="page-links">
                            <a href="login" class="active">Login</a><a href="register">Register</a>
                        </div>
                        
                        <form  method="post" action="${action}">
                            <input id="username" class="form-control" type="text" name="username" placeholder="Username" required="" autofocus="">
                            <input id="password" class="form-control" type="password" name="password" placeholder="Password" required="" autofocus="">
                            <div class="form-button">
                                <button id="submit" type="submit" class="ibtn">Login</button>
                            </div>
                        </form>
                            
                        <div class="other-links">
                            <span>Or login with</span><a href="#">Facebook</a><a href="#">Google</a><a href="#">Linkedin</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
<script type="text/javascript" src="resources/js/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/popper.min.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/main.js"></script>
</body>
