import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Date;

public class MedicalRecordAdapter implements MedicalRecord {

  private String firstName;
  private String lastName;
  private Date birthDate;
  private Gender gender;
  private ArrayList<Visit> visits; 

  public MedicalRecordAdapter (HealthRecord record) {
    String[] fullName = record.getName().split(" ", 3);
    this.firstName = fullName[0];
    this.lastName = fullName[1];
    this.birthDate = record.getBirthdate();
    this.gender =
      record.getGender() == "Male"
        ? Gender.MALE
        : record.getGender() == "Woman" ? Gender.FEMALE : Gender.OTHER;

    ArrayList<String> tempList = record.getHistory();
    ArrayList<Visit> newList = new ArrayList<Visit>();
    for (int i = 0; i < tempList.size(); i++) {
      String tempString = tempList.get(i);
      String[] tempArray = tempString.split(" ", 3);
      newList.add(new Visit(new Date(tempArray[0]), true, tempArray[2]));
    }
    this.visits = newList;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Date getBirthday() {
    return birthDate;
  }

  public Gender getGender() {
    return gender;
  }

  public void addVisit(Date date, boolean well, String description) {
    visits.add(new Visit(date, well, description));
  }

  public ArrayList<Visit> getVisitHistory() {
    return visits ; 
  }

  public String toString() { 
    return new SCMedicalRecord(firstName, lastName, birthDate, gender).toString(); 
  }
}
// public interface MedicalRecord {
//     public String getFirstName();
//     public String getLastName();
//     public Date getBirthday();
//     public Gender getGender();
//     public void addVisit(Date date, boolean well, String description);
//     public ArrayList<Visit> getVisitHistory();
//     public String toString();
// }
