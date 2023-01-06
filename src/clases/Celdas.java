
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Mojica
 */
public class Celdas {
    
    public  ArrayList <String> Acel = new ArrayList();
  
    public Celdas(){};

    public ArrayList getAcel() {
        return Acel;
    }

    public void setCeldas(String Stts) {
        this.Acel.add(Stts);
    }
    
    public void mostrar(){
        for (int i = 0; i < Acel.size(); i++) {
            System.out.println(Acel.get(i));
        }
        
    }
    
    
    
}
