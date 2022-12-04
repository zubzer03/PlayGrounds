package JavaOPP.studentManagement;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse("13/10/2004");
        Student student = new Student(
            "1727171421", 
            "Gabriel", 
            "Rojas", 
            birthDate,
            "leogaborojas1@gmail.com",
            "098504884",
            5);
            student.print();
        Date birthDate2 = new SimpleDateFormat("dd/MM/yyyy").parse("12/11/1995");
        Staff staff = new Staff(
            "171215860",
            "Julio",
            "elpoderoso",
            birthDate2,
            "zubzer25@gmail.com",
            "0984259935",
            1200.20,
            "Accounting");
            staff.print();
    }
}
