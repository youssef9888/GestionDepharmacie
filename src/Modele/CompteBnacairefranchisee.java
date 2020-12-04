package Modele;

public class CompteBnacairefranchisee extends CompteBancaire {



	public CompteBnacairefranchisee(Reseau reseauBancaire) {
		super(reseauBancaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void debiter(double somme) {
		 this.setMontant(this.getMontant());
		// TODO Auto-generated method stub
		
	}



}
