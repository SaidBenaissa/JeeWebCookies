<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Test</title>
</head>
<body>
<p> Vous sur autre.jsp</p>
<c:if test="${!empty sessionScope.nom && !empty sessionScope.prenom }">
<p> <c:out value="Vous etes ${sessionScope.nom } ${sessionScope.prenom }"></c:out></p>
</c:if>


</body>
</html>