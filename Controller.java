//Gilbert Roos, Daniel Garcia, Juan Recinos, Matthew Maldonado

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;

/**The controller class is where most of the action takes place. It has a GUI and CoffeeMachine object and uses the classes together
  * to do whatever the user needs it to do. */
public class Controller {

 private GUI gui;
 String productType = "";
 private CoffeeMachine cm;
 DecimalFormat df2 = new DecimalFormat( "#,###,###,##0.00" );//Format our output so that it's nice and neat.
 Product p = null;
 
 public Controller(GUI g, CoffeeMachine c)
 {
  this.gui = g;
  this.cm = c;
  this.gui.addVendListener(new VendListener());
 }
 
 class VendListener implements ActionListener
 {
  public void actionPerformed(ActionEvent e)
  {
   
   productType = "";//set the string to the empty string so that it won't just keep adding on to the end of the original string.
   
   //Set the productType to what the user selects
   if (gui.coffeeRadioButton.isSelected() == true)
    productType += "Coffee";
   if (gui.soupRadioButton.isSelected() == true)
    productType += "Soup";
   if (gui.hotChocolateRadioButton.isSelected() == true)
    productType += "HotChocolate";
   
   if (gui.decafRadioButton.isSelected() == true)
    productType += "Decaf";
   if (gui.sugarRadioButton.isSelected() == true)
    productType += "Sugar";
   if (gui.creamRadioButton.isSelected() == true)
    productType += "Cream";
   if (gui.marshmallowsRadioButton.isSelected() == true)
    productType += "Marshmallows";
   
   
   if (cm.numOfCups > 0)//Check and see if the CoffeeMachine has enough cups for us to make this product.
   {
    if (cm.getAmountOfProduct( productType) >= .3) //Check to see if we have enough of the product itself in the machine to make the requested product.
    {
    
      if (cm.bank.currentAmount >= cm.getPriceOfProduct(productType)) //Check to see if the user has inputed enough money.
      {
       //Now we actually make the product.
       p = cm.pf.createProduct(productType);//Will return null if not enough condiments
       cm.decrementAmountOfProduct( productType); //Decrement the amount of specefied product by .3 liters
       gui.imgButton.setIcon(new ImageIcon(productType + ".jpg"));//Output iamge based on the product selected by the user.
       cm.bank.currentAmount -= p.getPrice(); //or we could do cm.getPriceOfProduct(productType);
       gui.currentAmountTextField.setText("" + df2.format(cm.bank.currentAmount));//Update currentAmountTextField, obviously.
       
       if (p == null)//If the ProductFactory returns null, then it is because it did not have enough of the condiments requested.
       {
        gui.messageToUserLabel.setText("Not enough condiments"); //If the product factory returns null, then we didn't have enough condiments to make that item.
       }
       else
       {
        gui.messageToUserLabel.setText(p.getDescription());//If the product returned is not null, then we'll output a description of the product created.
       }
      }//end current amount > price
      else
      {
       gui.messageToUserLabel.setText("Not enough money.");
      }
     
    }//end if amount product > .3
    else
    {
     gui.messageToUserLabel.setText("Not enough of the product you selected.");
    }
   }//end if numOfcups > 0
   else
   {
    gui.messageToUserLabel.setText("Not enough cups.");
   }
   
      
  }//end action performed     
          
 }//end vendlistener class
 
 
}//end controller class
