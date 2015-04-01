package pharmacy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class RegisterMedicineDelivery extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterMedicineDelivery frame = new RegisterMedicineDelivery();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public RegisterMedicineDelivery(final JFrame parent) {
		final RegisterMedicineDelivery registerMedicineDelivery=this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 439, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u062B\u0628\u062A \u062A\u062D\u0648\u06CC\u0644 \u062F\u0627\u0631\u0648");
		label.setBounds(5, 5, 424, 20);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645:");
		label_1.setBounds(378, 36, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u06A9\u062F \u0645\u0644\u06CC:");
		label_2.setBounds(378, 61, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u062F\u0627\u0631\u0648\u0647\u0627:");
		label_3.setBounds(378, 86, 46, 14);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(46, 36, 322, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(46, 58, 322, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(46, 83, 322, 110);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("\u062B\u0628\u062A \u062A\u062D\u0648\u06CC\u0644");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerMedicineDelivery.dispatchEvent(new WindowEvent(registerMedicineDelivery, WindowEvent.WINDOW_CLOSING));
			}
		});
		btnNewButton.setBounds(184, 216, 89, 23);
		contentPane.add(btnNewButton);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	parent.setEnabled(true);
		    }
		});
	}

}
