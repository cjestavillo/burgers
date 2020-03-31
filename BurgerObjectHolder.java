public class BurgerObjectHolder {
  public static void main(String[] args) {
    Burger cheeseburger = new Burger();

    cheeseburger.name = "Cheese Burger";
    cheeseburger.price = 40.00;
    cheeseburger.cheese = true;
    cheeseburger.lettuce = false;

    // call cheeseburger functions
    cheeseburger.getCheese();
    cheeseburger.getLettuce();

    // print 
    System.out.println("Your burger is " + cheeseburger.name + 
      ", which costs " + cheeseburger.price + ", " + cheeseburger.hasCheese + 
      " and " + cheeseburger.hasLettuce + ".");
  }
}
