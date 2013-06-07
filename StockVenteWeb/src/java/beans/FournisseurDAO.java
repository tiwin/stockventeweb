package beans;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FournisseurDAO {
  
        HibernateUtil  hu              = new HibernateUtil();
        SessionFactory sessionsFactory = hu.getSessionFactory();
        Session        session         = null;

        public FournisseurDAO() {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        }
        
        public ArrayList <Fournisseur> listeFournisseur() throws Exception{
            
            Session session = sessionsFactory.openSession();
            Transaction tx = null;
            ArrayList<Fournisseur> result = null;
            try {

                /*
                 * Recuperation dans une liste des don�es contenue dans la table
                 * eleve
                 */
                tx = session.beginTransaction();

                 result = (ArrayList<Fournisseur>) session.createQuery( " from Fournisseur" )
                        .list();

                session.getTransaction().commit();

                for ( int i = 0; i < result.size(); i++ ) {

                    Fournisseur nvx = (Fournisseur) result.get( i );

                    System.out.println( nvx.getNomFournisseur() + " " + nvx.getIdFournisseur() );

                }
            } catch ( Exception e ) {
                if ( tx != null ) {
                    System.out.println( "Erreur" );
                    tx.rollback();
                }
                throw e;
            } finally {
                session.close();
            }
            return result;
           
            
            
        }

}
