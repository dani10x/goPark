
package SQL;


import Clases.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mojica
 */
public class InsertarCliente {
    
    public static void InsertarCliente(String id, String name, String cellphone){
    
    Cliente c1 = new Cliente();
   
    c1.setId(id);
    c1.setName(name);
    c1.setCellphone(cellphone);
    
    try
           {
               //LLAMO A LA CONEXION
               Connection cnx = Coneccion.getConnection();
               //PREPARA EL ESPACION
               Statement  st = cnx.createStatement();

               // CREO EL STRING CON LA INSERCION
               String insertar = "INSERT INTO CLIENTS VALUES ('"+c1.getId()+"','"+c1.getName()+"','"+c1.getCellphone()+"')";
               //BOTA EN TABLA O RESULTADOS
               st.executeUpdate(insertar);
              

            }
        catch(SQLException ex)
            {
                System.out.println(ex.getMessage());
                System.out.println("\nERROR: No se pudo insertar el Cliente en la Base de Datos");
            }
    
    }
    
}
