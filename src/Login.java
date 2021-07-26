import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Login implements ActionListener {
	
	private static JLabel userLabel, passwordLabel, success,failed;
	private static JTextField userText;
	private static JPasswordField passwordText;
	private static JButton button;
	
	
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame ();
		JPanel panel = new JPanel ();
		
		frame.setVisible(true);
		frame.setSize(400, 250);
		frame.setTitle("LOGIN");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
				
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(80, 60, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField (50);
		userText.setBounds(150, 60, 180, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(80, 95, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField(50);
		passwordText.setBounds(150, 95, 180, 25);
		panel.add(passwordText);
		
		button = new JButton ("Login");
		button.setBounds(200, 140, 80, 25);
		button.addActionListener(new Login());
		panel.add(button);
		
		success = new JLabel ("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		failed = new JLabel ("");
		failed.setBounds(10, 110, 300, 25);
		panel.add(failed);
		
		 
	}

	private static void setForeground(Color magenta) {
		// TODO Auto-generated method stub
		
	}

	private static void setBackground(Color orange) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user+ "," +password);
		
		if (user.equals("gopakumar") && password.equals("password")) {
			JOptionPane.showMessageDialog(null, "Login Successfull!!");
		}
		
		 else 
			
			 JOptionPane.showMessageDialog(null, "Incorrect username or password");
							
	}

	

}
