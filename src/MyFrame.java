import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.sql.*;
public class MyFrame extends JFrame implements ActionListener{
	Utility u;
	public String msg;
	public JTextField NameField;
	public Label message;
	Screen sc;
	public MyFrame()
	{
		
		super("Input Name");
				
		
		message=new Label();
		JLabel nameLabel=new JLabel("Enter Name");
		
		JButton submitButton=new JButton("Submit");
		
	    NameField=new JTextField(30);
		
	
		add(nameLabel);
		add(NameField);
		
		add(submitButton);
		add(message);
		submitButton.addActionListener(this);
		submitButton.setActionCommand("Open");
		
		
		
		
		setSize(400,400);
		int screenWidth=(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		
		setLocation((screenWidth-280)/2,120);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
    {
		
		boolean flag=true;
		String dn=this.NameField.getText();
		if(dn.length()==0){
			JOptionPane.showMessageDialog(this,"You must provide a Name");
			System.out.println("You must provide a Name");
			flag=false;
		}
		String s=ae.getActionCommand();
		
		if(flag && s.equals("Open")){
			
			//u.updateData(this);
			dispose();
			sc=new Screen();
		}
		
	}
}
