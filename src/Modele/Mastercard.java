package Modele;

public class Mastercard extends Reseau {
	   @Override
	    public double Transaction(double montant) {
	        return montant - montant*0.005;
	    }

	    @Override
	    public double Remboursement(double montant){
	        return montant;
	    }
	
}
