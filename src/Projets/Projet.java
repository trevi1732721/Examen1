package Projets;

import java.util.Date;

/**
 * Created by TreVi1732721 on 2018-02-19.
 */
public class Projet{
    private String nomDeCode;
    private String échéance;
    private double budget;
    private Status status;

    public String getNomDeCode() {
        return nomDeCode;
    }

    public void setNomDeCode(String nomDeCode) {
        this.nomDeCode = nomDeCode;
    }

    public String getÉchéance() {
        return échéance;
    }

    public void setÉchéance(String échéance) {
        this.échéance = échéance;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
