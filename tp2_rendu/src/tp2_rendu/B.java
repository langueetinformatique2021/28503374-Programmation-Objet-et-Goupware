package tp2_rendu;

/**
 * 
 * @author Fatou
 * @version 0.1
 */

public class B {
	/** 
	 * Renvoie n/2 si n est divisible par 13 et n+2 dans le cas contraire
	 * @param  n  un entier quelconque
	 * @return n/2 ou n+2*/
	public static int divise(int n)
	{
		if(A.treize(n)) {
			return n/2;
		}
		else return n+2; 
	}


}
