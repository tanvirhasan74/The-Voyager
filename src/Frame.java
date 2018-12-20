import javax.swing.JFrame;

public class Frame extends JFrame {
	public Frame()
	{
		this.setTitle("The Voyager");
		this.setSize(1100,600);
		this.setResizable(false);
		this.setLocation(90, 80);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setBackground(getBackground());
		this.setVisible(true);
	}
	
	

}
