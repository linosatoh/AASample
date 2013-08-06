<%@page import="agile.academy.App" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h2>Agile Academy Sample Application</h2>
<%! String addendStr; %>
<%! String augendStr; %>
<%
	addendStr = request.getParameter("addend");
	augendStr = request.getParameter("augend");
%>
<form method="POST">
<table id="calc_table">
	<tr><td>
	<input type="text" name="addend" value="<%= addendStr == null ? "" : addendStr %>"/>
	<span>+</span>
	<input type="text" name="augend" value="<%= augendStr == null ? "" : augendStr %>"/>
	<span>=</span>
	<label id="result"><%
	if (addendStr != null	&& augendStr != null) {
		out.print(App.subtract(Integer.valueOf(addendStr), Integer.valueOf(augendStr)).toString());
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
