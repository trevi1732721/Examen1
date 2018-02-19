package Employer;

/**
 * Created by TreVi1732721 on 2018-02-19.
 */
public class Employer {
    protected String nom;
    protected int numéroEmployer, expérience;
    protected double salaire;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNuméroEmployer() {
        return numéroEmployer;
    }

    public void setNuméroEmployer(int numéroEmployer) {
        this.numéroEmployer = numéroEmployer;
    }

    public int getExpérience() {
        return expérience;
    }

    public void setExpérience(int expérience) {
        this.expérience = expérience;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
