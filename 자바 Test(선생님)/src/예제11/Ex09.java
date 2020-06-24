package ¿¹Á¦11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex09 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex09 window = new Ex09();
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
	public Ex09() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 330, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                   \uC785\uB825\uD6C4 enter\uB97C \uC785\uB825\uD558\uC138\uC694.");
		lblNewLabel.setBounds(12, 10, 290, 30);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		
		textField.setBounds(42, 61, 242, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setBounds(42, 153, 248, 153);
		frame.getContentPane().add(textArea);
	
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textArea.append(textField.getText() + "\n");
			textField.setText(""); 
			}
		});
	}
}
