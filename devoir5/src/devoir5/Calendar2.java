package devoir5;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Calendar2 extends Calendar {
	public boolean cours;
	public Calendar gc = new GregorianCalendar();
	/**
	 * Constructeur de Calendar2
	 */
	public Calendar2() {
		
		if (gc.HOUR >= 9 && gc.HOUR <= 12) {
			if((gc.HOUR >= 9 && gc.MINUTE >= 30) || (gc.HOUR == 12 && gc.MINUTE == 0)) {
				this.cours = true;
			}		
		}
		this.cours = false;
	}
	/**
	 * Affiche la date et l'heure
	 */
	public void afficher() {
		System.out.println("Date : "+gc.get(gc.DATE)+"/"+(gc.get(gc.MONTH)+1)+"/"+gc.get(gc.YEAR));
		System.out.println("Heure : "+gc.get(gc.HOUR)+":"+gc.get(gc.MINUTE));
	}

	@Override
	public void add(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void computeFields() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void computeTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getGreatestMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void roll(int arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}

	


}
