package Modele;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Responsablepharmacy extends  PharmacienDiplome {
	public ObservableList<pharmacy> listeDPharmacie;
    public Responsablepharmacy Responsable;

    public Responsablepharmacy(String nom, String prenom, String adresse, double salaire) {
        super(nom, prenom, adresse, salaire);
        this.setVentesTotal(0);
        listeDPharmacie = FXCollections.observableArrayList();
        Responsable = this;
    }

    public void addPharma(pharmacy phar){
        this.listeDPharmacie.add(phar);
        phar.addEmployee(this);
    }
}
