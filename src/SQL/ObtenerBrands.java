
package SQL;

import Clases.Brands;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mojica
 */
public class ObtenerBrands {
    public static ArrayList<Brands> obtener() throws SQLException{
       
        ArrayList <Brands> br = new ArrayList();
        
        //LLAMO A LA CONEXION
           Connection cnx = Coneccion.getConnection();
           //PREPARA EL ESPACION
           Statement  st = cnx.createStatement();

           // CREO EL STRING CON LA INSERCION
           String consulta = "SELECT * FROM BRANDS";
           //BOTA EN TABLA O RESULTADOS
           ResultSet res = st.executeQuery(consulta);

           while(res.next()){
               Brands b1 = new Brands();
               String id = res.getString("Id");
               b1.setId(id);
               
               String Name = res.getString("Name");
               b1.setName(Name);
               
               br.add(b1);
           }
        
        
        return br;
    }
    
    
}
