import java.util.Enumeration;

public class Student {

    //PIB
    private String family = "";
    private String firstName = "";
    private String secondName = ""; //ім'я по батькові
    private int year;

    public Student(String family, String firstName, String secondName, int year){
        this.family = family;
        this.firstName = firstName;
        this.secondName = secondName;
        this.year = year;
    }


}
