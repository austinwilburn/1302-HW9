import java.util.*;
public class Fibonacci {
	private double fibSum;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fibonacci Number: ");
		double userNumber = sc.nextDouble();
		double iAnswer = fibonacciIterative(userNumber);
		double rAnswer = fibonacciRecursive(userNumber);
		System.out.println("Iteration says the answer is: " + iAnswer);
		System.out.println("Recursion says the answer is: " + rAnswer);
		sc.close();
		
		
	}
	public static double fibonacciIterative(double a){
	
		double x = 0, y = 1, z = 1;
		for(double i = 0; i < a; i++){
			x = y;
		y = z;
		z= x + y;
		}
		return x;
	
	}
	public static double fibonacciRecursive(double a){
		if(a == 1|| a==2)
			return 1;
		else{
			return fibonacciRecursive(a - 1) + fibonacciRecursive(a - 2);
		}
	}
}
