package essais;
import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale test11 = new AdressePostale(13,"Rue Angevinne",44190,"Clisson");
        AdressePostale test21 = new AdressePostale(4,"Rue Garise",44100,"Nantes");

        Personne test1 = new Personne("Jean","Jack",test11);
        Personne test2 = new Personne("Marie","Louise",test21);

        System.out.println(test1.prenom+" "+test1.nom+" vit a : "+test1.adresse.numeroRue+" "+test1.adresse.libelleRue+", "+test1.adresse.ville+", "+test1.adresse.codePostal);
        System.out.println(test2.prenom+" "+test2.nom+" vit a : "+test2.adresse.numeroRue+" "+test2.adresse.libelleRue+", "+test2.adresse.ville+", "+test2.adresse.codePostal);
    }
}
