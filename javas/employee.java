import java.util.*;
public class employee{
	String name,address;
	int age;
	Scanner sc = new Scanner(System.in);
	public void getData(){
		System.out.println("\nEnter details of employee");
		System.out.print("Enter address: ");
		address = sc.nextLine();
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter age: ");
		age = sc.nextInt();
	}
	public void showData(){
		System.out.println("Details of Employee");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
		System.out.println();
	}
	public static void main(String[] args){
		employee obj[];
		obj = new employee[3];
		for(int i=0;i<3;i++){
			obj[i] = new employee();
			obj[i].getData();
		}
		for(int i=0;i<3;i++){
			obj[i].showData();
		}
	}
}
		
