package personnages;
import personnages.Equipement;
public class Romain {
	
	private String nom;
	private int force;
	private  Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipements = equipements;
		this.nbEquipement =nbEquipement;
		
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
		} 
		else {
			parler("J'abandonne...");
		}
		assert force1!=force;
	}
	
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			parler("Le soldat "+nom+ " est bien protégé !");
			break;
		
		case 1:
			if (equipements[0]==equipement) {
				parler("Le soldat "+nom+ " possède déjà un "+equipement);
				}
			
			else {
				equipements[1]=equipement;
				nbEquipement+=1;
				parler("Le soldat "+nom+ " s'équipe avec un "+equipement);
			}
			break;
		case 0:
			equipements[0]=equipement;
			nbEquipement+=1;
			parler("Le soldat "+nom+ " s'équipe avec un "+equipement);
			break;
		}
	}
	
		
	public static void main(String[] args){
	Romain minus = new Romain("Minus",6);
	minus.sEquiper(Equipement.CASQUE);
	minus.sEquiper(Equipement.CASQUE);
	minus.sEquiper(Equipement.BOUCLIER);
	minus.sEquiper(Equipement.BOUCLIER);

	}
	
}
