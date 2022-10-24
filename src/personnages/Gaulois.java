package personnages;


public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion = 1;
	
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
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de "
			+ romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force
		+ ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion(int forcePotion) {	
		effetPotion = forcePotion; 
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
}
	
	public static void main(String[] args) {
			Gaulois asterix= new Gaulois("Astérix",8);
			Romain minus = new Romain("Minus",6);
//			System.out.println(asterix);
//			asterix.parler("2");
			asterix.frapper(minus);
			asterix.frapper(minus);
			asterix.frapper(minus);
//			asterix.boirePotion(6);
			}
	
}
