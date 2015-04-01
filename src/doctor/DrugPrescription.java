package doctor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class DrugPrescription extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrugPrescription frame = new DrugPrescription();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*

	/**
	 * Create the frame.
	 */
	public DrugPrescription(final JFrame parent) {
		final DrugPrescription drugPrescription=this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 476, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u062A\u062C\u0648\u06CC\u0632 \u062F\u0627\u0631\u0648");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(181, 11, 71, 33);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u062F\u0627\u0631\u0648:");
		label_1.setBounds(378, 56, 72, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(10, 53, 358, 74);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u0633\u0627\u0628\u0642\u0647 \u0628\u06CC\u0645\u0627\u0631\u06CC:");
		label_2.setBounds(378, 150, 72, 14);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 147, 358, 48);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("\u062A\u062C\u0648\u06CC\u0632");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drugPrescription.dispatchEvent(new WindowEvent(drugPrescription, WindowEvent.WINDOW_CLOSING));
			}
		});
		button.setBounds(181, 228, 89, 23);
		contentPane.add(button);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	parent.setEnabled(true);
		    }
		});
	}

}
