<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link type="text/css" rel="stylesheet" href="Registration.css"/>
</head>
<body>
<marquee >For Login or Register</marquee>
<form action="get">
    <table align="center">
        <tr><td>
            <label>Username:</label></td><td><input type="text" placeholder="User name" value="${userModel.userName}">
        </td></tr>
        <tr><td>
            <label>Password:</label></td><td><input type="password" placeholder="**********" value="${userModel.password}">
        </td></tr>
        <tr><td>
            <input id="css" type="submit" value="Submit">
        </td></tr>
    </table>
</form>
<center>
<table >
    <tr><td> <h1>For Registration</h1>
    </td></tr>
    <tr><td>
        <form action="Register.html">
            <div class="container">
                <button>Click Here</button>
            </div>
        </form>
    </td></tr>
</table>

<%--<script>--%>
<%--    function goBack() {--%>
<%--        window.history.back();--%>
<%--    }--%>
<%--</script>--%>
</center>
</body>
</html>