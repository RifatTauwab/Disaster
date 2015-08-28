/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Tauwab Uz Zahir
 */
import java.sql.*;
import javax.swing.*;
public class ConnectDB {
    Connection conn = null;
    public static Connection connectDb(){
        
       String host = "localhost";
        String dbname = "xe";
        String username = "SYSTEM";
        String password = "tauwab";
        String url="jdbc:oracle:thin:@//"+host+":1521/"+dbname;
        try{
       Class.forName("oracle.jdbc.OracleDriver");
       Connection conn = DriverManager.getConnection(url,username,password);
      //JOptionPane.showMessageDialog(null, "connected");
       System.out.print("Connected\n");
       return conn;
        }catch(Exception e){
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return null;
        }
        
    }
}
