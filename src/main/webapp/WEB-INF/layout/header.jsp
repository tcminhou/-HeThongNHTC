<%-- 
    Document   : header
    Created on : Aug 16, 2022, 10:48:54 PM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--kiểm tra trjang thái đăng nhập-->
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--navbar-->
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="javascript:void(0)">HeThongNHTC</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="mynavbar">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/" />">&#127758; Trang chu</a>
                </li>
                
                <sec:authorize access="!isAuthenticated()">
                <li class="nav-item">
                    <a class="nav-link text-info" href="<c:url value="/register" />">Đăng ký</a>
                </li>
                    <li class="nav-item">
                        <a class="nav-link text-info" href="<c:url value="/login" />">Đăng nhập</a>
                    </li>

                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <li class="nav-item">
                        <a class="nav-link text-danger" href="<c:url value="/login" />">

                            <img style="width: 30px;" src="${pageContext.session.getAttribute("currentUser").image}" class="rounded-circle"/>
                            ${pageContext.session.getAttribute("currentUser").firstname}
                            ${pageContext.session.getAttribute("currentUser").lastname}

                            (<sec:authentication property="principal.username" />)
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-danger" href="<c:url value="/logout" />">Đăng xuất</a>
                    </li>
                </sec:authorize>
                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <li class="nav-item">
                        <a class="nav-link text-info" href="<c:url value="/admin/stats" />">Quản trị hệ thống</a>
                    </li>
                </sec:authorize>
<!--                <li class="nav-item">
                    <a class="nav-link text-info" href="<c:url value="/admin/stats" />">Quản trị hệ thống</a>
                </li>-->
    <li class="nav-item">
                        <a class="nav-link text-info" href="<c:url value="/cart" />">Giỏ Hàng</a>
                    </li>

            </ul>  
            <c:url value="" var="action" />
            <form method="get" action="${action}" class="d-flex">
                <input class="form-control me-2" name="kw" type="text" placeholder="Nhap tu khoa...">
                <button type="submit" class="btn btn-primary" type="button">Tim</button>
            </form>
        </div>
    </div>
</nav>

