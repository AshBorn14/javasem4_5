class student{
	int rollno;
	String name;
	float fee;
	
	student(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display(){
		System.out.println("Rollno: "+rollno+" Name: "+name+" Fee: "+fee);
	}
}
class thisPointer{
	public static void main(String[] args){
		student s1 = new student(12,"Shiv",23.90f);
		s1.display();
	}
}
