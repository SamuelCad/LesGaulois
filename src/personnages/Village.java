package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois=0;
	
	public Village(String nom, int nbVillageoisMaximum)
		this.nom = nom;
		nbVillageois=nbVillageoisMaximum;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois g) {
		villageois[nbVillageois]=g;
		nbVillageois++;		
	}
	
	public Gaulois trouverHabitant(int nbV) {
		return villageois[nbV];
		
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}

	public static void main(String[] args){
		Village village = new Village("Village_des_Irreductible", 30); 
//		Gaulois gaulois = village.trouverHabitant(30);
		
		Chef chef = new Chef("Abraracoursix", 6, village);
		Gaulois gaulois = new Gaulois("Astérix", 8);
		Village village = ajouterHabitant(Gaulois);
		Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
	} 
	

}
