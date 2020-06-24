
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
		setTitle("LA player data CRUD Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 460);
        setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImgPanel panel = new ImgPanel(new ImageIcon("C:\\자바학습\\Pro젝트\\image\\main.jpeg").getImage());
		panel.setBounds(0, 0, 750, 421);
		contentPane.add(panel);
		
		JButton createbutton = new JButton("");
		createbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new InsFrame().setVisible(true);
			}
		});
		createbutton.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\Pro\uC81D\uD2B8\\image\\C.png"));
		createbutton.setBackground(new Color(255, 255, 240));
		createbutton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), null, null, new Color(255, 165, 0)));
		createbutton.setBounds(12, 10, 140, 140);
		panel.add(createbutton);
		JButton readbutton = new JButton("");
		readbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new SelFrame().setVisible(true);
			}
		});
		readbutton.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\Pro\uC81D\uD2B8\\image\\R.png"));
		readbutton.setBackground(new Color(255, 255, 240));
		readbutton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 165, 0), null, null, new Color(255, 255, 0)));
		readbutton.setBounds(598, 10, 140, 140);
		panel.add(readbutton);
		
		JButton updatebutton = new JButton("");
		updatebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new UpdFrame().setVisible(true);
			}
		});
		updatebutton.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\Pro\uC81D\uD2B8\\image\\U.png"));
		updatebutton.setBackground(new Color(255, 255, 240));
		updatebutton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 165, 0), null, null, new Color(255, 255, 0)));
		updatebutton.setBounds(12, 271, 140, 140);
		panel.add(updatebutton);
		
		JButton deletebutton = new JButton("");
		deletebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new DelFrame().setVisible(true);
			}
		});
		deletebutton.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\Pro\uC81D\uD2B8\\image\\D.png"));
		deletebutton.setBackground(new Color(255, 255, 240));
		deletebutton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), null, null, new Color(255, 165, 0)));
		deletebutton.setBounds(598, 271, 140, 140);
		panel.add(deletebutton);
		
		JButton endbutton = new JButton("\uC885\uB8CC");
		endbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		endbutton.setBounds(319, 330, 97, 23);
		panel.add(endbutton);
	}

}
class ImgPanel extends JPanel{
	private Image img;
	
	public ImgPanel(Image img){
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 0, null);
	}
}
