package Modele;

public class ComptebancaireClassique extends CompteBancaire {

	public ComptebancaireClassique(double montant) {
		super(montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void debiter(double somme) {
		   this.setMontant(this.getMontant());
		
	}



	



	

	 

}
