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
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.imageio.ImageIO;

public class KeyLisPanel extends JPanel{
	
	int x = 8, y=400, width=170,height=90;
			int oix=1100,oiy=440,oiWidth=180,oiHeight=60;
			int oix2=1500,oiy2=90,oi2Width=180,oi2Height=60;
			int oix3=900,oiy3=220,oi3Width=180,oi3Height=60;
			int oix4=1300,oiy4=350,oi4Width=180,oi4Height=60;
			int count=0;
	JLabel lblFirst;
	JTextField scoreField;
	int sx1=0, sy1=0, sx2=150, sy2;
	Random rand = new Random();
	BufferedImage backGroundImage,objectImage,obstacleImage,obstacleImage2,obstacleImage3,obstacleImage4;
	String path,imagePath,obstacleImagePath,obstacleImagePath2,obstacleImagePath3,obstacleImagePath4;
	public KeyLisPanel()
	{
		
			this.setLayout(null);
			  this.lblFirst=new  JLabel("SCORE");
			this.lblFirst.setBounds(10,5,60,60);
			Font f=new Font("Century",Font.BOLD,15);
			lblFirst.setFont(f);
			lblFirst.setForeground(new Color(150,000,100));
			this.add(lblFirst);
			 this.scoreField=new JTextField(15);
			 this.scoreField.setBounds(80,15,100,40);
			 this.add(scoreField);
			this.path = "/Images/imagesky.jpg";
			this.imagePath="/Images/plane.png";
			this.obstacleImagePath="/Images/airplane33.png";
			this.obstacleImagePath2="/Images/airplane33.png";
			this.obstacleImagePath3="/Images/airplane33.png";
			this.obstacleImagePath4="/Images/airplane33.png";
			
			try {
				backGroundImage = ImageIO.read(getClass().getResource(this.path));
				backGroundImage.getWidth();
				sy2= backGroundImage.getHeight();
				
				objectImage = ImageIO.read(getClass().getResource(this.imagePath));
				obstacleImage=ImageIO.read(getClass().getResource(this.obstacleImagePath));
				obstacleImage2=ImageIO.read(getClass().getResource(this.obstacleImagePath2));
				obstacleImage3=ImageIO.read(getClass().getResource(this.obstacleImagePath3));
				obstacleImage4=ImageIO.read(getClass().getResource(this.obstacleImagePath4));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			addLisToPanel();
			this.setFocusable(true);
	        this.requestFocusInWindow();
	        System.out.println("panel constructor");
		
	}
	
	
	private void addLisToPanel() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				//System.out.println(e.getKeyChar());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				 
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyChar());
				int code = e.getKeyCode();
				if(code==KeyEvent.VK_UP){
					
					if(y<70)
					{
					y-=0;
					repaint();
					}
				else{
					y-=8;
					repaint();
				}
										
					System.out.println("Up arrow");
					
				}else if(code==KeyEvent.VK_DOWN){
					
					if(y>470)
						{
						y+=0;
						repaint();
						}
					else{
						y+=8;
						repaint();
					}
					
					System.out.println("down arrow");
					
				}else if(code == KeyEvent.VK_LEFT){
					System.out.println("left arrow");
					
				}else if(code == KeyEvent.VK_TAB){
					System.out.println("right arrow");
					
					x+=5; repaint();
					
				}else if(code==KeyEvent.VK_SPACE){
					sx1 +=5;
					sx2 +=5;
				    repaint();
					
				}
				
			}
		});		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if(sx2>backGroundImage.getWidth())
			{
			sx1=0;
			sy1=0;
			sx2=150;
			//sy2=50;
			}
		if (oix+obstacleImage.getWidth()==0)
		{
			count+=10;
			
			oix=1200;
			  oiy = rand.nextInt(420) + 80;
			// oiy=(int)Math.round(Math.random()*300);
			  
			  
		}
		String an=Integer.toString(count);
		scoreField.setText(an);
		if (oix2+obstacleImage2.getWidth()<0)
		{
			count+=10;
			
			oix2=1200;
			  oiy2 = rand.nextInt(420) + 80;
			  
			
			  
          
          
			  
		}
	   if (oix3+obstacleImage3.getWidth()<0)
		{
			count+=10;
			
			oix3=1200;
			  oiy3 = rand.nextInt(420) + 80;
			  
			
			  
          
         
			  
		}
		if (oix4+obstacleImage4.getWidth()<0)
		{
			count+=10;
			
			oix4=1200;
			  oiy4 = rand.nextInt(420) + 80;
			  
			
			  
          
        
			  
		}
		

		g.drawImage(backGroundImage, 0, 70, this.getWidth(), this.getHeight(), sx1, sy1, sx2, sy2, null);
		g.drawImage(objectImage, x, y, width, height, null);
		g.drawImage(obstacleImage,oix,oiy,oiWidth,oiHeight,null);
		g.drawImage(obstacleImage,oix2,oiy2,oi2Width,oi2Height,null);
		g.drawImage(obstacleImage,oix3,oiy3,oi3Width,oi3Height,null);
		g.drawImage(obstacleImage,oix4,oiy4,oi4Width,oi4Height,null);
		
		
	}
}
