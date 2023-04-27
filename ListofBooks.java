import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class ListofBooks {

	private static JFrame frame;
	private static JTextField jtxtUserRent;
	static int book1Copy = 2;
	static int book2Copy = 3;
	static int book3Copy = 4;
	
	//the number of books and its copy
	static JLabel jlbl0 = new JLabel();	
	static JLabel jlbl1 = new JLabel();
	static JLabel jlbl2 = new JLabel();
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListofBooks window = new ListofBooks();
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
	public ListofBooks() {
		listInitialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//List of books frame
	public static void listInitialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 334);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Input the number of the book you want to rent.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(22, 78, 279, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Copies");
		lblNewLabel_1.setBounds(376, 79, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("[0] System Analysis and Design by Gary B. Shelly (1991).");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(22, 103, 325, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("[1] Android Application by Corine Hoisington (2012).");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(22, 128, 325, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("[2] Programming Concepts and Logic Formulation");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(22, 153, 289, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton jbtnBack = new JButton("Back");
		jbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				LibrarianLoginSystem.librarianInitialize();
			}
		});
		
		jbtnBack.setBounds(72, 248, 89, 23);
		frame.getContentPane().add(jbtnBack);
		
		JButton jbtnRent = new JButton("Rent");
		jbtnRent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Arraylist to store the books and its copy.
				ArrayList<Book> book = new ArrayList<>();
				
				//the name, author of the books.
				Book bookNum1 = new Book();
				bookNum1.name = "System Analysis and Design 1991";
				bookNum1.author = "Gary B. Shelly";

				Book bookNum2 = new Book();
				bookNum2.name = "Android Application 2012";
				bookNum2.author = "Corine Hoisington";

				Book bookNum3 = new Book();
				bookNum3.name = "Programming Concepts and Logic Formulation 2016";
				bookNum3.author = "Rosauro E. Manuel";

				book.add(bookNum1);
				book.add(bookNum2);
				book.add(bookNum3);

				try {
					//Copies checker to know is there are still copy
					int pick = Integer.parseInt(jtxtUserRent.getText());
					Book bk = book.get(pick);
					
					if (pick == 0 && book1Copy < 1) {
						JOptionPane.showMessageDialog(null, "No copies available.", "",
								JOptionPane.INFORMATION_MESSAGE);
					} else if (pick == 1 && book2Copy < 1) {
						JOptionPane.showMessageDialog(null, "No copies available.", "",
								JOptionPane.INFORMATION_MESSAGE);
					} else if (pick == 2 && book3Copy < 1) {
						JOptionPane.showMessageDialog(null, "No copies available.", "",
								JOptionPane.INFORMATION_MESSAGE);
					}
					
					//Notification to ask user the chosen for book 1.
					if (pick == 0 && book1Copy > 0) {
						int choice = JOptionPane.showConfirmDialog(null, "You chose: " + book.get(pick).getName(), "",
								JOptionPane.YES_NO_OPTION);

						//Deductor for book 1 copy.
						book1Copy -= 1;
						jlbl0.setText(Integer.toString(book1Copy));

						if (choice == JOptionPane.OK_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "",
									JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								frame.setVisible(true);
							} else {
								frame.dispose();
								LibLoginSystem.libraryInitialize();
							}
						}
					} 
					
					//Notification to ask user the chosen for book 2.
					else if (pick == 1 && book2Copy > 0) {
						
						int choice = JOptionPane.showConfirmDialog(null, "You choose: " + book.get(pick).getName(), "",
								JOptionPane.CLOSED_OPTION);
						//deductor for book 2 copy
						book2Copy -= 1;
						jlbl1.setText(Integer.toString(book2Copy));
						if (choice == JOptionPane.OK_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "",
									JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								frame.setVisible(true);
							} else {
								frame.dispose();
								LibLoginSystem.libraryInitialize();
							}
						}
					} 
					//Notification to ask user the chosen book for book 3.
					else if (pick == 2 && book3Copy > 0) {

						int choice = JOptionPane.showConfirmDialog(null, "You choose: " + book.get(pick).getName(), "",
								JOptionPane.CLOSED_OPTION);
						//deductor for book 3 copy.
						book3Copy -= 1;
						jlbl2.setText(Integer.toString(book3Copy));

						if (choice == JOptionPane.OK_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "",
									JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								frame.setVisible(true);
							} else {
								frame.dispose();
								LibLoginSystem.libraryInitialize();
							}
						}
					}
					//catch method for out of bounds input to avoid termination of code
				} catch (NumberFormatException ex) {
					int choose = JOptionPane.showConfirmDialog(null, "Input must be in the choices.", "",
							JOptionPane.CLOSED_OPTION);
					if (choose == JOptionPane.OK_OPTION) {
						frame.dispose();
						ListofBooks.listInitialize();
					}
				} catch (IndexOutOfBoundsException ex) {
					int choose = JOptionPane.showConfirmDialog(null, "Index does not exist.", "",
							JOptionPane.CLOSED_OPTION);
					if (choose == JOptionPane.OK_OPTION) {
						frame.dispose();
						ListofBooks.listInitialize();
					}
				}
			}

		});
		
		jbtnRent.setBounds(273, 248, 89, 23);
		frame.getContentPane().add(jbtnRent);
	
		jtxtUserRent = new JTextField();
		jtxtUserRent.setBounds(196, 208, 46, 20);
		frame.getContentPane().add(jtxtUserRent);
		jtxtUserRent.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Rent a Book");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(146, 24, 167, 43);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("by Rosauro E. Manuel (2016).");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(43, 170, 243, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		jlbl0.setText(Integer.toString(book1Copy));
		jlbl0.setBounds(392, 104, 46, 14);
		frame.getContentPane().add(jlbl0);

		jlbl1.setText(Integer.toString(book2Copy));
		jlbl1.setBounds(392, 129, 29, 14);
		frame.getContentPane().add(jlbl1);

		jlbl2.setText(Integer.toString(book3Copy));
		jlbl2.setBounds(392, 154, 46, 14);
		frame.getContentPane().add(jlbl2);
		frame.setVisible(true);
	}
}