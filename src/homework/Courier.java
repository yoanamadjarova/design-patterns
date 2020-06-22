package homework;

public abstract class Courier {
	public static int ABROAD = 1;
	public static int BULGARIA = 2;
	public static int PLOVDIV = 3;
	
	protected int level;
	
	protected Courier nextCourier;
	
	public void setNextCourier(Courier nextCourier) {
		this.nextCourier = nextCourier;
	}
	
	public void logMessage(int level, String message) {
		
		if(this.level <= level) {
			
			this.writeMessage(message);
		}
		
		if(this.nextCourier != null) {
			this.nextCourier.logMessage(level, message);
		}
		
	}
	
	abstract protected void writeMessage(String message);
}
