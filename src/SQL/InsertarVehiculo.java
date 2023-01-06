
package SQL;

import Clases.Vehiculos;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Mojica
 */
public class InsertarVehiculo {
    public static void Insertar(Vehiculos v1) throws SQLException{
    
       
        //LLAMO A LA CONEXION
        Connection cnx = Coneccion.getConnection();
        //PREPARA EL ESPACION
        Statement  st = cnx.createStatement();
        //CREO LA LA INSERCION
        
        String insercion = "INSERT INTO VEHICLES VALUES ('"+v1.getLicense_plate()+"','"+v1.getBrands_id()+"','"+v1.getTypes_Id()+"','"+v1.getColors_Id()+"')";
        st.execute(insercion);
    }
    
}
