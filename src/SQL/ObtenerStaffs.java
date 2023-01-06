
package SQL;

import clases.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mojica
 */
public class ObtenerStaffs {
    
    public static ArrayList<Staff> ObtenerStaff() throws SQLException{
        
        ArrayList <Staff> As = new ArrayList();
        
        try{    
           //LLAMO A LA CONEXION
           Connection cnx = Coneccion.getConnection();
           //PREPARA EL ESPACION
           Statement  st = cnx.createStatement();

           // CREO EL STRING CON LA INSERCION
           String consulta = "SELECT * FROM STAFFS";
           //BOTA EN TABLA O RESULTADOS
           ResultSet res = st.executeQuery(consulta) ;
           
           while(res.next()){
               Staff s1;
               s1 = new Staff();
               String Id = res.getString("Id");
               s1.setId(Id);
               
               String Name = res.getString("Name");
               s1.setName(Name);
               
               String Cellphone = res.getString("Cellphone");
               s1.setCellphone(Cellphone);
               
               String Schedule = res.getString("SCHEDULE_Code");
               s1.setSchedule_Code(Schedule);
               
               As.add(s1);
           }

        }catch(SQLException e){
            System.out.println(e);
        }
        
        return As;
        
    }
    
}
