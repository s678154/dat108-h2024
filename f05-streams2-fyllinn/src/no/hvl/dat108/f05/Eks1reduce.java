package no.hvl.dat108.f05;

import static no.hvl.dat108.f05.People.people;

import java.util.List;

public class Eks1reduce {
	
	public static void main(String[] args) {
		
		/* Summen av aldrene til personene i people-listen */
		
		int sumAlder = people.stream()
				.mapToInt(Person::age)
				.sum();
		//Løsning 2:
		int sumAlder = people.stream()
				.map(Person::age)
				.reduce(0, Integer::sum);
		System.out.println("Sum alder er: " + sumAlder);
	
		// DET OVER ER EGENTLIG DETTE:
		int sumAlder = people.stream()
				.map(p -> p.age())
				.reduce(0, (sum, alder) -> Integer.sum(sum, alder));
		System.out.println("Sum alder er: " + sumAlder);
		
		
		/* En streng med alle initialene, "CD LC TC CB MA" */
		
		String initialer = people.stream()
				.map(p -> "" + p.firstName().charAt(0) + p.lastName().charAt(0) + " ")
				.reduce("", (akku, s) -> akku + s);
		System.out.println(initialer);
		
	}	
}
