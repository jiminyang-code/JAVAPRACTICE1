import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.RowFilter;

public class RetiredNumber extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LA Lakers");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(312, 10, 132, 25);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Permanent");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose(); //원래프레임삭제
				new RetiredNumber2().setVisible(true); //새 프레임 생성
			}
		});
		btnNewButton.setBounds(247, 311, 103, 15);
		contentPane.add(btnNewButton);
		
//		search.addKeyListener(new KeyAdapter() { // 검색바 액션키리스너
//			public void keyReleased(KeyEvent e) {
//				String val = search.getText();
//				TableRowSorter<TableModel> trs = new TableRowSorter<>(table.getModel());
//				table.setRowSorter(trs);
//				trs.setRowFilter(RowFilter.regexFilter(val));
//			}
//		});
		textField = new JTextField();
		textField.setBounds(39, 147, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(507, 147, 116, 21);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("RetiredNumber");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(53, 80, 87, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Position");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(533, 80, 57, 15);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Pictures\\FOYU.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 650, 336);
		contentPane.add(lblNewLabel);
	}

}
