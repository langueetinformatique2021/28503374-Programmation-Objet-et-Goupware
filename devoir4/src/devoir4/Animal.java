package devoir4;
/**
 * @author fatou
 * Gestion de la classe abstraite Animal
 */
public abstract class Animal {
	
	private String espece;
	protected int nb_pattes = 0;
	/** création d'une nouvelle instance de la classe Animal
	 * @param type nom de l'espèce
	 * @pattes nombre de pattes
	 */
	public Animal(String type, int pattes) {
		espece = type;
		nb_pattes = pattes;
	}
	/**présentation des caractéristiques de l'animal*/
	public void presente() {
		System.out.println("je suis un représentant de l'espèce des " + espece + " et j'ai " + nb_pattes + " pattes");
	}

	/** cri de l'animal */
	public abstract void crie();

}
