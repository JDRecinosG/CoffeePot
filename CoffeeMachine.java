//Gilbert Roos, Daniel Garcia, Juan Recinos, Matthew Maldonado



/**The CoffeeMachine class is where we store the amount of coffee, soup, and hot chocolate.
  * This class is also where we have the getAmountOfProduct(), decrementAmountOfProduct(), and getPriceOfProduct() methods.*/
public class CoffeeMachine
{
  Bank bank = new Bank();
  static double amountOfSugar;
  static  double amountOfCream;
  static double amountOfCoffee = 10;
  static  double amountOfSoup = 10;
  static  double amountOfHotChocolate = 10;
  
  ProductFactory pf = new ProductFactory();
  
  static int numOfCups = 97;
  
  //Returns the amount of specified product that is in the machine.
  public double getAmountOfProduct(String product)
  {
    if (product.contains("Coffee"))
    {
      return amountOfCoffee;
    }
    if (product.contains("Soup"))
    {
      return amountOfSoup;
    }
    if (product.contains("HotChocolate"))
    {
      return amountOfHotChocolate;
    }
    return 0;
  }
  
  //Decrements the amount of specefied product
  public void decrementAmountOfProduct(String product)
  {
    if (product.contains("Coffee"))
    {
      amountOfCoffee -= .3;
    }
    if (product.contains("Soup"))
    {
      amountOfSoup -= .3;
    }
    if (product.contains("HotChocolate"))
    {
      amountOfHotChocolate -= .3;
    }
    
  }
  
  
  //Returns the price of the specefied product.
  public double getPriceOfProduct(String product)
  {
    if (product.contains("Coffee"))
    {
      return .35;
    }
    
    if (product.contains("Soup"))
    {
      return .5;
    }
    
    if (product.contains("HotChocolate"))
    {
      return .75;
    }
    
    return 0;
  }
  
  
  
}
