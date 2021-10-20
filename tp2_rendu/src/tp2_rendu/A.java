package tp2_rendu;
/**
 * 
 * @author Fatou
 * @version 0.1
 * Calcul de la divisibilite par 13 d'un nombre quelconque
 */

public class A {
	/** 
	 * Renvoie true si la valeur n est divisible par 13
	 * @param  n  un entier quelconque
	 * @return  true si n est divisible par treize*/
	public static boolean treize(int n)
	{
		if((n%13 == 0)) return true;
		else return false;
	}
}
