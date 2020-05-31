package decoratorAndFacade;

public class Cheese extends AdditionsDecorator {

	public Cheese(Burger newBurger) {
		super(newBurger);
		
		System.out.println("Adding Cheese");
		
	}
		
		public String getDescription(){
			
			return decoratedBurger.getDescription() + "Extra cheese ";
		}
		
		public double getPrice() {
			return decoratedBurger.getPrice() + 1.00;
		
	}

		@Override
		public void make() {
			
			
		}

}
