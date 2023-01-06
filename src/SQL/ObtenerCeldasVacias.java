package SQL;


import Clases.Celdas;
import SQL.Coneccion;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Mojica
 */
public class ObtenerCeldasVacias {
    
    public static ArrayList<String> obtenerceldas() throws SQLException{
        
        Celdas c2 = new Celdas();
        
         //LLAMO A LA CONEXION
               Connection cnx = Coneccion.getConnection();
               //PREPARA EL ESPACION
               Statement  st = cnx.createStatement();

               // CREO EL STRING CON LA INSERCION
               String consulta = "SELECT Nmb FROM PARKING_CELLS WHERE STTS = 0";
               
               ResultSet res = st.executeQuery(consulta);
               
               while(res.next()){
                   String celdas = res.getString("Nmb");
                   c2.setCeldas(celdas);
               }
        
        
        return c2.Acel;
    }
    
}
