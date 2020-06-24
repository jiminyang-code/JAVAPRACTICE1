package MultiFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
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
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setSize(800,600);
		setLocationRelativeTo(null);//화면정중앙
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uCCAB\uBC88\uC9F8\uD504\uB808\uC784\uC785\uB2C8\uB2E4");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(26, 10, 383, 76);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uB450\uBC88\uC9F8\uD504\uB808\uC784\uC73C\uB85C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //원래프레임 삭제
				new Frame2().setVisible(true); //새 프레임 생성
			}
		});
		btnNewButton.setBounds(26, 113, 137, 138);
		contentPane.add(btnNewButton);
	}

}
