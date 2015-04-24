/**
 * 
 */
package yakusa;

import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Boubacar
 *
 */
public class GrandMere extends Humain {

		private ArrayList<Humain> memoire=new ArrayList<Humain>();
		private ArrayList<String> hasard=new ArrayList<String>();
	
	public GrandMere(String nom){
		super(nom,0,"Tisane");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the memoire
	 */
	public ArrayList<Humain> getMemoire() {
		return memoire;
	}

	/**
	 * @param memoire the memoire to set
	 */
	public void setMemoire(ArrayList<Humain> memoire) {
		this.memoire = memoire;
	}
	
	
	public void faireConnaissanceAvec(Humain h){
		memoire.add(h);
	}
	
	
	public String humainHasard(){
		int i;
		hasard.add("Commerçant");
		hasard.add("Yakusa");
		hasard.add("Ronin");
		hasard.add("Commerçant");
		Random rnd = new Random();
		i=rnd.nextInt(4);
		System.out.println(i);
		return hasard.get(i);
				
	}
	
	
	
	// comme methode de parcourt, on peut utiliser des iterateur. 
	public void ragoter(){
		for(int i=0;i<memoire.size();i++)
		{
			//memoire.get(i);	
			if(memoire.get(i) instanceof Traitre)
			{
				System.out.println("Je sais que "+ memoire.get(i).getNom() + " est un traitre");
			}
			else
			{
				System.out.println("Je crois que "+ memoire.get(i).getNom() + " est " + humainHasard());
			}
		}				
	}
	
	// Faire dire bonjour
	public void reunion(){
		for(int i=0;i<memoire.size();i++)
		{
			memoire.get(i).direBonjour();	
		}
	}
	
	/*public void sauvegarde(String nomFichier) throws FileNotFoundException, IOException{
		
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("archive.dat"));
		for(int i=0;i<memoire.size();i++)
		{
			writeObject(memoire.get(i));	
		}
	}
	*/
	
		/** Permettre a la grand-mere de faire connaissance par elle-meme avec d'autres humains. 
		 * On saisit l'un apres l'autre les humains qu'on souhaite ajouter a la memoire de la grand-mere 
		 */
			public void menuHumain() {
			
			try {
				//creation de l'objet Humain que l'on ajoutera dans la memoire
				Humain h = null;
				//creation du descripteur d'entree
				BufferedReader entree = new BufferedReader(new FileReader(FileDescriptor.in));
				char reponse = ' ';
				//variable qui serviront aux constructeurs appropries
				String nom;
				String boisson;
				int argent;
				String clan;
				String seigneur;
				//Il est délicat d'ajouter une grand-mere... car elle-meme devra avoir un fichier de sauvegarde. Attention alors a avoir des noms differents pour ne pas 
				//effacer la memoire de la grand-mere que l'on est en train de traiter.
				System.out.println("Voulez-vous ajouter Commercant(c), Ronin(r),Yakuza(y), Samourai(s), GrandMere(g) ou rien($) ?");
				while ((reponse=(entree.readLine()).charAt(0)) !='$') {
					//tous les constructeurs necessitent un nom
					System.out.println("Le nom");
					nom = entree.readLine();
					switch (reponse) {
					case 'c': //constructeur avec attribut argent
						System.out.println("L'argent");
						argent=Integer.parseInt(entree.readLine());
						h=new Commerçant(nom,argent);
						break;
					case 'r':// constructeur avec argent et boisson
						System.out.println("L'argent");
						argent=Integer.parseInt(entree.readLine());
						System.out.println("La boisson");
						boisson = entree.readLine();
						h=new Ronin(nom,argent,boisson);
						break;
						
					case 'y'://constructeur avec argent, boisson et clan
						System.out.println("L'argent");
						argent=Integer.parseInt(entree.readLine());
						System.out.println("La boisson");
						boisson = entree.readLine();
						System.out.println("Le clan");
						clan = entree.readLine();
						h=new Yakusa(nom,argent,boisson,clan);
						break;

					case 's': //constructeur avec argent, boisson et seigneur
						System.out.println("L'argent");
						argent=Integer.parseInt(entree.readLine());
						System.out.println("La boisson");
						boisson = entree.readLine();
						System.out.println("Le seigneur");
						seigneur = entree.readLine();
						h=new Samourai(nom,argent,boisson,seigneur);
						break;

					case 'g': //constructeur avec le nom uniquement
						h=new GrandMere(nom);
						break;
						// pas de cas par defaut : on recommence si le caractere lu n'est pas l'un de ceux propose
					}
					//renouveler la demande pour le while
					System.out.println("Voulez-vous ajouter Commercant(c), Ronin(r),Yakuza(y), Samourai(s), GrandMere(g) ou rien($) ?");
					faireConnaissanceAvec(h);
				}
			} catch (IOException e) {//gestion de l'exception
				System.out.println("Pb lecture standard");
				e.printStackTrace();
			}
		}
}
	


