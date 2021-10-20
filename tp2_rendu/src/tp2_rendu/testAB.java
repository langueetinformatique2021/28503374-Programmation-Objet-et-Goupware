package tp2_rendu;

/**
 * 
 * @author Fatou
 * @version 0.1
 * Tests de la fonction divise
 */
public class testAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int m;
		int res = i;
		for(m=0;m<8;m++)
		{
			res = B.divise(res);
			System.out.println(res);
		}

	}

}
