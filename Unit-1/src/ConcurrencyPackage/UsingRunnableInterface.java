package ConcurrencyPackage;
class Hi implements Runnable{//.implementing runnable interfcae
	@Override
	public void run(){
	for(int i=0; i<10; i++) {
		System.out.println("Hi");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			
		}
		}
	}
}

class Hello implements Runnable{
	@Override
	public void run(){
	for(int i=0; i<10; i++) { 
		System.out.println("Hello");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			
		}
		}
	}
}

public class UsingRunnableInterface {

	public static void main(String[] args) throws InterruptedException {
		Hi h = new Hi();//this is not a thread
		Thread t1 = new Thread(h);//now the object h is a thread in t1
		Hello he = new Hello();
		Thread t2 = new Thread(he);
		t1.start();
		t2.start();
		
	}

}
