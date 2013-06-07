package test;

import beans.FournisseurDAO;

public class Test1 {

    /**
     * @param args
     * @throws Exception
     */
    public static void main( String[] args ) throws Exception {

//        ClientDAO clientDAO = new ClientDAO();
//        UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
//        ProduitDAO produitDAO = new ProduitDAO();

        // Enregistre un client
        // clientDAO.creerCLient();

        // Rechercher un client par son nom
        //clientDAO.rechercheClientParNom( "ppp" );

        // Rechercher client par son Id
        //clientDAO.rechercheClientParId( "7" );

        // Affiche tous les clients
        // clientDAO.listeClient();

        // Rechercher un utilisateur par son nom
        //String login = "Pablo";
        //utilisateurDAO.rechercheUtilisateurParLogin( login );
        
        //Afficher tous les utilisateurs
        //utilisateurDAO.listeUtilisateur();
        
        //Recuperer l'id MAX
       //clientDAO.creerClient( "MESSI", "Lionel", "12 alle de barcelone", "21000", "Dijon", "096363636363", "leo@gmail.com" );

         //Liste de la table Produit
         //produitDAO.rechercheProduitParPrix( 15 );
        //produitDAO.rechercheProduitParNom( "tournevis" );
//        ArrayList liste = produitDAO.afficherTousProduits();
//        
//        for (int i = 0 ; i < liste.size() ; i++){
//            System.out.println(liste.get( i ));
//        }
        
//        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy");
//        DateTimeFormatter frenchFmt = fmt.withLocale(Locale.FRENCH);
//        DateTime dateDebut1 = frenchFmt.parseDateTime( "12/12/2012" ) ;
//        
//        DateTime dt = new DateTime();
//        DateTimeFormatter fmt1 = ISODateTimeFormat.date();
//        String str = fmt1.print(dt);
//      
//        System.out.println(dateDebut1);
//        System.out.println (dt);
        
//        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//        
//        Date date=null;
//        
//        try
//      
//        {
//      
//        date= df.parse("25-12-2010");
//        java.sql.Date dateSQL = new java.sql.Date(date.getTime());
//        System.out.println(dateSQL);
//       
//        } catch (ParseException e){
//       
//        e.fillInStackTrace();
//       
//        }
//        HibernateUtil  hu              = new HibernateUtil();
//        SessionFactory sessionsFactory = hu.getSessionFactory();
//        Session        session         = null;
//        int idMaxProduit = 0;
//        int idMaxPrixProduit = 0;
//
//        session = sessionsFactory.openSession();
//        Transaction tx = null;
//        tx = session.beginTransaction();
//        try {
//
//            /**
//             * Recuperation de l'ID MAX puis on ajoute 1 pour le nouveau
//             * Produit
//             */
//            tx = session.beginTransaction();
//            idMaxPrixProduit = (Integer) session.createQuery( "select max (pro.idPrix) from Prixproduit pro " ).uniqueResult();
//            idMaxPrixProduit = idMaxPrixProduit + 1;
//            session.getTransaction().commit();
//            System.out.println(idMaxPrixProduit);
//
//        } catch ( Exception e ) {
//            if ( tx != null ) {
//                System.out.println( "Erreur" );
//                tx.rollback();
//            }
//            throw e;
//        } finally {
//            session.close();
//        }
//        
//       
//       
//    }
   FournisseurDAO fournisseurDAO =  new FournisseurDAO();
   fournisseurDAO.listeFournisseur();
    
    
    }}
