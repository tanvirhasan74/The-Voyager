import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import javax.imageio.ImageIO;

public class ScreenPanel extends JPanel implements ActionListener{
	
	public JButton b1,b2,b3,b4;
	BufferedImage backGroundImage;
	String path;
	
	public ScreenPanel()
	{
		this.setLayout(null);
		System.out.println("hello Screen Panel");
		this.addComponentToPanel();
	}
	public void addComponentToPanel()
	{
		b1=new JButton("START GAME");
		b2=new JButton("SETTING");
		b3=new JButton("SOUND");
		b4=new JButton("EXIT");
		b1.setBackground(new Color(255,102,0));
		b2.setBackground(new Color(0,102,204));
		b3.setBackground(new Color(204,204,0));

		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		Font f=new Font("Century",Font.BOLD,20);
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		this.b1.setBounds(350,60,300,40);
		this.b2.setBounds(350,120,300,40);
		this.b3.setBounds(350,180,300,40);
		this.b4.setBounds(350,240,300,40);
		b1.addActionListener(this);
        b1.setActionCommand("Open");
		this.add(b1); this.add(b2);
		this.add(b3); this.add(b4);
	}
	
	
	public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand();

        if(cmd.equals("Open"))
        {
        	
          dispose();
            new GameScreen();
        }
        else 
	    	System.out.println("not called");
    }
	private void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
