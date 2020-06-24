import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class RetiredNumber_2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetiredNumber_2 frame = new RetiredNumber_2();
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
	public RetiredNumber_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1013, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);//»≠∏È¡§¡ﬂæ”
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 997, 644);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kobe Bean Bryant");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(47, 72, 141, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(47, 24, 129, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("RetiredNumber");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(321, 24, 128, 15);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Position");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(596, 24, 105, 15);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Year of enrollment");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(844, 24, 128, 15);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("8 & 24");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(351, 72, 57, 20);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("SG");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBounds(622, 72, 57, 20);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("1996~2016");
		lblNewLabel_1_6.setForeground(Color.WHITE);
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setBounds(872, 72, 76, 20);
		panel.add(lblNewLabel_1_6);
		
		JLabel lblWiltonNormanChamberlain = new JLabel("Wilton Norman Chamberlain");
		lblWiltonNormanChamberlain.setForeground(Color.WHITE);
		lblWiltonNormanChamberlain.setFont(new Font("Arial", Font.PLAIN, 12));
		lblWiltonNormanChamberlain.setHorizontalAlignment(SwingConstants.CENTER);
		lblWiltonNormanChamberlain.setBounds(47, 119, 163, 20);
		panel.add(lblWiltonNormanChamberlain);
		
		JLabel lblElginGayBaylor = new JLabel("Elgin Gay Baylor");
		lblElginGayBaylor.setForeground(Color.WHITE);
		lblElginGayBaylor.setFont(new Font("Arial", Font.PLAIN, 12));
		lblElginGayBaylor.setHorizontalAlignment(SwingConstants.CENTER);
		lblElginGayBaylor.setBounds(47, 164, 141, 20);
		panel.add(lblElginGayBaylor);
		
		JLabel lblGailGoodrich = new JLabel("Gail goodrich");
		lblGailGoodrich.setForeground(Color.WHITE);
		lblGailGoodrich.setFont(new Font("Arial", Font.PLAIN, 12));
		lblGailGoodrich.setHorizontalAlignment(SwingConstants.CENTER);
		lblGailGoodrich.setBounds(47, 212, 141, 20);
		panel.add(lblGailGoodrich);
		
		JLabel lblEarvinmagicJohnson = new JLabel("Earvin \"Magic\" Johnson Jr.");
		lblEarvinmagicJohnson.setForeground(Color.WHITE);
		lblEarvinmagicJohnson.setFont(new Font("Arial", Font.PLAIN, 12));
		lblEarvinmagicJohnson.setHorizontalAlignment(SwingConstants.CENTER);
		lblEarvinmagicJohnson.setBounds(47, 254, 163, 20);
		panel.add(lblEarvinmagicJohnson);
		
		JLabel lblNewLabel_7 = new JLabel("Kareem Abdul-Jabbar");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(47, 299, 141, 20);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Shaquille Rashaun O'Neal, Ed. D.");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(12, 345, 211, 20);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("James Ager Worthy");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(47, 392, 141, 20);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Jerry Alan West");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(47, 444, 141, 20);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Jamaal Wilkes");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(47, 502, 141, 20);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Ji Min Yang");
		lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(47, 554, 141, 20);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("13");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setBounds(351, 119, 57, 20);
		panel.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("22");
		lblNewLabel_1_4_2.setForeground(Color.WHITE);
		lblNewLabel_1_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_2.setBounds(351, 164, 57, 20);
		panel.add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_4_3 = new JLabel("25");
		lblNewLabel_1_4_3.setForeground(Color.WHITE);
		lblNewLabel_1_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_3.setBounds(351, 212, 57, 20);
		panel.add(lblNewLabel_1_4_3);
		
		JLabel lblNewLabel_1_4_4 = new JLabel("32");
		lblNewLabel_1_4_4.setForeground(Color.WHITE);
		lblNewLabel_1_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_4.setBounds(351, 254, 57, 20);
		panel.add(lblNewLabel_1_4_4);
		
		JLabel lblNewLabel_1_4_5 = new JLabel("33");
		lblNewLabel_1_4_5.setForeground(Color.WHITE);
		lblNewLabel_1_4_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_5.setBounds(351, 299, 57, 20);
		panel.add(lblNewLabel_1_4_5);
		
		JLabel lblNewLabel_1_4_6 = new JLabel("34");
		lblNewLabel_1_4_6.setForeground(Color.WHITE);
		lblNewLabel_1_4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_6.setBounds(351, 345, 57, 20);
		panel.add(lblNewLabel_1_4_6);
		
		JLabel lblNewLabel_1_4_7 = new JLabel("42");
		lblNewLabel_1_4_7.setForeground(Color.WHITE);
		lblNewLabel_1_4_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_7.setBounds(351, 392, 57, 20);
		panel.add(lblNewLabel_1_4_7);
		
		JLabel lblNewLabel_1_4_8 = new JLabel("44");
		lblNewLabel_1_4_8.setForeground(Color.WHITE);
		lblNewLabel_1_4_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_8.setBounds(351, 444, 57, 20);
		panel.add(lblNewLabel_1_4_8);
		
		JLabel lblNewLabel_1_4_9 = new JLabel("52");
		lblNewLabel_1_4_9.setForeground(Color.WHITE);
		lblNewLabel_1_4_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_9.setBounds(351, 502, 57, 20);
		panel.add(lblNewLabel_1_4_9);
		
		JLabel lblNewLabel_1_4_10 = new JLabel("7");
		lblNewLabel_1_4_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_10.setBounds(351, 554, 57, 20);
		panel.add(lblNewLabel_1_4_10);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("C");
		lblNewLabel_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_1.setBounds(622, 119, 57, 20);
		panel.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("SF");
		lblNewLabel_1_5_2.setForeground(Color.WHITE);
		lblNewLabel_1_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_2.setBounds(622, 164, 57, 20);
		panel.add(lblNewLabel_1_5_2);
		
		JLabel lblNewLabel_1_5_3 = new JLabel("SG");
		lblNewLabel_1_5_3.setForeground(Color.WHITE);
		lblNewLabel_1_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_3.setBounds(622, 212, 57, 20);
		panel.add(lblNewLabel_1_5_3);
		
		JLabel lblNewLabel_1_5_4 = new JLabel("PG");
		lblNewLabel_1_5_4.setForeground(Color.WHITE);
		lblNewLabel_1_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_4.setBounds(622, 254, 57, 20);
		panel.add(lblNewLabel_1_5_4);
		
		JLabel lblNewLabel_1_5_5 = new JLabel("C");
		lblNewLabel_1_5_5.setForeground(Color.WHITE);
		lblNewLabel_1_5_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_5.setBounds(622, 299, 57, 20);
		panel.add(lblNewLabel_1_5_5);
		
		JLabel lblNewLabel_1_5_6 = new JLabel("C");
		lblNewLabel_1_5_6.setForeground(Color.WHITE);
		lblNewLabel_1_5_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_6.setBounds(622, 345, 57, 20);
		panel.add(lblNewLabel_1_5_6);
		
		JLabel lblNewLabel_1_5_7 = new JLabel("SF");
		lblNewLabel_1_5_7.setForeground(Color.WHITE);
		lblNewLabel_1_5_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_7.setBounds(622, 392, 57, 20);
		panel.add(lblNewLabel_1_5_7);
		
		JLabel lblNewLabel_1_5_8 = new JLabel("PG, SG");
		lblNewLabel_1_5_8.setForeground(Color.WHITE);
		lblNewLabel_1_5_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_8.setBounds(622, 444, 57, 20);
		panel.add(lblNewLabel_1_5_8);
		
		JLabel lblNewLabel_1_5_9 = new JLabel("SF");
		lblNewLabel_1_5_9.setForeground(Color.WHITE);
		lblNewLabel_1_5_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_9.setBounds(622, 502, 57, 20);
		panel.add(lblNewLabel_1_5_9);
		
		JLabel lblNewLabel_1_5_10 = new JLabel("PG");
		lblNewLabel_1_5_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_10.setBounds(622, 554, 57, 20);
		panel.add(lblNewLabel_1_5_10);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("1968~1973");
		lblNewLabel_1_6_1.setForeground(Color.WHITE);
		lblNewLabel_1_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_1.setBounds(872, 119, 76, 20);
		panel.add(lblNewLabel_1_6_1);
		
		JLabel lblNewLabel_1_6_2 = new JLabel("1958~1971");
		lblNewLabel_1_6_2.setForeground(Color.WHITE);
		lblNewLabel_1_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_2.setBounds(872, 164, 86, 20);
		panel.add(lblNewLabel_1_6_2);
		
		JLabel lblNewLabel_1_6_3 = new JLabel("1965~1978, 1970~1976");
		lblNewLabel_1_6_3.setForeground(Color.WHITE);
		lblNewLabel_1_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_3.setBounds(808, 212, 150, 20);
		panel.add(lblNewLabel_1_6_3);
		
		JLabel lblNewLabel_1_6_4 = new JLabel("1979~1991, 1996");
		lblNewLabel_1_6_4.setForeground(Color.WHITE);
		lblNewLabel_1_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_4.setBounds(844, 254, 114, 20);
		panel.add(lblNewLabel_1_6_4);
		
		JLabel lblNewLabel_1_6_5 = new JLabel("1975~1989");
		lblNewLabel_1_6_5.setForeground(Color.WHITE);
		lblNewLabel_1_6_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_5.setBounds(872, 299, 76, 20);
		panel.add(lblNewLabel_1_6_5);
		
		JLabel lblNewLabel_1_6_6 = new JLabel("1996~2004");
		lblNewLabel_1_6_6.setForeground(Color.WHITE);
		lblNewLabel_1_6_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_6.setBounds(872, 345, 76, 20);
		panel.add(lblNewLabel_1_6_6);
		
		JLabel lblNewLabel_1_6_7 = new JLabel("1982~1994");
		lblNewLabel_1_6_7.setForeground(Color.WHITE);
		lblNewLabel_1_6_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_7.setBounds(872, 392, 76, 20);
		panel.add(lblNewLabel_1_6_7);
		
		JLabel lblNewLabel_1_6_8 = new JLabel("1960~1974");
		lblNewLabel_1_6_8.setForeground(Color.WHITE);
		lblNewLabel_1_6_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_8.setBounds(872, 444, 76, 20);
		panel.add(lblNewLabel_1_6_8);
		
		JLabel lblNewLabel_1_6_9 = new JLabel("1977~1985");
		lblNewLabel_1_6_9.setForeground(Color.WHITE);
		lblNewLabel_1_6_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_9.setBounds(872, 502, 76, 20);
		panel.add(lblNewLabel_1_6_9);
		
		JLabel lblNewLabel_1_6_10 = new JLabel("2000~2016");
		lblNewLabel_1_6_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_10.setBounds(872, 554, 76, 20);
		panel.add(lblNewLabel_1_6_10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admin\\Pictures\\la-lakers-kepsar.png"));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 0, 999, 645);
		panel.add(lblNewLabel_2);
	}
}
