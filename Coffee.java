//Gilbert Roos, Daniel Garcia, Juan Recinos, Matthew Maldonado
import javax.swing.ImageIcon;

/**The Coffee class has a constructor that determines what condiments to add and whether or not it's decaf. It also
  * has a getDescription method that returns what options for coffee have been selected by the user. Also has a getPrice method
 that returns the price of the product.*/
public class Coffee extends Product {
  
  
  static final double PRICE = .35;
  boolean hasSugar;
  boolean hasCream;
  boolean isDecaf;
  
  //The next three strings are for use in our getDescription() method.
  String sugarS = "no sugar";
  String creamS = " no cream";
  String decafS = "regular coffee ";

  public Coffee(boolean decaf, boolean s, boolean c)// We could have an image icon for each class, and set it to be whatever we want in the constructor.
  {
    hasSugar = s;
    hasCream = c;
    isDecaf = decaf;
    
    //For the toString/getDescription method.
    if (hasSugar == true)
      sugarS = "sugar";
    if (hasCream == true)
      creamS = "cream";
    if (isDecaf == true)
      decafS = "decaf coffee ";
  }
  
  //Returns a description of the type of coffee and whether or not it has cream and/or sugar.
  public String getDescription()
  {
    return "Serving " + decafS + "with " + sugarS + " and " + creamS;
  }
  
    //Returns a description of the type of coffee and whether or not it has cream and/or sugar.
  public String toString()
  {
    return "Serving " + decafS + "with " + sugarS + " and " + creamS;
  }
  
  @Override
  public double getPrice() 
  {
    return PRICE;
  }
  
  
}
