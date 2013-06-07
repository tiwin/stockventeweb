<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Recherche</title>
<link type="text/css" rel="stylesheet"
	href="<c:import url="/inc/style.css" />" />

</head>
<body>
	<c:import url="/inc/menu.jsp"></c:import>
	<form method="post" action="recherche">

		
			
				
			


			
				Rechercher un Produit par son  <SELECT name="critere" size="1">
					<OPTION>Nom
					<OPTION>Id
					<OPTION>Tous
				</SELECT>
				<input type="text" value="" name="champtexte" />			
			</br> 
			
			<input type="submit" value="Rechercher" /> <br />
			</br>
		
 
			<table>
              
                
               
                <tr>
                    <th>Nom produit</th>
                    <th>Prix produit</th>
                    <th>Quantitée restante</th>
                    <th>Garantie</th>
                    
                
                    <th class="action">Action</th>                    
                </tr>
                
                <c:forEach items="${ liste }" var="liste" varStatus="boucle">
                <tr>
                    <%-- Affichage des propriétés du bean Commande, qui est stocké en tant que valeur de l'entrée courante de la map --%>
                    <td><c:out value="${ liste.nomProduit}"/></td>
                    <td><c:out value="${ liste.valeurProduit }"/></td>
                    <td><c:out value="${ liste.quantiteeProdut }"/></td>
                    <td><c:out value="${ liste.garantieProduit }"/></td>
                     
                   </tr>
                   </c:forEach>
                </table>
			

	</form>

</body>
</html>