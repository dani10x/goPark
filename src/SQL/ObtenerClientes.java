
package SQL;

import Clases.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mojica
 */
public class ObtenerClientes {
    public static ArrayList<String> ObtenerCliente() throws SQLException{
        Cliente c1 = new Cliente();
        
        try{    
           //LLAMO A LA CONEXION
           Connection cnx = Coneccion.getConnection();
           //PREPARA EL ESPACION
           Statement  st = cnx.createStatement();

           // CREO EL STRING CON LA INSERCION
           String consulta = "SELECT Id FROM Clients";
           //BOTA EN TABLA O RESULTADOS
           ResultSet res = st.executeQuery(consulta) ;

           while(res.next()){
               String cedula = res.getString("Id");
               c1.setAc(cedula);
           }

        }catch(SQLException e){
            System.out.println(e);
        }
        return c1.getAc();
    }
    
}
