package homework;

public class Abroad extends Courier {
	
		public Abroad() {
			this.level = Courier.ABROAD;
		}

		@Override
		protected void writeMessage(String message) {
			System.out.println("Shipping Location: " + message);
		}
}
