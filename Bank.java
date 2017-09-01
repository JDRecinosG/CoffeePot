//Gilbert Roos, Daniel Garcia, Juan Recinos, Matthew Maldonado

import java.util.*;

/** The BAnk class handles the everything related to money. It has an amount of nickels, dimes, quarters, and one dollar bills in the machine.
  * It also has 
  * It also has a method to return coins when the user presses the Coin Return button on the graphical user interface.*/
public class Bank
{
  
  //These next few variables are static because we'll have two instances of the Bank class and we want these amounts to remain the same across all instances.
  static int numOfQuarters = 40;
  static int numOfDimes = 40;
  static int numOfNickels = 40;
  static int numOfOnes = 0;
  static double currentAmount = 0.0; //The amount of money the current user has entered into the machine.
  
  //Method to return coins which will be called when the user presses the Coin Return button on the GUI
  public String coinReturn(double amountToReturn)
  {
    int numOfQuartersToReturn = 0, numOfDimesToReturn = 0, numOfNickelsToReturn = 0;
    
    if (numOfQuarters == 0 && numOfDimes == 0 && numOfNickels == 0)//Uf we don't have any change to return; say so.
    {
      return "No change to return";
    }
    
    if (numOfQuarters > 0)// If we run out of quarters we'll skip ahead to dimes.
    {
      while (amountToReturn >= .25)
      {
        if (numOfQuarters < 0)
          break;
        numOfQuartersToReturn++;
        numOfQuarters--;
        amountToReturn -= .25;
      }
    }
    
    if (numOfDimes > 0)//If we run out of dimes we'll skip ahead to nickels.
    {
      while (amountToReturn >= .1)
      {
        if (numOfDimes < 0)
          break;
        numOfDimesToReturn++;
        numOfDimes--;
        amountToReturn -= .1;
      }
    }
    if (numOfNickels > 0)//If we don't have any nickels to return, then skip this and return what we can. 
    {
      while (amountToReturn >= .01)
      {
        if (numOfNickels < 0)
          break;
        numOfNickelsToReturn++;
        numOfNickels--;
        amountToReturn -= .05;
      }
    }

    
    return "Returned " + numOfQuartersToReturn + " quarters " + numOfDimesToReturn + " dimes " + numOfNickelsToReturn + " nickels.";
  }
  
  
  
}







