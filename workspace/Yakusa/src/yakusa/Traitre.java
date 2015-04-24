/**
 * 
 */
package yakusa;

/**
 * @author Boubacar
 *
 */
public class Traitre extends Samourai {
	
		public int traitrise;

	public Traitre(String nom, Integer argent, String boisson, String seigneur){
		super(nom, argent, boisson, seigneur);
		this.traitrise=0;
		// TODO Auto-generated constructor stub
	}
	
	// le traitre extorque aussi
	public void extorquer(Commerçant c){
		int a;
		
		if(getTraitrise()<3)
		{	
			a =c.seFaireExtorquer(); // le commerçant perd tout son argent
			
			setTraitrise(getTraitrise()+1); // augmente sa traitrise
			super.parler("j'ai piqué le fric de "+ c.getNom());
			super.gagnerArgent(a); // il gagne l'argent qu'il a extorqué
		}
		else
		{
			super.parler("Merde !! je ne peux plus extorquer");
		}
	}
	
	public void faireLeGentil(Humain h, int don){
		
		super.parler("Je fais ami-ami");
		h.gagnerArgent(don);
		perdreArgent(don);
		
		setTraitrise(getTraitrise()-(don/10));
		if(getTraitrise()<0)
		{
			setTraitrise(0);
		}
	}

	/**
	 * @return the traitrise
	 */
	public int getTraitrise() {
		return traitrise;
	}

	/**
	 * @param traitrise the traitrise to set
	 */
	public void setTraitrise(int traitrise) {
		this.traitrise = traitrise;
	}
}
