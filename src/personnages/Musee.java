package personnages;

public class Musee {
	protected Trophee[] tabTrophees = new Trophee[200];
	private int nbTrophee=0;
		
	

	public Musee(Trophee[] tabTrophees, int nbTrophee) {
		super();
		this.tabTrophees = tabTrophees;
		this.nbTrophee = nbTrophee;
	}



	public void donnerTrophee(Gaulois gaulois, Equipement equipement) {
		Trophee trophee = new Trophee(gaulois, equipement);
		tabTrophees[nbTrophee]= trophee;
		nbTrophee+=1;
	}

}