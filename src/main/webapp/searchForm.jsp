<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Search Page</title>
</head>
<body>
<s:form action="tutorials/getTutorial">
    <s:textfield label="Enter the language" key="language" />
    <s:submit />
</s:form>
</body>
</html>
