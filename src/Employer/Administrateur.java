package Employer;

import FondsEtSubventions.*;

/**
 * Created by TreVi1732721 on 2018-02-19.
 */
public class Administrateur extends Employer{
    protected Subventions[] subventions= new Subventions[10];
    protected Dépenses[] dépenses= new Dépenses[10];
    private double bilan;

    public Subventions[] getSubvention() {
        return subventions;
    }

    public void setSubvention(int i,Subventions subvention) {
        subventions[i] = subvention;
    }

    public Dépenses[] getDépenses() {
        return dépenses;
    }

    public void setDépenses(int i,Dépenses dépense) {
        dépenses[i] = dépense;
    }

    public double getBilan() {
        for (int i=0; i<10; i++){
            if(subventions[i]!=null){
            bilan = (bilan + subventions[i].getMontant());
            }
        }
        for (int i=0; i<10; i++){
            if(subventions[i]!=null){
            bilan =(bilan - dépenses[i].getMontant());
            }
        }
        return bilan;
    }

    public void setBilan(double bilan) {
        this.bilan = bilan;
    }
}
