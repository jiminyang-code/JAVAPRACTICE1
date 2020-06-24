package ¿¬½À2;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class LA_Main extends JFrame {
	private JRadioButton[] radio = new JRadioButton[10];
	private String[] text = { "Kobe", "Wilton", "elgin", "gail", "magic", "kareem", "shaquille", "james", "jerry",
			"jamal" };
	private ImageIcon[] image = { new ImageIcon("images/Kobe.jpg"), new ImageIcon("images/Wilton.jpg"),
			new ImageIcon("images/elgin.jpg"), new ImageIcon("images/gail.jpg"), new ImageIcon("images/magic.jpg"),
			new ImageIcon("images/kareem.jpg"), new ImageIcon("images/shaquille.jpg"),
			new ImageIcon("images/james.jpg"), new ImageIcon("images/jerry.jpg"), new ImageIcon("images/jamal.jpg") };

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LA_Main frame = new LA_Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	public LA_Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 1013);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
				
				JButton btnNewButton = new JButton("LA Legend");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					dispose();
					new LA().setVisible(true);
					}
				});
				btnNewButton.setBounds(152, 802, 97, 46);
				contentPane.add(btnNewButton);
				
						JLabel lblNewLabel = new JLabel("");
						lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\LA Legend.png"));
						lblNewLabel.setBounds(0, 0, 414, 974);
						contentPane.add(lblNewLabel);
	
	}
}

