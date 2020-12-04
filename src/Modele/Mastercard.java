package Modele;

public class Mastercard extends Reseau {
	   @Override
	    public double calculTransaction(double montant) {
	        return montant - montant*0.005;
	    }

	    @Override
	    public double calculRemboursement(double montant){
	        return montant;
	    }
	
}
