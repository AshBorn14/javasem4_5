import java.util.*;
class studentClass{
	/*studentClass(){
		System.out.println("Name: Unknown");
	}*/
try{
	studentClass(String name){
		System.out.println("Name: "+name);
	}
}
catch(Exception e){
	System.out.println("Unknown name");
}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		studentClass obj = new studentClass();
		System.out.print("Enter name: ");
		String name = sc.next();
		studentClass obj1 = new studentClass(name);
	}
}