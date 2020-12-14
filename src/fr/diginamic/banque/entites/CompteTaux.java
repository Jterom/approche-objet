package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    int tauxDeRemu;

    public CompteTaux(int numCompte, int soldeCompte,int tauxDeRemu){
        super(numCompte,soldeCompte);
        this.tauxDeRemu=tauxDeRemu;
    }

    @Override
    public String toString(){
        return this.numCompte +" "+ this.soldeCompte +" "+ this.tauxDeRemu;
    }
}
