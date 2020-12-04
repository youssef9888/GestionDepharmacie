package Modele;

public class CarteBancaire extends PaiementStrategy {

	public CarteBancaire(Reseau reseau, double montant) {
		super(reseau, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean payer(double montantt) {
		   if(reseau.calculTransaction(montantt)>montant){
	            return false;
	        } else {
	            montant = montant - reseau.calculTransaction(montantt);
	            return true;
	        }
		
	}

}
