import java.util.*;
class parent{
	public void parentMethod(){
		System.out.println("This is method of parent");
	}
}
class childA extends parent{
	public void childAMethod(){
		System.out.println("This is method of child A");
	}
}
class childB extends parent{
	public void childBMethod(){
		System.out.println("This is method of child B");
	}
}
public class heirarchical{
	public static void main(String[] args){
		childA objA = new childA();
		childB objB = new childB();
		objA.childAMethod();
		objA.parentMethod();
		objB.childBMethod();
		objB.parentMethod();
	}
}