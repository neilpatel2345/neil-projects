/*HOMEWORK 5
Neil Patel
np914968@wcupa.edu
*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Calculator extends JFrame
{
     private JPanel panel;
     final int WINDOW_WIDTH = 350;
     final int WINDOW_HEIGHT = 300;
     private JButton button1;
     private JButton button2;
     private JButton button3;
     private JButton button4;
     private JButton button5;
     private JButton button6;
     private JButton button7;
     private JButton button8;
     private JButton button9;
     private JButton button0;
     private JButton buttonDot;
     private JButton buttonMult;
     private JButton buttonDiv;
     private JButton buttonAdd;
     private JButton buttonSub;
     private JButton buttonEqual;
     private JButton buttonClear;
     private JTextField calcTextField;
     String symbol = "";
     double num1=0;
     double num2=0;
     double answer=0;
     String detector= "tester";
    
    //CONSTRUCTOR
   public Calculator()
   { 
     //title of window
     setTitle("Calculator");
     
     //set size of window 
     setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
     
     //close button operation
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     //set Layout Manager to the content page
     setLayout(new GridLayout(4,4));
     setLayout(new BorderLayout());
     
     
     //create 14 buttons
    button1 = new JButton("1");
    button2 = new JButton("2");
    button3 = new JButton("3");
    button4 = new JButton("4");
    button5 = new JButton("5");
    button6 = new JButton("6");
    button7 = new JButton("7");
    button8 = new JButton("8");
    button9 = new JButton("9");
    button0 = new JButton("0");
    buttonDot = new JButton(".");
    buttonMult = new JButton("x");
    buttonDiv = new JButton("/");
    buttonAdd = new JButton("+");
    buttonSub = new JButton("-");
    buttonEqual = new JButton("=");
    buttonClear = new JButton("C");
    
     //Register an event listener with all 14 buttons
     button1.addActionListener(new ButtonListener());
     button2.addActionListener(new ButtonListener());
     button3.addActionListener(new ButtonListener());
     button4.addActionListener(new ButtonListener());
     button5.addActionListener(new ButtonListener());
     button6.addActionListener(new ButtonListener());
     button7.addActionListener(new ButtonListener());
     button8.addActionListener(new ButtonListener());
     button9.addActionListener(new ButtonListener());
     button0.addActionListener(new ButtonListener());
     buttonDot.addActionListener(new ButtonListener());
     buttonMult.addActionListener(new ButtonListener());
     buttonDiv.addActionListener(new ButtonListener());
     buttonAdd.addActionListener(new ButtonListener());
     buttonSub.addActionListener(new ButtonListener());
     buttonEqual.addActionListener(new ButtonListener());
     buttonClear.addActionListener(new ButtonListener());  
    
     //set the color on the buttons
     buttonMult.setForeground(Color.ORANGE);
     buttonDiv.setForeground(Color.ORANGE);
     buttonAdd.setForeground(Color.ORANGE);
     buttonSub.setForeground(Color.ORANGE);
     buttonEqual.setForeground(Color.ORANGE);

     //text field
     calcTextField = new JTextField(10);
     
     //create a panel and add the buttons to it
     panel = new JPanel();
     panel.add(button7);
     panel.add(button8);
     panel.add(button9);
     panel.add(buttonMult);
     panel.add(button4);
     panel.add(button5);
     panel.add(button6);
     panel.add(buttonSub);
     panel.add(button1);
     panel.add(button2);
     panel.add(button3);
     panel.add(buttonAdd);
     panel.add(button0);
     panel.add(buttonDiv);
     panel.add(buttonDot);
     panel.add(buttonEqual);
     panel.add(buttonClear);
     
     //create a cursor and place it to the left
     calcTextField.setHorizontalAlignment(SwingConstants.LEFT);
     
     //add the panel to the content pane
     add(panel);
     add(calcTextField,BorderLayout.NORTH);
     
     //set the background of the content page to black
     panel.setBackground(Color.BLACK);
     
     //set window visible
     setVisible(true);
   
 }  
   /**
   Private Inner Class
   */
   
  private class ButtonListener implements ActionListener
  {
   public void actionPerformed(ActionEvent e)
   {      
      //when a certain button is clicked then a certain number should be displayed in the TextField 
      if(e.getSource()==button1)
			calcTextField.setText(calcTextField.getText().concat("1"));
		
		if(e.getSource()==button2)
			calcTextField.setText(calcTextField.getText().concat("2"));
		
		if(e.getSource()==button3)
			calcTextField.setText(calcTextField.getText().concat("3"));
		
	   if(e.getSource()==button4)
			calcTextField.setText(calcTextField.getText().concat("4"));
		
		if(e.getSource()==button5)
			calcTextField.setText(calcTextField.getText().concat("5"));
		
		if(e.getSource()==button6)
			calcTextField.setText(calcTextField.getText().concat("6"));
		
		if(e.getSource()==button7)
			calcTextField.setText(calcTextField.getText().concat("7"));
		
		if(e.getSource()==button8)
			calcTextField.setText(calcTextField.getText().concat("8"));
		
		if(e.getSource()==button9)
			calcTextField.setText(calcTextField.getText().concat("9"));
		
		if(e.getSource()==button0)
			calcTextField.setText(calcTextField.getText().concat("0"));
		
		if(e.getSource()==buttonDot)
			calcTextField.setText(calcTextField.getText().concat("."));
		
		//action of the mutiply button
      if(e.getSource()==buttonMult)
		{
			num1=Double.parseDouble(calcTextField.getText());
         symbol = "x";
			calcTextField.setText("");
		}

      //action of the addition button
      if(e.getSource()==buttonAdd)
		{
			num1=Double.parseDouble(calcTextField.getText());
         symbol = "+";
			calcTextField.setText("");
		} 
		
	   //action of the divison button
      if(e.getSource()==buttonDiv)
		{
			num1=Double.parseDouble(calcTextField.getText());
         symbol = "/";
			calcTextField.setText("");
		}
		
      //action of the subtraction button
      if(e.getSource()==buttonSub)
		{
			num1=Double.parseDouble(calcTextField.getText());
         symbol = "-";
			calcTextField.setText("");
		}
      
		 //function of the clear button 
        if(e.getSource()==buttonClear)
			{
             calcTextField.setText("");
             answer=0;
             detector = "tester";
         }
      
      //action of the equal button
      if(e.getSource()==buttonEqual)
		{
			num2=Double.parseDouble(calcTextField.getText());

         //switch-case to find out what operation is being used and getting the answer
         switch(symbol)
			{
				//case 1:
            case "+": 
            answer=num1+num2;
					break;
		
				//case 2:
            case "-": 
            answer=num1-num2;
					break;
		
				//case 3:
            case "x": 
            answer=num1*num2;
					break;
		
				//case 4:
            case "/": 
            //this is to tell the user "error" if they try to divide a number by 0
            if(num2==0)
            {
               detector = "Error";
            }
            else
            {
            answer=num1/num2;
            }   
               break;
		
				default: 
            answer=0;
            break;
			}
		
			//displaying the answer into the TextField
         if(detector == "Error")
         {
            calcTextField.setText(""+detector);
         }
         else
         {
         calcTextField.setText(""+answer);
		   }
      }
        
   }
 }
   
   
   //main method
   public static void main(String[] args)
   {
      new Calculator();
   }
}
      