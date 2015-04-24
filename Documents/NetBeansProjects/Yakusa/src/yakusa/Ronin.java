/**
 * 
 */
package yakusa;

/**
 * @author Boubacar
 *
 */
public class Ronin extends Humain{

	private int honneur;
	
	/**
	 * 
	 */
	public Ronin(String nom, Integer argent, String boisson) {
		super(nom, argent, boisson);
		honneur=1;
		// TODO Auto-generated constructor stub
	}

		/**
	 * @return the honneur
	 */
	public int getHonneur() {
		return honneur;
	}

	/**
	 * @param honneur the honneur to set
	 */
	public void setHonneur(int honneur) {
		this.honneur = honneur;
	}
  
	public void donner(Commerçant c, int argent){
		String a;
		a="Tiens "+ c.getNom()+ " voilà "+ argent +" sous.";
		c.recevoir(argent);
		super.parler(a);
		perdreArgent(argent);
  }
	
	
	public void provoquer(Yakusa y){
		int n;
		if((getHonneur()*2)>y.getReputation())
		{
			n=y.perdreduel();
			setHonneur(getHonneur()+1);
			super.gagnerArgent(n);
			super.parler("Je t'ai eu petit yakusa !!! ");
		}
		else
		{
			setHonneur(getHonneur()-1);
			super.parler("Je viens de perdre un duel contre un Yakusa !!! ");
			y.gagnerDuel();
		}
	}

}
