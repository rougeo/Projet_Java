/**
 * 
 */
package yakusa;

/**
 * @author Boubacar
 *
 */
public class Samourai extends Ronin {
	
	private String seigneur;

	public Samourai(String nom, Integer argent, String boisson,String seigneur) {
		super(nom, argent, boisson);
		this.seigneur=seigneur;
		// TODO Auto-generated constructor stub
	}
	
	// Surcharge de la méthode boire
	public void boire(String boisson){
		String a="Ahh, un bon verre de " +boisson;
		parler(a);
	}

	/**
	 * @return the seigneur
	 */
	public String getSeigneur() {
		return seigneur;
	}

	/**
	 * @param seigneur the seigneur to set
	 */
	public void setSeigneur(String seigneur) {
		this.seigneur = seigneur;
	}
	
}
