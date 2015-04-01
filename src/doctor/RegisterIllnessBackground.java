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

public class RegisterIllnessBackground extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterIllnessBackground frame = new RegisterIllnessBackground();
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
	public RegisterIllnessBackground(final JFrame parent) {
		final RegisterIllnessBackground registerIllnessBackground=this;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u062B\u0628\u062A \u0633\u0627\u0628\u0642\u0647 \u0628\u06CC\u0645\u0627\u0631\u06CC");
		label.setBounds(5, 5, 424, 20);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u0648 \u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC:");
		label_1.setBounds(318, 36, 106, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u06A9\u062F \u0645\u0644\u06CC:");
		label_2.setBounds(318, 61, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u062A\u0648\u0636\u06CC\u062D \u0628\u06CC\u0645\u0627\u0631\u06CC:");
		label_3.setBounds(318, 86, 106, 14);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(74, 33, 234, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(74, 58, 234, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(74, 83, 234, 65);
		contentPane.add(textField_2);
		
		JLabel label_4 = new JLabel("\u0639\u0644\u0627\u0626\u0645 \u0628\u06CC\u0645\u0627\u0631\u06CC:");
		label_4.setBounds(318, 163, 106, 14);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(74, 160, 234, 65);
		contentPane.add(textField_3);
		
		JLabel label_5 = new JLabel("\u062A\u0627\u0631\u06CC\u062E:");
		label_5.setBounds(318, 233, 46, 14);
		contentPane.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(74, 230, 234, 20);
		contentPane.add(textField_4);
		
		JButton button = new JButton("\u062B\u0628\u062A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerIllnessBackground.dispatchEvent(new WindowEvent(registerIllnessBackground, WindowEvent.WINDOW_CLOSING));
			}
		});
		button.setBounds(168, 270, 89, 23);
		contentPane.add(button);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	parent.setEnabled(true);
		    }
		});
	}

}
