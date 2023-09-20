public class ThreadJoin extends Thread{
	public void run(){
		System.out.println("r1");
		try{
			Thread.sleep(500);
		}
		catch(InterruptedException ie){ }
		System.out.println("r2");
	}
	public static void main(String[] args){
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		t1.start();
		try{
			t1.join();
		}
		catch(InterruptedException ie){ }
		t2.start();
	}
}