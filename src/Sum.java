import java.util.*;
public class Sum {
	private int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int userNumber = sc.nextInt();
		Sum s= new Sum();
		System.out.print(s.recursiveSum(userNumber));
		
	}
	public int recursiveSum(int n){
		if(n>1){
			System.out.print(n + "+");
			sum += n;
			return recursiveSum(n-1);
		}
		else{
			sum+=n;
			System.out.print(n + "=");
			return sum;
		}
	}
}
