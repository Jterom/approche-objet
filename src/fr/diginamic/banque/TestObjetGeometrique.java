package fr.diginamic.banque;

import fr.diginamic.banque.entites.Cercle;
import fr.diginamic.banque.entites.ObjetGeometrique;
import fr.diginamic.banque.entites.Rectangle;

public class TestObjetGeometrique {

    public static void main(String[] args) {

        ObjetGeometrique C=new Cercle(5);
        ObjetGeometrique R=new Rectangle(5,10);
        ObjetGeometrique[] Ct = new ObjetGeometrique[]{C,R};
        for (ObjetGeometrique objetGeometrique:Ct){
            System.out.println(objetGeometrique.surface());
            System.out.println(objetGeometrique.perimetre());
        }
    }
}
