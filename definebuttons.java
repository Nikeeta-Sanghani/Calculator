package calproclassed;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class definebuttons  implements ActionListener{
	
	
	protected JTextField textField;
	public static  JButton b1, b2, b3, b4, b5, b6 , b7 , b8, b9, b0, bsquare,bsquareroot,bsignchange,bdel;
	protected JButton buttonpressed;
	protected JButton bPlus,bSub,bDiv,bMul;
	protected JButton bClear;
	protected JButton bEqu;
	double firstNumber=0, secondNumber=0, result=0, answer=0,previousnumber=0,currentnumber=0;
	int loopnumber=0;
	String EnterNumber="",lastkey="",currentkey="",actionCommand="", secondlastkey="";
	Border bordertextfield,borderdisplaytext,borderframe;
	String operations="";
	private JTextField displaytext;
	private static final String Superscript_TWO = "\u00b2";
	private static final String Squareroot = "\u221a";	 
	
	//
	// default constructor
	//}
	public definebuttons()
	{
		calproclassed.numbers= new JPanel();
		calproclassed.displays= new JPanel();
		calproclassed.operators= new JPanel();
		
		
		// defining how number buttons will be displayed below
		
		calproclassed.numbers.setLayout(new GridLayout(4,4,2,2)); // x, y, horizontal gap , vertical gap
		calproclassed.numbers.setBounds(0,101,400,400);  // x , y , width , height 

		calproclassed.displays.setLayout(new GridLayout(2,1,2,2));
		calproclassed.displays.setBounds(0,0,400,100);
		
		
		displaytext = new JTextField();
		displaytext.setBorder(borderdisplaytext);
		Border border=BorderFactory.createLineBorder(Color.orange, 1);
		Border border1=BorderFactory.createLineBorder(Color.PINK, 2);
		Border border2=BorderFactory.createLineBorder(Color.BLACK, 2);
		Border border3=BorderFactory.createLineBorder(Color.BLUE,2);
		displaytext.setBorder(border);
		displaytext.setHorizontalAlignment(SwingConstants.RIGHT);
		displaytext.setForeground(Color.BLACK);
		displaytext.setBackground(Color.lightGray);
		displaytext.setFont(new Font("Tahoma", Font.PLAIN, 24));
		calproclassed.displays.add(displaytext);
		displaytext.setColumns(10);
		displaytext.setEditable(false);
		
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBorder(bordertextfield);
	    textField.setBorder(border);
		calproclassed.displays.add(textField);
		textField.setColumns(10);
		
		
		b1= new JButton("1");
		b1.setBorder(border1);
		b2= new JButton("2");
		b2.setBorder(border1);
		b3= new JButton("3");
		b3.setBorder(border1);
		b4= new JButton("4");
		b4.setBorder(border1);
		b5= new JButton("5");
		b5.setBorder(border1);
		b6= new JButton("6");
		b6.setBorder(border1);
		b7= new JButton("7");
		b7.setBorder(border1);
		b8= new JButton("8");
		b8.setBorder(border1);
		b9= new JButton("9");
		b9.setBorder(border1);
		b0= new JButton("0");
		b0.setBorder(border1);
		bPlus=new JButton("+");
		bPlus.setBorder(border2);
		bSub=new JButton("-");
		bSub.setBorder(border2);
		bDiv=new JButton("/");
		bDiv.setBorder(border2);
		bMul=new JButton("*");
		bMul.setBorder(border2);
		bEqu= new JButton("=");
		bEqu.setBorder(border3);
		bClear= new JButton("c");
		bClear.setBorder(border3);
		bsquare=new JButton("x"+Superscript_TWO);
		bsquare.setBorder(border2);
		bsquareroot=new JButton(Squareroot);
		bsquareroot.setBorder(border2);
		bdel=new JButton("del");
		bdel.setBorder(border3);
		bsignchange=new JButton("+-");
		bsignchange.setBorder(border2);
		
		b1.setBackground(Color.black);
		b2.setBackground(Color.black);
		b3.setBackground(Color.black);
		b4.setBackground(Color.black);
		b5.setBackground(Color.black);
		b6.setBackground(Color.black);
		b7.setBackground(Color.black);
		b8.setBackground(Color.black);
		b9.setBackground(Color.black);
		b0.setBackground(Color.black);
		bPlus.setBackground(Color.PINK);
		bSub.setBackground(Color.PINK);
		bMul.setBackground(Color.PINK);
		bDiv.setBackground(Color.PINK);
		bEqu.setBackground(Color.cyan);
		bClear.setBackground(Color.cyan);
		bsquare.setBackground(Color.PINK);
		bsquareroot.setBackground(Color.PINK);
		bdel.setBackground(Color.cyan);
		bsignchange.setBackground(Color.PINK);
		//b1.setBackground(Color.GREEN.brighter());
		
		
		b1.setForeground(Color.getHSBColor(64, 100, 100));	
		b1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		b2.setForeground(Color.getHSBColor(64, 100, 100));	
		b2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		b3.setForeground(Color.getHSBColor(64, 100, 100));	
		b3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		b4.setForeground(Color.getHSBColor(64, 100, 100));	
		b4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		b5.setForeground(Color.getHSBColor(64, 100, 100));	
		b5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		b6.setForeground(Color.getHSBColor(64, 100, 100));	
		b6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		b7.setForeground(Color.getHSBColor(64, 100, 100));	
		b7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		b8.setForeground(Color.getHSBColor(64, 100, 100));	
		b8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		b9.setForeground(Color.getHSBColor(64, 100, 100));	
		b9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		b0.setForeground(Color.getHSBColor(64, 100, 100));	
		b0.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		
		bPlus.setFont(new Font("Tahoma", Font.PLAIN, 24));
		bSub.setFont(new Font("Tahoma", Font.PLAIN, 24));
		bDiv.setFont(new Font("Tahoma", Font.PLAIN, 24));
		bMul.setFont(new Font("Tahoma", Font.PLAIN, 24));
		bsquare.setFont(new Font("Tahoma", Font.PLAIN, 24));
		bsquareroot.setFont(new Font("Tahoma", Font.PLAIN, 24));
		bEqu.setFont(new Font("Tahoma", Font.PLAIN, 24));
		bClear.setFont(new Font("Tahoma", Font.PLAIN, 24));
		bsignchange.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		calproclassed.numbers.add(b1);
		calproclassed.numbers.add(b2);
		calproclassed.numbers.add(b3);
		calproclassed.numbers.add(bPlus);
		calproclassed.numbers.add(bdel);
		calproclassed.numbers.add(b4);
		calproclassed.numbers.add(b5);
		calproclassed.numbers.add(b6);
		calproclassed.numbers.add(bSub);
		calproclassed.numbers.add(bsquare);
		calproclassed.numbers.add(b7);
		calproclassed.numbers.add(b8);
		calproclassed.numbers.add(b9);
		calproclassed.numbers.add(bDiv);
		calproclassed.numbers.add(bsquareroot);
		calproclassed.numbers.add(bEqu);
		calproclassed.numbers.add(bClear); 
		calproclassed.numbers.add(b0);
		calproclassed.numbers.add(bMul);
		calproclassed.numbers.add(bsignchange);

		
		
		b1.setVisible(true);
		b2.setVisible(true);
		b3.setVisible(true);
		b4.setVisible(true);
		b5.setVisible(true);
		b6.setVisible(true);
		b7.setVisible(true);
		b8.setVisible(true);
		b9.setVisible(true);
		b0.setVisible(true);
		bPlus.setVisible(true);
		bSub.setVisible(true);
		bDiv.setVisible(true);
		bMul.setVisible(true);
		bEqu.setVisible(true);
		bClear.setVisible(true); 
		textField.setVisible(true);
		displaytext.setVisible(true);
		bsquare.setVisible(true);
		bsquareroot.setVisible(true);
		bdel.setVisible(true);
		bsignchange.setVisible(true);
		
		
		b1.addActionListener((ActionListener) this);
		b2.addActionListener((ActionListener) this);
		b3.addActionListener((ActionListener) this);
		b4.addActionListener((ActionListener) this);
		b5.addActionListener((ActionListener) this);
		b6.addActionListener((ActionListener) this);
		b7.addActionListener((ActionListener) this);
		b8.addActionListener((ActionListener) this);
		b9.addActionListener((ActionListener) this);
		bPlus.addActionListener((ActionListener) this);
		bSub.addActionListener((ActionListener) this);
		bDiv.addActionListener((ActionListener) this);
		bMul.addActionListener((ActionListener) this);
		bEqu.addActionListener((ActionListener) this);
		bClear.addActionListener((ActionListener)this);
		bsquare.addActionListener((ActionListener) this);
		bsquareroot.addActionListener((ActionListener) this);
		bdel.addActionListener((ActionListener) this);
		bsignchange.addActionListener((ActionListener) this);
		
		
		b1.setActionCommand("b1");
		b2.setActionCommand("b2");
		b3.setActionCommand("b3");
		b4.setActionCommand("b4");
		b5.setActionCommand("b5");
		b6.setActionCommand("b6");
		b7.setActionCommand("b7");
		b8.setActionCommand("b8");
		b9.setActionCommand("b9");
		bPlus.setActionCommand("bPlus");
		bSub.setActionCommand("bSub");
		bDiv.setActionCommand("bDiv");
		bMul.setActionCommand("bMul");
		bEqu.setActionCommand("bEqu");
		bClear.setActionCommand("bClear");
		bsquare.setActionCommand("bsquare");
		bsquareroot.setActionCommand("bsquareroot");
		bdel.setActionCommand("bdel");
		bsignchange.setActionCommand("bsignchange");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    	/* First of all initialized the loop number 
	    	 * This will be helpful to put the button pressed in the correct array of keys pressed
	    	 * then check if the button pressed is either number or operator
	    	 * if number simply take the button assigned value and store it inside the EnterNumber and repaint the textfield to show the number
	    	 */
	    	loopnumber++;
	    	buttonpressed= ((JButton) e.getSource());
		actionCommand = ((JButton) e.getSource()).getActionCommand();
		secondlastkey=lastkey;
		lastkey=currentkey;
		currentkey=buttonpressed.getText();
		//EnterNumber=textField.getText()+buttonpressed.getText();     // take the value from text field only and only when there is something in it otherwise it will become null or empty
		 //textField.setText(EnterNumber);
		
		switch(actionCommand)
		{
		
		case "b1":
			{
			    getnumber();
			   
			    break;
			}
		case "b2":
			{
			
			  getnumber();
			  break;
			}
		case "b3":
			{
			   getnumber();
			    
			    break;
			}
		case "b4":
			{
			    getnumber();
			    
			    break;
			}
		case "b5":
			{
			   getnumber();
			    break;
			}
		case "b6":
			{
			    getnumber();
			    break;
			}
		case "b7":
			{
			    getnumber();
			    break;
			}
		case "b8":
			{
			    getnumber();
			    break; 
			}
		case "b9":
			{
			    getnumber();
			    break;
			}
		case "b0":
			{
			    getnumber();
			    break;
			}
			
			
			
		case "bPlus":
			{


			    if(checkpending())
			
			   {
			       
			       displaytext.setText(result+" "+"+");
			       operation();
			       operations="+";
			   }
		
			    //  following three lines will be executed in case it is first time
			   else {
			       			       
			    operations="+";
			    operationplus();
			    }
			
			   textField.setText("");
			   // textField.setText(String.valueOf(result));
			    break;
			}
		case "bSub":
			{
			
			    if(checkpending()) // if pending do it
			
				
			    {
				displaytext.setText(result+" "+"-");
				operation();
				operations="-";
			
			    }
			    else
			    {operations="-";
			    operationsub();
			    } 
			    textField.setText("");
			    break;
			}
		case "bDiv":
		    
			{
			if(checkpending()) // if pending do it
			   
			    {
				displaytext.setText(result+" "+"/");
				operation();
				operations="/";
				break;
			    }
			    
			    else
			    {
			    operations="/";
			    operationdiv();
			    }
			    textField.setText("");
			    break;
			}
		case "bMul":
			{
			   if(checkpending()) // if pending do it
			    
			    {
				 displaytext.setText(result+" "+"*");
				    	operation();
					operations="*";
					break;
			    }
			    else
			    {

			    operations="*";
			    operationmul();
			    }
			    textField.setText("");
			    break;
			}
		case "bEqu":
			{
			    operation();
			    break;
			}
		case "bClear":
			{
			    operationclear();
			    break;
			}
			
		case "bsquare":
		{
		  
		   if(checkpending())
		
		   {
		     
		       displaytext.setText(result+" "+Superscript_TWO);
		       operation();
		       
		       operations="square";
		       operationsquare();
		     
		       
		   }
	
		    //  following three lines will be executed in csae it is first time
		   else {
		    operations="square";
		    operationsquare();
		    }
		   textField.setText("");
		   // textField.setText(String.valueOf(result));
		    break;
		}

		case "bsquareroot":
		{
		   if(checkpending())
		
		   {
		       
		       displaytext.setText(result+" "+Squareroot); // this display needs to change as we dont know what operation is going on +-/*
		       operation();
		     
		       operations="squareroot";
		       operationsquareroot();
		   }
	
		    //  following three lines will be executed in csae it is first time
		   else {
		    operations="squareroot";
		    operationsquareroot();
		    }
		   textField.setText("");
		   // textField.setText(String.valueOf(result));
		    break;
		}

		
		case "bdel":
		{
		    //dont check pending as we are just removing the last digit
		  if(checkpending())
		
		   {
		 		      
		      displaytext.setText(result+" "+operations); // this line needs to change as we dont know what operation is going on +-/*
		      operationdel();
		    }
		   
		    break;
		}

		
		case "bsignchange":
		{

		    // unlike other operations here you don't calculate result as this is just changing sign of the textField entered number also don't set text field to "'" as still result calculations are pending
		       operationsignchange();
		    }
		    break;
		} // end of action command

		
	}// end of actionperformed action listener
		
		
		private void operationsquare() {
		    
		    
		    /*
		     * For square you dont need to check the loop number as square can be calculated for even one number no second number required
		     */
		    
			
				appendresult();
				displaytext.setText(String.valueOf(result)+Superscript_TWO);
				textField.setText("");
		    
		    
	
	    
	}  // end of method operationsquare

		private void operationsquareroot() {
		    
		    appendresult();
		    displaytext.setText(String.valueOf(result)+Squareroot);
		    textField.setText("");
	   
	    
	}

		private void operationdel() {
		    if (!textField.getText().isBlank())
		    {

			EnterNumber=textField.getText();
			textField.setText(EnterNumber);
			int textfieldlength=EnterNumber.length();
		    
			if(textfieldlength==0)
				{
			    		//EnterNumber=String.valueOf(0); // set the display to zero as there was only one number and after del now no number
			    		EnterNumber="";
				}
		    
			else
				{
			    	// 	now parse the string and remove the last number
			    	EnterNumber=EnterNumber.substring(0, textfieldlength-1);
			
				}
		 //  if (!EnterNumber.isBlank())
		       if (!EnterNumber.isBlank())
			secondNumber=Double.parseDouble(EnterNumber);
		    textField.setText(EnterNumber);
		    } // end of if textfiled is blank
		    
		    
	    // TODO Auto-generated method stub
	    
	}// end of method

		private void operationsignchange() {
		   
		   if (!textField.getText().isBlank())
		   {
		   textField.setText(String.valueOf(-Double.parseDouble(textField.getText())));
		   if (secondNumber !=0)
		   {
		       
		       secondNumber=Double.parseDouble(textField.getText());
		   }
		} // end of outer if
		  // displaytext.setText(String.valueOf(result));
	   
	    
	} // end of method operationssignchange

		private  boolean checkpending() {

		    
		    	if(!operations.isEmpty())
		    	{
		    	if (loopnumber>2)			// go to complete pending operations only if the loop number is more than 2 i.e. not first time // this method breaks if you enter 2 digit number first time itself
		    		    	if(!textField.getText().isBlank())
		    		    	{
		    		 	
		    		    	    return true;
		    		   
		    		    	}
			}
		    		return false; 
	    
	}  // end of method checkpending

		private void getnumber() {
	    
		    EnterNumber=textField.getText().concat(currentkey);  // this would be better way to add string rather than + sign
		   
		    //EnterNumber=textField.getText()+currentkey;
		    textField.setText(EnterNumber);
		    if (loopnumber==1)
			{
				firstNumber=Double.parseDouble(EnterNumber);
				result=firstNumber;
			}
			else
			{
				secondNumber=Double.parseDouble(EnterNumber);
				
				// operation();  // enable this if you want results to be calculated immediately after entering the number
			}
		    
	    
	} // end of method getnumber

		private void operationclear() {
		    	textField.setText("");
			displaytext.setText("");
			firstNumber=0;
			secondNumber=0;
			result=0;
			loopnumber=0;
			operations="";
	} // end of method getnumber

	
	/*
	 * Main calculations start here	
	 */
	private void operation() {
	 
	
		    switch(operations)
		    {
		    
		    case "+":
			{
			   
			    displaytext.setText(String.valueOf(result)+ " + ");
			   
			    operationplus();
			    
			}
			    break;
			case "-":
			{
			    displaytext.setText(String.valueOf(result)+ " - ");
			    operationsub();
			}
			    break;
			case "/":
			{
			    displaytext.setText(String.valueOf(result)+ " / ");
			    operationdiv();
			}
			    break;
			case "*":
			{
			    displaytext.setText(String.valueOf(result)+ " * ");
			    operationmul();
			}
			    break;
			    
			case "square":
			{
			    
			    displaytext.setText(String.valueOf(result)+ Superscript_TWO);
			    operationsquare();
			}
			    break;    
			case "squareroot":
			{
			    displaytext.setText(String.valueOf(result)+ Squareroot);
			    operationsquareroot();
			}
			    break;    
			    
			case "removelastdigit":
			{
			   // displaytext.setText(String.valueOf(result));
			    operationdel();
			}
			    break;    
			    
			    
			case "signchange": // this code in case can be removed as we are not setting anywhere operations as signchange
			{
			    displaytext.setText(String.valueOf(result));
			    operationsignchange();
			}
			    break;    
			    
			    
			    
		   } // end of switch operations
	
		} // end of  method operation

	
	private void appendresult() {
	
	  
	    
	  if (!textField.getText().isBlank()) // this condition is required when someone wants to continously do repeatative calclulations where next number will be calculated with the results directly
	    { 	

		switch(operations)
		{

		case "+":
		    result+=Double.parseDouble(textField.getText());
		    // result+=Double.parseDouble(textField.getText());	// means result needs to be appended
		    break;
   
		case "-":
		    result-=Double.parseDouble(textField.getText());	// means result needs to be appended
		    break;
		    
		case "/":
		    result/=Double.parseDouble(textField.getText());	// means result needs to be appended
		    break;
		    
		case "*":
		    result*=Double.parseDouble(EnterNumber);
		    break;   
		case"square":
		    	result*=result;
		    	break;
		case"squareroot":
		    	result=Math.sqrt(result);
		    	break;
		case "del":
		    break;
		    // right logic to remove lastdigit 
		case "signchange":
		    // right logic to change the sign 
		   break; 
		} // end of switch
		 
	    
	  } // end of if textfield not blank
	    
	    else  {
		
	
		switch(operations)
		{
			case "square":
			    result*=result;
			    displaytext.setText(String.valueOf(result)+ Superscript_TWO);
			    break;
			case "squareroot":
			    
			    result=Math.sqrt(result);
			    displaytext.setText(String.valueOf(result)+ Squareroot);
			    break;
		} // end of switch operations for else textfield blank
	    } // end of else
	    
	}  // end of append result

	private void assignresult() {
		result=Double.parseDouble(textField.getText());   // first time number entered so simply assign
	}

	
	
private void operationplus() {
	    
    		
	    if (displaytext.getText().isEmpty())    // means running for the first time // this loopnumber will not work
		{
		
		
			assignresult();
			displaytext.setText(String.valueOf(result)+"+");
	
		} // end of loop number 2 
	else
		{
	
	    		
	    
	    		appendresult();
	    		
	    		
	    		if(!textField.getText().isBlank())  
	    		{// if we are coming after = operations means settext has been set to blank so dont append the display
	    		    
	    		displaytext.setText(displaytext.getText()+secondNumber+"="+result);}
	
		}  // end of else of loop number 2
		textField.setText("");
	    
	}  //end of method operationplus
	
	
	
	private void operationsub() {

	    	
	    if (loopnumber==2)    // means running for the first time
		{
			assignresult();
			displaytext.setText(String.valueOf(result)+"-");
		} // end of loop number 2 
	else
		{
	    		
	    		appendresult();
	    		if(!textField.getText().isBlank())
	    		displaytext.setText(displaytext.getText()+secondNumber+"="+result);
		}  // end of else of loop number 2

		textField.setText("");
	
	    // TODO Auto-generated method stub
	    
	}

	private void operationdiv() {
		   
	    if (loopnumber==2)    // means running for the first time
		{
			
			assignresult();
			displaytext.setText(String.valueOf(result)+"/");
	
		} // end of loop number 2 
	else
		{

	    		appendresult();
	    		if(!textField.getText().isBlank())
	    		displaytext.setText(displaytext.getText()+secondNumber+"="+result);
	
		}  // end of else of loop number 2

		textField.setText("");
	    
	} // end of method operationdiv
	

	private void operationmul()
	{
	    
	    //if (loopnumber==2)    // means running for the first time loopnumber is not the proper way
		if(displaytext.getText().isBlank())  // this means there are no prior operations done
	    	{
			
			assignresult();
			displaytext.setText(String.valueOf(result)+"*");
		} // end of loop number 2 
	else
		{
	    		
	    		appendresult(); 
	    		if(!textField.getText().isBlank())
	    		displaytext.setText(displaytext.getText()+secondNumber+"="+result);
		}  // end of else of loop number 2
		textField.setText("");
		
	} // end of method operationmul
	
	
}  // end of class definebuttons
