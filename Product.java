//Gilbert Roos, Daniel Garcia, Juan Recinos, Matthew Maldonado
import javax.swing.ImageIcon;

/**The Product class is abstract and provides the templates for the necessary methods its children will need to implement.
  * This class also makes it easier to refer to all its subclasses uniformly, which results in less necessary code.*/
public abstract class Product {
  
  public abstract String  getDescription();
  
  public abstract double getPrice();
}
