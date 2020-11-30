package Modele;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public abstract class  pharmacy {
	 
	 

	    private String nom;
	    private int nbEmploye;
	    private ObservableList<Produit> listeProduit;
		private ObservableList<Employe> listeEmploye;
		private double Surface ;
	    private CompteBancaire compte;
	    private double taille;
	    private String siret;
	    private double chiffreAffaires;

	    public pharmacy(String nom, int Nbremploye, CompteBancaire compte, double taille, String siret,Double Surface){
	    	this.setNom(nom);
	        this.setNbEmploye(Nbremploye);
	        this.setSurface(Surface);
	        this.setCompte(compte);
	        this.setListeProduit(FXCollections.observableArrayList());
	        this.setTaille(taille);
			this.setSiret(siret);
			this.chiffreAffaires = 0;
			
	    }

		public double getSurface() {
			return Surface;
		}

		public void setSurface(double surface) {
			Surface = surface;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public int getNbEmploye() {
			return nbEmploye;
		}

		public void setNbEmploye(int nbEmploye) {
			this.nbEmploye = nbEmploye;
		}

		public ObservableList<Produit> getListeProduit() {
			return listeProduit;
		}

		public void setListeProduit(ObservableList<Produit> listeProduit) {
			this.listeProduit = listeProduit;
		}

		public ObservableList<Employe> getListeEmploye() {
			return listeEmploye;
		}

		public void setListeEmploye(ObservableList<Employe> listeEmploye) {
			this.listeEmploye = listeEmploye;
		}

		public CompteBancaire getCompte() {
			return compte;
		}

		public void setCompte(CompteBancaire compte) {
			this.compte = compte;
		}

		public double getTaille() {
			return taille;
		}

		public void setTaille(double taille) {
			this.taille = taille;
		}

		public String getSiret() {
			return siret;
		}

		public void setSiret(String siret) {
			this.siret = siret;
		}

		public double getChiffreAffaires() {
			return chiffreAffaires;
		}

		public void setChiffreAffaires(double chiffreAffaires) {
			this.chiffreAffaires = chiffreAffaires;
		}

	    
	    
}
