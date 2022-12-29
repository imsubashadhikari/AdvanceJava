package ConcurrencyPackage;

class CSITBooking {
	static int csit_seats = 48;

	public static synchronized void bookSeat(int seats) {

		System.out.println("I am sysnchronized");
		// synchronized(this){} //<----- Can do this where we need synchronized
		if (csit_seats >= seats) {
			System.out.println(seats + " seats are booked sucessfully");
			csit_seats = csit_seats - seats;
			System.out.println(csit_seats + " seats are available");
		} else {
			System.out.println(seats + " seats are not available.");
			System.out.println(csit_seats + "  seats are available");
		}
	}
}

class Esewa extends Thread {
	CSITBooking cb;
	int seats;

	public Esewa(CSITBooking cb, int seats) {
		this.cb = cb;
		this.seats = seats;
	}

	@Override
	public void run() {
		CSITBooking.bookSeat(seats);
	}
}

//class khalti extends Thread {
//	CSITBooking cb;
//	int seats;
//
//	public Khalti( CSITBooking cb, int seats){
//		this.cb =cb;
//		this.seats = seats;
//	}
//
//	@Override
//	public void run() {
//		cb.bookSeat(seats);
//	}
//}

public class StaticSynchroniazation {

	public static void main(String[] args) {
		CSITBooking b1 = new CSITBooking();
		Esewa t1 = new Esewa(b1, 12);
		t1.start();
		
		Esewa t2 =new Esewa(b1,14);
		t2.start();
		 //different object
		CSITBooking b2 = new CSITBooking();
		Esewa e3 = new Esewa(b2,12);
		e3.start();
		
	}

}
