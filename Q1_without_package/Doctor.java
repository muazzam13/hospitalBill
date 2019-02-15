/**
 * This class contains information about a Doctor.
 * It inherits class person
 */
public class Doctor extends Person
{
    private String speciality;

    /**
     * This no arguments constructor initializes the default super constructor and instance variable speciality
     * to default values
     */
    public Doctor()
    {
        super();
        speciality = null;
    }

    /**
     * This is a constructor with arguments that initializes the instance variables to the values obtained from user
     * it calls super constructor to initialize name
     * @param fn first Name
     * @param lN Last name
     * @param sp speciality
     */
    public Doctor(String fn, String lN, String sp)
    {
        super(fn, lN);
        speciality = sp;
    }

    /**
     * used to return speciality of the doctor
     * @return String specifying the doctor's speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * Used to edit the doctor's speciality
     * @param speciality value obtained from user
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * used to output all the information of the class object as a string
     * @return it returns all info as a string
     */
    @Override
    public String toString()
    {
        return "\nDoctor's First Name: "+ super.getFirstName()+"\nDoctor's Last Name: " + super.getLastName()+"\nSpeciality: "+getSpeciality();
    }
}
