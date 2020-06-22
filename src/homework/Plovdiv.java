package homework;

public class Plovdiv extends Courier {
	
		public Plovdiv() {
			this.level = Courier.PLOVDIV;
		}

		@Override
		protected void writeMessage(String message) {
			System.out.println("Shiping locations: " + message);
		}
}
