package personnages;

public class Romain {
	
	private String nom;
	private int force;
	private  Equipement[] equipement= new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>0 : "Invalide";
	}
	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force>0;
		int force1=force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force1!=force;
	}
	
	
	
//	public void sEquiper(Equipement[] equipement) {
		
//		switch (equipement) {
		
		
//		}
//	}
	
		
	public static void main(String[] args){
	Romain minus = new Romain("Minus",6);
//	minus.recevoirCoup(4);
//	System.out.println(Equipement.CASQUE);
//	System.out.println(Equipement.BOUCLIER);
	}
	
}
