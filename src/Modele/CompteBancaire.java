package Modele;



public abstract class CompteBancaire {
private double montant;
    
    public CompteBancaire(Reseau reseauBancaire) {
		this.montant = 10000;
	}
    
    public CompteBancaire(double montant) {
		this.montant = montant;
	}
    
    public abstract void debiter(double somme);

    public void Verser(double somme){
    	montant += somme;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}


}
