//Gilbert Roos, Daniel Garcia, Juan Recinos, Matthew Maldonado

import javax.swing.ImageIcon;

/**The HotChocolate class has a constructor that determines whether or not marshmallows are needed, and a getDescription method
  * that returns a string describing the hot chocolate object. Also has a getPrice method that returns the price of the product.*/
public class HotChocolate extends Product
{
  static final double PRICE = .75;
  Marshmallow marshmallow;
  boolean hasMarshmallows;
  String marshmallowsS = "no marshmallows";
  
  
  public HotChocolate(boolean hasMarshmallows)
  {
    if (hasMarshmallows == true)
      marshmallowsS = "marshmallows";
  }//End constructor
  
  public String getDescription()
  {
    return "Serving Hot Chocolate with " + marshmallowsS;
    
  }
  
  @Override
  public double getPrice()
  {
    
    return PRICE;
  }
  
  
}
