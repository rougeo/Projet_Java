/**
 * 
 */
package yakusa;

/**
 * @author Boubacar
 *
 */
public class Humain {
			
	private String nom;
	private int argent;
	private String boisson;
	/**
	 * @param nom
	 * @param argent
	 * @param boisson
	 */
	public Humain(String nom, int argent, String boisson) {
		super();
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}

			
			/**
			 * @return the nom
			 */
			public String getNom() {
				return nom;
			}
			/**
			 * @param nom the nom to set
			 */
			public void setNom(String nom) {
				this.nom = nom;
			}
			/**
			 * @return the argent
			 */
			public int getArgent() {
				return argent;
			}
			/**
			 * @param argent the argent to set
			 */
			public void setArgent(int argent) {
				this.argent = argent;
			}
			/**
			 * @return the boisson
			 */
			public String getBoisson() {
				return boisson;
			}
			/**
			 * @param boisson the boisson to set
			 */
			public void setBoisson(String boisson) {
				this.boisson = boisson;
			}
			
			/**
			 * @param texte the texte to write
			 */
			public void parler(String texte)
			{
				System.out.println( "("+getNom()+")" + " - " + texte);
			}
			
			/**
			 * @param texte the texte to write
			 */
			public void direBonjour()
			{
				String a=" Bonjour ! Je m'appelle " + getNom() + " ,j'aime boire du " + getBoisson() + " et j'ai "+ getArgent() + " sous en poche";
			
				parler(a);
			}
			
			/**
			 * @param none
			 */
			public void boire(){
				String a=" Ahh, un bon verre de " + getBoisson();
				parler(a);
			}
			
			
			/**
			 * @param none
			 */
			public void gagnerArgent(int somme){
				setArgent(getArgent()+somme);
			}
			
			/**
			 * @param none
			 */
			public void perdreArgent(int somme){
				setArgent(getArgent()-somme);
			}


			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return " Je suis  " + nom + ", je possède " + argent
						+ " euro , et ma boisson est " + boisson ;
			}
			
			
}
