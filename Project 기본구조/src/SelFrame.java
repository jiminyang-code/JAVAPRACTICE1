
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.sql.*;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelFrame extends JFrame {

	private JPanel contentPane;
	private static Vector<JLabel> numVector=new Vector<JLabel>();
	private static Vector<JLabel> nameVector=new Vector<JLabel>();
	private static Vector<JLabel> ageVector=new Vector<JLabel>();
	private static Vector<JLabel> posVector=new Vector<JLabel>();

	private static Vector<JLabel> avgVector=new Vector<JLabel>();
	private static JPanel panel = new JPanel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelFrame frame = new SelFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void getPlayers(){
		
		try {
			Connection conn=getConnection(); //db¿¬°á
			PreparedStatement statement=conn.prepareStatement(
					"SELECT * FROM player");
			ResultSet result=statement.executeQuery();
			numVector.clear();
			nameVector.clear();
			ageVector.clear();
			posVector.clear();
			avgVector.clear();
			while(result.next()) {
				numVector.add(new JLabel(result.getString("num")));
				nameVector.add(new JLabel(result.getString("name")));
				ageVector.add(new JLabel(result.getString("age")));
				posVector.add(new JLabel(result.getString("pos")));
				avgVector.add(new JLabel(result.getString("avg")));
			}
			
			for(int i=0; i<numVector.size(); i++) {
				JLabel num=numVector.get(i);
				num.setForeground(Color.WHITE);
				num.setBounds(0,20,60,30+(30*i));
				num.setFont(new Font("±¼¸²", Font.BOLD, 12));
				num.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(num);
				JLabel nam=nameVector.get(i);
				nam.setForeground(Color.WHITE);
				nam.setBounds(60, 20, 105, 30+(30*i));
				nam.setFont(new Font("±¼¸²", Font.BOLD, 12));
				nam.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(nam);
				JLabel age=ageVector.get(i);
				age.setForeground(Color.WHITE);
				age.setBounds(165,20,65,30+(30*i));
				age.setFont(new Font("±¼¸²", Font.BOLD, 12));
				age.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(age);
				JLabel loc=posVector.get(i);
				loc.setForeground(Color.WHITE);
				loc.setBounds(230,20,80,30+(30*i));
				loc.setFont(new Font("±¼¸²", Font.BOLD, 12));
				loc.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(loc);
				JLabel avg=avgVector.get(i);
				avg.setForeground(Color.WHITE);
				avg.setBounds(310,20,65,30+(30*i));
				avg.setFont(new Font("±¼¸²", Font.BOLD, 12));
				avg.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(avg);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public SelFrame() {
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
		
		getPlayers();
		
		JButton numb = new JButton("\uBC88\uD638");
		numb.setFont(new Font("±¼¸²", Font.BOLD, 10));
		numb.setBounds(0, 0, 60, 25);
		panel.add(numb);
		
		JButton nameb = new JButton("\uC774\uB984");
		nameb.setFont(new Font("±¼¸²", Font.BOLD, 10));
		nameb.setBounds(60, 0, 105, 25);
		panel.add(nameb);
		
		JButton ageb = new JButton("\uB098\uC774");
		ageb.setFont(new Font("±¼¸²", Font.BOLD, 10));
		ageb.setBounds(165, 0, 65, 25);
		panel.add(ageb);
		
		JButton posb = new JButton("\uD3EC\uC9C0\uC158");
		posb.setFont(new Font("±¼¸²", Font.BOLD, 10));
		posb.setBounds(230, 0, 80, 25);
		panel.add(posb);
		
		JButton avgb = new JButton("\uD3C9\uB4DD");
		avgb.setFont(new Font("±¼¸²", Font.BOLD, 10));
		avgb.setBounds(310, 0, 65, 25);
		panel.add(avgb);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\hicl.png"));
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
		panel.add(finButton); }
		
		

				
		
	public static Connection getConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String pass = "1234";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,user,pass);
			System.out.println("DB ¿¬°á ¿Ï·á!");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	


}

