package app;

public class Personne {

    // Une Personne possède les attributs nom, prenom, rue et localite ainsi qu'un npa (numéro postal qui lui sera un entier).

    private String nom;
    private String prenom;
    private String rue;
    private int localite;
    private int npa;


    public Personne(String nom, String prenom, String rue, int localite, int npa) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.localite = localite;
        this.npa = npa;
    }
// Créez cette classe Personne et faites que toutes ses informations puissent être consultées une fois l'objet créé, mais que plus rien ne puisse être modifié.

    public String getNom() {
        return nom;
    }


    public String getPrenom() {
        return prenom;
    }


    public String getRue() {
        return rue;
    }


    public int getLocalite() {
        return localite;
    }


    public int getNpa() {
        return npa;
    }

}
