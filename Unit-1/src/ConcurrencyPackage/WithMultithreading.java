package ConcurrencyPackage;
class Good1 extends Thread{
	@Override
	public void run(){
	for(int i=0; i<10; i++) {
		System.out.println("Good");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			
		}
		}
	}
}

class Morning1 extends Thread{
	@Override
	public void run(){
	for(int i=0; i<10; i++) { 
		System.out.println("Morning");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			
		}
		}
	}
}

public class WithMultithreading {

	public static void main(String[] args) throws InterruptedException {
		Good1 g= new Good1();
		g.start(); //10 seconds     //start method invokes the run method 
		Morning1 m = new Morning1();
		m.start(); //10 seconds
	}

}
