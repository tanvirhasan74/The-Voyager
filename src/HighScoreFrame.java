
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.DbUtils;

import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class HighScoreFrame extends JFrame implements ActionListener {
	 
	    String JDBC_DRIVER;  
	    String DB_URL;
	    Statement stmt;
	    String USER;
	    String PASS;
	    
	
	ResultSet rs;
	Connection conn;
	DataAccess ds=new DataAccess();
	public HighScoreFrame()
	{
		super("Another GUI");
		  
		JDBC_DRIVER = "com.mysql.jdbc.Driver";
        DB_URL = "jdbc:mysql://localhost:3306/datab";
        USER = "root";
        PASS = "";
        try
        {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
      
		this.setLayout(new GridLayout(2,0,10,100));
		
    	JButton jb = new JButton("Menu");
    	jb.addActionListener(this);
    	jb.setActionCommand("Open");
       
    	this.setSize(500,400);
		this.setResizable(false);
		
   	     this.setVisible(true);
   	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	
     	JButton button = new JButton("Menu");
     	
     	
     	
   	   
   	   
	     
   	String sql="select * from score  order by HScore desc limit 5";
      System.out.println(sql);
     this.getData(sql);
     this.add(jb);
	}
	  public void close()throws SQLException{
          if(rs!=null)rs.close();
          if(rs!=null)stmt.close();
      }
	  
	  public void actionPerformed(ActionEvent e)
	  {
		  String cmd = e.getActionCommand();
		  if(cmd.equals("Open"))
		  {
			  dispose();
			  new Screen();
		  }
	  }
	public void getData(String query) 
	{
        try{
            stmt = conn.createStatement();
            rs= stmt.executeQuery(query);
          
			JTable table=new JTable();	
			table.setModel(DbUtils.resultSetToTableModel(rs));
			this.add(table);
        }
        catch(Exception ex)
		{
            System.out.println("DB Read Error !");
            
        }
        
   }
	
}
