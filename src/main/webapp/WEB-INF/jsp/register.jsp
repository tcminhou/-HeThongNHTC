<%-- 
    Document   : register
    Created on : Sep 23, 2022, 1:51:52 AM
    Author     : HP
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h1 class="text-center text-danger"> ĐĂNG KÝ </h1>

<c:if test="${errMsg != null}">
    <div class="alert alert-danger">
        ${errMsg}
    </div>
</c:if>

<c:url value="/register" var="action" />
<form:form method="post" action="${action}" enctype="multipart/form-data" modelAttribute ="user">
    <div class="form-group">
        <label for="firstname">First Name</label>
        <form:input type="text" id="firstname" path="firstname" class="form-control" />

    </div>
    <div class="form-group">
        <label for="lastname">Last Name</label>
        <form:input type="text" id="lastname" path="lastname" class="form-control" />

    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <form:input type="text" id="email" path="email" class="form-control" />

    </div>
    <div class="form-group">
        <label for="phone">Phone</label>
        <form:input type="text" id="phone" path="phone" class="form-control" />

    </div>
    <div class="form-group">
        <label for="address">Address</label>
        <form:input type="text" id="address" path="address" class="form-control" />

    </div>
    <div class="form-group">
        <label for="username">Username</label>
        <form:input type="text" id="username" path="username" class="form-control" />

    </div>


    <div class="form-group">
        <label for="password">Password</label>
        <form:input type="password" id="password" path="password" class="form-control" />

    </div>
    <div class="form-group">
        <label for="confirmpassword">Confirm Password</label>
        <form:input type="password" id="confirmpassword" path="confirmpassword" class="form-control" />

    </div>
    <div class="form-group">
        <label for="image">Avatar</label>
        <form:input type="file" id="image" path="file" class="form-control" />

    </div>
        <br>
    <div class="form-group">
        <input class="btn btn-danger" type="submit" value="Đăng ký" />
    </div>
</form:form>
