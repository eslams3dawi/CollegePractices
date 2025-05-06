package myPackage;
import java.awt.*;
import javax.swing.*;


public class InputForm extends JFrame
{
	JPanel panelOne, panelTwo, panelThree;
	
	JLabel welcome, FullNameLabel, PasswordLabel, GenderLabel, StatusLabel, DepartmentLabel;
	
	JTextField FullNameText;
	
	JButton SignIn, SignUp;
	
	JRadioButton MaleRadio, FemaleRadio, SingleButton, MarriedButton;
	
	ButtonGroup groupOne, groupTwo, groupThree;
	
	JCheckBox ITCheckBox, HRCheckBox, MarketingCheckBox;
	
	JPasswordField password;
	
	JMenu File,
		  Edit,
		  Help;
	JMenuItem ShowPassword, HidePassword, Save, Properties;
	JMenuItem Undo, Redo, Copy, Delete;
	JMenuItem AboutUs, Sponsor, Tips;
	
	JMenuBar barOne;
	
	//----------------------------------//
	JToggleButton toggle;
	public InputForm()
	{
		ExecuteForm();
	}
	
	public void ExecuteForm()
	{
		this.setTitle("Registration Form");
		this.setSize(700, 800);

		this.setLocation(450, 20);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.setLayout(new GridLayout(3 , 1));
		
		panelOne = new JPanel(); //menu
		panelTwo = new JPanel(); //Form body
		panelThree = new JPanel();//Last
		
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
		
		File = new JMenu("View");
			ShowPassword = new JMenuItem("Show Password");
			HidePassword = new JMenuItem("Hide Password");
			Save = new JMenuItem("Reset All");
			Properties = new JMenuItem("Properties");
			File.add(ShowPassword);
			File.add(HidePassword);
			File.add(Save);
			File.add(Properties);
		
		Edit = new JMenu("Edit");
			Undo = new JMenuItem("Undo");
			Redo = new JMenuItem("Redo");
			Copy = new JMenuItem("Copy");
			Delete = new JMenuItem("Delete");
			Edit.add(Undo);
			Edit.add(Redo);
			Edit.add(Copy);
			Edit.add(Delete);
			
		Help = new JMenu("Help");
			AboutUs = new JMenuItem("About Us");
			Sponsor = new JMenuItem("Sponsor");
			Tips = new JMenuItem("Tips");
			Help.add(AboutUs);
			Help.add(Sponsor);
			Help.add(Tips);
			
		barOne.add(File);
		barOne.add(Edit);
		barOne.add(Help);
		this.setJMenuBar(barOne);
		this.setVisible(true);
		
//-------------//Panel Two (FormInput body)//-------------------------
		panelTwo.setLayout(null);
		
		FullNameLabel = new JLabel("Full Name");
		FullNameText = new JTextField();
		
		PasswordLabel = new JLabel("Password");
		//textTwo = new JTextField();
		password = new JPasswordField();
			
		SignIn = new JButton("Sign in");
		SignUp = new JButton("Sign up");
		
		
		panelTwo.add(FullNameLabel);
		panelTwo.add(FullNameText);

		FullNameLabel.setBounds(170, 10, 70, 50);
		FullNameText.setBounds(240, 10, 250, 50);
		
		
		panelTwo.add(PasswordLabel);
		//panelTwo.add(textTwo);
		panelTwo.add(password);
		
		PasswordLabel.setBounds(170, 80, 70, 50 );
		//textTwo.setBounds(240, 80, 250, 50);
		password.setBounds(240, 80, 250, 50);
		
		panelTwo.add(SignIn);
		panelTwo.add(SignUp);
		
		SignIn.setBounds(260, 160, 100, 50);
		SignUp.setBounds(370, 160, 100, 50);
//--------------------------------------------------------------------
		
//------------------//Panel Three//------------------------------------		
		panelThree.setLayout(null);
		
		GenderLabel = new JLabel("Gender: ");
		MaleRadio = new JRadioButton("Male");
		FemaleRadio = new JRadioButton("Female");
		
		//ButtonGroup to force the user to choose one of the radios in that group
		groupOne = new ButtonGroup();
		
		panelThree.add(GenderLabel);
		panelThree.add(MaleRadio);
		panelThree.add(FemaleRadio);
		
		groupOne.add(MaleRadio);
		groupOne.add(FemaleRadio);
		
		GenderLabel.setBounds(120, 40, 70, 50);
		MaleRadio.setBounds(200, 40, 70, 50)	;
		FemaleRadio.setBounds(460, 40, 70, 50);
		
//------------------------------------------------------------//
		
		StatusLabel = new JLabel("Status");
		SingleButton = new JRadioButton("Single");
		MarriedButton = new JRadioButton("Married");
		
		groupTwo = new ButtonGroup();
		
		panelThree.add(StatusLabel);
		panelThree.add(SingleButton);
		panelThree.add(MarriedButton);
		
		groupTwo.add(SingleButton);
		groupTwo.add(MarriedButton);
		
		StatusLabel.setBounds(120, 110, 70, 50);
		SingleButton.setBounds(200, 110, 70, 50);
		MarriedButton.setBounds(460, 110, 70, 50);
		
//------------------------------------------------------------//
		
		DepartmentLabel = new JLabel("Department: ");
		ITCheckBox = new JCheckBox("IT");
		HRCheckBox = new JCheckBox("HR");
		MarketingCheckBox =new JCheckBox("Marketing");
		
		panelThree.add(DepartmentLabel);
		panelThree.add(ITCheckBox);
		panelThree.add(HRCheckBox);
		panelThree.add(MarketingCheckBox);
		
		groupThree = new ButtonGroup();
		
		groupThree.add(ITCheckBox);
		groupThree.add(HRCheckBox);
		groupThree.add(MarketingCheckBox);
		
		DepartmentLabel.setBounds(330, 150, 100, 60);
		ITCheckBox.setBounds(190, 200, 40, 40);
		MarketingCheckBox.setBounds(320, 200, 90, 40);
		HRCheckBox.setBounds(495, 200, 45, 40);
		

		MaleRadio.setOpaque(false);
		FemaleRadio.setOpaque(false);
		SingleButton.setOpaque(false);
		MarriedButton.setOpaque(false);
		
		ITCheckBox.setOpaque(false);
		HRCheckBox.setOpaque(false);
		MarketingCheckBox.setOpaque(false);
		
//		toggle = new JToggleButton("Form Active");
//		toggle.addItemListener(t ->
//		{
//			if(toggle.isSelected())
//			{
//				System.out.println("Button is ON");
//			}
//			else
//			{
//				System.out.println("Button is OFF");
//			}
//		});
//		panelOne.add(toggle);
//		toggle.setBounds(125, 50, 200, 200);
	}
}











