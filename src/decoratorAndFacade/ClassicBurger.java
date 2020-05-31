package decoratorAndFacade;

public class ClassicBurger implements Burger{

	@Override
	public String getDescription() {
		
		return "Classic burger ";
	}

	@Override
	public double getPrice() {
		
		return 3.00;
	}

	@Override
	public void make() {
		System.out.println("Making a Classic Burger");
		
	}
	
	
	
}