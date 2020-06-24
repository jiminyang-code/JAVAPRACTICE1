package 예제11;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ImageEx {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageEx window = new ImageEx();
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
	public ImageEx() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		ImagePanel panel = new ImagePanel(new ImageIcon("C:\\자바학습\\Test 예제\\image").getImage());
		frame.add(panel);
		frame.pack();
	}
	

}
