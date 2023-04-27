import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLoginSystem {

	private static JFrame AdminFrame;
	private static JTextField jtxtUser;
	private static JPasswordField jpfPass;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLoginSystem window = new AdminLoginSystem();
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
	public AdminLoginSystem() {
		AdminloginInitialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//Admin login frame 
	public static void AdminloginInitialize() {
		AdminFrame = new JFrame();
		AdminFrame.setSize(422, 393);
		AdminFrame.setLocationRelativeTo(null);
		AdminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AdminFrame.getContentPane().setLayout(null);
		AdminFrame.setVisible(true);
		
		JLabel jlblUser = new JLabel("Username:");
		jlblUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jlblUser.setBounds(86, 130, 78, 14);
		AdminFrame.getContentPane().add(jlblUser);
		
		JLabel jlblPass = new JLabel("Password:");
		jlblPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jlblPass.setBounds(86, 184, 78, 14);
		AdminFrame.getContentPane().add(jlblPass);
		
		JLabel lblNewLabel_2 = new JLabel("Admin Log-in");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblNewLabel_2.setBounds(42, 26, 299, 58);
		AdminFrame.getContentPane().add(lblNewLabel_2);
		
		jtxtUser = new JTextField();
		jtxtUser.setBounds(174, 129, 137, 20);
		AdminFrame.getContentPane().add(jtxtUser);
		jtxtUser.setColumns(10);
		
		jpfPass = new JPasswordField();
		jpfPass.setBounds(174, 183, 137, 20);
		AdminFrame.getContentPane().add(jpfPass);
		
		//SHOW PASSWORD BUTTON
		JRadioButton jrbtnShowpass = new JRadioButton("Show Password");
		jrbtnShowpass.setBounds(147, 223, 129, 23);
		AdminFrame.getContentPane().add(jrbtnShowpass);
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
		jbtnExit.setBounds(10, 299, 89, 23);
		AdminFrame.getContentPane().add(jbtnExit);
		
		//RESET BUTTON
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtUser.setText(null);
		        jpfPass.setText(null);
			}
		});
		jbtnReset.setBounds(208, 299, 89, 23);
		AdminFrame.getContentPane().add(jbtnReset);
		AdminFrame.getContentPane().add(jbtnReset);
		
		//LOGIN BUTTON
		JButton jbtnLogin = new JButton("Log in");
		jbtnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass = jpfPass.getText();
		        String user = jtxtUser.getText();
		    
		       //Username and Password checker
		       if(jtxtUser.getText().equals("") && jpfPass.getText().equals("")) {
		           JOptionPane.showMessageDialog(null, "Please full up Username and Password");
		       }
		        else if(jtxtUser.getText().equals("")){
		            JOptionPane.showMessageDialog(null, "Please fill out username.");
		       }
		        else if(jpfPass.getText().equals("")){
		            JOptionPane.showMessageDialog(null, "Please fill up password");
		       }
		        else if(pass.equals("AdminOne") && (user.equals("Admin_01"))){           
		        	JOptionPane.showMessageDialog(null, "Successfully Login");
		        	AdminFrame.dispose();
		            Welcomefreym.welcomeInitialize();
		       }
		        else if(pass.equals("AdminTwo") && (user.equals("Admin_02"))){ 
		        	JOptionPane.showMessageDialog(null, "Successfully Login");
		        	AdminFrame.dispose();
		        	Welcomefreym.welcomeInitialize();
		        }
		        else if(pass.equals("AdminThree") && (user.equals("Admin_03"))){ 
		        	JOptionPane.showMessageDialog(null, "Successfully Login");
		        	AdminFrame.dispose();
		        	Welcomefreym.welcomeInitialize();
		        }
		        else if(pass.equals("AdminOne") && !user.equals("Admin_01") || pass.equals("AdminTwo") && !user.equals("Admin_02") || pass.equals("AdminThree") && !user.equals("Admin_03")){ 
		        	JOptionPane.showMessageDialog(null,"Incorrect Username", "Login Error", JOptionPane.ERROR_MESSAGE);
		            jpfPass.setText(null);
		        }
		        else if(!pass.equals("AdminOne") && user.equals("Admin_01") || !pass.equals("AdminTwo") && user.equals("Admin_02") || !pass.equals("AdminThree") && user.equals("Admin_03")){ 
		        	JOptionPane.showMessageDialog(null,"Incorrect Password", "Login Error", JOptionPane.ERROR_MESSAGE);
		            jpfPass.setText(null);
		        }
		        else if(!pass.equals("AdminOne") && !user.equals("Admin_01") || !pass.equals("AdminTwo") && !user.equals("Admin_02") || !pass.equals("AdminThree") && !user.equals("Admin_03")){ 
		        	JOptionPane.showMessageDialog(null,"Incorrect Username and Password", "Login Error", JOptionPane.ERROR_MESSAGE);
		            jpfPass.setText(null);
		        }
		        else{
		            JOptionPane.showMessageDialog(null,"Invalid Details", "Login Error", JOptionPane.ERROR_MESSAGE);
		            jpfPass.setText(null);
		       }
		    }
		});

		jbtnLogin.setBounds(307, 299, 89, 23);
		AdminFrame.getContentPane().add(jbtnLogin);
		
		//BACK BUTTON
		JButton jbtnBack = new JButton("Back");
		jbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFrame.dispose();
				LibLoginSystem.libraryInitialize();
			}
		});
		jbtnBack.setBounds(109, 299, 89, 23);
		AdminFrame.getContentPane().add(jbtnBack);
	}
}
