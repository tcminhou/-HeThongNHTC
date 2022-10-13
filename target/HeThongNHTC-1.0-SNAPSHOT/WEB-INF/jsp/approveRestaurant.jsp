<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h1 class="text-center text-info" style="padding-top: 15px">DUYỆT NHÀ HÀNG</h1>
<script src="<c:url value="/js/restaurant.js" />"></script>

<div class="container">
    <div class="spinner-border text-secondary" id="myLoading"></div>
    <table class="table">
        <tr>
            <th></th>
            <th>Name</th>
            <th>Address</th>
            <th>Hotline</th>
            <th>ID Owner</th>
            <th>Status</th>
        </tr>
        <tbody id="employRes">

        </tbody>
    </table>
</div>


<script>
    <c:url value="/api/restaurants" var="endpoint" />
    window.onload = function () {
        loadRestaurants('${endpoint}');
    }
</script>