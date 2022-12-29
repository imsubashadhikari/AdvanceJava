package ConcurrencyPackage;

class CSITBookingSystem {
	int csit_seats = 48;

	public synchronized void bookSeat(int seats) { 
		
		System.out.println("I am sysnchronized");
		//synchronized(this){} //<-----  Can do this where we need synchronized
		if(csit_seats>=seats) {
			System.out.println(seats+ " seats are booked sucessfully");
			csit_seats = csit_seats - seats;
			System.out.println(csit_seats+ " seats are available");
		}
		else {
			System.out.println(seats + " seats are not available.");
			System.out.println(csit_seats+ "  seats are available");
		}
	}
}

public class Synchronzation extends Thread {
	static CSITBookingSystem cbs;
	int seats;
	@Override
	public void run() {
		cbs.bookSeat(seats);
	}


	public static void main(String[] args) {
		cbs = new CSITBookingSystem();
		Synchronzation subash = new Synchronzation();
		subash.seats = 15;
		subash.start();
		
		Synchronzation deshant = new Synchronzation();
		deshant.seats = 15;
		deshant.start();
		
		Synchronzation dhiraj = new Synchronzation();
		dhiraj.seats = 5;
		dhiraj.start();
		
		Synchronzation ridesh = new Synchronzation();
		ridesh.seats = 15;
		ridesh.start();
		
		
		
		// TODO Auto-generated method stub

	}

}
