package Modele;

import javafx.collections.ObservableList;


public  class pharmacyFranchisee extends pharmacy {

	
	  private String siret;

	    private int nbrDependante;

	    private ObservableList<pharmacyFranchisee> listeDependante;

	    private boolean isDependante;

	    private pharmacyFranchisee pharMere;
	    
	public pharmacyFranchisee(String nom, int Nbremploye, CompteBancaire compte, double taille, String siret,
			Double Surface) {
		super(nom, Nbremploye, compte, taille, siret, Surface);
		
	}
	 public String getSiret() {
	        return siret;
	    }

	    public void setSiret(String siret) {
	        this.siret = siret;
	    }

	    public int getNbrDependante() {
	        return nbrDependante;
	    }

	    public void setNbrDependante(int nbrDependante) {
	        this.nbrDependante = nbrDependante;
	    }

	    public ObservableList<pharmacyFranchisee> getListeDependante() {
	        return listeDependante;
	    }

	    public void setListeDependante(ObservableList<pharmacyFranchisee> listeDependante) {
	        this.listeDependante = listeDependante;
	    }

	    public boolean isDependante() {
	        return isDependante;
	    }

	    public void setDependante(boolean dependante) {
	        isDependante = dependante;
	    }

	    public pharmacyFranchisee getPharMere() {
	        return pharMere;
	    }

	    public void setPharMere(pharmacyFranchisee pharMere) {
	        this.pharMere = pharMere;
	    }

	    public double calcFranchise(double somme){
	        int x = pharMere.getNbrDependante();
	        if(x>10){
	            return somme - somme*0.0075;
	        } else if (x>4) {
	            return somme - somme*0.005;
	        } else if (x>1) {
	            return somme - somme*0.0025;
	        } else {
	            return somme;
	        }
	    }

	    public void reversementCA(){
	        double temp = this.getChiffreAffaires();
	        int x = pharMere.getNbrDependante();
	        if(x>10){
	            pharMere.setChiffreAffaires(pharMere.getChiffreAffaires()+(temp*0.003));
	        } else if (x>4) {
	            pharMere.setChiffreAffaires(pharMere.getChiffreAffaires()+(temp*0.002));
	        } else if (x>1) {
	            pharMere.setChiffreAffaires(pharMere.getChiffreAffaires()+(temp*0.001));
	        }
	    }

	    public boolean acheterProduit(Produit produit){
	        double temp = calcFranchise(produit.getPrixAchat());
	        if(this.getCompte().getMontant()>=temp){
	            this.getListeProduit().add(produit);
	            this.getCompte().debiter(temp);
	            return true;
	        } else {
	            return false;
	        }
	    }

}
