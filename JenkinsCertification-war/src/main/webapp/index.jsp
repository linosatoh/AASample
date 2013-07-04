<%@page import="jp.shiftinc.App" %>
<html>
<body>
<h2>Hello World!</h2>
<h3>
<%
out.print("1 + 2 = " + App.add(1, 2));
%>
</h3>
</body>
</html>
