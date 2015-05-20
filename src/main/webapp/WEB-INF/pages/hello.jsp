<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
	<h1>${message}</h1>
    <p>${logon_error}</p>
    <br/>
    <form action="/info" method="post">
        <input type="text" id="par" name="par" />
        <input type="submit" value="PUSH!"/>
    </form>
</body>
</html>