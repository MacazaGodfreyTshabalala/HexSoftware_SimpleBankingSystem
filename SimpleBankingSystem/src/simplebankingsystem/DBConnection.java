

package simplebankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    
    public static Connection getConnection() throws SQLException{
    String url = "jdbc://localhost:3306/java_crud_db";
    String user ="root";
    String password ="";
    
    
    return DriverManager.getConnection(url,user,password);
    }
    
}
