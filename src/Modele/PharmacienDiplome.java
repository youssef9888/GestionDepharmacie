package Modele;

public class PharmacienDiplome extends Employe{
	private double ventesTotal ;
  
	private double salaire ;
	
	private boolean Manger ;
	
	
	public PharmacienDiplome(String nom, String prenom, String adresse,double salaire,boolean manger) {
	
		    super(nom, prenom, adresse);
	        this.setSalaire(salaire);
	        this.setVentesTotal(0);
	        this.setManger(manger);
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public double getVentesTotal() {
		return ventesTotal;
	}

	public void setVentesTotal(double ventesTotal) {
		this.ventesTotal = ventesTotal;
	}

	@Override
	public double calcSalaire() {
		return salaire+(ventesTotal*0.01);
		
	}

	public boolean isManger() {
		return Manger;
	}

	public void setManger(boolean manger) {
		Manger = manger;
	}

}
