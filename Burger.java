public class Burger {
  String name;
  double price;
  boolean cheese;
  boolean lettuce;
  String hasCheese;
  String hasLettuce;

  public void getCheese() {
    if (this.cheese == true) {
      this.hasCheese = "has cheese";
    } else {
      this.hasCheese = "has no cheese";
    }
  }

  public void getLettuce() {
    if (this.lettuce == true) {
      this.hasLettuce = "has lettuce";
    } else {
      this.hasLettuce = "has no lettuce";
    }
  }
}