interface welcome{
	void msg();
}
class Interface1 implements welcome{
	public void msg(){
		System.out.println("First class interface");
	}
}
class Interface2 implements welcome{
	public void msg(){
		System.out.println("Second class interface");
	}
	public static void main(String[] args){
		Interface1 obj1 = new Interface1();
		Interface2 obj2 = new Interface2();
		obj1.msg();
		obj2.msg();
	}
}