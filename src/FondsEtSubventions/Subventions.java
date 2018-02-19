package FondsEtSubventions;

import java.util.Date;

/**
 * Created by TreVi1732721 on 2018-02-19.
 */
public class Subventions {
    private int code;
    private String instance;
    private double montant = 0;
    private String échéance;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getÉchéance() {
        return échéance;
    }

    public void setÉchéance(String échéance) {
        this.échéance = échéance;
    }
}
