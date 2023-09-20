class A{
	void display(){
		System.out.println("This is class A");
	}
}
class B extends A{
	void display(){
		System.out.println("This is class B");
	}
}
class poly{
	public static void main(String[] args){
		A obj1 = new B();
		obj1.display();
	}
}