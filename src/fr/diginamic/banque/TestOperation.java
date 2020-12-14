package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestOperation {
    public static void main(String[] args) {
        Credit C1  = new Credit("10 Janvier", 20) ;
        Debit D1  = new Debit("100 Janvier",200);
        Credit C2  = new Credit("20 Janvier", 22) ;
        Debit D2  = new Debit("200 Janvier",220);
        Operation [] Ct = new Operation[]{C1,C2,D1,D2};

        int somme =0;

        for(Operation operation: Ct){
            System.out.println("("+operation.afficherType()+") "+operation.date+" : "+operation.montant);
            if(operation.afficherType()=="Credit")
            {
                somme=somme+operation.montant;
            }
            else
            {
                if(operation.afficherType()=="Debit")
                {
                    somme=somme-operation.montant;
                }
            }
        }
    }
}
