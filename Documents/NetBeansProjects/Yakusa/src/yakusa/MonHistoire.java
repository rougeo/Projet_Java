/**
 * 
 */


//ines.de-courchelle@irit.fr
package yakusa;

/**
 * @author Boubacar
 * i
 */
public class MonHistoire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain h=new Humain("Prof",10,"Porto");
		h.direBonjour();
		h.boire();
		
		Commerçant c=new Commerçant("Marchant",35);
		c.direBonjour();
		
		Yakusa y=new Yakusa("Yaku_le_noir",42,"biere", "Warsong");
		y.extorquer(c);
		Ronin r=new Ronin("Roro",61,"sake");
	/*	r.donner(c,10);
		r.provoquer(y);
		r.direBonjour();
		*/
		Traitre t=new Traitre("Walter", 34, "Tequila","Reyden");
		GrandMere g=new GrandMere("grani");
		
		g.faireConnaissanceAvec(r);
		g.faireConnaissanceAvec(h);
		g.faireConnaissanceAvec(c);
		g.faireConnaissanceAvec(t);
		
		g.ragoter();
		//g.menuHumain();
		g.reunion();
		
	}

}
