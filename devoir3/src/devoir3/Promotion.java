package devoir3;

/**
 * 
 * @author Fatou
 * @version 0.1
 * Classe Promotion
 */

public class Promotion {
	private Etudiant[] etudiants;
	private String cursus;
	private String annee;
	
	/**
	 * Constructeur de la classe Promotion
	 * @param etudiants
	 * @param cursus
	 * @param annee
	 */
	public Promotion(Etudiant[] etudiants, String cursus, String annee)
	{
		for(int i=0;i<etudiants.length;i++)
		{
			this.etudiants[i] = etudiants[i];
		}
		this.cursus = cursus;
		this.annee = annee;
	}
	/**
	 * Renvoie le nom du cursus
	 * @return le nom du cursus
	 */
	public String getCursus()
	{
		return cursus;
	}
	/**
	 * modifie la valeur de l'attribut cursus
	 * @param cursus
	 */
	public void setCursus(String cursus)
	{
		this.cursus = cursus;
	}
	/**
	 * renvoie l'annee de la promotion
	 * @return l'annee de la promotion
	 */
	public String getAnnee() {
		return annee;
	}
	/**
	 * Renvoie le nombre d'etudiants de la promotion
	 * @param etudiants
	 * @return le nombre d'etudiants de la promotion
	 */
	public int NombreEtudiants(Etudiant[] etudiants)
	{
		return etudiants.length;
	}
	/**
	 * Renvoie la moyenne de la promotion
	 * @param etudiants
	 * @return la moyenne de la promotion
	 */
	public float MoyennePromotion(float etudiants[])
	{
		float moyenne = 0;
		//instructions
		return moyenne;
	}
}
