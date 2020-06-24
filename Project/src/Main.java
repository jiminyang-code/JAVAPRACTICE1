import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Main {

	private JFrame frame;
	private JTextField ID;
	private JTextField Pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(500, 400));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImgPanel panel = new ImgPanel(new ImageIcon("image\\image1.jpg").getImage());
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		ID = new JTextField();
		ID.setBorder(new LineBorder(new Color(171, 173, 179)));
		ID.setBounds(248, 127, 116, 21);
		panel.add(ID);
		ID.setColumns(10);

		Pass = new JTextField();
		Pass.setBounds(248, 183, 116, 21);
		panel.add(Pass);
		Pass.setColumns(10);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(156, 130, 57, 15);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setBounds(140, 186, 92, 15);
		panel.add(lblNewLabel_1);
		JButton Login = new JButton("Login");
		Login.setBounds(201, 259, 97, 58);
		panel.add(Login);

		JButton Join = new JButton("Join");
		Join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Customer.ID.setText(), Pass.getText());
				frame.dispose();
				new Join().setVisible(true);
				;
			}

			
			
		});
		Join.setBounds(319, 259, 92, 58);
		panel.add(Join);
		frame.pack();

	}
}

class ImgPanel extends JPanel {
	private Image img;

	public ImgPanel(Image img) {
		this.img = img;

		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}

}
