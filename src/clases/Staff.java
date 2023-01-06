package clases;

/**
 *
 * @author USER
 */
public class Staff {
    private String Id;
    private String Name;
    private String Cellphone;
    private String Schedule_Code;
    
    public Staff(){}

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCellphone() {
        return Cellphone;
    }

    public void setCellphone(String Cellphone) {
        this.Cellphone = Cellphone;
    }

    public String getSchedule_Code() {
        return Schedule_Code;
    }

    public void setSchedule_Code(String Schedule_Code) {
        this.Schedule_Code = Schedule_Code;
    }
}
