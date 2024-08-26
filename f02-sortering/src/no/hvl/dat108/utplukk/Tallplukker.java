package no.hvl.dat108.utplukk;

import java.util.ArrayList;
import java.util.List;


interface Betingelse {
	boolean sjekk(int t);
}

public class Tallplukker {
	public static List<Integer> plukkUt(List<Integer> liste, Betingelse b) {
		
		List<Integer> svar = new ArrayList<>();
		for(int tall : liste) {
			if(b.sjekk(tall)) { //Sjekke om tallet oppfyller en viss betingelse
				svar.add(tall);
			}
		}
		return svar;
	}
}	
