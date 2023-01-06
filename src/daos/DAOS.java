package daos;

import Clases.Brands;
import Clases.Colors;
import Clases.Types;
import Clases.Vehiculos;
import Clases.tickets;
import clases.*;
import java.util.ArrayList;
import SQL.*;
import java.sql.SQLException;

/**
 *
 * @author Daniel Alzate
 */
public class DAOS {
    ArrayList<Staff> staffs;
    Staff selectedStaff;


    public DAOS() {
        
    }
    
    public void start() throws SQLException{
        staffs=ObtenerStaffs.ObtenerStaff();
    }
    
    public ArrayList<String> getStaffs_name(){
        ArrayList<String> names = new ArrayList<>();
        for(int i=0; i<staffs.size(); i++){
            names.add(staffs.get(i).getName());
        }
        return names;
    }
    
    public void crearCliente(String id, String name, String cellphone){
        InsertarCliente.InsertarCliente(id, name, cellphone);
    }

    public void setSelectedStaff(Staff selectedStaff) {
        this.selectedStaff = selectedStaff;
    }
    
    public void setSelectedStaff(String name){
        for(int i=0; i<staffs.size(); i++){
            if(name.equals(staffs.get(i).getName())){
                setSelectedStaff(staffs.get(i));
                break;
            }
        }
    }
    
    public ArrayList<Brands> getMarcas() throws SQLException{
        ArrayList<Brands> marcas = ObtenerBrands.obtener();
        
        return marcas;
    }
    
    public ArrayList<Types> getTipos() throws SQLException{
        ArrayList<Types> tipos = ObtenerTypes.obtener();
        
        return tipos;
    }
    
    public ArrayList<Colors> getColores() throws SQLException{
        ArrayList<Colors> colores = ObtenerColors.obtener();
        
        return colores;
    }
    
    public void crearVehiculo(Vehiculos v) throws SQLException{
        InsertarVehiculo.Insertar(v);
    }
    
    public ArrayList<String> getCeldasDis() throws SQLException{
        return ObtenerCeldasVacias.obtenerceldas();
    }
    
    public ArrayList<String> getPlacas() throws SQLException{
        return ObtenerVehiculos.ObtenerVehiculo();
    }
    
    public ArrayList<String> getClientes() throws SQLException{
        return ObtenerClientes.ObtenerCliente();
    }

    public Staff getSelectedStaff() {
        return selectedStaff;
    }
    
    public void crearTicket(tickets t) throws SQLException{
        InsertarTicket.InsertarTicket(t);
    }
    
    public tickets buscar(String id) throws SQLException{
        return ObtenerTicket.buscar(id);
    }
    
    public void borrar(String id) throws SQLException{
        BorrarTicket.Borrar(id);
    }
    
    public tickets actualizar(tickets t) throws SQLException{
        return ActualizarTicket.Actualizar(t);
    }
}
