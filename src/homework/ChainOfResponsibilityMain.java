package homework;

public class ChainOfResponsibilityMain {
	private static Courier getChain() {
		Courier abroad = new Abroad();
		Courier bulgaria = new Bulgaria();
		Courier plovdiv = new Plovdiv();
		
		plovdiv.setNextCourier(bulgaria);
		bulgaria.setNextCourier(abroad);
		return plovdiv;
	}
	
	public static void main(String[] args) {

		Courier chain = getChain();
		chain.logMessage(2, "Shipping to cities in Bulgaria");
		chain.logMessage(1, "Shipping abroad");

	}
}
