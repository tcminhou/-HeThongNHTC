
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>

<h1 class="text-center text-info" style="padding-top: 15px">THÊM NHÀ HÀNG</h1>
<div style="padding: 40px">
<form:form method="post" action="" modelAttribute="restaurant">
    <form:errors path="*" element="div" cssClass="alert alert-danger" />
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" path="name" class="form-control" id="name" placeholder="name" name="name" />
        <label for="name">Tên nhà hàng</label>
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" path="road" class="form-control" id="road" placeholder="road" name="road" />
        <label for="name">Tên đường</label>
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" path="ward" class="form-control" id="ward" placeholder="ward" name="ward" />
        <label for="name">Tên phường</label>
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" path="district" class="form-control" id="district" placeholder="district" name="district" />
        <label for="name">Tên quận</label>
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input type="number" path="hotline" class="form-control" id="hotline" placeholder="hotline" name="hotline" />
        <label for="name">Số điện thoại</label>
    </div>
    <div>
        <input type="submit" value="Thêm nhà hàng" class="btn btn-danger" />
    </div>
</form:form>
</div>
