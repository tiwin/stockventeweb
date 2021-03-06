package beans;

// Generated 25 mai 2013 15:25:21 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Contient generated by hbm2java
 */
@Entity
@Table( name = "contient" )
public class Contient implements java.io.Serializable {

    private ContientId id;
    private Produit    produit;
    private Facture    facture;
    private String     qteProduitFacturee;

    public Contient() {
    }

    public Contient( ContientId id, Produit produit, Facture facture ) {
        this.id = id;
        this.produit = produit;
        this.facture = facture;
    }

    public Contient( ContientId id, Produit produit, Facture facture, String qteProduitFacturee ) {
        this.id = id;
        this.produit = produit;
        this.facture = facture;
        this.qteProduitFacturee = qteProduitFacturee;
    }

    @EmbeddedId
    @AttributeOverrides( {
            @AttributeOverride( name = "idFacture", column = @Column( name = "id_facture", nullable = false ) ),
            @AttributeOverride( name = "idProduit", column = @Column( name = "id_produit", nullable = false ) ) } )
    public ContientId getId() {
        return this.id;
    }

    public void setId( ContientId id ) {
        this.id = id;
    }

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "id_produit", nullable = false, insertable = false, updatable = false )
    public Produit getProduit() {
        return this.produit;
    }

    public void setProduit( Produit produit ) {
        this.produit = produit;
    }

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "id_facture", nullable = false, insertable = false, updatable = false )
    public Facture getFacture() {
        return this.facture;
    }

    public void setFacture( Facture facture ) {
        this.facture = facture;
    }

    @Column( name = "qte_produit_facturee", length = 32 )
    public String getQteProduitFacturee() {
        return this.qteProduitFacturee;
    }

    public void setQteProduitFacturee( String qteProduitFacturee ) {
        this.qteProduitFacturee = qteProduitFacturee;
    }

}
