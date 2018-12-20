import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JComponent.*;

public class GameScreen extends JFrame

{
	
KeyLisPanel keylispanel;
GameOverScene gos;
JMenuBar bar;
JMenu file;
JMenuItem start;

//AudioClip clip;	
//String soundPath;
	
    public GameScreen()
    {
        super("Another GUI");
    	this.setTitle("The Voyager");
		this.setSize(1300,600);
		this.setResizable(false);
		this.setLocation(40, 50);		
   	     this.setVisible(true);
   	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	   
   	//this.soundPath="/Sound/One_Direction_-_Story_of_My_Life.wav";
	//URL url = Screen.class.getResource(this.soundPath);
	// clip = Applet.newAudioClip(url);
	//clip.play();
	
	
       this.keylispanel= new KeyLisPanel();
		
		this.add(this.keylispanel);
		addMenuToFrame();
		
    }
    
    
  


	private void addMenuToFrame() {
		this.bar = new JMenuBar(); this.file = new JMenu("File");
		this.start = new JMenuItem("Start");
		//this.stop = new JMenuItem("stop");
		this.setJMenuBar(this.bar);
		
		this.bar.add(this.file);
		this.file.add(this.start);
		//this.file.add(this.stop);
		
		this.start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Thread t = new Thread(new Runnable() {
					
					@Override
					public void run() {
						while(true){
							
							
							keylispanel.sx1 +=5;
							keylispanel.sx2 +=5;
							//keylispanel.oix -=15;
							
							keylispanel.repaint();
							try {
								Thread.sleep(200);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				});
				
				t.start();
				
				Thread t2 = new Thread(new Runnable() {
					boolean run3=true;
					@Override
					public void run() {
						
						while(run3){
							Rectangle r = new Rectangle(keylispanel.x,keylispanel.y,keylispanel.width,keylispanel.height);	
							Rectangle s = new Rectangle(keylispanel.oix,keylispanel.oiy,keylispanel.oiWidth,keylispanel.oiHeight);
							 if (s.intersects(r))
							    {
								
								 dispose();	
								 run3=false;
								 
								 String str=keylispanel.scoreField.getText();
								// new GameOverScene(str);
								
							    }
							
							
							keylispanel.oix -=15;
							
							keylispanel.repaint();
							try {
								Thread.sleep(150);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				});
				
				t2.start();
				/*
				 
				 
				 */
	Thread t3 = new Thread(new Runnable() {
		boolean run2=true;
					@Override
					public void run() {
						
						while(run2){
							
							Rectangle r = new Rectangle(keylispanel.x,keylispanel.y,keylispanel.width,keylispanel.height);	
							Rectangle s = new Rectangle(keylispanel.oix2,keylispanel.oiy2,keylispanel.oi2Width,keylispanel.oi2Height);
							 if (s.intersects(r))
							    {
								
								 dispose();
								 run2=false;
								 String str=keylispanel.scoreField.getText();
							//	 new GameOverScene(str);
		 
								
							    }
							keylispanel.oix2 -=15;
							
							keylispanel.repaint();
							try {
								Thread.sleep(150);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				});
				
				t3.start();
	Thread t4 = new Thread(new Runnable() {
					
					@Override
					public void run() {
						boolean run=true;
						while(run){
							Rectangle r = new Rectangle(keylispanel.x,keylispanel.y,keylispanel.width,keylispanel.height);	
							Rectangle s = new Rectangle(keylispanel.oix3,keylispanel.oiy3,keylispanel.oi3Width,keylispanel.oi3Height);
							 if (s.intersects(r))
							    {
								
								 dispose();
								 run=false;
								
								 String str=keylispanel.scoreField.getText();
								// new GameOverScene(str);
							
							    }
							
							keylispanel.oix3 -=13;
							
							keylispanel.repaint();
							try {
								Thread.sleep(130);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				});
				
				t4.start();
	Thread t5 = new Thread(new Runnable() {
					
					@Override
					public void run() {
						boolean run=true;
						while(run){
							
							Rectangle r = new Rectangle(keylispanel.x,keylispanel.y,keylispanel.width,keylispanel.height);	
							Rectangle s = new Rectangle(keylispanel.oix4,keylispanel.oiy4,keylispanel.oi4Width,keylispanel.oi4Height);
							 if (s.intersects(r))
							    {
								
								 dispose();
								 run=false;
								 String str=keylispanel.scoreField.getText();
								// new GameOverScene(str);
	
							    }
							keylispanel.oix4 -=17;
							
							keylispanel.repaint();
							try {
								Thread.sleep(170);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				});
				
				t5.start();
				
				
				
							
				
				
				
			}
		});
    }
    
    
   

}