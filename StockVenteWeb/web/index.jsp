<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Connexion</title>
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
    </head>
    <body>
        <form method="post" action="connexion">
            <fieldset >
                <legend>Connexion</legend>
                <p>Vous pouvez vous connecter via ce formulaire.</p>
 
                <label for="nom">Login <span class="requis">*</span></label>
                <input type="text" id="loginUser" name="loginUser" value="<c:out value="${utilisateur.loginUser}"/>" size="20" maxlength="60" />
                <span class="erreur">${form.erreurs['loginUser']}</span><br/>
                 
 
                <label for="motdepasse">Mot de passe <span class="requis">*</span></label>
                <input type="password" id="mdpUser" name="mdpUser" value="" size="20" maxlength="20" />
                <span class="erreur">${form.erreurs['motdepasse']}</span><br/>
 
 
                <input type="submit" value="Connexion" class="sansLabel" />
                 
               <!--    
                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
                -->
              
            </fieldset>
        </form>

         <img src="images/suiviCommande.png" alt="image suivi commande" height=150 width= 30% />

    </body>
</html>