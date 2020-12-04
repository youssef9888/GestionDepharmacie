package Modele;

public abstract class PaiementStrategy  {

	Reseau reseau;
	double montant;
	
	public PaiementStrategy(Reseau reseau, double montant) {
		super();
		this.reseau = reseau;
		this.montant = montant;
	}

	public Reseau getReseau() {
		return reseau;
	}

	public void setReseau(Reseau reseau) {
		this.reseau = reseau;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	 public void remboursement(double somme){
	        montant += reseau.Remboursement(somme);
	    }
	public abstract boolean payer(double montant);
	
}
