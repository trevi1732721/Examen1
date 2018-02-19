/**
 * Created by TreVi1732721 on 2018-02-19.
 */
import Employer.*;
import FondsEtSubventions.*;
import Projets.*;

public class main {
    public static void main(String[] args) {
        Projet nouveauProjet = new Projet();
        Subventions nouvelleSubvention= new Subventions();
        Dépenses nouvelleDépenses = new Dépenses();
        Chercheur nouveauChercheur = new Chercheur();
        Superviseur nouveauSuperviseur = new Superviseur();
        Administrateur nouveauAdministrateur = new Administrateur();
        Employer[] employers = new Employer[20];

        // new project
        nouveauProjet.setNomDeCode("test");
        nouveauProjet.setStatus(Status.enCours);
        nouveauProjet.setBudget(100);
        nouveauProjet.setÉchéance("20 fév. 2018");

        // new subvention
        nouvelleSubvention.setCode(5498);
        nouvelleSubvention.setInstance("DCRA association");
        nouvelleSubvention.setMontant(200);
        nouvelleSubvention.setÉchéance("28 fev. 2018");

        // new dépenses
        nouvelleDépenses.setDescription(" Raison x ");
        nouvelleDépenses.setMontant(100);
        nouvelleDépenses.setProjet(nouveauProjet);

        // new chercheur
        nouveauChercheur.setNom("Tremblay");
        nouveauChercheur.setNuméroEmployer(001);
        nouveauChercheur.setExpérience(15);
        nouveauChercheur.setSalaire(15);
        nouveauChercheur.setProjet(nouveauProjet);

        // new superviseur
        nouveauSuperviseur.setNom("Aubé");
        nouveauSuperviseur.setNuméroEmployer(002);
        nouveauSuperviseur.setExpérience(10);
        nouveauSuperviseur.setSalaire(20);
        nouveauSuperviseur.setProjet(nouveauProjet);
        nouveauSuperviseur.setChercheurs(1,nouveauChercheur);

        // new administrateur
        nouveauAdministrateur.setNom("Lapointe");
        nouveauAdministrateur.setNuméroEmployer(003);
        nouveauAdministrateur.setExpérience(20);
        nouveauAdministrateur.setSalaire(25);
        nouveauAdministrateur.setSubvention(1,nouvelleSubvention);
        nouveauAdministrateur.setDépenses(1,nouvelleDépenses);

        //Afficher bilan
        System.out.println("le bilan est de : " + nouveauAdministrateur.getBilan()+ " $");

        //liste employer
        employers[1] = nouveauChercheur;
        employers[2] = nouveauSuperviseur;
        employers[3] = nouveauAdministrateur;

        //afficher employers
        for(int i=0 ; i<20;i++){
            if(employers[i]!=null){
            System.out.println("Employers " + i);
            System.out.println("    nom : " + employers[i].getNom());
            System.out.println("    numero d'employer : " + employers[i].getNuméroEmployer());
            System.out.println("    salaire : " + employers[i].getSalaire());
            }
        }
    }
}
