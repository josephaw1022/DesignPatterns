import java.util.ArrayList;
import java.util.Date;

public class MedicalRecordAdapter implements HealthRecord {

    String name;
    Date birthDate;
    String gender;
    ArrayList<String> history;


    public void constructor(CarolinaHealthRecord record){
        this.name = record.getName() ; 
        this.birthDate = record.getBirthdate(); 
        this.gender = record.getGender(); 
        this.history = record.getHistory();  
    }



    public String getName() {
        return this.name;
    }

    public Date getBirthdate() {
        return this.birthDate;
    }

    public String getGender() {
        return this.gender;
    }

    public void addHistory(Date visitDate, boolean well, String details) {
        String wellnessStatus = well ? "Well Visit" : "Sick Visit";
        String Record = visitDate + ":\t" + wellnessStatus + ",\t" + details;
        this.history.add(Record);

    }

    public ArrayList<String> getHistory(){
        return this.history; 
    }

}
