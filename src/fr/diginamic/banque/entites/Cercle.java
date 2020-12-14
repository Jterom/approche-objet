package fr.diginamic.banque.entites;

public class Cercle implements ObjetGeometrique{
    double rayon;

    public Cercle(double rayon){
        this.rayon=rayon;
    }

    public double surface(){
        return Math.PI * this.rayon * this.rayon;
    }

    public double perimetre(){
        return 2*Math.PI * this.rayon;
    }
}
