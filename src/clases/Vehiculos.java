package Clases;

import java.util.ArrayList;


/**
 *
 * @author Mojica
 */
public class Vehiculos{
    
    private  ArrayList <String> AVehiculos = new ArrayList();
    
    private String  License_plate;
    private String Brands_id;
    private String Types_Id;
    private String Colors_Id; 
    
    public Vehiculos(){};

    public String getLicense_plate() {
        return License_plate;
    }

    public void setLicense_plate(String License_plate) {
        this.License_plate = License_plate;
    }

    public String getBrands_id() {
        return Brands_id;
    }

    public void setBrands_id(String Brands_id) {
        this.Brands_id = Brands_id;
    }

    public String getTypes_Id() {
        return Types_Id;
    }

    public void setTypes_Id(String Types_Id) {
        this.Types_Id = Types_Id;
    }

    public String getColors_Id() {
        return Colors_Id;
    }

    public void setColors_Id(String Colors_Id) {
        this.Colors_Id = Colors_Id;
    }

    
    // ArrayList 
    public void setAVehiculos(String placa){
        this.AVehiculos.add(placa);
    }

    public ArrayList<String> getAVehiculos() {
        return AVehiculos;
    }
    
    
    public void mostrar(){
        for (int i = 0; i < AVehiculos.size(); i++) {
            System.out.println(AVehiculos.get(i).toString());
        }
    }
    
   
    
    
    

}



