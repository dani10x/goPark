
package SQL;

import Clases.tickets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Mojica
 */
public class ActualizarTicket {
    public static tickets Actualizar(tickets t1) throws SQLException{
        
        //LLAMO A LA CONEXION
        Connection cnx = Coneccion.getConnection();
        //PREPARA EL ESPACION
        Statement  st = cnx.createStatement();
        
        String coste = Costo(t1);
        
        String prueba = "UPDATE TICKETS SET DEPARTURE_TIME = TO_DATE('"+t1.getDeparture_time2()+"','DD/MM/YYYY HH24:MI'), STAFF_OUT = '"+t1.getSTAFF_out()+"', COST = '"+coste+"' WHERE T_number = '"+t1.getT_number()+"'";

         st.executeUpdate(prueba);
         
         return t1;
    }
    
   
    private static String Costo(tickets t1) throws SQLException {
       
        String coste = "";
        
        //LLAMO A LA CONEXION
        Connection cnx = Coneccion.getConnection();
        //PREPARA EL ESPACION
        Statement  st = cnx.createStatement();

        // CREO EL STRING CON LA INSERCION
        String consulta = "SELECT HOUR_VALUE FROM RATES WHERE Id = '"+t1.getRATES_Id()+"'";
        //BOTA EN TABLA O RESULTADOS
        ResultSet res = st.executeQuery(consulta);

        int preciohora = 0;
        while(res.next()){
            preciohora = Integer.parseInt(res.getString("HOUR_VALUE"));
        }
        
        String[] fechaentrada = t1.getEntry_time().split(" ");
        String[] fechasalida = t1.getDeparture_time().split(" ");
        
        String fechaentrada1 = fechaentrada[0];
        String horaentrada = fechaentrada[1];
        
        String fechasalida1 = fechasalida[0];
        String horasalida = fechasalida[1];
                

        LocalDate d1 = LocalDate.parse((fechaentrada1), DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d2 = LocalDate.parse((fechasalida1), DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate d3 = LocalDate.parse((fechaentrada1), DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d4 = LocalDate.parse((fechasalida1), DateTimeFormatter.ISO_LOCAL_DATE);

        Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
        Period period = Period.between(d3, d4);

        
        long diffDays = diff.toDays();
        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
        
       
        if(diffDays == 0){
            // ENTRA Y SALE EL MISMO DIA ENTONCES RESTO LAS HORAS
            
           String[] horasalida5 = horasalida.split(":");
           int horasalreal = Integer.parseInt(horasalida5[0]+horasalida5[1]);
           
           String[] horaentrada5 = horaentrada.split(":");
           int horaentreal = Integer.parseInt(horaentrada5[0]+horaentrada5[1]);
            
           
            if(((((horasalreal - horaentreal) * (int)preciohora)) / 100000) == 0){
               coste = ((int)(preciohora / 1000))+".000";
            }else{
                coste = (int)((((horasalreal - horaentreal) * (int)preciohora)) / 100000)+".000";
            }
           
        }else{
            coste = (diffDays*(preciohora*10)/1000)+".000";
            
        }
            
        
        t1.setCost(coste);
        return coste;
    }
   
}
