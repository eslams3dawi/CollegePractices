package PraciceModule;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


//Once user click Save
	//His data saved to the console
//Once user click Show
	//His name show in the text of panels two & three to do some actions on it


//How to use Event?
	//Implemets ActionListener for inner class
	//Override actionPerformed
	//Link to the wanted component

//With CheckBox → ItemListener

public class App extends JFrame
{
	JButton Save,  Show, Right, Left, Min, Max;
	JTextField FullName, Text;
	JPasswordField Password;
	JLabel FullNameLabel, PasswordLabel, Label3;
	
	JPanel PanelOne, PanelTwo, PanelThree;
	JRadioButton Red, Blue, Brown, Yellow, Black;
		ButtonGroup GroupOne;
	JCheckBox CheckOne, CheckTwo, CheckThree;
	
	int x = 100;
	int y = 30;
	
	Action action = new Action();
	Item item = new Item();

	public App() {
		this.setSize(500,600);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(200,200);
		
		PanelOne = new JPanel();
		PanelTwo = new JPanel();
		PanelThree = new JPanel();
		
		PanelOne.setBackground(Color.red);
		PanelTwo.setBackground(Color.YELLOW);
		PanelThree.setBackground(Color.blue);
		
		PanelOne.setSize(500, 200);
		PanelTwo.setSize(500, 200);
		PanelThree.setSize(500, 200);
		
		this.setLayout(new GridLayout(3,1));
		
		this.add(PanelOne);
		this.add(PanelTwo);
		this.add(PanelThree);
		
		
		FullNameLabel = new JLabel("FullName: ");
		FullName = new JTextField();
		
		PasswordLabel = new JLabel("Password: ");
		Password = new JPasswordField();
		
		Save = new JButton("Save");
		Show = new JButton("Show");
		
		Red = new JRadioButton("Red");
		Blue = new JRadioButton("Blue");
		Brown = new JRadioButton("Brown");
		Yellow = new JRadioButton("Yellow");
		Black = new JRadioButton("Black");
		
		GroupOne = new ButtonGroup();
		
		CheckOne = new JCheckBox("Bold");
		CheckTwo = new JCheckBox("SERIF");
		CheckThree = new JCheckBox("PLAIN");
		
		Right = new JButton("Right");
		Left = new JButton("Left");
		Min = new JButton("Min");
		Max = new JButton("Max");
		
		PanelOne.setLayout(null);
		PanelTwo.setLayout(null);
		PanelThree.setLayout(null);
		
		//PanelOne---------------------------------//
		
		FullNameLabel.setBounds(100, 30, 70, 20);
		PanelOne.add(FullNameLabel);
		FullName.setBounds(180, 30, 100, 20);
		PanelOne.add(FullName);
		
		PasswordLabel.setBounds(100, 80, 70, 20);
		PanelOne.add(PasswordLabel);
		Password.setBounds(180, 80, 100, 20);
		PanelOne.add(Password);
		
		Save.setBounds(160, 110, 70, 20);
		PanelOne.add(Save);
		Show.setBounds(240, 110, 70, 20);
		PanelOne.add(Show);

		//PanelTwo---------------------------------//
		
		Text = new JTextField();
		Text.setBounds(70, 10, 345, 25);
		PanelTwo.add(Text);
		
		Red.setBounds(65, 40, 50, 30);
		Blue.setBounds(130, 40, 60, 30);
		Brown.setBounds(205, 40, 65, 30);
		Yellow.setBounds(285, 40, 70, 30);
		Black.setBounds(370, 40, 65, 30);
		
		PanelTwo.add(Red);
		PanelTwo.add(Blue);
		PanelTwo.add(Brown);
		PanelTwo.add(Yellow);
		PanelTwo.add(Black);
		
		GroupOne.add(Red);
		GroupOne.add(Blue);
		GroupOne.add(Brown);
		GroupOne.add(Yellow);
		GroupOne.add(Black);
		
		//PanelThree---------------------------------//
		

		Label3 = new JLabel("");
		Label3.setBounds(x, 10, 345, 25);
		PanelThree.add(Label3);
		
		CheckOne.setBounds(80, 40, 60, 30);
		PanelThree.add(CheckOne);
		
		CheckTwo.setBounds(185, 40, 65, 30);
		PanelThree.add(CheckTwo);
		
		CheckThree.setBounds(295, 40, 65, 30);
		PanelThree.add(CheckThree);
		
		Right.setBounds(50, 85, 70, 30);
		PanelThree.add(Right);
		
		Left.setBounds(150, 85, 70, 30);
		PanelThree.add(Left);
		
		Min.setBounds(250, 85, 70, 30);
		PanelThree.add(Min);
		
		Max.setBounds(350, 85, 70, 30);
		PanelThree.add(Max);
	
		
		//if the event implementation in the same class
//		Save.addActionListener(this);//Link the event to the button
//		Show.addActionListener(this);
		
		//if the event implementation is not in the same class
		Save.addActionListener(action);
		Show.addActionListener(action);
		
		Red.addActionListener(action);
		Blue.addActionListener(action);
		Yellow.addActionListener(action);
		Brown.addActionListener(action);
		Black.addActionListener(action);

		Right.addActionListener(action);
		Left.addActionListener(action);
		Min.addActionListener(action);
		Max.addActionListener(action);
		
		CheckOne.addItemListener(item);
		CheckTwo.addItemListener(item);
		CheckThree.addItemListener(item);
		
		this.setVisible(true);
	}
	
//Inner class
private class Action implements ActionListener
{
	public Action() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) //Reads the action, to take the action and do reaction
	{
		String NameText;
		String PasswordText;
		if(e.getSource() == Save) //if the action ocurred on The 'Save' Button, do something
		{
			NameText = FullName.getText().toString(); 
			PasswordText = new String(Password.getPassword());//Password is JPasswordField
			
			System.out.println(NameText + " " + PasswordText);
		}
		if(e.getSource() == Show)
		{
			NameText = FullName.getText().toString(); 
			PasswordText = new String(Password.getPassword());//Password is JPasswordField 
			
			Text.setText(NameText + " " + PasswordText);
			Label3.setText("Welcome, " + NameText);
			
			FullName.setText("");
			Password.setText("");
		}
		if(e.getSource() == Red)
		{
			PanelTwo.setBackground(Color.RED);
			Text.setForeground(Color.RED);
		}
		if(e.getSource() == Blue)
		{
			PanelTwo.setBackground(Color.BLUE);
			Text.setForeground(Color.BLUE);	
		}
		if(e.getSource() == Brown)
		{
			PanelTwo.setBackground(Color.DARK_GRAY);
			Text.setForeground(Color.DARK_GRAY);	
		}
		if(e.getSource() == Yellow)
		{
			PanelTwo.setBackground(Color.YELLOW);
			Text.setForeground(Color.YELLOW);	
		}
		if(e.getSource() == Black)
		{
			PanelTwo.setBackground(Color.BLACK);
			Text.setForeground(Color.BLACK);	
		}
		
		if(e.getSource() == Right)
		{
			x += 50;
			Label3.setBounds(x, 10, 345, 25);	
		}
		if(e.getSource() == Left)
		{
			x -= 50;
			Label3.setBounds(x, 10, 345, 25);	
		}
		if(e.getSource() == Min)
		{
			
		}
		if(e.getSource() == Max)
		{
			
		}
	}
}

private class Item implements ItemListener
{
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(CheckOne.isSelected() && CheckTwo.isSelected())
		{
			Label3.setFont(new Font("atilic", Font.BOLD + Font.PLAIN, y));
		}
		else if(CheckTwo.isSelected())
		{
			Label3.setFont(new Font("atilic", Font.ROMAN_BASELINE, y));
		}
		else if(CheckThree.isSelected())
		{
			Label3.setFont(new Font("atilic", Font.ITALIC, y));
		}
	}
}
}















