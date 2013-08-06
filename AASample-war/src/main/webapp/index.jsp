<%@page import="agile.academy.App" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h2>Agile Academy Sample Application</h2>
<%! String num1Str; %>
<%! String num2Str; %>
<%
	num1Str = request.getParameter("text_num1");
	num2Str = request.getParameter("text_num2");
%>
<form method="POST">
<table id="calc_table">
	<tr><td>
	<input type="text" name="text_num1" value="<%= num1Str == null ? "" : num1Str %>"/>
	<span>+</span>
	<input type="text" name="text_num2" value="<%= num2Str == null ? "" : num2Str %>"/>
	<span>=</span>
	<label id="result"><% 
	if (num1Str != null	&& num2Str != null) {
		out.print(App.sub(Integer.valueOf(num1Str), Integer.valueOf(num2Str)));
	}
	%></label>
	</td></tr>
	<tr><td>
		<input id="button_calc" type="submit" value="CALC!"/>
	</td></tr>
</table>
</form>
</body>
</html>
