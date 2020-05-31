package decoratorAndFacade;

abstract class AdditionsDecorator implements Burger {

	protected Burger decoratedBurger;
	
	public AdditionsDecorator(Burger newBurger) {
		
		decoratedBurger=newBurger;
	}
	
	public String getDescription(){
	
		return decoratedBurger.getDescription();
	}
	
	public double getPrice() {
		return decoratedBurger.getPrice();
	}
}
