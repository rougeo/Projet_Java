/**
 * 
 */
package yakusa;

/**
 * @author Boubacar
 *
 */
public class Commer�ant extends Humain {

	public Commer�ant(String nom, int argent) {
		super(nom, argent, "Th�");
		// TODO Auto-generated constructor stub
	}
	
	public int seFaireExtorquer(){
		int a=super.getArgent();
		super.perdreArgent(a);
		super.parler("J'ai tout perdu !! Le monde est vraiment trop injuste");
		return a;    // On renvoit le montant duquel il s'est fait extorquer
	}
	
	public void recevoir(int somme)	{
		super.gagnerArgent(somme);
		super.parler("Je te remercie g�n�reux donateur");
	}

}
