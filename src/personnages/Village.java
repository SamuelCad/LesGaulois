package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois=0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
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
	
	public void afficherVillageois() {
		System.out.println("Dans village du chef "+chef.getNom() +"vivent les légendaires gaulois :");
		for (int i=0; i<nbVillageois; i++) {
			System.out.println('-'+trouverHabitant(i).getNom());
		}
			
	};
	
	

	public static void main(String[] args){
		Village village = new Village("Village_des_Irreductible", 30); 
//		Gaulois gaulois = village.trouverHabitant(30);
		
		Chef abraracoursix = new Chef("Abraracoursix", 6, village);
		village.setChef(abraracoursix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
//		Village village = ajouterHabitant(Gaulois);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
		
		
	} 
	

}
