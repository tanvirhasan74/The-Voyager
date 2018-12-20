import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.sql.*;
public class WindowSensor extends WindowAdapter {
	
		public void windowClosing(WindowEvent we){
	        System.out.println("Window is closing");
			System.exit(0);
		}
}
