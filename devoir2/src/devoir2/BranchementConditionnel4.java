package devoir2;
/**
 * 
 * @author Fatou
 * @version 0.1
 * Calcul de la médiane de 5 nombres
 */

public class BranchementConditionnel4 {
	/** 
	 * Renvoie le minimum d'un tableau d'entiers
	 * @param  tab un tableau d'entiers
	 * @return le minimum des entiers du tableau en parametre*/
	
		public static int minimum(int[] tab) {
			int minimum = 10000;
			for (int i=0;i<tab.length;i++) {
				if(tab[i] < minimum) {
					minimum = tab[i];
				}
			}
			return minimum;
		}
		
		/** 
		 * Renvoie le maximum d'un tableau d'entiers
		 * @param  tab un tableau d'entiers
		 * @return le maximum des entiers du tableau en parametre*/
		public static int maximum(int[] tab) {
			int maximum = -100000;
			for (int i=0;i<tab.length;i++) {
				if(tab[i] > maximum) {
					maximum = tab[i];
				}
			}
			return maximum;
		}
		/**
		 * Renvoie la mediane de trois entiers
		 * @param p1 entier relatif
		 * @param p2 entier relatif
		 * @param p3 entier relatif
		 * @return renvoie la mediane des trois entiers en paramètre
		 */
		public static int mediane(int p1,int p2,int p3) {
			int p4;
			if (p1 > p2) {
				if (p2 > p3)
					p4 = p2;
				else {
					if (p3 > p1)
						p4 = p1;
					else p4 = p3;
				}
			}
			else {
				if (p1 > p3)
					p4 = p1;
				else {
					if (p3 > p2)
						p4 = p2;
					else p4 = p3;
				}
			}
			return p4;

		}

}
