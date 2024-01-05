<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<mt:template title="BeachclubApp">
    <jsp:attribute name="content">
    <br>
        <h1>Nová rezervácia</h1>
        <br>
<%--<c:forEach items="${reservations}" var="rsv">--%>
    <form action="${pageContext.request.contextPath}/reservations/add" method="post">
        <span class="label label-default">Court number :</span>
        <input type=text name="courtNumber" class="form-control"><br>
        <span class="label label-default">Start time :</span>
        <input type=datetime-local name="startTime" class="form-control"><br>
        <span class="label label-default">End time :</span>
        <input type=datetime-local name="endTime" class="form-control"><br>
        <br>
        <input type=submit class="btn btn-sm btn-success" value="Create">
    </form>
<%--</c:forEach>--%>
    </jsp:attribute>
</mt:template>
