package myPackage;

import java.awt.*;
//awt is a library that contains the(colors, events, fonts, ...)
import javax.swing.*;
//swing is a library that contains the(JFrame, JButton, Janything)

public class ScreenLayouts extends JFrame
{
	//Take objects of JButton within the frame
	JButton buttonOne = new JButton("Save");
	JButton buttonTwo = new JButton("Show");
	JButton buttonThree = new JButton("Help");
	JButton buttonFour = new JButton("Click Here");
	JButton buttonFive = new JButton("Edit");
	
	
	public ScreenLayouts()
	{
		ShowMethod();
	}
	
	public void ShowMethod()
	{
		//this : (Optional) refers to GUIScreen that inherit JFrame, but best practice
		this.setTitle("Screen");
		//setTile("Your title")
		this.setSize(500, 500);
		//setSize(width, height)
		this.setVisible(true);
		//Allow the GUI appears on the Screen
		this.setResizable(true);
		//To prevent/allow the user to change the size of the GUI 

		this.setLocation(300, 150);
		//setLocation(left, top)
			//then will show the GUI on your Pc's screen 
				//300px far away of left
				//150px far away of top
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//To be able to close the GUI
		


//Layout
	 //Use specific layout to organize your componenets
		//Layout in AWT library
   	    //Default layout → absolute 
		
		//1. FlowLayout : components show as flow on screen
			//based on the order of them in your code
		
		this.setLayout(new FlowLayout());
		
	 //define the location of the layout
		this.setLayout(new FlowLayout(FlowLayout.CENTER));//default
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		//Add marigin
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
		//FlowLayout.Direction, awayOfLeft, awayOfTop);
		
		this.add(buttonOne);
		this.add(buttonTwo);
		this.add(buttonThree);
		this.add(buttonFour);
		this.add(buttonFive);

//----------------------------------------------------------------------------------
		
		//2. GridLayout : show components in rows & columns
			//default (whitout specifing rows and columns)
		this.setLayout(new GridLayout());
		
			//(rows, columns)
		this.setLayout(new GridLayout(2,3));
		
			//(rows, columns, x, y)
		this.setLayout(new GridLayout(2,3, 15, 50));
		
		this.add(buttonOne);
		this.add(buttonTwo);
		this.add(buttonThree);
		this.add(buttonFour);
		this.add(buttonFive);
		
//----------------------------------------------------------------------------------- 

		//3. BorderLayout : show the components in different directions
			//
		this.setLayout(new BorderLayout());
		
		//(x, y)
		this.setLayout(new BorderLayout(30, 100));
		
		//add method used to add your components
		this.add(buttonOne, BorderLayout.WEST);
		this.add(buttonTwo, BorderLayout.EAST);
		this.add(buttonThree, BorderLayout.NORTH);
		this.add(buttonFour, BorderLayout.SOUTH);
		
		//CNETER : IS THE DEFAULT
		this.add(buttonFive); //Called 'Edit'

//-----------------------------------------------------------------------------------
		
		//4. Absolute Layout : customize the components as you want
		//Absolute Layout (default)
		this.setLayout(null);
		//buttonOne.setBounds(x ,y, width, height);
		buttonOne.setBounds(20, 40, 150, 150);
			//Width(x) : in (20, .., 150) : place let 20px and width 150
				// x buttonOne : 20 + 150 → 170
				//frameWidth is 500 - 170 = 330px left
			
			//Height : in 40 + 150 = 190
				//framwHeight is 500 - 190 = 310
		
		
		buttonTwo.setBounds(170, 190, 320, 310 );
				//x buttonTow : 170 means x of b2 will start at the end of buttonOne
				
				//190 means buttonTwo y-axis will start at the end of buttonOne height
				//y buttonTwo : 330(the left y-pixles)
		
	}
}


















