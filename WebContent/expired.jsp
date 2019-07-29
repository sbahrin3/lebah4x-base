<%@page import="lebah.util.UIDGenerator"%>
<%
session.invalidate();
String randomNo = UIDGenerator.getUID();
%>
<script>
	document.location = "../portalv2/?rndId=<%=randomNo%>";
</script>