import java.util.*;
public class BaseToPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value");
		double m = sc.nextDouble();
		System.out.println("Enter the power value");
		int n = sc.nextInt();
		BaseToPower bp = new BaseToPower();
		System.out.println(bp.recursivePower(m, n));

	}
	public double recursivePower(double a, int b){
		if(b == 0)
			return 1.00;
		else if(b>0)
			return recursivePower(a, b-1) * a;
		else
			return recursivePower(a, b+1) * (1/a);
	}

}
