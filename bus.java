package BusReservation;
public class bus{
	private int busno;
	private boolean ac;
	private int capacity;
	private String dest;
    //private int amt;
	
	
	bus(int no,boolean ac,int cap,String dest){
		this.busno=no;
		this.ac=ac;
		this.capacity=cap;
		this.dest=dest;
        
	}
	public int getBusno() {
		return busno;
	}
	
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean val) {
		ac=val;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int cap) {
		capacity=cap;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String destination) {
		dest=destination;
		
	}
	
	
	/**
	 * 
	 */
	public void displayBus() {
		System.out.println("BUS NO: "+ busno +" AC: "+ ac +" CAPACITY: "+ capacity+ " DESTINATION: "+dest);
	}
}