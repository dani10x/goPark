
package SQL;

import Clases.Vehiculos;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Mojica
 */
public class ObtenerVehiculos {
    
    public static ArrayList<String> ObtenerVehiculo() throws SQLException{
        Vehiculos v1 = new Vehiculos();
        
        try{    
           //LLAMO A LA CONEXION
           Connection cnx = Coneccion.getConnection();
           //PREPARA EL ESPACION
           Statement  st = cnx.createStatement();

           // CREO EL STRING CON LA INSERCION
           String consulta = "SELECT License_Plate FROM Vehicles";
           //BOTA EN TABLA O RESULTADOS
           ResultSet res = st.executeQuery(consulta) ;
           
           while(res.next()){
               String placa = res.getString("License_Plate");
               v1.setAVehiculos(placa);
           }


        }catch(SQLException e){
            System.out.println(e);
        }
        return v1.getAVehiculos();
    }
    
}
