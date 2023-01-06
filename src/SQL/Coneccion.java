
package SQL;

import java.beans.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mojica
 */
public class Coneccion {
    
       public static  Connection getConnection()
            {
                try
                    {
                        Class.forName("oracle.jdbc.OracleDriver");
               
                        String myDB="jdbc:oracle:thin:@localhost:1522:XE";
                        Connection cnx = DriverManager.getConnection(myDB,"us_parqueadero","user");                    
                        return cnx;
                        
                    }
                catch(SQLException ex)
                        {
                            System.out.println(ex.getMessage());
                            System.out.println("No se pudo conectar");
                        }
                catch (ClassNotFoundException ex) {
                     Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);
                      System.out.println("Error");
                     }

                    return null;
                
                
            }
    
}
