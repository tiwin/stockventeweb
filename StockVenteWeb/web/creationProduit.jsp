<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Création d'un produit</title>
<link type="text/css" rel="stylesheet" href="<c:import url="/inc/style.css" />"/>

</head>
<body>
	<c:import url="/inc/menu.jsp"></c:import>
	<div>
		<!--  Envoie a l' adresse creationClient qui par le fichier web.xml est ensuite envoyé à la servlet
        					CreationClient -->
		<form method="post" action="creationProduit">
			<fieldset>
				<legend>Informations Produit</legend>
				<c:import url="/inc/formulaireProduit.jsp" />
			</fieldset>
			<input type="submit" value="Valider" /> <input type="reset"
				value="Remettre à zéro" /> <br />
		</form>
	</div>
</body>
</html>