import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Interface extends JFrame implements ActionListener {
	public final int FRAME_WIDTH = 300;
	public final int FRAME_HEIGHT = 300;
	public final int FIELD_WIDTH = 20; 
	String enter, clear, plus, minus, divide, multiply;
	
	public Interface(JFrame frame) {
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setResizable(false);
		
		frame.setTitle("Calculator");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Textfield Entry
		JPanel num = new JPanel();
		
		JTextField entry = new JTextField(FIELD_WIDTH);
		
		num.add(entry);
	
		// Number key entry
		JPanel panel = new JPanel(new GridLayout(4,0));
		for (int i = 0; i < 10; i++) {
			
			panel.add(new JButton(String.valueOf(i)));
			
		}
		
		// Operators
		JPanel operators = new JPanel(new GridLayout(0,2));
		operators.add(new JButton("+"));
		operators.add(new JButton("-"));
		operators.add(new JButton("/"));
		operators.add(new JButton("*"));
		
		// Calculate and Clear buttons
		JPanel func = new JPanel();
		func.add(new JButton("Enter"));
		func.add(new JButton("Clear"));
		
		// Add JPanels
		JPanel main = new JPanel();
		setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));  
		main.add(num);
		main.add(operators);
		main.add(panel);
		main.add(func);
		frame.add(main);
		
	}
	
	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		}
	}
	*/
	
}
