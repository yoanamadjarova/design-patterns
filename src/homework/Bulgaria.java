package homework;

public class Bulgaria extends Courier {
	public Bulgaria() {
		this.level = Courier.BULGARIA;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Shipping location: " + message);
	}
}
