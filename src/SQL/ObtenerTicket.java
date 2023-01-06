
package SQL;

import Clases.tickets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mojica
 */
public class ObtenerTicket {
    public static tickets buscar(String nroticket) throws SQLException{
        tickets t1 = new tickets();
        
        //LLAMO A LA CONEXION
        Connection cnx = Coneccion.getConnection();
        //PREPARA EL ESPACION
        Statement  st = cnx.createStatement();

        // CREO EL STRING CON LA INSERCION
        String consulta = "SELECT * FROM TICKETS WHERE T_number = '"+nroticket+"'";
        //BOTA EN TABLA O RESULTADOS
        ResultSet res = st.executeQuery(consulta) ;

        while(res.next()){
            t1 = new tickets();
            
            String T_number = res.getString("T_number");
            t1.setT_number(T_number);
            
            String Fechaentrada = res.getString("Entry_time");
            t1.setEntry_time(Fechaentrada);
            
            String departure = res.getString("DEPARTURE_TIME");
            t1.setDeparture_time(departure);
            
            String Staffin = res.getString("STAFF_in");
            t1.setSTAFF_in(Staffin);
            
            String Staffout = res.getString("STAFF_OUT");
            t1.setSTAFF_out(Staffout);
            
            String celda = res.getString("PARKING_CELL_NMB");
            t1.setPARKING_CELL(Integer.parseInt(celda));
            
            
            String placa = res.getString("VEHICLE_License_plate");
            t1.setVEHICLE_License_plate(placa);
            
            String idclient = res.getString("CLIENT_Id");
            t1.setCLIENT_Id(idclient);
            
            String costo = res.getString("Cost");
            t1.setCost(costo);
            
            String RATES_Id = res.getString("RATES_Id");
            t1.setRATES_Id(RATES_Id);
            
            
        }
        
        
        return t1;
    }
    
    
}
