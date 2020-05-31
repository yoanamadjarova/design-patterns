package decoratorAndFacade;

public class Egg extends AdditionsDecorator {

	public Egg(Burger newBurger) {
		super(newBurger);
		
        System.out.println("Adding Egg");
		
	}
		
		public String getDescription(){
			
			return decoratedBurger.getDescription() + "Egg ";
		}
		
		public double getPrice() {
			return decoratedBurger.getPrice() + 0.50;
		
	}

		@Override
		public void make() {
			
		}

	}


