/**
 * 
 */
package yakusa;

/**
 * @author Boubacar
 *
 */
public class Yakusa extends Humain {
	
	private String clan;
	private int reputation;

	public Yakusa(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.setClan(clan);
		setReputation(0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the reputation
	 */
	public int getReputation() {
		return reputation;
	}

	/**
	 * @param reputation the reputation to set
	 */
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	/**
	 * @return the clan
	 */
	public String getClan() {
		return clan;
	}

	/**
	 * @param clan the clan to set
	 */
	public void setClan(String clan) {
		this.clan = clan;
	}
	
	/**
	 * @param extorquer
	 */
	public void extorquer(Commer�ant c){
		int a =c.seFaireExtorquer(); // le commer�ant perd tout son argent
		setReputation(getReputation()+1); // augmente sa reputation
		super.parler("j'ai piqu� le fric de "+ c.getNom());
		super.gagnerArgent(a); // il gagne l'argent qu'il a extorqu�
		
	}
	/**
	 * @param gagner un duel
	 */
	
	public void gagnerDuel(){
		setReputation(getReputation()+1);
		super.parler("Je viens de gagner un duel !!! ");
	}
	
	
	public int perdreduel(){
		int n=super.getArgent();
		
		if(getReputation()>0)
			setReputation(getReputation()-1);
		super.perdreArgent(n);
		super.parler("j'ai perdu mon duel et mes "+ n +" sous, sniff ....");
		return n; // on renvoit l'argent qu'il vient de perdre, c'est � dire tout
	}
	
	/**
	 * Redefinition de la m�thode dire bonjour
	 */
	
	public void direBonjour(){
		super.direBonjour();
		super.parler("j'appartiens au clan "+ getClan());
	}
	

}
