import java.awt.Color;
//import java.awt.FlowLayout;
import java.awt.Font;
//import java.awt.Window;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.*;
import javax.swing.*;

public class GameOverScene  implements ActionListener  {
	
  Utility utlt=new Utility();

	public GameOverScene(String s)
	{
		JFrame frm=new JFrame();
		frm.setTitle("GameOver");
		frm.setSize(700,500);
		frm.setVisible(true);
		frm.setLayout(null);
		frm.setResizable(true);
		frm.setLocation(90, 80);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l1=new JLabel("GAME OVER");
		l1.setForeground(Color.BLACK);
		Font f=new Font("Century",Font.BOLD,30);
		l1.setFont(f);
		l1.setBounds(200,100,500,150);
		
		JButton p = new JButton("Submit");
		p.setBounds(10,10,80,45);
		frm.add(p);
		
		p.addActionListener(this);
		p.setActionCommand("Open");
		
		
		
		JLabel l2=new JLabel("Score");
		l2.setForeground(Color.BLACK);
		Font f1=new Font("Century",Font.BOLD,20);
		l2.setFont(f1);
		l2.setBounds(100,250,200,150);
		JTextField t1 = new JTextField(8);
		t1.setBounds(500,300,100,50);
		frm.add(l1);
		frm.add(l2);
		frm.add(t1);
		t1.setText(s);
		
		int p1 =Integer.parseInt(s);
		System.out.println(p1);
		
		utlt.getScore(p1);
		
	
		
	}
	
	public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand();

        if(cmd.equals("Open"))
        {
			
           
            new MyFrame();
           
          
        }
    }
}
