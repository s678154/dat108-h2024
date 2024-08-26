package uke34laboppgaver;

public class OppgaveBetingetUtskrift{

	private static void betingetUtskrift (String s, LambdaFunction l) {
		if (l.betingelse()) {
            System.out.println(s);
        }
	}
	
	public static void main(String[] args) {
		betingetUtskrift("Heihei!", () -> true);
		betingetUtskrift("heihei!", () -> false);
	}
	
}

interface LambdaFunction {
	boolean betingelse();
}
