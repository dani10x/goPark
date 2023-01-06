
package SQL;

import Clases.Types;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mojica
 */
public class ObtenerTypes {
    public static ArrayList<Types> obtener() throws SQLException{
       
        ArrayList <Types> br = new ArrayList();
        
        //LLAMO A LA CONEXION
           Connection cnx = Coneccion.getConnection();
           //PREPARA EL ESPACION
           Statement  st = cnx.createStatement();

           // CREO EL STRING CON LA INSERCION
           String consulta = "SELECT * FROM TYPES";
           //BOTA EN TABLA O RESULTADOS
           ResultSet res = st.executeQuery(consulta);

           while(res.next()){
               Types c1 = new Types();
               String id = res.getString("Id");
               c1.setId(id);
               
               String Name = res.getString("Name");
               c1.setName(Name);
               
               br.add(c1);
           }
        
        
        return br;
    }
    
    
}
