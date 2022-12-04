package JavaOPP.studentManagement;

import java.util.Date;

public class Student extends Person{
    

    private int level;

    public Student(String id, String firstName, String lastName, Date birthDate, String email, String phoneNumber,
            int level) {
        super(id, firstName, lastName, birthDate, email, phoneNumber);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


}