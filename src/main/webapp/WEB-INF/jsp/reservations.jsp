<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<mt:template title="BeachclubApp">
    <jsp:attribute name="content">
    <br>
        <h1>Rezervácie</h1>
        <br>
        <a href ="/reservations/new"><input type="button" class="btn btn-sm btn-danger" value="Create"></a>
        <br>
        <a href ="/reservations/browse"><input type="button" class="btn btn-sm btn-success" value="Browse"></a>
    </jsp:attribute>
</mt:template>
