package lambdapracticeproblems;

public class EmptyStringCheck {
	
	//Java program to implement a lambda expression to check if a given string is empty.
	
	public static void main(String[] args) {
		MyLambda lambdafunction = a -> a.isEmpty();
		System.out.println("Streng er tom: " + lambdafunction.check(""));
		System.out.println("Streng er tom: " + lambdafunction.check("hei!"));
	}

}


interface MyLambda {
	boolean check(String s);
}