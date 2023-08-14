package BusReservation;
import java.util.*;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class booking {
 String passengername;
 int busno;
 Date date;
 String destinationn;
 //int amountt;
	
 booking(){
  Scanner sc=new Scanner(System.in);
  System.out.println("ENTER PASSENGER NAME:");
  passengername=sc.nextLine();
  System.out.println("ENTER BUS NO:");
  busno=sc.nextInt();
  System.out.println("ENTER DATE:(dd/mm/yyyy)");
  String dateInput=sc.next();
  SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
  try {
   date=dateFormat.parse(dateInput);
  }catch(ParseException e) {
   e.printStackTrace();
  }
  System.out.println("Enter the destination: ");
  destinationn=sc.nextLine();
  sc.nextLine();
 }
 
	
 public boolean isAvailable(ArrayList<booking>bookings, ArrayList<bus>buses){
  int capacity=0;
  for(bus Bus:buses) {
   if(Bus.getBusno()==busno) {
    capacity=Bus.getCapacity();
   }
  }
  int booked=0;
  for(booking b:bookings) {
   if(b.busno==busno && b.date.equals(date)) {
    booked++;
   }
  }
  
  return booked<capacity?true:false;
  
 }
 public void destprice(int busno) {
	// this.busno=busno;
	 int amount=0;
	 if(busno==1) {
		 amount+=500;
		 System.out.println("Destination: Chennai");

		 System.out.println("Amount: "+amount);
		 
	 }
	 if(busno==2) {
		 amount+=700;
		 System.out.println("Destination: Madurai");

		 System.out.println("Amount: "+amount);
		 
	 }
	 if(busno==3) {
		 amount+=900;
		 System.out.println("Destination: Trichy");
		 System.out.println("Amount: "+amount);
		 
	 }
	 	 
 }
 public void ticket() {
	 System.out.println("------Ticket------");
	 System.out.println("Passanger Name: "+passengername);
	 System.out.println("Bus No: "+busno);
	 System.out.println("Date:  "+date);
	 destprice(busno);
	 System.out.println("--------------------");

 }

 
}