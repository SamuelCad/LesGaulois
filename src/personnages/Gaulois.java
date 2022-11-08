package personnages;


public class Gaulois {
	
	private String nom;
	private int effetPotion = 1;
	private int force; 
	private int nbtrophees;
	private Equipement[] newTrophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3)*effetPotion);
//	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion(int forcePotion) {	
		effetPotion = forcePotion; 
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
}
	
	public void faireUneDonnation(Musee musee) {
		parler(" Je donne au musee tous mes trophees : ");
		for (int i=0; newTrophees[i]!=null; i++, nbtrophees++) {
			musee.tabTrophees[nbtrophees]=newTrophees[i];
			System.out.println("- "+ newTrophees[i]);
		};
	}
	
	
	
//_________________________________________________________________	
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbtrophees++) {
			newTrophees[nbtrophees] = trophees[i];
		}
		
	}
	
	public static void main(String[] args) {
			Gaulois asterix= new Gaulois("Astérix",8);
			Romain minus = new Romain("Minus",6);
			Musee musee = new Musee(null, 0);
//			asterix.parler("2");
			asterix.faireUneDonnation(musee);
		
			}
	
}
