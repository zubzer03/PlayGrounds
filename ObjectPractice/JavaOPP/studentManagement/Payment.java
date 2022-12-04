package JavaOPP.studentManagement;


import java.util.Date;

public class Payment extends Person {

    private float amount;
    private Date paymentDate;





    public Payment(String id, String firstName, String lastName, Date birthDate, String email, String phoneNumber,
            float amount, Date paymentDate) {
        super(id, firstName, lastName, birthDate, email, phoneNumber);
        this.amount = amount;
        this.paymentDate = paymentDate;
    }





    public float getAmount() {
        return amount;
    }





    public void setAmount(float amount) {
        this.amount = amount;
    }





    public Date getPaymentDate() {
        return paymentDate;
    }





    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }





    /**
     * 
     */
    public void printPayment(){

        System.out.println("Ammount: "+getAmount());
        System.out.println("Date: "+getPaymentDate());

    }
}
