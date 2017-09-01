//Gilbert Roos, Daniel Garcia, Juan Recinos, Matthew Maldonado

/**The ProductFactory is responsible for the creation of whatever product the user wants. It is also responsible for
  * checking to see if there are enough condiments to make the product, and decrements their amounts if there is.*/
public class ProductFactory {
  
  Product p = null;
  Sugar s = new Sugar();
  Cream c = new Cream();
  Marshmallow m = new Marshmallow();
  
  public Product createProduct(String type)
  {
   
   
   //Coffee
    if(type.equals("Coffee"))
    {
      p = new Coffee(false, false, false);
    }
    if (type.equals("CoffeeSugar"))
    {
     if (s.amountOfSugar > 0)
     {
      p = new Coffee(false, true, false);
      s.amountOfSugar -= .1;
     }
     
    }
    if (type.equals("CoffeeCream"))
    {
     if (c.amountOfCream > 0)
     {
      p = new Coffee(false, false, true);
      c.amountOfCream -= .1;
     }
    }
    if (type.equals("CoffeeSugarCream"))
    {
     if (s.amountOfSugar > 0 && c.amountOfCream > 0)
     {
      p = new Coffee(false, true, true);
      s.amountOfSugar -= .1;
      c.amountOfCream -= .1;
     }
    }//End coffee
    
    
    
    //Begin decaf coffee options
    if(type.equals("CoffeeDecaf"))
    {
      p = new Coffee(true, false, false);
    }
    if (type.equals("CoffeeDecafSugar"))
    {
     if (s.amountOfSugar > 0)
     {
      p = new Coffee(true, true, false);
      s.amountOfSugar -= .1;
     }
    }
    if (type.equals("CoffeeDecafCream"))
    {
     if (c.amountOfCream > 0)
     {
      p = new Coffee(true, false, true);
      c.amountOfCream -= .1;
     }
    }
    if (type.equals("CoffeeDecafSugarCream"))
    {
     if (s.amountOfSugar > 0 && c.amountOfCream > 0)
     {
      p = new Coffee(true, true, true);
      s.amountOfSugar -= .1;
      c.amountOfCream -= .1;
     }
    }
    //End decaf coffee options.
    

    
    
    //Soup
    if (type.equals("Soup"))
    {
      p = new Soup();
    }
    

    
    
    //If user wants HotChocolate
    if (type.equals("HotChocolate"))
    {
      p = new HotChocolate(false);
    }
    if (type.equals("HotChocolateMarshmallows"))
    {
     if (m.numOfMarshmallows > 10)
     {
      p = new HotChocolate(true);
      m.numOfMarshmallows -= 10;
     }
      
    }
    
    
    return p;
  }
  
}
