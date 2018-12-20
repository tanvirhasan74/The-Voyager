import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.io.IOException;
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

public class ThreadMain {
	KeyLisPanel  GamePanel;
	//GameScreen gs;
	public ThreadMain()
	{
		
				
				Thread t = new Thread(new Runnable() {
					
					@Override
					public void run() {
						while(true){
							GamePanel.sx1 +=5;
							GamePanel.sx2 +=5;
						
							
							GamePanel.repaint();
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
					
					@Override
					public void run() {
						while(true){
							
							GamePanel.oix -=15;
							
							GamePanel.repaint();
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
				
				
							
				
				
				
		
	}
}
