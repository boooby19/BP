<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<mt:template title="BeachclubApp">
    <jsp:attribute name="content">
    <br>
        <h1>Prehľad rezervácií</h1>
        <br>

        <table class="table table-hover">
            <thead>
            <tr>

                <td style='font-weight:bold'>Court</td>
                <td style='font-weight:bold'>Start Time</td>
                <td style='font-weight:bold'>End Time</td>
            </tr>
            </thead>
            <c:forEach items="${reservations}" var="rsv">
                <tr>

                    <td>${rsv.getCourtNumber()}</td>
                    <td>${rsv.getStartTime()}</td>
                    <td>${rsv.getEndTime()}</td>

                    <td style="width:5%">
						<form:form action="/reservations/delete/${rsv.getId()}" method="POST">
                            <input type="submit" class="btn btn-sm btn-danger" value="Delete">
                        </form:form>
                    </td>
                    <td style="width:5%">
						<form:form action="/reservations/update/${rsv.getId()}" method="POST">
                            <input type="submit" class="btn btn-sm btn-success" value="Update">
                        </form:form>
                    </td>
                </tr>
            </c:forEach>

        </table>

    </jsp:attribute>
</mt:template>
