import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Smile {
	static JFrame frame = new JFrame("Smile");
	static DrawPanel dP;
	static JButton smileButton;

	public static void main(String[] args) {
		Smile smile = new Smile();
		smile.go();
	}

	public void setUpGui() {
		dP = new DrawPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		smileButton = new JButton("Smile!");
		smileButton.addActionListener(dP);
		frame.getContentPane().add(BorderLayout.SOUTH, smileButton);
		frame.getContentPane().add(BorderLayout.CENTER, dP);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}

	public void go() {
		setUpGui();
	}

	class DrawPanel extends JPanel implements ActionListener {
		boolean msg = false;

		public void actionPerformed (ActionEvent event) {
			frame.repaint();
			System.out.println("button pressed");
			if (msg) {
				msg = false;
			} else if (!msg) {
				msg = true;
			}
		}

		public void paintComponent (Graphics g) {
			System.out.println("Loading drawpanel");
			System.out.println(msg);

			if (!msg) {
				g.setColor(new Color(100,0,0));
				g.fillRect(0,0,this.getWidth(), this.getHeight());
			}

			if (msg) {
				System.out.println("image");
				Image image = new ImageIcon("smile.jpg").getImage();
				g.drawImage(image, 0, 0, this);
			}
		}
	}
}