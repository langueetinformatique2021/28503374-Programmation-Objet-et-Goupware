package devoir3;
/**
 * 
 * @author Fatou
 * @version 0.1
 * Classe Etudiant
 */
public class Etudiant {
	private int numero;
	private String prenom;
	private String nom;
	/**
	 * Constructeur de la classe Etudiant
	 * @param numero
	 * @param prenom
	 * @param nom
	 */
	public Etudiant(int numero,String prenom,String nom)
	{
		this.numero = numero;
		this.prenom = prenom;
		this.nom = nom;
	}
	/** 
	 * Renvoie le nom de l'etudiant
	 * @return le nom de l'etudiant
	 * */
	public int getNumero() {
		return numero;
	}
	/**
	 * Modifie la valeur de l'attribut numero
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * Renvoie la valeur de l'attribut prenom
	 * @return le prenom de l'etudiant
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * Modifie la valeur du prenom
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * Renvoie la valeur du nom de l'etudiant
	 * @return le nom de l'etudiant
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Modifie la valeur de nom
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * Renvoie la moyenne de l'etudiant
	 * @param tab
	 * @return la moyenne des notes de l'etudiant 
	 */
	public float Moyenne(float tab[])
	{
		float moyenne = 0;
		//instructions
		return moyenne;
	}


}
