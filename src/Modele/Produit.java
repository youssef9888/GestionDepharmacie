package Modele;

import java.time.LocalDate;

public class Produit {
	   private String nom;
	    private String type;
	    private double prixAchat;
		private double prixVente;
	    private LocalDate datePeremption;


		public Produit(String Nom, String type, double prixAchat, double prixVent, LocalDate datePeremption){

	        this.nom = Nom;
	        this.type = type;
	        this.prixAchat = prixAchat;
			this.prixVente = prixVent;
	        this.datePeremption = datePeremption;

	    }


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public double getPrixAchat() {
			return prixAchat;
		}


		public void setPrixAchat(double prixAchat) {
			this.prixAchat = prixAchat;
		}


		public double getPrixVente() {
			return prixVente;
		}


		public void setPrixVente(double prixVente) {
			this.prixVente = prixVente;
		}


		public LocalDate getDatePeremption() {
			return datePeremption;
		}


		public void setDatePeremption(LocalDate datePeremption) {
			this.datePeremption = datePeremption;
		}
		
		


}
