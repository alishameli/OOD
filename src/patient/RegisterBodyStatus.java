package patient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class RegisterBodyStatus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/* static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterBodyStatus frame = new RegisterBodyStatus();
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
	public RegisterBodyStatus(final JFrame parent) {
		final RegisterBodyStatus registerBodyStatus=this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u062B\u0628\u062A \u0641\u0639\u0627\u0644\u06CC\u062A \u0628\u062F\u0646\u06CC \u0628\u0627 \u0627\u062A\u0635\u0627\u0644 \u0628\u0647 \u062F\u0633\u062A\u06AF\u0627\u0647");
		label.setBounds(5, 5, 424, 20);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0644\u0637\u0641\u0627 \u062F\u0633\u062A\u06AF\u0627\u0647 \u0631\u0627 \u0628\u0647 \u0633\u06CC\u0633\u062A\u0645 \u0648\u0635\u0644 \u06A9\u0631\u062F\u0647 \u0648 \u067E\u0633 \u0627\u0632 \u0627\u062A\u0635\u0627\u0644 \u0622\u0646 \u0628\u0647 \u0628\u062F\u0646 \u062E\u0648\u062F \u062F\u06A9\u0645\u0647 \u062B\u0628\u062A \u0631\u0627 \u0628\u0632\u0646\u06CC\u062F.");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(5, 61, 419, 120);
		contentPane.add(label_1);
		
		JButton button = new JButton("\u062B\u0628\u062A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerBodyStatus.dispatchEvent(new WindowEvent(registerBodyStatus, WindowEvent.WINDOW_CLOSING));
			}
		});
		button.setBounds(178, 228, 89, 23);
		contentPane.add(button);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	parent.setEnabled(true);
		    }
		});
	}

}
