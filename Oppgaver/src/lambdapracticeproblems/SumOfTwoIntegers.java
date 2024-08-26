package lambdapracticeproblems;

public class SumOfTwoIntegers {

	//Java program to implement a lambda expression to find the sum of two integers
	
	public static void main(String[] args) {
		LambdaFunction mylambda = (x, y) -> x + y;
		int resultat = mylambda.execute(5,2);
		System.out.println("5 + 2 = " + resultat);
		
		System.out.println("100 + 3 = " + mylambda.execute(100, 3));
		
	}
}

interface LambdaFunction {
	int execute(int a, int b);
}
