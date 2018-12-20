/*import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.sql.*;
public class ButtonSensor {
	MyFrame mf;
	Utility u;
	public ButtonSensor(MyFrame f){
		mf=f;
		u=new Utility();
	}
	public void actionPerformed(ActionEvent ae){
		boolean flag=true;
		String dn=mf.slField.getText();
		if(dn.length()==0){
			JOptionPane.showMessageDialog(mf,"You must provide a Name");
			System.out.println("You must provide a Name");
			flag=false;
		}
		String s=ae.getActionCommand();
		
		if(flag && s.equals("Submit")){
			u.updateData(this);
		}
		
	}
}*/
