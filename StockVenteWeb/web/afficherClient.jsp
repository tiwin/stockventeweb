<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Affichage d'un client</title>
<link type="text/css" rel="stylesheet"
	href="<c:import url="/inc/style.css" />" />

</head>
<body>
	<c:import url="/inc/menu.jsp"></c:import>
	<%-- Affichage de la chaîne "message" transmise par la servlet --%>
	<p class="succes">
		<c:out value="${ form.resultat }" />
	</p>
	<%-- Puis affichage des données enregistrées dans le bean "client" transmis par la servlet --%>
	<p>
		Nom :
		<c:out value="${ client.nomClient }" />
	</p>
	<p>
		Prénom :
		<c:out value="${ client.prenomClient }" />
	</p>
	<p>
		Adresse :
		<c:out value="${ client.adresseClient }" />
	</p>
		Code postale : 
		<c:out value="${ client.cpClient }" />
	<p>
	</p>
		Ville : 
		<c:out value="${ client.villeClient }" />
	<p>
		Numéro de téléphone :
		<c:out value="${ client.telClient }" />
	</p>
	<p>
		Email :
		<c:out value="${ client.emailClient }" />

</body>
</html>