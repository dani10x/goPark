package crud_parqueadero;

import crud_parqueadero.interfaz.*;
import daos.DAOS;
import java.sql.SQLException;
import java.text.ParseException;


/**
 *
 * @author Daniel Alzate 
 */
public class CRUD_Parqueadero {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ParseException, SQLException {
        DAOS daos = new DAOS();
        daos.start();
        Inicio i = new Inicio(daos);
        i.setVisible(true);
        
                
    }
    
}
