package Employer;

import Projets.Projet;

/**
 * Created by TreVi1732721 on 2018-02-19.
 */
public class Superviseur extends Employer {
    private Projet projet;
    protected Chercheur[] chercheurs = new Chercheur[10];

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public Chercheur[] getChercheurs() {
        return chercheurs;
    }

    public void setChercheurs( int i,Chercheur chercheur) {
        chercheurs[i] = chercheur;
    }
}
