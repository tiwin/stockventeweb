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
	
	<%-- Puis affichage des données enregistrées dans le bean "client" transmis par la servlet --%>
	
	<p>
		garantie produit :
		<c:out value="${ creationProduit.garantieProduit }" />
	</p>
	<p>
		debut validite prix :
		<c:out value="${ creationProduit.debutValiditePrix }" />
	</p>
		fin validite prix : 
		<c:out value="${ creationProduit.finValiditePrix }" />
	<p>
	</p>
		Prix : 
		<c:out value="${ creationProduit.valeurPrix }" />
	<p>
		Quantite:
		<c:out value="${ creationProduit.qteProduitStocke }" />
	</p>
	<p>
		nom Produit :
		<c:out value="${ creationProduit.nomProduit }" />

	</p>
	<p>
		Nom fournisseur :
		<c:out value="${ creationProduit.nomFournisseur }" />

	</p>

</body>
</html>