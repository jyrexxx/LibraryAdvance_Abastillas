import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibrarianLoginSystem {

	private static JFrame frame;
	private static JTextField jtxtUser;
	private static JPasswordField jpfPass;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLoginSystem window = new LibrarianLoginSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarianLoginSystem() {
		librarianInitialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static void librarianInitialize() {
		frame = new JFrame();
		frame.setSize(422, 393);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Librarian Log-in");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblNewLabel.setBounds(42, 26, 354, 58);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel jlblUser = new JLabel("Username:");
		jlblUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jlblUser.setBounds(86, 130, 78, 14);
		frame.getContentPane().add(jlblUser);
		
		JLabel jlblPass = new JLabel("Password:");
		jlblPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jlblPass.setBounds(86, 184, 78, 14);
		frame.getContentPane().add(jlblPass);
		
		jtxtUser = new JTextField();
		jtxtUser.setBounds(174, 129, 137, 20);
		frame.getContentPane().add(jtxtUser);
		jtxtUser.setColumns(10);
		
		jpfPass = new JPasswordField();
		jpfPass.setBounds(174, 183, 137, 20);
		frame.getContentPane().add(jpfPass);
		
		//SHOW PASSWORD
		JRadioButton jrbtnShowpass = new JRadioButton("Show Password");
		jrbtnShowpass.setBounds(147, 223, 129, 23);
		frame.getContentPane().add(jrbtnShowpass);
		jrbtnShowpass.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				if(jrbtnShowpass.isSelected()){
			           jpfPass.setEchoChar((char)0);
			       }
			       else{
			           jpfPass.setEchoChar('*');
			       }
			    }   	
		});
		
		//EXIT BUTTON
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.setBounds(10, 299, 89, 23);
		frame.getContentPane().add(jbtnExit);
		jbtnExit.addActionListener(new ActionListener() {
			public JFrame frame;
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
		        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "Log-in Account",
		              JOptionPane.YES_NO_OPTION  )== JOptionPane.YES_NO_OPTION){
		            System.exit(0); 
			}
		}
		
		});
		
		//BACK BUTTON
		JButton jbtnBack = new JButton("Back");
		jbtnBack.setBounds(109, 299, 89, 23);
		frame.getContentPane().add(jbtnBack);
			jbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				LibLoginSystem.libraryInitialize();
			}
		});
			
		//RESET BUTTON
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.setBounds(208, 299, 89, 23);
		frame.getContentPane().add(jbtnReset);
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtUser.setText(null);
		        jpfPass.setText(null);
			}
		});
		
		//LOGIN BUTTON
		JButton jbtnLogin = new JButton("Log in");
		jbtnLogin.setBounds(307, 299, 89, 23);
		frame.getContentPane().add(jbtnLogin);
		frame.setVisible(true);
		jbtnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass = jpfPass.getText();
		        String user = jtxtUser.getText();
		        
		       //Username and Password checker.
		       if(jtxtUser.getText().equals("") && jpfPass.getText().equals("")) {
		           JOptionPane.showMessageDialog(null, "Please full up Username and Password");
		       }
		        else if(jtxtUser.getText().equals("")){
		            JOptionPane.showMessageDialog(null, "Please fill out username.");
		       }
		        else if(jpfPass.getText().equals("")){
		            JOptionPane.showMessageDialog(null, "Please fill up password");
		       }
		        else if(pass.equals("LibOne") && (user.equals("Librarian_01"))){           
		        	JOptionPane.showMessageDialog(null, "Successfully Login");
		        	frame.dispose();
		            ListofBooks.listInitialize();
		       }
		        else if(pass.equals("LibTwo") && (user.equals("Librarian_02"))){ 
		        	JOptionPane.showMessageDialog(null, "Successfully Login");
		        	frame.dispose();
		        	ListofBooks.listInitialize();
		        }
		        else if(pass.equals("LibThree") && (user.equals("Librarian_03"))){ 
		        	JOptionPane.showMessageDialog(null, "Successfully Login");
		        	frame.dispose();
		        	ListofBooks.listInitialize();
		        }
		        else if(pass.equals("LibOne") && !user.equals("Librarian_01") || pass.equals("LibTwo") && !user.equals("Librarian_02") || pass.equals("LibThree") && !user.equals("Librarian_03")){ 
		        	JOptionPane.showMessageDialog(null,"Incorrect Username", "Login Error", JOptionPane.ERROR_MESSAGE);
		            jpfPass.setText(null);
		        }
		        else if(!pass.equals("LibOne") && user.equals("Librarian_01") || !pass.equals("LibTwo") && user.equals("Librarian_02") || !pass.equals("LibThree") && user.equals("Librarian_03")){ 
		        	JOptionPane.showMessageDialog(null,"Incorrect Password", "Login Error", JOptionPane.ERROR_MESSAGE);
		            jpfPass.setText(null);
		        }
		        else if(!pass.equals("LibOne") && !user.equals("Librarian_01") || !pass.equals("LibTwo") && !user.equals("Librarian_02") || !pass.equals("LibThree") && !user.equals("Librarian_03")){ 
		        	JOptionPane.showMessageDialog(null,"Incorrect Username and Password", "Login Error", JOptionPane.ERROR_MESSAGE);
		            jpfPass.setText(null);
		        }
		        else{
		            JOptionPane.showMessageDialog(null,"Invalid Details", "Login Error", JOptionPane.ERROR_MESSAGE);
		            jpfPass.setText(null);
		       }
		    }
		});
		
	}
}
