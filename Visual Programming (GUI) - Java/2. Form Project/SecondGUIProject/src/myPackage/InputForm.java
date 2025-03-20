package myPackage;

import java.awt.*;
import javax.swing.*;


public class InputForm extends JFrame
{
	JPanel panelOne, panelTwo, panelThree;
	
	JLabel welcome, labelOne, labelTwo, labelThree, labelFour, labelFive;
	
	JTextField textOne, textTwo;
	
	JButton buttonOne, buttonTwo;
	
	JRadioButton radioOne, radioTwo, radioThree, radioFour;
	
	ButtonGroup groupOne, groupTwo, groupThree;
	
	JCheckBox checkOne, checkTwo, checkThree;
	
	JPasswordField password;
	
	JMenu menuOne,
		  menuTwo,
		  menuThree;
	JMenuItem item1M1, item2M1, item3M1, item4M1;
	JMenuItem item1M2, item2M2, item3M2, item4M2;
	JMenuItem item1M3, item2M3, item3M3;
	
	JMenuBar barOne;
	
	
	public InputForm()
	{
		ExecuteForm();
	}
	
	public void ExecuteForm()
	{
		this.setTitle("Form");
		this.setSize(700, 800);

		this.setLocation(450, 20);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.setLayout(new GridLayout(3 , 1));
//		this.setLayout(new BorderLayout());
		
//		this.add(panelOne, BorderLayout.NORTH);
//		this.add(panelTwo, BorderLayout.CENTER);
//		this.add(panelThree, BorderLayout.SOUTH);
		
		panelOne = new JPanel(); //menu
		panelTwo = new JPanel(); //Form body
		panelThree = new JPanel();
		
		panelOne.setBackground(Color.LIGHT_GRAY);
		panelTwo.setBackground(Color.LIGHT_GRAY);
		panelThree.setBackground(Color.LIGHT_GRAY);
		
		this.add(panelOne);
		this.add(panelTwo);
		this.add(panelThree);
		
//--------------------PanelOne---------------------------------------
		welcome = new JLabel
				("Welcome to our Input Form,"
						+ " feel free to fill it !");
		
		welcome.setBounds(200, 250, 200, 100);
		panelOne.add(welcome);
		

		
//--------------------//Menue//--------------------------------------		
//want two objects (JMenu, JMenuBar)	
		//MenuBar has many Menu parts
		
		barOne = new JMenuBar();
		
		menuOne = new JMenu("File");
			item1M1 = new JMenuItem("New");
			item2M1 = new JMenuItem("Open");
			item3M1 = new JMenuItem("Save");
			item4M1 = new JMenuItem("Properties");
			menuOne.add(item1M1);
			menuOne.add(item2M1);
			menuOne.add(item3M1);
			menuOne.add(item4M1);
		
		menuTwo = new JMenu("Edit");
			item1M2 = new JMenuItem("Undo");
			item2M2 = new JMenuItem("Redo");
			item3M2 = new JMenuItem("Copy");
			item4M2 = new JMenuItem("Delete");
			menuTwo.add(item1M2);
			menuTwo.add(item2M2);
			menuTwo.add(item3M2);
			menuTwo.add(item4M2);
			
		menuThree = new JMenu("Help");
			item1M3 = new JMenuItem("About Us");
			item2M3 = new JMenuItem("Sponsor");
			item3M3 = new JMenuItem("Tips");
			menuThree.add(item1M3);
			menuThree.add(item2M3);
			menuThree.add(item3M3);
			
		barOne.add(menuOne);
		barOne.add(menuTwo);
		barOne.add(menuThree);
		this.setJMenuBar(barOne);
		this.setVisible(true);
		
//-------------//Panel Two (FormInput body)//-------------------------
		panelTwo.setLayout(null);
		
		labelOne = new JLabel("Full Name");
		textOne = new JTextField();
		
		labelTwo = new JLabel("Password");
		//textTwo = new JTextField();
		password = new JPasswordField();
			
		buttonOne = new JButton("Sign in");
		buttonTwo = new JButton("Sign up");
		
		
		panelTwo.add(labelOne);
		panelTwo.add(textOne);

		labelOne.setBounds(170, 10, 70, 50);
		textOne.setBounds(240, 10, 250, 50);
		
		
		panelTwo.add(labelTwo);
		//panelTwo.add(textTwo);
		panelTwo.add(password);
		
		labelTwo.setBounds(170, 80, 70, 50 );
		//textTwo.setBounds(240, 80, 250, 50);
		password.setBounds(240, 80, 250, 50);
		
		panelTwo.add(buttonOne);
		panelTwo.add(buttonTwo);
		
		buttonOne.setBounds(260, 160, 100, 50);
		buttonTwo.setBounds(370, 160, 100, 50);
//--------------------------------------------------------------------
		
//------------------//Panel Three//------------------------------------		
		panelThree.setLayout(null);
		
		labelThree = new JLabel("Gender: ");
		radioOne = new JRadioButton("Male");
		radioTwo = new JRadioButton("Female");
		
		//ButtonGroup to force the user to choose one of the radios in that group
		groupOne = new ButtonGroup();
		
		panelThree.add(labelThree);
		panelThree.add(radioOne);
		panelThree.add(radioTwo);
		
		groupOne.add(radioOne);
		groupOne.add(radioTwo);
		
		labelThree.setBounds(120, 40, 70, 50);
		radioOne.setBounds(200, 40, 70, 50)	;
		radioTwo.setBounds(460, 40, 70, 50);
		
//------------------------------------------------------------//
		
		labelFour = new JLabel("Status");
		radioThree = new JRadioButton("Single");
		radioFour = new JRadioButton("Married");
		
		groupTwo = new ButtonGroup();
		
		panelThree.add(labelFour);
		panelThree.add(radioThree);
		panelThree.add(radioFour);
		
		groupTwo.add(radioThree);
		groupTwo.add(radioFour);
		
		labelFour.setBounds(120, 110, 70, 50);
		radioThree.setBounds(200, 110, 70, 50);
		radioFour.setBounds(460, 110, 70, 50);
		
//------------------------------------------------------------//
		
		labelFive = new JLabel("Department: ");
		checkOne = new JCheckBox("IT");
		checkTwo = new JCheckBox("HR");
		checkThree =new JCheckBox("Marketing");
		
		panelThree.add(labelFive);
		panelThree.add(checkOne);
		panelThree.add(checkTwo);
		panelThree.add(checkThree);
		
		groupThree = new ButtonGroup();
		
		groupThree.add(checkOne);
		groupThree.add(checkTwo);
		groupThree.add(checkThree);
		
		labelFive.setBounds(330, 150, 100, 60);
		checkOne.setBounds(190, 200, 40, 40);
		checkThree.setBounds(320, 200, 90, 40);
		checkTwo.setBounds(495, 200, 45, 40);
		
//		
//		radioOne.setOpaque(false);
//		radioTwo.setOpaque(false);
//		radioThree.setOpaque(false);
//		radioFour.setOpaque(false);
//		
//		checkOne.setOpaque(false);
//		checkTwo.setOpaque(false);
//		checkThree.setOpaque(false);
		
	}
	
}













