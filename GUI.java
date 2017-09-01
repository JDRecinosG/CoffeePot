//Gilbert Roos, Daniel Garcia, Juan Recinos, Matthew Maldonado
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

/**The GUI class is the graphical user interface that the user uses to select a product, receive a product, enter money, or get their change back. */
public class GUI extends JFrame
{
  
  private JPanel jPanel;
  JPanel imagePanel;
  public JTextField currentAmountTextField = new JTextField("0");
  public BufferedImage image;
  
  JButton fiveButton = new JButton("Insert $5");
  JButton oneButton = new JButton("Insert $1");
  JButton quarterButton = new JButton("Insert $.25");
  JButton dimeButton = new JButton("Insert $.10");
  JButton nickelButton = new JButton("Insert $.05");
  JButton pennyButton = new JButton("Insert $.01");
  JRadioButton marshmallowsRadioButton = new JRadioButton("marshmallows");
  JRadioButton sugarRadioButton = new JRadioButton("Sugar");
  JRadioButton creamRadioButton = new JRadioButton("Cream");
  JRadioButton soupRadioButton = new JRadioButton("Soup $.50");
  JRadioButton coffeeRadioButton = new JRadioButton("Coffee $.35");
  JRadioButton hotChocolateRadioButton = new JRadioButton("Hot Chocolate $.75");
  JRadioButton decafRadioButton = new JRadioButton("Decaf");
  
  JLabel messageToUserLabel = new JLabel("Enter money with the buttons below");
  JLabel currentAmountLabel = new JLabel("Current Amount:");
  JLabel coinReturnLabel = new JLabel("");
  private final ButtonGroup buttonGroupProducts = new ButtonGroup();
  JButton vendButton = new JButton("Vend");
  double temp;
  Bank bank = new Bank();
  DecimalFormat df2 = new DecimalFormat( "#,###,###,##0.00" );
  JButton imgButton = new JButton("");
  
  
  //Constructor
  public GUI() {
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 821, 466);
    jPanel = new JPanel();
    imagePanel = new JPanel(); 
    setContentPane(jPanel);
    jPanel.setLayout(null);
    
    //add products to a button group so that only one can be selected at a time.
    buttonGroupProducts.add(coffeeRadioButton);
    buttonGroupProducts.add(soupRadioButton);
    buttonGroupProducts.add(hotChocolateRadioButton);
    
    //When the Coffee radio button is selected, enable the choices for condiments for coffee, and disable invalid choices.
    coffeeRadioButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) 
      {
        marshmallowsRadioButton.setEnabled(false);
        creamRadioButton.setEnabled(true);
        sugarRadioButton.setEnabled(true);
        decafRadioButton.setEnabled(true);
        marshmallowsRadioButton.setSelected(false);
      }
    });
    coffeeRadioButton.setBounds(668, 23, 109, 23);
    jPanel.add(coffeeRadioButton);
    
    //When the Soup radio button is selected, disable all condiment options.
    soupRadioButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0)
      {
        
        decafRadioButton.setEnabled(false);
        sugarRadioButton.setEnabled(false);
        creamRadioButton.setEnabled(false);
        marshmallowsRadioButton.setEnabled(false);
      }
    });
    
    
    soupRadioButton.setBounds(668, 69, 109, 23);
    jPanel.add(soupRadioButton);
    
    //When the Hot Chocolate button is pressed, disable all invalid radio buttons and enable the marshmallows radio button.
    hotChocolateRadioButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e)
      {
        marshmallowsRadioButton.setEnabled(true);
        creamRadioButton.setEnabled(false);
        sugarRadioButton.setEnabled(false);
        decafRadioButton.setEnabled(false);
      }
    });
    
    
    hotChocolateRadioButton.setBounds(668, 117, 131, 23);
    jPanel.add(hotChocolateRadioButton);
    
    
    
    sugarRadioButton.setBounds(668, 282, 109, 23);
    sugarRadioButton.setEnabled(false);
    jPanel.add(sugarRadioButton);
    
    
    creamRadioButton.setBounds(668, 256, 109, 23);
    creamRadioButton.setEnabled(false);
    jPanel.add(creamRadioButton);
    
    
    marshmallowsRadioButton.setBounds(668, 230, 109, 23);
    marshmallowsRadioButton.setEnabled(false);
    jPanel.add(marshmallowsRadioButton);
    
    decafRadioButton.setBounds( 668, 204, 109, 23);
    decafRadioButton.setEnabled(false);
    jPanel.add(decafRadioButton);
    
    currentAmountTextField = new JTextField();
    currentAmountTextField.setBounds(417, 24, 109, 20);
    jPanel.add(currentAmountTextField);
    currentAmountTextField.setColumns(10);
    currentAmountTextField.setText("0");
    currentAmountTextField.setEditable(false);
    
    
    currentAmountLabel.setBounds(315, 27, 109, 14);
    jPanel.add(currentAmountLabel);
    
    
    //Input one dollar bill.
    oneButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) 
      {
        bank.numOfOnes++;
        bank.currentAmount += 1;
        currentAmountTextField.setText("$ " + df2.format(bank.currentAmount));
      }
    });
   
    //Input quarter.
    quarterButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0)
      {
        bank.numOfQuarters++;
        bank.currentAmount += .25;
        currentAmountTextField.setText("$ " +  df2.format(bank.currentAmount));
      }
    });
    
    //Input dime.
    dimeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) 
      {
        bank.numOfDimes++;
        bank.currentAmount += .10;
        currentAmountTextField.setText("$ " +  df2.format(bank.currentAmount));
      }
    });
    
    //Input nickel.
    nickelButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) 
      {
        bank.numOfNickels++;
        bank.currentAmount += .050;
        currentAmountTextField.setText("$ " +  df2.format(bank.currentAmount));
      }
    });
    
    oneButton.setBounds(94, 365, 109, 23);
    jPanel.add(oneButton);
    
    quarterButton.setBounds(213, 365, 106, 23);
    jPanel.add(quarterButton);
    
    dimeButton.setBounds(329, 365, 123, 23);
    jPanel.add(dimeButton);
    
    nickelButton.setBounds(462, 365, 117, 23);
    jPanel.add(nickelButton);
    
    
    messageToUserLabel.setBounds(315, 55, 330, 37);
    jPanel.add(messageToUserLabel);
    JLabel currentAmountLabel = new JLabel("Current Amount:");
    
    coinReturnLabel.setBounds(315, 331, 440, 23);
    jPanel.add(coinReturnLabel);
    
    vendButton.setBounds(315, 105, 278, 99);
    
    jPanel.add(vendButton);
    
    
    //When the user presses Coin Return, call bank.coinReturn and update all textFields and Jlabels that need to be updated.
    JButton coinReturnButton = new JButton("Coin Return");
    coinReturnButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) 
      {
        coinReturnLabel.setText(bank.coinReturn(bank.currentAmount));
        bank.currentAmount = 0;
        currentAmountTextField.setText("$ " +  df2.format(bank.currentAmount));
      }
    });
    coinReturnButton.setBounds(315, 239, 278, 57);
    jPanel.add(coinReturnButton);
    imgButton.setBounds(10, 23, 270, 270);
    
    jPanel.add(imgButton);
  }//End constructor
  
  void addVendListener(ActionListener vendListener)
  {
    vendButton.addActionListener(vendListener);
  }
}
