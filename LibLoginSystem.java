import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibLoginSystem {

	private static JFrame frmNationalUniversity;
	private static JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibLoginSystem window = new LibLoginSystem();
					window.frmNationalUniversity.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibLoginSystem() {
		libraryInitialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//Admin or Librarian login frame
	public static void libraryInitialize() {
		frmNationalUniversity = new JFrame();
		frmNationalUniversity.setFont(new Font("Dialog", Font.BOLD, 12));
		frmNationalUniversity.setTitle("National University");
		frmNationalUniversity.setSize(453, 300);
		frmNationalUniversity.setLocationRelativeTo(null);
		frmNationalUniversity.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNationalUniversity.getContentPane().setLayout(null);
		frmNationalUniversity.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Library Management");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(60, 0, 329, 60);
		frmNationalUniversity.getContentPane().add(lblNewLabel);
		
		JButton jbtnAdminlogin = new JButton("Admin Login");
		jbtnAdminlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNationalUniversity.dispose();
				AdminLoginSystem.AdminloginInitialize();
			}
		});
		jbtnAdminlogin.setFont(new Font("Tahoma", Font.PLAIN, 23));
		jbtnAdminlogin.setBounds(134, 91, 186, 51);
		frmNationalUniversity.getContentPane().add(jbtnAdminlogin);
		
		JButton jbtnLibrarianlogin = new JButton("Librarian Login");
		jbtnLibrarianlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNationalUniversity.dispose();
				LibrarianLoginSystem.librarianInitialize();
			}
		});
		jbtnLibrarianlogin.setFont(new Font("Tahoma", Font.PLAIN, 23));
		jbtnLibrarianlogin.setBounds(134, 161, 186, 51);
		frmNationalUniversity.getContentPane().add(jbtnLibrarianlogin);
	}
}
