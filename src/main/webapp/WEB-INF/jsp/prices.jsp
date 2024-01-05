<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>BeachclubApp</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<mt:template title="BeachclubApp">
    <jsp:attribute name="content">
        <br>
        <h1>Cenník</h1>
        <br>
        <br>
<div class = "table">
        <table class="table table-bordered table-info" style="background-color: #2e5d6c; color: white;">
            <thead>
            <tr>
                <th scope="col">Areál</th>
                <th scope="col">8:00 - 15:00</th>
                <th scope="col">15:00 - 21:00</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">Beachclub Prešov</th>
                <td>7,- € / hod</td>
                <td>8,- € / hod</td>
            </tr>
            <tr>
                <th scope="row">Little Beachclub</th>
                <td>7,- € / hod</td>
                <td>8,- € / hod</td>
            </tr>
            </tbody>
        </table>
</div>
    </jsp:attribute>
</mt:template>

</body>
</html>