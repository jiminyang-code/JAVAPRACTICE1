
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class UpdFrame extends JFrame {

	private JPanel contentPane;
	private static JPanel panel = new JPanel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdFrame frame = new UpdFrame();
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
	public UpdFrame() {
		setTitle("UPDATE ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 500);
		 setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel = new JPanel();
		panel.setBounds(0, 0, 375, 460);
		panel.setBackground(new Color(138, 43, 226));
		contentPane.add(panel);
		panel.setLayout(null);
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\Pro\uC81D\uD2B8\\image\\hicl.png"));
		logo.setBounds(75, 130, 250, 197);
		panel.add(logo);
		JButton tomainbutton = new JButton("\uBA54\uC778 \uD654\uBA74\uC73C\uB85C");
		tomainbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MainFrame().setVisible(true);
			}
		});
		tomainbutton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(255, 0, 255), new Color(0, 255, 255), new Color(0, 255, 0)));
		tomainbutton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 15));
		tomainbutton.setBounds(0, 410, 187, 50);
		panel.add(tomainbutton);
		
		JButton finButton = new JButton("\uC885\uB8CC");
		finButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		finButton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GREEN, null, null, Color.CYAN));
		finButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 15));
		finButton.setBounds(187, 410, 187, 50);
		panel.add(finButton);
	}

}
