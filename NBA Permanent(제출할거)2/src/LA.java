
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LA extends JFrame {
	private JRadioButton[] radio = new JRadioButton[10];
	private String[] text = { "Kobe", "Wilton", "elgin", "gail", "Magic", "Kareem", "Oneal", "James", "Jerry",
			"Jamal" };
	private ImageIcon[] image = { new ImageIcon("images/Kobe.png"), new ImageIcon("images/Wilton.png"),
			new ImageIcon("images/elgin.png"), new ImageIcon("images/gail.png"), new ImageIcon("images/magic.png"),
			new ImageIcon("images/kareem.png"), new ImageIcon("images/Oneal.png"), new ImageIcon("images/james.png"),
			new ImageIcon("images/jerry.png"), new ImageIcon("images/jamaal.png") };
	private JLabel imageLabel = new JLabel();

	public LA() {
		setLocationRelativeTo(null);
		setTitle("LA Lakers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		// c.setSize(500,500);
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);
		// radioPanel.setSize(500,500);
		ButtonGroup g = new ButtonGroup();
		for (int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		radio[0].setSelected(false);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(569, 460);
		setVisible(true);

		radio[1].setSelected(false);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(783, 562);
		setVisible(true);

		radio[2].setSelected(false);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(250, 200);
		setVisible(true);

		radio[3].setSelected(false);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(250, 200);
		setVisible(true);

		radio[4].setSelected(false);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(250, 200);
		setVisible(true);

		radio[5].setSelected(false);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(250, 200);
		setVisible(true);

		radio[6].setSelected(false);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(250, 200);
		setVisible(true);

		radio[7].setSelected(false);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(250, 200);
		setVisible(true);

		radio[8].setSelected(false);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(250, 200);
		setVisible(true);

		radio[9].setSelected(false);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(250, 200);
		setVisible(true);

		setSize(950, 990);
		setLocationRelativeTo(null);

         
		
		
	}

	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
//			if (e.getStateChange() == ItemEvent.DESELECTED)
//				return;
			if (radio[0].isSelected())
				imageLabel.setIcon(image[0]);
			else if (radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			else if (radio[2].isSelected())
				imageLabel.setIcon(image[2]);
			else if (radio[3].isSelected())
				imageLabel.setIcon(image[3]);
			else if (radio[4].isSelected())
				imageLabel.setIcon(image[4]);
			else if (radio[5].isSelected())
				imageLabel.setIcon(image[5]);
			else if (radio[6].isSelected())
				imageLabel.setIcon(image[6]);
			else if (radio[7].isSelected())
				imageLabel.setIcon(image[7]);
			else if (radio[8].isSelected())
				imageLabel.setIcon(image[8]);
			else
				imageLabel.setIcon(image[9]);
		}
	}

	public static void main(String[] args) {
		new LA();
	}

}