package devoir4;
/**
 * 
 * @author fatou
 * Gestion de classe Reptile qui dérive de la classe Animal
 */
public abstract class Reptile extends Animal{
	
	//booléen qui vérifie si le reptile peut muer ou pas
	public boolean mue;
	
	/**
	 * Constructeur de la classe Reptile qui fait appel au constructeur de la sur-classe Animal
	 * @param type qui indique le type du reptile
	 * @param peutMuer qui indique si le reptile peut muer ou pas
	 */
	public Reptile(String type, boolean peutMuer) {
		super(type,0);
		mue = peutMuer;
	}
	/**
	 * Méthode abstraite qui permet de modifier le nombre de pattes d'un reptile
	 */
	public abstract void NombredePattes();
	
}
