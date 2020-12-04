package Modele;



public class pharmacyIndependante extends pharmacy {
	   private String siret;
	public pharmacyIndependante(String nom, int Nbremploye, CompteBancaire compte, double taille, String siret,
			Double Surface) {
		super(nom, Nbremploye, compte, taille, siret, Surface);
		
	}
	 public String getSiret() {
	        return siret;
	    }

	    public void setSiret(String siret) {
	        this.siret = siret;
	    }

	    public boolean acheterProduit(Produit produit){
	        if(this.getCompte().getMontant()>=produit.getPrixAchat()){
	            this.getListeProduit().add(produit);
	            this.getCompte().debiter(produit.getPrixAchat());
	            return true;
	        } else {
	            return false;
	        }
	    }
}
