import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DataAccess{
    Connection conn;
    String JDBC_DRIVER;  
    String DB_URL;
    Statement stmt;
    String USER;
    String PASS;
    ResultSet rs;
    public DataAccess()
    {
        JDBC_DRIVER = "com.mysql.jdbc.Driver";
        DB_URL = "jdbc:mysql://localhost:3306/score";
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
    }
    public void close()throws SQLException{
        if(rs!=null)rs.close();
        if(rs!=null)stmt.close();
    }
	

   
    public void updateDB(String sql){
        
        try{
            stmt = conn.createStatement(); 
            stmt.executeUpdate(sql);
        }
        catch(Exception ex)
		{
            ex.printStackTrace();
        }
        
    }
}
	