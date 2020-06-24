//어제 복습
package 예제11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PageMove {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageMove window = new PageMove();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PageMove() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel FirstPage = new JPanel();
		FirstPage.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(FirstPage);
		FirstPage.setLayout(null);
		
		JLabel La1 = new JLabel("\uCCAB\uBC88\uCA30\uD398\uC774\uC9C0");
		La1.setHorizontalAlignment(SwingConstants.CENTER);
		La1.setBounds(53, 29, 324, 50);
		FirstPage.add(La1);
		
		JButton btn1 = new JButton("NEXT");
		
		btn1.setBounds(26, 106, 115, 115);
		FirstPage.add(btn1);
		
		JPanel SecondPage = new JPanel();
		SecondPage.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(SecondPage);
		SecondPage.setLayout(null);
		
		JLabel La2 = new JLabel("\uB450\uBC88\uCA30\uD398\uC774\uC9C0");
		La2.setHorizontalAlignment(SwingConstants.CENTER);
		La2.setBounds(58, 35, 323, 47);
		SecondPage.add(La2);
		
		JButton btn2 = new JButton("BEFORE");
		btn2.setBounds(277, 104, 114, 123);
		SecondPage.add(btn2);
	
	    SecondPage.setVisible(false); //처음실행시 두번째페이지는 보이지않게(첫번째만보이게)
	
	    btn1.addActionListener(new ActionListener() {          
			public void actionPerformed(ActionEvent arg0) {    
			FirstPage.setVisible(false);                       
			SecondPage.setVisible(true);                       
			
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) { 
				FirstPage.setVisible(false);
				SecondPage.setVisible(true);
				
				}
			});
			
			}
		});
	}
}
