import java.util.Scanner;

public class V1LabUke34 {
	
	public static void main(String[] args) {
		String brukernavn = null;
		String passord = null;

		Scanner input = new Scanner(System.in);

		String funksjonTxt = "Velg funksjon\n a) - opprette konto\n b) - endre passord\n c) - slette konto\n d) - login";

		System.out.println(funksjonTxt);
		System.out.print(">");

		String valgTxt = input.nextLine();

		switch (valgTxt) {

		case "a":
			System.out.print("Opprett konto\nBrukernavn:");
			brukernavn = input.nextLine();
			System.out.print("Passord:");
			passord = input.nextLine();
			break;
		case "b":
			System.out.print("Endre passord\nGammelt passord:");
			passord = input.nextLine();
			System.out.print("Nytt passord:");
			passord = input.nextLine();
			break;
		case "c":
			System.out.print("Slette bruker\nBrukernavn:");
			brukernavn = input.nextLine();
			System.out.print("Passord:");
			passord = input.nextLine();
			break;
		case "d":
			System.out.print("Login\nBrukernavn:");
			brukernavn = input.nextLine();
			System.out.print("Passord:");
			passord = input.nextLine();
			break;
		default:
			System.out.println("Ingen funksjon valgt");
		}

		System.out.println(brukernavn);
		System.out.println(passord);

		input.close();
	}
	}
	
	
	
}
