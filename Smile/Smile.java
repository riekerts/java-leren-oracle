import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Smile {
	static JFrame frame = new JFrame("Smile");
	static DrawPanel dP;
	static JButton smileButton;
	static boolean msg = false;

	public static void main(String[] args) {
		Smile smile = new Smile();
		smile.go();
	}

	public void setUpGui() {
		dP = new DrawPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		smileButton = new JButton("Smile!");
		smileButton.addActionListener(new DrawPanel());
		frame.getContentPane().add(BorderLayout.SOUTH, smileButton);
		frame.getContentPane().add(BorderLayout.CENTER, dP);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}

	public void go() {
		setUpGui();
	}

	class DrawPanel extends JPanel implements ActionListener {

		public void actionPerformed (ActionEvent event) {
			msg = true;
			frame.repaint();
			System.out.println("button pressed");
		}

		public void paintComponent (Graphics g) {
			g.setColor(new Color(100,0,0));
			g.fillRect(0,0,this.getWidth(), this.getHeight());
			System.out.println("Loading drawpanel");
			System.out.println(msg);

			if (msg) {
				System.out.println("image");
				Image image = new ImageIcon("smile.jpg").getImage();
				g.drawImage(image, 0, 0, this);
				msg = false;
			}
		}
	}
}