package no.hvl.dat108.people;

/* Kopiert fra javabrains.io sitt Java 8 Lambda Basics kurs */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	
	static void printConditionally(List<Person> liste, Predicate<Person> bet) {
		for (Person p : liste) {
			if (bet.test(p)) {
				System.out.println(p);
			}
		}
	}
	
	
	static void printLastNameStartsWithC(List<Person> liste) {
		for (Person p : liste) {
			if (p.lastName().startsWith("C")) {
				System.out.println(p);
			}
		}
	}
	
	
	static void printAll(List<Person> liste) {
		for(Person p:liste) {
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);

		// 1: Sorter personene på etternavn.
		people.sort((p1,p2) -> p1.lastName().compareTo(p2.lastName()));
		
		// 2: Skriv ut alle personene, én linje per person. 
		// 		Lag en egen hjelpemetode printAll(...) som gjør dette.
		printAll(people);
		
		// 3: Skriv ut alle personene som har etternavn som begynner på C.
		//		Lag en egen hjelpemetode printLastNameStartsWithC(...) som gjør dette.
		System.out.println("De med etternavn som starter på C:");
		printLastNameStartsWithC(people);
		
		// 4: Skriv ut alle personene som har fornavn som begynner på C.
		//		Vi ser nå at det er tungvint å lage én utskriftsmetode per
		//      spesialtilfelle. Lag en generell hjelpemetode printConditionally(...)
		//		gjør jobben i stedet. Denne tar inn listen + et lambdauttrykk.
		System.out.println("De med fornavn som starter på C:");
		printConditionally(people, p -> p.firstName().startsWith("C"));
		
		// 5: Skriv ut ALLE personene ved å bruke printConditionally(...)
		
		
		// >>>> Tilbake til ppt for litt mer "teori" før vi gjør siste
		
		
		// 6: Skriv ut fornavn til alle over 50 år.
		//    	Lag en metode doConditionally(...)
		
		
	}
	
}
