/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Mojica
 */
public class BorrarTicket {
    
    @SuppressWarnings("empty-statement")
    public static void Borrar(String Codigo) throws SQLException{
        
        try{
               //LLAMO A LA CONEXION
               Connection cnx = Coneccion.getConnection();
               //PREPARA EL ESPACION
               Statement  st = cnx.createStatement();

               // CREO EL STRING CON LA INSERCION
               String borrar = "DELETE FROM TICKETS WHERE T_number = '"+Codigo+"'";
               //BOTA EN TABLA O RESULTADOS
               st.execute(borrar);
               
        }catch(SQLException e){
            System.out.println(e);};
    }
    
}
