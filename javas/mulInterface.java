interface hello{
	void printHello();
}
interface name{
	void printName();
}
class mulInterface implements hello,name{
	public void printHello(){
		System.out.println("Hello");
	}
	public void printName(){
		System.out.println("Shiv");
	}
	public static void main(String[] args){
		mulInterface obj = new mulInterface();
		obj.printHello();
		obj.printName();
	}
}

	