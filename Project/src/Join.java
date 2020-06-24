import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Join extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JTextField Pass;
	private JTextField Phone;
	private JTextField Note;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join frame = new Join();
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
	public Join() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\\uC790\uBC14\uD559\uC2B5\\Project\\image\\image1.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setForeground(Color.PINK);
		panel.setBounds(0, 0, 584, 361);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Join");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(25, 34, 536, 41);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(121, 119, 57, 15);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(94, 165, 57, 15);
		panel.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_2 = new JLabel("Gender");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setBounds(252, 165, 57, 15);
		panel.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_3 = new JLabel("Phone");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setBounds(252, 119, 57, 15);
		panel.add(lblNewLabel_1_1_3);

		JLabel lblNewLabel_1_1_4 = new JLabel("Note");
		lblNewLabel_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_4.setBounds(252, 208, 57, 15);
		panel.add(lblNewLabel_1_1_4);

		ID = new JTextField();
		ID.setBounds(159, 116, 90, 21);
		panel.add(ID);
		ID.setColumns(10);

		Pass = new JTextField();
		Pass.setColumns(10);
		Pass.setBounds(159, 162, 90, 21);
		panel.add(Pass);

		Phone = new JTextField();
		Phone.setColumns(10);
		Phone.setBounds(308, 116, 90, 21);
		panel.add(Phone);

		Note = new JTextField();
		Note.setBorder(new LineBorder(Color.PINK));
		Note.setFont(new Font("±¼¸²", Font.BOLD, 17));
		Note.setColumns(10);
		Note.setBounds(308, 208, 90, 41);
		panel.add(Note);

		String[] combo = { "Male", "Female" };
		JComboBox Gender = new JComboBox(combo);
		Gender.setBounds(308, 162, 90, 18);
		panel.add(Gender);
		
		JButton btnNewButton = new JButton("Join");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\Ok-icon (1).png"));
		btnNewButton.setBounds(235, 280, 97, 59);
		panel.add(btnNewButton);
	}
}
