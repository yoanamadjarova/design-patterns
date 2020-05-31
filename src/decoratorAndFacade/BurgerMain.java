package decoratorAndFacade;

public class BurgerMain {

		public static void main(String[]args) {
			Burger classicBurger=new Cheese(new Egg(new ClassicBurger()));
			
			System.out.println("Additions: " + classicBurger.getDescription());
			System.out.println("Price: " + classicBurger.getPrice());
		}
		
		BurgerFacade burgerFacade = new BurgerFacade();
		burgerFacade.makeclassicBurger();
		
	}

