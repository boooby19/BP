<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<mt:template title="BeachclubApp">
    <jsp:attribute name="content">
    <br>
        <h1>Aktualizácia rezervácie</h1>
        <br>

        <form action="${pageContext.request.contextPath}/reservations/update/${reservationRecord.getId()}" method="post">
            <span class="label label-default"><bold>Court Number :</bold></span>
            <input type=text name="name" value="${reservationRecord.getCourtNumber()}" class="form-control"><br>
            <span class="label label-default"><bold>Start Time :</bold></span>
            <input type=text name="points" value="${reservationRecord.getStartTime()}" class="form-control"><br>
            <span class="label label-default"><bold>End Time :</bold></span>
            <input type=text name="points" value="${reservationRecord.getEndTime()}" class="form-control"><br>

            <input type=submit class="btn btn-sm btn-success" value="Update">
        </form>

        <br>


    </jsp:attribute>
</mt:template>
