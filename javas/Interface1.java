interface hello{
	void print();
}
class Interface1 implements hello{
	public void print(){
		System.out.println("Hello World");
	}
	public static void main(String[] args){
		Interface1 obj = new Interface1();
		obj.print();
	}
}