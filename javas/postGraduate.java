class degree{
	void getDegree(){
		System.out.println("I got a degree");
	}
}
class underGraduate extends degree{
	void getDegree(){
		System.out.println("I am an undergraduate");
	}
}
class postGraduate extends degree{
	void getDegree(){
		System.out.println("I am a postgraduate");
	}
	public static void main(String[] args){
		degree obj1 = new degree();
		underGraduate obj2 = new underGraduate();
		postGraduate obj3 = new postGraduate();
		obj1.getDegree();
		obj2.getDegree();
		obj3.getDegree();
	}	
}