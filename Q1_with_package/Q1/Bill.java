package Q1;

/**
 * This class is used to store all billing related info for a patient who is identified using his id
 */
public class Bill
{
    private int iD;
    private double medicineFee;
    private double doctorFee;
    private double roomFee;
    private double totalFee;

    /**
     * This is a no argument constructors which initializes the instance variables to default values
     */
    public Bill()
    {
        iD = 0;
        medicineFee = 0;
        doctorFee = 0;
        roomFee = 0;
        totalFee = doctorFee+medicineFee+roomFee;
    }

    /**
     * This is a constructor with arguments which initializes the instance variables to the obtained values
     * @param i ID of patient
     * @param mFee medicine fee
     * @param dFee doctor fee
     * @param rFee room fee
     */
    public Bill(int i, double mFee, double dFee, double rFee)
    {
        iD = i;
        medicineFee =mFee;
        doctorFee = dFee;
        roomFee =rFee;
        totalFee = rFee+dFee+mFee;
    }

    /**
     * method to obtain the patient ID
     * @return returns a int variable which is the ID of patient
     */
    public int getID()
    {
        return iD;
    }
    /**
     * method to set the ID of patient
     * @param iD ID of patient
     */
    public void setID(int iD) {
        this.iD = iD;
    }

    /**
     * method to obtain the medicine fees
     * @return a double which is the medicine fees
     */
    public double getMedicineFee() {
        return medicineFee;
    }

    /**
     * method to set what the medicine fees are
     * @param medicineFee the medicine fees
     * it also recalculates the total fees
     */
    public void setMedicineFee(double medicineFee) {
        this.medicineFee = medicineFee;
        setTotalFee();
    }
    /**
     * method to obtain the doctor fees
     * @return a double which is the doctor fees
     */
    public double getDoctorFee() {
        return doctorFee;
    }
    /**
     * method to set what the medicine fees are
     * @param doctorFee the doctor fees
     * it also recalculates the total fees
     */
    public void setDoctorFee(double doctorFee) {
        this.doctorFee = doctorFee;
        setTotalFee();
    }
    /**
     * method to obtain the room fees
     * @return a double which is the room fees
     */
    public double getRoomFee() {
        return roomFee;
    }
    /**
     * method to set what the room fees are
     * @param roomFee the room fees
     * it also recalculates the total fees
     */
    public void setRoomFee(double roomFee) {
        this.roomFee = roomFee;
        setTotalFee();
    }
    /**
     * method to obtain the total fees
     * @return a double which is the total fees
     */
    public double getTotalFee() {
        return totalFee;
    }
    /**
     * method to set what the total fees is
     */
    public void setTotalFee() {
        totalFee = medicineFee+doctorFee+roomFee;
    }

    /**
     * method to obtain all the information as a string
     * @return a string value which has all the info
     */
    @Override
    public String toString()
    {
        return "Patient ID: " + iD +"\nDoctor's Fees: " + doctorFee +"\nRoom Fee: " + roomFee +"\nMedicine Fees: "+medicineFee
                + "\nTotal Fee: " + totalFee;
    }
}
