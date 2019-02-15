package Q1;

/**
 * This class contains name related information.
 * It is only used as a super class by Patient Class and Bill class
 */
public class Person
{
    private String firstName;
    private String lastName;
    /**
     * This no arguments constructor initializes the instance variables to default values
     * This has no access modifiers as it is only accessed by members of its own package
     */
    Person()
    {
        firstName = null;
        lastName = null;
    }
    /**
     * This is a constructor with arguments that initializes the instance variables to the values obtained from user
     * This has no access modifiers as it is only accessed by members of its own package
     * @param fn the first Name
     * @param lN the Last Name
     */
    Person(String fn, String lN)
    {
        firstName = fn;
        lastName = lN;
    }

    /**
     * This method is used to edit the instance variable first name
     * @param firstName the first name
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    /**
     * This method is used to edit the instance variable last name
     * @param lastName the last name
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    /**
     * This method returns the value of the instance variable firstName
     * @return returns the instance variable firstName
     */
    public String getFirstName()
    {
        return firstName;
    }
    /**
     * This method returns the value of the instance variable lastName
     * @return returns the instance variable lastName
     */
    public String getLastName() {
        return lastName;
    }
}
