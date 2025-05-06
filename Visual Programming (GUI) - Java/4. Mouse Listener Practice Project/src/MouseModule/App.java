package MouseModule;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//MouseListener, MouseWheelListener, MouseMotionListener

public class App extends JFrame
{
	JPanel PanelOne, PanelTwo;
	JLabel LabelOne, LabelTwo;

	Mouse mouse = new Mouse();
	
	public App() 
	{
		this.setSize(400,500);
		this.setLocation(200, 200);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(2, 1));

		PanelOne = new JPanel();
		PanelTwo = new JPanel();
		
		PanelOne.setLayout(null);
		PanelTwo.setLayout(null);
		
		PanelOne.setBackground(Color.RED);
		PanelTwo.setBackground(Color.BLUE);
		this.add(PanelOne);
		this.add(PanelTwo);
		
		LabelOne = new JLabel("Welcome One");
		LabelTwo = new JLabel("Welcome Two");
		
		LabelOne.setBounds(150, 50, 100, 25);
		LabelOne.setForeground(Color.WHITE);
		PanelOne.add(LabelOne);
		
		LabelTwo.setBounds(150, 90, 100, 25);
		LabelTwo.setForeground(Color.WHITE);
		PanelTwo.add(LabelTwo);
		
		//PanelOne.addMouseListener(mouse); //Normal way
		PanelOne.addMouseListener(new MouseAdapter() //Adapter way: to use only the method with spceific component
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{ //Hover
				LabelOne.setText("Mouse entered on label one");
				PanelOne.setBackground(Color.green);
				
			}

			@Override
			public void mouseExited(MouseEvent e) 
			{ //Return the original state
				LabelOne.setText("Welcome One");
				PanelOne.setBackground(Color.RED);
				
			}
		});
		
		//PanelTwo.addMouseListener(mouse);
		PanelTwo.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				PanelTwo.setBackground(Color.CYAN);
				
			}	
		});
		//PanelTwo.addMouseMotionListener(mouse);
		PanelTwo.addMouseMotionListener(new MouseMotionAdapter() 
		{	
			@Override
			public void mouseMoved(MouseEvent e) {
				LabelTwo.setText(e.getX() + ", " + e.getY());
			}
		});
		
		
		
		this.setVisible(true);
	}

	//Mouse Event class is class have properties to apply the action you want
	private class Mouse implements MouseListener, MouseWheelListener, MouseMotionListener
	{
		@Override
		public void mouseClicked(MouseEvent e) {
			PanelTwo.setBackground(Color.CYAN);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {//Keyboard
			if(e.isAltDown())
			{
				LabelOne.setText("Alt");
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) { //Hover
			LabelOne.setText("Mouse entered on label one");
			PanelOne.setBackground(Color.green);
			
		}

		@Override
		public void mouseExited(MouseEvent e) { //Return the original state
			LabelOne.setText("Welcome One");
			PanelOne.setBackground(Color.RED);
			
		}
		//Motion----------------------------------------------------//
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			LabelTwo.setText(e.getX() + ", " + e.getY());
		}
		//Wheel----------------------------------------------------//
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			
		}
	}

	
}
