
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<h1 class="text-center text-info" style="padding-top: 15px">THÊM NHÀ HÀNG</h1>

<c:url value="/restaurant/add" var="action" />

<div style="padding: 40px">
    <form:form method="post" action="${action}" modelAttribute="restaurant" enctype="multipart/form-data">
        <form:errors path="*" element="div" cssClass="alert alert-danger" />
        <div class="form-group">
            <label for="name">Tên nhà hàng</label>
            <form:input type="text" path="name" class="form-control" id="name" placeholder="Name" name="name" />

        </div>

        <br>

        <div class="form-group">
            <label for="name">Tên đường</label>
            <form:input type="text" path="road" class="form-control" id="road" placeholder="Road" name="road" />

        </div>

        <br>

        <div class="form-group">
            <label for="name">Tên phường</label>
            <form:input type="text" path="ward" class="form-control" id="ward" placeholder="Ward" name="ward" />

        </div>

        <br>

        <div class="form-group">
            <label for="name">Tên quận</label>
            <form:input type="text" path="district" class="form-control" id="district" placeholder="District" name="district" />

        </div>

        <br>

        <div class="form-group">
            <label for="name">Số điện thoại</label>
            <form:input type="phone" path="hotline" class="form-control" id="hotline" placeholder="Hotline" name="hotline" />

        </div>

        <br>

        <div class="form-group">
            <label for="image">Avatar</label>
            <form:input type="file" id="image" path="file" class="form-control" />

        </div>

        <br>

        <div>
            <input type="submit" value="Thêm nhà hàng" class="btn btn-danger" />
        </div>
    </form:form>
</div>