package myPackage;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class Practice extends JFrame
{
	
	public Practice()
	{
		Execute();
		this.setVisible(true);//Set the this visible
	}
	
	public void Execute()
	{
		//Frame------------------------------------------//
		// JFrame  = a GUI window to add components to
		this.setResizable(true);//Prevent frame being resized
		this.setTitle("This is practice window");//Set title of the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exist out of application
		this.setSize(800,800);//Set X-dimension (horizontal), Y-dimension (vertical)
			//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//HIDE the exist out of application
			//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//Prevent the user to close the application
		
		//Icone------------------------------------------//
		ImageIcon icone = new ImageIcon("logo1.jpg");
		this.setIconImage(icone.getImage());
		
		//Background Color------------------------------------------//
		this.getContentPane().setBackground(Color.DARK_GRAY);	
		
		//JLabel & Image------------------------------------------//
		JLabel label = new JLabel("How are you?");//Set text of label
			//label.setText("How are you?");//Do the same thing 
		this.add(label);
		
		ImageIcon image = new ImageIcon("MyImg.jpeg");
		label.setIcon(image);
		
		label.setHorizontalTextPosition(JLabel.CENTER);//Set the text left, right, center of the image icon
		label.setVerticalTextPosition(JLabel.TOP);//Set the text top or bottom of the image icon
		label.setIconTextGap(10);//Set the padding from the image (+ → far)(- → closer)
		
		Border border = BorderFactory.createLineBorder(Color.BLUE, 5);//Color, BordreSize
		label.setBorder(border);
		
		//label Font & color------------------------------------------//
		label.setForeground(Color.MAGENTA);
		label.setFont(new Font("MV Boli", Font.ITALIC, 30));//Type, Style, Size

		
		
	}
}
