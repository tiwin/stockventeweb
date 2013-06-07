<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="inc/style.css" />
<title>Insert title here</title>
</head>
<body>
	
	<label for="nomClient">Nom<span class="requis">*</span></label>
	<input type="text" id="nomClient" name="nomClient"
		value="<c:out value="${client.nomClient}"/>" size="20" maxlength="20" />
	<span class="erreur">${form.erreurs['nomClient']}</span>
	<br />

	<label for="prenomClient">Prénom </label>
	<input type="text" id="prenomClient" name="prenomClient"
		value="<c:out value="${client.prenomClient}"/>" size="20" maxlength="20" />
	<span class="erreur">${form.erreurs['prenomClient']}</span>
	<br />

	<label for="adresseClient">Adresse <span class="requis">*</span></label>
	<input type="text" id="adresseClient" name="adresseClient"
		value="<c:out value="${client.adresseClient}"/>" size="20" maxlength="20" />
	<span class="erreur">${form.erreurs['adresseClient']}</span>
	<br />
	
	<label for="cpClient">Code Postale <span class="requis">*</span></label>
	<input type="text" id="cpClient" name="cpClient"
		value="<c:out value="${client.cpClient}"/>" size="20" maxlength="20" />
	<span class="erreur">${form.erreurs['cpClient']}</span>
	<br />
	
	<label for="villeClient">Ville <span class="requis">*</span></label>
	<input type="text" id="villeClient" name="villeClient"
		value="<c:out value="${client.villeClient}"/>" size="20" maxlength="20" />
	<span class="erreur">${form.erreurs['villeClient']}</span>
	<br />

	<label for="telephoneClient">Numéro de téléphone <span
		class="requis">*</span></label>
	<input type="text" id="telephoneClient" name="telephoneClient"
		value="<c:out value="${client.telClient}"/>" size="20" maxlength="20" />
	<span class="erreur">${form.erreurs['telephoneClient']}</span>
	<br />

	<label for="emailClient">Adresse email<span class="requis">*</span></label>
	<input type="text" id="emailClient" name="emailClient"
		value="<c:out value="${client.emailClient}"/>" size="20" maxlength="60" />
	<span class="erreur">${form.erreurs['emailClient']}</span>
	<br />

	<p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
</body>
</html>