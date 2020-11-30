package Modele;



public class Preparateur extends Employe {
	private double salaire ;
	private double coutHeures;
    private int NbrHeures;
    private  Integer anciennete;


	 public Preparateur(String nom, String prenom, String adresse,double cout, int nbrHeures, Integer anc,double sal) {
		super(nom, prenom, adresse);
		 this.setAnciennete(anc);
		 this.setCoutHeures(cout);
		 this.setNbrHeures(nbrHeures);
		 this.setSalaire(sal);
		 
		
	}


	
	@Override
	public double calcSalaire() {
		if(anciennete<3)
			return NbrHeures*coutHeures ;
		else if((anciennete>3)||( anciennete<=6))
		{
			return NbrHeures*coutHeures + ((NbrHeures*coutHeures)* 0.1) ;
			
		}
		else 
			return NbrHeures*coutHeures + ((NbrHeures*coutHeures)* 0.15) ;
		
	}



	public double getCoutHeures() {
		return coutHeures;
	}



	public void setCoutHeures(double coutHeures) {
		this.coutHeures = coutHeures;
	}



	public int getNbrHeures() {
		return NbrHeures;
	}



	public void setNbrHeures(int nbrHeures) {
		NbrHeures = nbrHeures;
	}



	public Integer getAnciennete() {
		return anciennete;
	}



	public void setAnciennete(Integer anciennete) {
		this.anciennete = anciennete;
	}



	public double getSalaire() {
		return salaire;
	}



	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	

}
