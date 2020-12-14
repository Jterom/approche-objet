package fr.diginamic.banque.entites;

import java.util.Date;

abstract public class Operation {
    public String date;
    public int montant;

    public Operation(String date,int montant){
        this.date =date;
        this.montant=montant;
    }

    abstract public String afficherType();
}
