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
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class LA_Main extends JFrame {


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

		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(new LineBorder(Color.WHITE));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\admin\\Pictures\\LA LOGO2.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new LA().setVisible(true);
			}
		});
		btnNewButton.setBounds(172, 894, 66, 59);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\NBA Permanent(\uC81C\uCD9C\uD560\uAC70)\\images\\LA Legend - \uBCF5\uC0AC\uBCF8.png"));
		lblNewLabel.setBounds(0, 10, 414, 954);
		contentPane.add(lblNewLabel);
	}
}
