package BusReservation;
import java.util.Scanner;
import java.util.ArrayList;
public class busdemo {
		public static void main(String[] args)  {
			    ArrayList<bus>buses=new ArrayList<bus>();
			    ArrayList<booking>bookings=new ArrayList<booking>();
			    buses.add(new bus(1,true,2,"Chennai"));
			    buses.add(new bus(2,false,60,"Madurai"));
			    buses.add(new bus(3,true,45,"Trichy"));
				int userOpt = 1;
				Scanner scanner = new Scanner(System.in);
				for(bus b:buses) {
					b.displayBus();
				}
				while(userOpt==1) {
					System.out.println("ENTER 1 TO BOOK, 2 TO EXIT!");
					userOpt = scanner.nextInt();
					if(userOpt == 1) {
						booking Bookings=new booking();
						if(Bookings.isAvailable(bookings,buses)) {
							bookings.add(Bookings);
							System.out.println("YOUR BOOKING IS CONFIRMED!");
						}
						else {
							System.out.println("SORRY BUS IS FULL!");
						}
					}
				}
		}
}
						
			