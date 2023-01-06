
package SQL;

import Clases.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author Mojica
 */
public class InsertarTicket {
    public static void InsertarTicket(tickets t1) throws SQLException{
        
        //LLAMO A LA CONEXION
        Connection cnx = Coneccion.getConnection();
        //PREPARA EL ESPACION
        Statement  st = cnx.createStatement();
        //CREO LA LA INSERCION
        
        String fecha = fechaentrada();
        t1.setEntry_time(fecha);
        
        String nrotarifa = tarifa(t1);
        t1.setRATES_Id(nrotarifa);
       

        String insercion = "INSERT INTO TICKETS VALUES (To_Char(increment_tickets.NextVal),"+t1.getEntry_time()+",null,null,'"+t1.getSTAFF_in()+"',"+t1.getPARKING_CELL()+",'"+t1.getVEHICLE_License_plate()+"','"+t1.getCLIENT_Id()+"',null,'"+t1.getRATES_Id()+"')";
        st.execute(insercion);
        
        // ESTA LINEA LA HACE EL TRIGGER AUTOMATICAMENTE
        //st.executeUpdate("UPDATE PARKING_CELLS SET Stts = 1 WHERE Nmb = "+t1.getPARKING_CELL());
        
        
}
    
public static String fechaentrada(){
    
    String dia = (int)Math.floor(Math.random()*(21-18+1)+20)+"";
    String hora = (int)Math.floor(Math.random()*(23-0+1)+0)+"";
    String min = (int)Math.floor(Math.random()*(59-0+1)+0)+"";
    
    
        String fecha = "TO_DATE('"+dia+"/JUN/2022 "+hora+":"+min+"','DD/MON/YYYY HH24:MI')";
        
    System.out.println(fecha);
        return fecha;
    }

public static String tarifa(tickets t1) throws SQLException{
    
    
        //LLAMO A LA CONEXION
        Connection cnx = Coneccion.getConnection();
        //PREPARA EL ESPACION
        Statement  st = cnx.createStatement();
        //CREO LA LA INSERCION
        String consultatarifa = "SELECT RATES.Id FROM VEHICLES INNER JOIN TYPES ON VEHICLES.TYPES_ID = TYPES.ID INNER JOIN RATES ON RATES.TYPES_Id = TYPES.Id WHERE VEHICLES.License_plate = '"+t1.getVEHICLE_License_plate()+"'";
        ResultSet res = st.executeQuery(consultatarifa);
        
        String tarifa = "";
        while(res.next()){
            tarifa = res.getString("Id");
        }
       
        
        
    return tarifa;
}



}
