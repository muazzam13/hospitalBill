package Q1;

/**
 * This class is used to store dates
 */
public class Date
{
    private int date;
    private int month;
    private int year;

    /**
     *  This no arguments constructor initializes the instance variables to default values
     */
    public Date()
    {
        date = 0;
        month = 0;
        year = 0;
    }

    /**
     * This constructor assign values to instances variables from the values obtained from the parameters
     * @param date date
     * @param month month
     * @param year year
     */
    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    /**
     * method to obtain the date
     * @return return an int which is the date
     */
    public int getDate() {
        return date;
    }

    /**
     * method to set the date
     * @param date date
     */
    public void setDate(int date) {
        this.date = date;
    }

    /**
     * method to obtain the method
     * @return returns an int which is the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * method to set the month
     * @param month month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * method to obtain the year
     * @return returns an int which is the year
     */
    public int getYear() {
        return year;
    }

    /**
     * method to set the year
     * @param year year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * method to obtain all the info as a string
     * @return a string value which is all the info combined
     */
    @Override
    public String toString()
    {
        return date+"/"+month+"/"+year;
    }
}
