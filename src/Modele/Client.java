package Modele;


import javafx.collections.ObservableList;

public class Client {
	private ObservableList<CarteBancaire> cartes;

    private String nom;
    private String prenom ;
    private  String adresse ;
   

    public Client(ObservableList<CarteBancaire> cartes, String nom, String prenom, String adresse) {
		super();
		this.cartes = cartes;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}


	public boolean acheter(Produit produit, CarteBancaire carte){
		return false;
        
        
    }


	public ObservableList<CarteBancaire> getCartes() {
		return cartes;
	}


	public void setCartes(ObservableList<CarteBancaire> cartes) {
		this.cartes = cartes;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}
