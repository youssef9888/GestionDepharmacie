package Modele;

public abstract class Employe {
	
	

	private String nom;
    private String prenom;
    private String adresse;
    private double salaireFinal;

    
	public Employe(String nom, String prenom, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		
	}
	
    public abstract double calcSalaire();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getSalaireFinal() {
		return salaireFinal;
	}

	public void setSalaireFinal(double salaireFinal) {
		this.salaireFinal = salaireFinal;
	}
	
}
