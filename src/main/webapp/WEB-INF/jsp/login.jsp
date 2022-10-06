<%-- 
    Document   : login
    Created on : Aug 27, 2022, 3:07:12 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1 class="text-center text-primary" style="padding: 15px"> ĐĂNG NHẬP</h1>

<c:url value="/login" var="action" />

<form method="post" action="${action}">    
    
    <div>
        <h1 style="float: left; padding-top: 30px" class="text-center text-info" >HỆ THỐNG <br> NHÀ HÀNG TIỆC CƯỚI </h1>
    </div>
    
    <!--căn giữa-->
    <div style="height: 100%; display: flex; align-items: center; justify-content: center">
        
        <div class="form-group" >
            <label for="username"  class="sr-only">Username</label>
            <input type="text" id="username" name="username" class="form-control" placeholder="Username"/>
            <br>
            <div class="form-group">
                <label for="password" class="sr-only">Password</label>
                <input type="password" id="password" name="password" class="form-control" placeholder="Password"/>
            </div>
            <br>
            <div class="form-group">
                <input class="btn btn-danger" type="submit" value="Đăng nhập" />
            </div>
        </div>
        
    </div>
</form>