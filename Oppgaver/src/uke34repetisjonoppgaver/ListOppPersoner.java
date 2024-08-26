package uke34repetisjonoppgaver;

import java.util.List;

public class ListOppPersoner {
	
	public static void main(String[] args) {
		
		List<Person> personer = List.of(
		            new Person("Atle Patle", 1970),
		            new Person("Per Viskeler", 1972),
		            new Person("Madam Felle", 1960),
		            new Person("Donald Duck", 1950)
		        );
		skrivUtPersonene(personer, new FormatPerson());
	}
	
	
	
	private static void skrivUtPersonene(List<Person> liste, Skapning format) {
		for (Person person : liste) {
            System.out.println(format.somStreng(person));
        }
	}
}

record Person(String navn, int fodselsaar) {}

interface Skapning {
	 String somStreng(Person person);
}

class FormatPerson implements Skapning {

    @Override
    public String somStreng(Person person) {
        return person.navn().toUpperCase() + ", født i " + person.fodselsaar();
    }
}
