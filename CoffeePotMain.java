//Gilbert Roos, Daniel Garcia, Juan Recinos, Matthew Maldonado

/**This is the class with the main method that runs the program. */
public class CoffeePotMain {
  
  
  public static void main(String[] args) { 
    
    
    CoffeeMachine cm = new CoffeeMachine();
    GUI gui = new GUI();
    Controller c = new Controller(gui, cm);
    gui.setVisible(true);
    
    
  }//end main
  
  
  
}
