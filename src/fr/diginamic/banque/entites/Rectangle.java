package fr.diginamic.banque.entites;

public class Rectangle implements ObjetGeometrique{
    double longueur;
    double largeur;

    public Rectangle(double longueur,double largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }

    public double surface(){
        return this.largeur*this.largeur;
    }

    public double perimetre(){
        return 2*this.longueur+2*this.largeur;
    }
}
