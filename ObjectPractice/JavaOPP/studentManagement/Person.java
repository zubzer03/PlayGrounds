package JavaOPP.studentManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Person {

    private String id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;
    private String phoneNumber;


    public Person(String id, String firstName, String lastName, Date birthDate, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName(){
        
        return this.firstName+" "+this.lastName;

    }

    public int getAge(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateFormat dateFormat = new SimpleDateFormat("d/MM/yyyy");
        String datebirthString = dateFormat.format(this.getBirthDate());
        LocalDate fbDate1 = LocalDate.parse(datebirthString, formatter);
        Period age = Period.between(fbDate1, LocalDate.now());
        return age.getYears();        

    }
    public void print(){

        String DB = new SimpleDateFormat("dd/MM/yyyy").format(this.getBirthDate());

        System.out.println("\n");
        System.out.println("********************************");
        System.out.println("------- "+this.getFullName()+" -------");
        System.out.println("ID: "+this.getId());
        System.out.println("Fecha de Nacimiento: "+DB);
        System.out.println("Edad: "+this.getAge()+" años.");
    }



    
}
