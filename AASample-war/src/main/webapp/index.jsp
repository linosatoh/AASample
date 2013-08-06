<%@page import="agile.academy.App" %>
<html>
<body>
<h2>Agile Academy Sample Application</h2>
<%! String num1Str; %>
<%! String num2Str; %>
<%
	num1Str = request.getParameter("num1");
	num2Str = request.getParameter("num2");
%>
<form method="POST">
	<input type="text" name="num1" value="<%= num1Str == null ? "" : num1Str %>"/>
	<span>+</span>
	<input type="text" name="num2" value="<%= num2Str == null ? "" : num2Str %>"/>
	<span>=</span>
	<label id="result"><% 
	if (num1Str != null	&& num2Str != null) {
		out.print(App.add(Integer.valueOf(num1Str), Integer.valueOf(num2Str)));
	}
	%></label>
	
	<input type="submit" value="計算"/>
</form>
</body>
</html>
