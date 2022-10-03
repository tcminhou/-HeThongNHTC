
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="<c:url value='/' />">HTNHTC</a>
        
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">         
                
                <sec:authorize access="!isAuthenticated()">
                    <li class="nav-item">
                        <a class="nav-link text-danger" href="<c:url value="/login" />">Đăng nhập</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-danger" href="<c:url value="/register"/>">Đăng kí</a>
                    </li>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <li class="nav-item">
                        <a class="nav-link text-danger" href="<c:url value="/login" />">                         
                            ${pageContext.session.getAttribute("currentUser").firstName}
                            ${pageContext.session.getAttribute("currentUser").lastName}
                            (<sec:authentication property="principal.username"/>)
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-danger" href="<c:url value="/logout" />">Đăng xuất</a>
                    </li>
                </sec:authorize>
            </ul>
        </div>
    </div>
</nav>
