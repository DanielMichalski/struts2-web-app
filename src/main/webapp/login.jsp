<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h4>For testing: test test</h4>
<s:form action="login">
    <s:textfield label="Login ID" key="userId"/>
    <s:password label="Password" key="password"/>
    <s:submit/>
</s:form>
</body>
</html>
