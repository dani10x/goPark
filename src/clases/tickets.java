
package Clases;

/**
 *
 * @author Mojica
 */
public class tickets {

    private String T_number;
    private String Entry_time;
    private String Departure_time;
    private String STAFF_out;
    private String STAFF_in;
    private int PARKING_CELL;
    private String VEHICLE_License_plate;
    private String CLIENT_Id;
    private String Cost;
    private String RATES_Id;

    public tickets(){};
    
    public tickets(String Entry_time, String STAFF_in, int PARKING_CELL, String VEHICLE_License_plate, String CLIENT_Id, String RATES_Id) {
       
        this.Entry_time = Entry_time;
        this.STAFF_in = STAFF_in;
        this.PARKING_CELL = PARKING_CELL;
        this.VEHICLE_License_plate = VEHICLE_License_plate;
        this.CLIENT_Id = CLIENT_Id;
        this.RATES_Id = RATES_Id;
    }

    public String getT_number() {
        return T_number;
    }

    public void setT_number(String T_number) {
        this.T_number = T_number;
    }

    public String getEntry_time() {
        return Entry_time;
    }

    public void setEntry_time(String Entry_time) {
        this.Entry_time = Entry_time;
    }

    public String getDeparture_time() {
        return Departure_time;
    }
    
    public String getDeparture_time2() {
        // SOLO PARA EL UPDATE DEL COSTO
       
        String[] fechasalida = this.getDeparture_time().split(" ");
        String[] horasalida = fechasalida[1].split(":");
        String[] fechasalida1 = fechasalida[0].split("-");
        String dia,mes,ano,hora,min;
        
        dia = fechasalida1[2];
        mes = fechasalida1[1];
        ano = fechasalida1[0];
        hora = horasalida[0];
        min = horasalida[1];
        
        
        String time = dia+"/"+mes+"/"+ano+" "+hora+":"+min;
        
        
        
        return time;
    }
    
    
    public void setDeparture_time(String Departure_time) {
        this.Departure_time = Departure_time;
    }

    public String getSTAFF_out() {
        return STAFF_out;
    }

    public void setSTAFF_out(String STAFF_out) {
        this.STAFF_out = STAFF_out;
    }

    public String getSTAFF_in() {
        return STAFF_in;
    }

    public void setSTAFF_in(String STAFF_in) {
        this.STAFF_in = STAFF_in;
    }

    public int getPARKING_CELL() {
        return PARKING_CELL;
    }

    public void setPARKING_CELL(int PARKING_CELL) {
        this.PARKING_CELL = PARKING_CELL;
    }

    public String getVEHICLE_License_plate() {
        return VEHICLE_License_plate;
    }

    public void setVEHICLE_License_plate(String VEHICLE_License_plate) {
        this.VEHICLE_License_plate = VEHICLE_License_plate;
    }

    public String getCLIENT_Id() {
        return CLIENT_Id;
    }

    public void setCLIENT_Id(String CLIENT_Id) {
        this.CLIENT_Id = CLIENT_Id;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    public String getRATES_Id() {
        return RATES_Id;
    }

    public void setRATES_Id(String RATES_Id) {
        this.RATES_Id = RATES_Id;
    }
    


}
