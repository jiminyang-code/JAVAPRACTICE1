import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import MultiFrame.Frame1;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Rectangle;
import javax.swing.border.BevelBorder;

public class RetiredNumber extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetiredNumber frame = new RetiredNumber();
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
	public RetiredNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 375);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(0, 0, 666, 375));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);//화면정중앙
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 650, 336);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LA Lakers");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(280, 0, 231, 31);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Permanent");
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			dispose(); //원래프레임삭제
			new RetiredNumber_2().setVisible(true); //새 프레임 생성
			} 

		});
		btnNewButton.setBounds(226, 311, 164, 18);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\admin\\Pictures\\FOYU.jpg"));
		lblNewLabel_1.setBounds(0, 0, 650, 336);
		panel.add(lblNewLabel_1);
	}
}

