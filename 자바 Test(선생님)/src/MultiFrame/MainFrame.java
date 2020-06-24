package MultiFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//
//import MultiFrame.Frame1;
//
//import javax.swing.JLabel;
//import javax.swing.JButton;
//import javax.swing.SwingConstants;
//import javax.swing.JTextField;
//import javax.swing.ImageIcon;
//import java.awt.Font;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setSize(800,600);
		setLocationRelativeTo(null);//화면정중앙
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel MainFrame = new JLabel("MainFrame");
		MainFrame.setHorizontalAlignment(SwingConstants.CENTER);
		MainFrame.setBounds(38, 10, 357, 77);
		contentPane.add(MainFrame);
		
		JButton btnNewButton = new JButton("\uCCAB\uBC88\uC9F8\uD504\uB808\uC784\uC73C\uB85C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			dispose(); //원래프레임 삭제
				new Frame1().setVisible(true); //새 프레임 생성
			}
		});
		btnNewButton.setBounds(38, 121, 114, 107);
		contentPane.add(btnNewButton);
	}
}
