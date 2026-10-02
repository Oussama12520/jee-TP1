package clubs;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant("oussema", LocalDate.of(2005,7,16), "oussema@gmail.com");
		Etudiant e2 = new Etudiant("ayoub", LocalDate.of(2005,8,31), "ayoub@gmail.com");
		Club c1 = new Club();
		c1.setNom("mtc");
		System.out.println(c1.addMembre(e1));
		
		c1.addMembre(e2);
		
		
	}
}
