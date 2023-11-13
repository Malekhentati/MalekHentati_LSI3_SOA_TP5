package metier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
// Classe représentant un compte
//@WebService
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;
    @XmlTransient
    private Date dateCreation;

    public Compte() {}

    public Compte(int code, int solde, Date dateCreation) {
        super();
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }
   // Getters and setters
    public int getCode() {return code;}
    public void setCode(int code) {  this.code = code;}

    public double getSolde() {  return solde;}
    public void setSolde(double solde) { this.solde = solde; }

    public Date getDateCreation() { return dateCreation;  }
    public void setDateCreation(Date dateCreation) {this.dateCreation = dateCreation;}
}







