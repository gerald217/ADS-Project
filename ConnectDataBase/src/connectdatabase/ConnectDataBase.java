package connectdatabase;

import java.sql.Connection;
import java.util.logging.Level;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ConnectDataBase {

    public static void main(String[] args) {
       
        try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","intet081403");
               System.out.println("Success");
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConnectDataBase.class.getName()).log(Level.SEVERE,null, ex);
        } catch (SQLException ex){
                Logger.getLogger(ConnectDataBase.class.getName()).log(Level.SEVERE,null, ex);
        }
            
    }
    
}
