package fr.diginamic.banque;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

    public static void main(String[] args) {
        Compte C1  = new Compte(10,20);
        Compte C2  = new CompteTaux(100,200,25);
        Compte [] Ct = new Compte[]{C1,C2};
        for(Compte compte: Ct){
        System.out.println(compte.toString());
        }
    }
}
