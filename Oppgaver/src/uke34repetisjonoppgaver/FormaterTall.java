package uke34repetisjonoppgaver;

public class FormaterTall {
	
	public static void main(String[] args) {
		
		int[] t = {2,3,1,5};
		skrivUtTallene(t, new Stjerneformat());
		
		
	
	}
	
	/*generell metode void skrivUtTallene(int[] tabell, Tallformat format) som skriver ut alle tallene i tabell, 
	 * formatert ved hjelp av objektet format
	 */
	private static void skrivUtTallene(int[] tabell, Tallformat format) {
		for (int i=0 ; i < tabell.length ; i++) {
			System.out.println(format.somStreng(tabell[i]));
		}
	}
}	
	
	
interface Tallformat {
	String somStreng(int tall);
}

class Stjerneformat implements Tallformat {

	@Override
	public String somStreng(int tall) {
		return "*".repeat(tall);
	}	
}

	

