import java.util.*;
public class throw{
	 static void checkAge(int age){
		if(age<18){
			throw new ArithmeticException("You must be 18 years of age");
		}else{
			System.out.println("Acccess granted");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		checkAge(age);
	}
}