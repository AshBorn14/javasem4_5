interface Interface1{
	void print();
}
interface Interface2 extends Interface1{
	void hello();
}
class interfaceExtend implements Interface2{
	public void print(){
		System.out.println("Hi");
	}
	public void hello(){
		System.out.println("Shiv");
	}
	public static void main(String[] args){
		interfaceExtend obj = new interfaceExtend();
		obj.print();
		obj.hello();
	}
}