package Q1;

/**
 * This class contains all the information of a patient
 * Inherits class person
 */
public class Patient extends Person
{
    private int iD;
    private int age;
    private Date dob;
    private Doctor d1;
    private Date admissionDate;
    private Date dischargeDate;

    /**
     * This no arguments constructor initializes the default super constructor and instance variables
     * to default values
     */
    public Patient()
    {
        super();
        iD = 0;
        age = 0;
        dob = new Date();
        d1 = new Doctor();
        admissionDate = new Date();
        dischargeDate = new Date();
    }

    /**
     * This is a constructor with arguments that initializes the instance variables to the values obtained from user
     * it calls super constructor to initialize name
     * @param fn Patient first Name
     * @param lN Patient Last Name
     * @param iD Patient ID
     * @param age age of patient
     * @param dob date of birth
     * @param d1 doctor info
     * @param admissionDate admit Date of patient
     * @param dischargeDate Date patient was discharged
     */
    public Patient(String fn, String lN, int iD, int age, Date dob, Doctor d1, Date admissionDate, Date dischargeDate)
    {
        super(fn, lN);
        this.iD = iD;
        this.age = age;
        this.dob = dob;
        this.d1 = d1;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
    }

    /**
     * method to obtain patient ID
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
    public void setID(int iD)
    {
        this.iD = iD;
    }

    /**
     * method to obtain patient Age
     * @return returns int variable which is age of patient
     */
    public int getAge()
    {
        return age;
    }

    /**
     * method to set the age of patient
     * @param age Age of patient
     */
    public void setAge(int age)
    {
        this.age = age;
    }
    /**
     * method to obtain patient's date of birth
     * @return returns an object of Date which is date of birth of patient
     */
    public Date getDob()
    {
        return dob;
    }
    /**
     * method to set the date of birth of patient
     * @param dob Date of birth of patient
     */
    public void setDob(Date dob)
    {
        this.dob = dob;
    }
    /**
     * method to obtain patient's Doctor's Information
     * @return returns an object of Doctor which contains info about the doctor of this patient
     */
    public Doctor getD1()
    {
        return d1;
    }
    /**
     * method to set the doctor info of patient
     * @param d1 Info about the doctor of the patient
     */
    public void setD1(Doctor d1)
    {
        this.d1 = d1;
    }
    /**
     * method to obtain patient's admission date
     * @return returns an object of Date which is admission date
     */
    public Date getAdmissionDate()
    {
        return admissionDate;
    }
    /**
     * method to set the admission date of patient
     * @param admissionDate admission date of patient
     */
    public void setAdmissionDate(Date admissionDate)
    {
        this.admissionDate = admissionDate;
    }
    /**
     * method to obtain patient's discharge date
     * @return returns an object of Date which is discharge Date
     */
    public Date getDischargeDate()
    {
        return dischargeDate;
    }
    /**
     * method to set the discharge date of patient
     * @param dischargeDate discharge date of patient
     */
    public void setDischargeDate(Date dischargeDate)
    {
        this.dischargeDate = dischargeDate;
    }

    /**
     * used to output all the information as a string
     * @return it returns all info as a string
     */
    @Override
    public String toString() {
        return "Patient ID: " + iD+ "\nPatient First Name: " + super.getFirstName()+"\nPatient Last Name: " + super.getLastName()
                +"\nPatient Age: " + age + "\nPatient Date of birth: " + dob.toString() + d1.toString()+
                "\nAdmission date: " + admissionDate.toString()+"\nDischarge date: " + dischargeDate.toString();

    }
}
