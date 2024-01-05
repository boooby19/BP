<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<mt:template title="BeachclubApp">
    <jsp:attribute name="content">
    <br>
         <h1>Login</h1>
        <br>
        <br>
        <form>
            <!-- Email input -->
            <div class="form-outline mb-4">
                <input type="email" id="form2Example1" class="form-control" />
                <label class="form-label" for="form2Example1">Email address</label>
            </div>
            <br>
            <!-- Password input -->
            <div class="form-outline mb-4">
                <input type="password" id="form2Example2" class="form-control" />
                <label class="form-label" for="form2Example2">Password</label>
            </div>
            <br>
            <!-- Submit button -->
            <button type="button" class="btn btn-primary btn-block mb-4" style="background-color: #2e5d6c">Sign in</button>

        </form>

    </jsp:attribute>
</mt:template>
