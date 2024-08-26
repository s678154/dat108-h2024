package no.hvl.dat108.collsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//1. Sortere i "naturlig" rekkefølge i hht. String compareTo. OK
			List<String> listen = Arrays.asList("Hallo", "blabla", "knut", "Per");
			Collections.sort(listen); 
			// ! kan bruke collections.sort eller listen.sort()
			System.out.println(listen);
			
			//2. Sortere alfabetisk uavhengig av store og små bokstaver
			listen.sort((a,b) -> a.toLowerCase().compareTo(b.toLowerCase()));
			System.out.println(listen);
			
			//4. Sortere på lengden på strengene (med lambda-uttrykk)
			listen.sort((a,b) -> a.length() - b.length());
			System.out.println(listen);
			
			//5. Sortere på lengden synkende. Putte lambda-uttrykk inn i variabel.
			Comparator<String> c = (a,b) -> b.length() - a.length();
			listen.sort(c);
			System.out.println(listen);
	}

}