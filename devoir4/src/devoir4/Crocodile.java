package devoir4;
/**
 * Gestion de la classe Crocodile qui est dérivée de Reptile
 * @author Fatou
 */
public class Crocodile extends Reptile {
	
	//attribut qui permet de préciser l'habitat du crocodile
	public String habitat;
	
	/**
	 * Constructeur de la classe Crocodile qui fait appel au constructeur de la sur-classe Reptile
	 * @param type
	 */
	public Crocodile(String type) {
		super(type,false);
	}
	/**
	 * Implémentation de la méthode crie qui est définie dans la classe Animal
	 */
	public void crie() {
		System.out.println("Je vagis");
	}
	/**
	 * Méthode qui modifie le nombre de pattes du crocodile
	 */
	public void NombredePattes() {
		nb_pattes = 4;
	}
	/**
	 * Fonction qui fait appel à la méthode présente dans la sur-classe Animal et affiche d'autres informations sur une instance de la classe Crocodile
	 * @param habitat
	 */
	public void affichage(String habitat) {
		super.presente();
		this.habitat = habitat;
		System.out.println("Mon habitat est "+habitat);
		if(mue) {
			System.out.println("Je peux muer");
		}
		else System.out.println("Je ne peux pas muer");
	}
	
	
}
