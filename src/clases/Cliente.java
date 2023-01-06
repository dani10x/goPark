
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Mojica
 */
public class Cliente{
    
    private String id;
    private String name;
    private String cellphone;
    private ArrayList <String> Ac = new ArrayList<>();
    
    
    public Cliente(){};

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public ArrayList<String> getAc() {
        return Ac;
    }

    public void setAc(String Ac) {
        this.Ac.add(Ac);
    }
    
    
}
