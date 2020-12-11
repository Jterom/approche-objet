package entites;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    public Personne()
    {

    }

    public Personne(String nom, String prenom, AdressePostale adresse)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
    }

    public void Majuscule (){
        System.out.println(this.nom.toUpperCase()+" "+this.prenom);
    }

    public void ModifNom(String nom){
        this.nom=nom;
    }

    public void ModifPrenom(String prenom){
        this.prenom=prenom;
    }

    public void ModifAdresse(AdressePostale adresse){
        this.adresse=adresse;
    }

    public String GetNom(){
        return this.nom;
    }

    public String GetPrenom(){
        return this.prenom;
    }

    public AdressePostale GetAdresse(){
        return this.adresse;
    }


}
