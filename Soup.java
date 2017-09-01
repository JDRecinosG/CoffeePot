//Gilbert Roos, Daniel Garcia, Juan Recinos, Matthew Maldonado
import javax.swing.ImageIcon;

/**The Soup class has no condiments to worry about but still has a getDescription method that returns a description of the product
  * and a getPrice method that returns the price of the product.*/
public class Soup extends Product {
  
  static final double PRICE = .50;
  
//public Soup() {}

  public String getDescription()
  {
    return "Soup!";
  }
  
  public String toString()
  {
    return "Soup";
  }

@Override
public double getPrice() {
 // TODO Auto-generated method stub
 return PRICE;
}

}
