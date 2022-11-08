package personnages;

public class Trophee {
	protected Gaulois gaulois;
	protected Equipement equipement;
	
	public Trophee(Gaulois gaulois, Equipement equipement) {
		this.gaulois = gaulois;
		this.equipement = equipement;
	}

	public Gaulois getGaulois() {
		return gaulois;
	}

	public Equipement getEquipement() {
		return equipement;
	}
	
	public String donnerNom(Gaulois gaulois) {
		return gaulois.getNom();
	}

}
