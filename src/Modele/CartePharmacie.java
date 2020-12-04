package Modele;

public class CartePharmacie extends PaiementStrategy {
  double montantMensuel ;
	public CartePharmacie(Reseau reseau, double montant) {
		super(reseau, montant);
		this.montantMensuel=0;
	}

	@Override
	public boolean payer(double montantt) {
		 if((montantMensuel+reseau.Transaction(montantt))>montant){
	            return false;
	        } else {
	        	montantMensuel += reseau.Transaction(montantt);
	            return true;
	        }
	}

	public double getMontantMensuel() {
		return montantMensuel;
	}

	public void setMontantMensuel(double montantMensuel) {
		this.montantMensuel = montantMensuel;
	}

	
	 public void paiementMensuel(){
	        montant = montant - montantMensuel;
	        montantMensuel = 0;
	    }
}
