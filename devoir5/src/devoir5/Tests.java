package devoir5;


public class Tests {

	public static void main(String[] args) {
	
		Calendar2 cal2 = new Calendar2();
		cal2.afficher();
		if (cal2.cours) {
			System.out.println("Objet créé pendant le cours");
		}
		else System.out.println("Objet non créé pendant le cours"); 


	}

}
