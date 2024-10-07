
import static javax.swing.JOptionPane.*;

public class Test {
	public static void main(String[] args) {
		
		int a = 1;
		int sum = 0;
		int i = 0;
		if (a != 0) {
		a = Integer.parseInt(showInputDialog("Skriv en rekke tall som skal summeres. Bare skriv ett tall om gangen. Når du er ferdig skriv inn 0"));
		
		if (a != 0) {
		sum += a;
		i++;
		}
		
		}
		
		System.out.println("Antall tall: " + i);
		System.out.println("Sum: " + sum);
		
		
	}
}
	
	 

