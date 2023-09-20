import java.util.*;
public class exception{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num = sc.nextInt();
		int den = sc.nextInt();
		try{
			int div = num/den;
			System.out.println("Divison = "+div);
		}
		catch(ArithmeticException e){
			System.out.println("Can't be divided by zero");
		}
	}
}
		

