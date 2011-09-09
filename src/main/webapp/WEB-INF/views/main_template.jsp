<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
	<title><tiles:getAsString name="title" /></title>
	<script type="text/javascript" src="resources/js/application.js"></script>
	<link href="resources/css/application.css" rel="stylesheet" type="text/css">
</head>
<body>
<table cellpadding="0" cellspacing="2" id="mainLayout">
	<tr>
		<td colspan="2" id="header"><tiles:insertAttribute name="header" /></td>
	</tr>
	<tr>
		<td id="leftBar"><tiles:insertAttribute name="leftBar" /></td>
		<td id="content"><tiles:insertAttribute name="content" /></td>
	</tr>
	<tr>
		<td colspan="2" id="footer"><tiles:insertAttribute name="footer" /></td>
	</tr>
</table>
</body>
</html>