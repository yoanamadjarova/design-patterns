package decoratorAndFacade;

public class BurgerFacade {
 private Burger classicBurger;
 
 public BurgerFacade() {
	this.classicBurger= new ClassicBurger();
	 
 }
 
 public void makeClassicBurger() {
	 this.classicBurger.make();
 }
}