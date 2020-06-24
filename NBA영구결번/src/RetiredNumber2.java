import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.SwingConstants;

public class RetiredNumber2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetiredNumber2 frame = new RetiredNumber2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static String[][] getRetiredPlayers(){
		try {
			Connection con =  getConnection();
			PreparedStatement statement = con.prepareStatement("Select * FROM la");
			ResultSet results = statement.executeQuery();
			ArrayList<String[]> list = new ArrayList<String[]>();
			while(results.next()) {
				list.add(new String[] {
						results.getString("RNumber"),
						results.getString("Name"),
						results.getString("Position"),
						results.getString("YOE"),
						});
			}
			System.out.println("데이터 모두 불러왔다!");
			String[][] arr = new String[list.size()][4];
			return list.toArray(arr);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * Create the frame.
	 */
	public RetiredNumber2() {
		setBounds(new Rectangle(0, 0, 484, 296));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 488);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(0, 0, 484, 296));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		String[][]data = getRetiredPlayers();
		String[] headers = new String[] {"Name","Retired Number","Position","Year Of Enrollment"};
		JTable table = new JTable(data,headers); // 테이블
		table.setRowHeight(30);
		table.setFont(new Font("Sanserif",Font.BOLD,15));
		table.setAlignmentX(0);
		table.setSize(800,400);
		table.setPreferredScrollableViewportSize(new Dimension(800,400));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setFont(new Font("휴먼둥근헤드라인", Font.ITALIC, 12));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, 823, 449);
		contentPane.add(scrollPane);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Pictures\\la-lakers-kepsar.png"));
		lblNewLabel.setBounds(0, 0, 823, 449);
		contentPane.add(lblNewLabel);
	}
	public static Connection getConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String pass = "1234";

		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("DB 연결 완료!");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
