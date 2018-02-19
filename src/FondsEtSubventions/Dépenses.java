package FondsEtSubventions;
import Projets.Projet;

/**
 * Created by TreVi1732721 on 2018-02-19.
 */
public class Dépenses {
    private String description;
    private Projet projet;
    private double montant = 0;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
