package devoir2;
/**
 * 
 * @author Fatou
 * @version 0.1
 * Calcul de la mediane de 5 entiers
 * On appelle les fonctions maximum() et minimum() sur les 5 entiers (ranges dans un tableau)
 * Apres avoir determine le maximum et le minimum, on calcule la mediane sur les 3 entiers restants et on l'affiche
 */
public class BranchementConditionnel4Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4,p5 = 8;
		
		int p6=0;
		
		int[] tab = {p1,p2,p3,p4,p5};
		
		int mini = BranchementConditionnel4.minimum(tab);
		
		int maxi = BranchementConditionnel4.maximum(tab);


		if((mini == p1 && maxi == p2) || (mini == p2 && maxi == p1)) {
			p6 = BranchementConditionnel4.mediane(p3,p4,p5);
		}
		if((mini == p1 && maxi == p3) || (mini == p3 && maxi == p1)) {
			p6 = BranchementConditionnel4.mediane(p2,p4,p5);
		}
		if((mini == p1 && maxi == p4) || (mini == p4 && maxi == p1)) {
			p6 = BranchementConditionnel4.mediane(p2,p3,p5);
		}
		if((mini == p1 && maxi == p5) || (mini == p5 && maxi == p1)) {
			p6 = BranchementConditionnel4.mediane(p2,p3,p4);
		}
		if((mini == p2 && maxi == p3) || (mini == p3 && maxi == p2)) {
			p6 = BranchementConditionnel4.mediane(p1,p4,p5);
		}
		if((mini == p2 && maxi == p4) || (mini == p4 && maxi == p2)) {
			p6 = BranchementConditionnel4.mediane(p1,p3,p5);
		}
		if((mini == p2 && maxi == p5) || (mini == p5 && maxi == p2)) {
			p6 = BranchementConditionnel4.mediane(p1,p3,p4);
		}
		if((mini == p3 && maxi == p4) || (mini == p4 && maxi == p3)) {
			p6 = BranchementConditionnel4.mediane(p1,p2,p5);
		}
		if((mini == p3 && maxi == p5) || (mini == p5 && maxi == p3)) {
			p6 = BranchementConditionnel4.mediane(p1,p2,p4);
		}
		if((mini == p4 && maxi == p5) || (mini == p5 && maxi == p4)) {
			p6 = BranchementConditionnel4.mediane(p1,p2,p3);
		}
		System.out.println("La médiane de "+p1+", "+p2+", "+p3+", "+p4+" et "+p5+" est : "+p6);

	}

}
