package fr.diginamic.banque.entites;

public class Compte {

    public int numCompte;
    public int soldeCompte;

    public Compte( int numCompte, int soldeCompte){
        this.numCompte=numCompte;
        this.soldeCompte=soldeCompte;
    }

    public String toString(){
        return this.numCompte +" "+ this.soldeCompte;
    }
}
