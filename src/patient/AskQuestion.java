package patient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class AskQuestion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AskQuestion frame = new AskQuestion();
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
	public AskQuestion(final JFrame parent) {
		final AskQuestion askQuestion=this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0645\u0634\u0627\u0648\u0631\u0647 \u0628\u0627 \u067E\u0632\u0634\u06A9");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(147, 11, 127, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0633\u0648\u0627\u0644:");
		label_1.setBounds(378, 52, 46, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(10, 49, 358, 70);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u067E\u0632\u0634\u06A9:");
		label_2.setBounds(378, 144, 46, 14);
		contentPane.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(241, 141, 127, 20);
		contentPane.add(comboBox);
		
		JButton button = new JButton("\u0627\u0631\u0633\u0627\u0644 \u0633\u0648\u0627\u0644");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askQuestion.dispatchEvent(new WindowEvent(askQuestion, WindowEvent.WINDOW_CLOSING));
			}
		});
		button.setBounds(175, 228, 89, 23);
		contentPane.add(button);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	parent.setEnabled(true);
		    }
		});
	}
}
