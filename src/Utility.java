import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.sql.*;
public class Utility{
DataAccess da=new DataAccess();
	
	int score;
	
public void getScore(int s)
{
	System.out.println(s);
	score=s;
}
	public void updateData(MyFrame frame)
	{
		
		String sql="INSERT INTO score (SL,Name)" + "VALUES (NULL,'"+frame.NameField.getText()+"');";
				
		
		da.updateDB(sql);
	}
	
	
}