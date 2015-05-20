<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/custom_login" method="post">
    <p>Error message: ${logon_error}</p>
    <p>Logout param value: ${param.logout}</p>
    <p>
        <label for="username">Username</label>
        <input type="text" id="username" name="username"/>
    </p>
    <p>
        <label for="password">Password</label>
        <input type="password" id="password" name="password"/>
    </p>
    <button type="submit">Log in!!!</button>
</form>