package no.hvl.dat108.f05;

import static no.hvl.dat108.f05.People.people;

public class Eks2countmatch {

	public static void main(String[] args) {

		//Alle forbokstavene i fornavnene i en streng "CLTCM" - reduce() 
		String fornavn = people.stream()
				.map(p -> "" + p.firstName().charAt(0))
				.reduce("", (akku, s) -> akku + s);
		System.out.println("Forbokstavene til fornavnene er:" + fornavn);
		
		
		//HVORFOR BLIR p.firstName().charAt(0) EN INT??????????????????
		
		
		//Antall personer over 50 år - count()
		int antallOver50 = (int) people.stream()
				.filter(p -> p.age() > 50)
				.count();
		System.out.println("Antall over 50 år er: " + antallOver50);
		
		//Om vi har data som matcher - anyMatch(), allMatch(), noneMatch()
		//Er alle over 30 år?
		boolean alleOver30 = people.stream()
				.allMatch(p -> p.age() > 30);
		System.out.println("Er alle over 30 år? " + alleOver30);
		//Er noen over 60 år?
		boolean noenOver60 = people.stream()
				.anyMatch(p -> p.age() > 60);
		System.out.println("Er noen over 60? " + noenOver60);
		
		
		

	}

}




