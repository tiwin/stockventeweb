package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.CreationProduit;
import beans.Fournisseur;
import beans.FournisseurDAO;
import formulaires.FormulaireCreationProduit;



public class CreationProduitServlet extends HttpServlet {

    private static final String VUE2           = "/afficherProduit.jsp";
    private static final String ATT_FORMULAIRE = "form";
    private static final String ATT_BEAN       = "creationProduit";
    private static final String ATT_LISTE_FOURNISSEUR       = "listeFournisseur";
    
    ArrayList<Fournisseur> listeFournisseur = null;


    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {

    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {

        FormulaireCreationProduit formulaireCreationProduit = new FormulaireCreationProduit();
        CreationProduit creationProduit = null;
        try {
            creationProduit = formulaireCreationProduit.creerProduit( request );
        } catch ( ParseException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        FournisseurDAO fDAO = new FournisseurDAO();
        try {
            listeFournisseur = fDAO.listeFournisseur();
        } catch ( Exception e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     // Mise en param�tre du Bean utilisateur dans la req�ete

        request.setAttribute( ATT_BEAN, creationProduit );
        request.setAttribute( ATT_LISTE_FOURNISSEUR,listeFournisseur  );
       

        // Renvoie a la jsp creationClient.jsp
        this.getServletContext().getRequestDispatcher( VUE2 ).forward( request, response );

    }

}
