package Employer;
import Projets.Projet;
/**
 * Created by TreVi1732721 on 2018-02-19.
 */
public class Chercheur extends Employer{
    private Projet projet;

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }
}
