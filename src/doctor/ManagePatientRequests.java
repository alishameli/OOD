package doctor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class ManagePatientRequests extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagePatientRequests frame = new ManagePatientRequests();
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
	public ManagePatientRequests(final JFrame parent) {
		final ManagePatientRequests managePatientRequests=this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0645\u062F\u06CC\u0631\u06CC\u062A \u062F\u0631\u062E\u0648\u0627\u0633\u062A \u0628\u06CC\u0645\u0627\u0631\u0627\u0646");
		label.setBounds(5, 5, 424, 20);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0628\u06CC\u0645\u0627\u0631:");
		label_1.setBounds(377, 55, 47, 27);
		contentPane.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(212, 58, 155, 20);
		contentPane.add(comboBox);
		
		JButton button = new JButton("\u0627\u0641\u0632\u0648\u062F\u0646");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				managePatientRequests.dispatchEvent(new WindowEvent(managePatientRequests, WindowEvent.WINDOW_CLOSING));
			}
		});
		button.setBounds(225, 122, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u062D\u0630\u0641");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				managePatientRequests.dispatchEvent(new WindowEvent(managePatientRequests, WindowEvent.WINDOW_CLOSING));
			}
		});
		button_1.setBounds(126, 122, 89, 23);
		contentPane.add(button_1);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	parent.setEnabled(true);
		    }
		});
	}

}
