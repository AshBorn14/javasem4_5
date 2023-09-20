import java.util.*;
class A{
	public void methodA(){
		System.out.println("This is method A");
	}
	
}
class B extends A{
	public void methodB(){
		System.out.println("This is method B");
	}
}
public class multilevelC extends B{
	public void methodC(){
		System.out.println("This is method C");
	}
	public static void main(String [] args){
		multilevelC obj = new multilevelC();
		obj.methodA();
		obj.methodB();
		obj.methodC();
	}
}

	