import javax.swing.*;
import java .awt.event.*;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
public class Screen extends JFrame implements ActionListener {
	int x=10,y=50;
	public JButton b1,b2,b3,b4;
	String soundPath;
	//GameScreen sc;
	boolean sound=true;
	
	AudioClip clip;
	public Screen()
	{
		this.setTitle("The Voyager");
		this.setSize(1100,600);
		this.setResizable(false);
		this.setLocation(90, 80);
		this.setBackground(Color.BLUE);
		
		this.setLayout(null);
		this.setBackground(getBackground());
		this.setVisible(true);			
		this.addComponentsToFrame();
		this.soundPath="/Sound/Song.wav";
		URL url = Screen.class.getResource(this.soundPath);
		 clip = Applet.newAudioClip(url);
		clip.play();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
	}
		

	public void addComponentsToFrame()
	{
		b1=new JButton("START GAME");
		b2=new JButton("HIGH SCORE");
		b3=new JButton("SOUND");
		b4=new JButton("EXIT");
		b1.setBackground(new Color(255,102,0));
		b2.setBackground(new Color(255,102,0));
		b3.setBackground(new Color(255,102,0));
		b4.setBackground(new Color(255,102,0));

		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		Font f=new Font("Century",Font.BOLD,20);
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		this.b1.setBounds(380,60,300,40);
		this.b2.setBounds(380,120,300,40);
		this.b3.setBounds(380,180,300,40);
		this.b4.setBounds(380,240,300,40);
		b1.addActionListener(this);
        b1.setActionCommand("Open");
        b2.addActionListener(this);
        b2.setActionCommand("score");
        b3.addActionListener(this);
        b3.setActionCommand("sound");
        b4.addActionListener(this);
        b4.setActionCommand("exit");
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
	        else if(cmd.equals("score"))
	        {
	        	dispose();
	        	
	        	new HighScoreFrame();
	        	 
	        }
	        else if(cmd.equals("sound"))
	        {
	        	
	        	if(this.sound==true)
	        	{
	        		clip.stop();
	        		sound=false;
	        	}
	        	else if(this.sound==false)
	        	{
	        		clip.play();
	        		sound=true;
	        	}
	        	 
	        }
	        else if(cmd.equals("exit"))
	        {
	        	
	        	
	        	System.exit(0);
	        	 
	        }
	        else 
		    	System.out.println("not called");
	    }
	    
	
	
	
}
