package doctor;

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

public class SearchPatient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchPatient frame = new SearchPatient();
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
	public SearchPatient(final JFrame parent) {
		final SearchPatient searchPatient=this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 487, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u062C\u0633\u062A\u062C\u0648\u06CC \u0628\u06CC\u0645\u0627\u0631\u0627\u0646");
		label.setBounds(5, 5, 424, 20);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645:");
		label_1.setBounds(378, 48, 83, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(136, 45, 232, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u06A9\u062F \u0645\u0644\u06CC:");
		label_2.setBounds(378, 73, 83, 14);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 70, 232, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_3 = new JLabel("\u0633\u0646:");
		label_3.setBounds(378, 98, 83, 14);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(136, 95, 232, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_4 = new JLabel("\u0633\u0627\u0628\u0642\u0647 \u0628\u06CC\u0645\u0627\u0631\u06CC:");
		label_4.setBounds(378, 123, 83, 14);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(136, 120, 232, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton button = new JButton("\u062C\u0633\u062A\u062C\u0648");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchResults sr=new SearchResults(searchPatient);
				sr.setVisible(true);
				searchPatient.setEnabled(false);
				
			}
		});
		button.setBounds(193, 164, 89, 23);
		contentPane.add(button);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	parent.setEnabled(true);
		    }
		});
	}

}
