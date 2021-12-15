package devoir6;

import java.util.Random;

public class BatailleTest {
	public static void main(String[] args) {
		
		int i = 0;
		try {
			
			while(true) {
				String carte1 = getCarte();
				String carte2 = getCarte();
				jeu(carte1,carte2);
				i++;
			}
		}
		catch (Bataille b) {
			System.out.println("Bataille ! en "+i+" essais");
		}
	}
	public static void jeu(String j1, String j2) throws Bataille {
		if(j1.equals(j2)) {
			throw new Bataille();
		}	
	}
	public static String getCarte() {
		String cartes[] = {"As","Roi","Reine","Valet","10","9","8","7"};
		Random r = new Random();
		int val = r.nextInt(cartes.length-1) + 1;
		
		return cartes[val];
	}

}
