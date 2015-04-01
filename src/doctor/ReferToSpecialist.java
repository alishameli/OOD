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
import java.awt.event.WindowEvent;

public class ReferToSpecialist extends JFrame {

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
					ReferToSpecialist frame = new ReferToSpecialist();
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
	public ReferToSpecialist(final JFrame parent) {
		final ReferToSpecialist referToSpecialist=this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0627\u0631\u062C\u0627\u0639 \u0628\u0647 \u067E\u0632\u0634\u06A9 \u0645\u062A\u062E\u0635\u0635");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(123, 11, 181, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0628\u06CC\u0645\u0627\u0631:");
		lblNewLabel_1.setBounds(378, 51, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0646\u0627\u0645:");
		lblNewLabel_2.setBounds(339, 76, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u06A9\u062F \u0645\u0644\u06CC:");
		lblNewLabel_3.setBounds(339, 101, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(148, 73, 181, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 98, 181, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("\u067E\u0632\u0634\u06A9:");
		label.setBounds(378, 138, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645:");
		label_1.setBounds(339, 163, 56, 14);
		contentPane.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(148, 160, 181, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("\u06A9\u062F \u067E\u0631\u0633\u0646\u0644\u06CC:");
		label_2.setBounds(339, 188, 56, 14);
		contentPane.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(148, 185, 181, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton button = new JButton("\u0627\u0631\u062C\u0627\u0639");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				referToSpecialist.dispatchEvent(new WindowEvent(referToSpecialist, WindowEvent.WINDOW_CLOSING));
			}
		});
		button.setBounds(169, 228, 89, 23);
		contentPane.add(button);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	parent.setEnabled(true);
		    }
		});
	}
}
