package beans;



import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreationProduitDAO {
    HibernateUtil  hu              = new HibernateUtil();
    SessionFactory sessionsFactory = hu.getSessionFactory();
    Session        session         = null;

    public CreationProduitDAO() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void creerProduit(   String nomProduit, String garantieProduit,
                                Date debutValiditePrix, Date finValiditePrix, Double valeurPrix,  
                                int qteProduitStocke, String nomFournisseur) throws Exception{

        int idMaxProduit = 0;
        int idMaxPrixProduit = 0;

        Session session = sessionsFactory.openSession();
        Transaction tx = null;
        tx = session.beginTransaction();

        try {

            /**
             * Recuperation de l'ID MAX puis on ajoute 1 pour le nouveau
             * Produit
             */
            tx = session.beginTransaction();
            idMaxProduit = (Integer) session.createQuery( "select max (pro.idProduit) from Produit pro " ).uniqueResult();
            idMaxProduit = idMaxProduit + 1;
            session.getTransaction().commit();

        } catch ( Exception e ) {
            if ( tx != null ) {
                System.out.println( "Erreur" );
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
        /**
         * Insertion d'une nouvelle ligne de la table Produit (id, nom, garaantie)
         * Creation don du bean produit
         */
        
        Produit produit = new Produit();
        produit.setIdProduit( idMaxProduit );
        produit.setGarantieProduit( garantieProduit );
        produit.setNomProduit( nomProduit );
        
      //Ouverture de la session
        session = sessionsFactory.openSession();
        tx = null;
        tx = session.beginTransaction();

        try {
            //Enregistrement du client
            session.saveOrUpdate( produit );
            session.flush();
            tx.commit();

        } catch ( Exception e ) {
            if ( tx != null ) {
                System.out.println( "Erreur" );
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
        
        session = sessionsFactory.openSession();
        tx = null;
        tx = session.beginTransaction();
        
        try {

            /**
             * Recuperation de l'ID MAX puis on ajoute 1 pour le nouveau
             * Produit
             */
            tx = session.beginTransaction();
            idMaxPrixProduit = (Integer) session.createQuery( "select max (pro.idPrix) from Prixproduit pro " ).uniqueResult();
            idMaxPrixProduit = idMaxPrixProduit + 1;
            session.getTransaction().commit();
            System.out.println(idMaxProduit);

        } catch ( Exception e ) {
            if ( tx != null ) {
                System.out.println( "Erreur" );
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
        /**
         * Insertion d'une nouvelle ligne de la table prixProduit (idPrix,idProduit, dateDebut, dateFin, prix)
         * Creation don du bean produit
         */
        
        Prixproduit prixProduit = new Prixproduit();
        prixProduit.setIdPrix( idMaxPrixProduit );
        prixProduit.setProduit( produit );
        prixProduit.setDebutValiditePrix( debutValiditePrix );
        prixProduit.setFinValiditePrix( finValiditePrix );
        prixProduit.setValeurPrix( valeurPrix );
        
        
        
      //Ouverture de la session
        session = sessionsFactory.openSession();
        tx = null;
        tx = session.beginTransaction();

        try {
            //Enregistrement du client
            session.saveOrUpdate( prixProduit );
            session.flush();
            tx.commit();

        } catch ( Exception e ) {
            if ( tx != null ) {
                System.out.println("erreur");
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
    
    }
    

   
}


