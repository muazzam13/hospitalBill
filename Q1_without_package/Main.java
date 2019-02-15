import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Patient> patientList = new ArrayList<Patient>();
    static ArrayList<Bill> billList = new ArrayList<Bill>();

    /**
     * main method which controls everything
     * @param args
     */
    public static void main(String[] args)
    {
        menu();
        int input = in.nextInt();
        while(input != 7) {
            switch (input) {
                case 1: {

                    String fN, lN;
                    int iD, age;
                    Date dob;
                    Doctor d1;
                    Date admissionDate, dischargeDate;
                    System.out.print("\nEnter patient first name: ");
                    fN = in.next();
                    System.out.print("\nEnter patient last name: ");
                    lN = in.next();
                    System.out.print("\nEnter patient ID name: ");
                    iD = in.nextInt();
                    System.out.print("\nEnter patient age: ");
                    age = in.nextInt();
                    dob = dobE();
                    d1 = dE();
                    admissionDate = admissionE();
                    dischargeDate = dischargeE();
                    Patient temp = new Patient(fN, lN, iD, age, dob, d1, admissionDate, dischargeDate);
                    patientList.add(temp);
                    break;
                }
                case 2: {

                    int iD;
                    double dFee;
                    double rFee;
                    double mFee;
                    System.out.print("\nEnter patient iD: ");
                    iD = in.nextInt();
                    System.out.print("\nEnter patient's doctor fees: ");
                    dFee = in.nextInt();
                    System.out.print("\nEnter patient's medicine fees: ");
                    mFee = in.nextInt();
                    System.out.print("\nEnter patient's room fees: ");
                    rFee = in.nextInt();
                    Bill temp = new Bill(iD, mFee, dFee, rFee);
                    billList.add(temp);
                    break;
                }
                case 3: {
                    searchPatient();
                    break;
                }
                case 4: {
                    searchBill();
                    break;
                }
                case 5: {
                    editPatientInfo();
                    break;
                }
                case 6:
                {
                    editBillInfo();
                    break;
                }
                default:
                {
                    System.out.println("Wrong Input");
                    break;
                }
            }
            menu();
            input = in.nextInt();
        }
        if(input == 7)
        {
            System.out.println("GoodBye");
        }
    }

    /**
     * has the main menu of the project
     */
    static void menu()
    {
        System.out.println("1) Enter patient info");
        System.out.println("2) Enter billing info for a patient");
        System.out.println("3) Retrieve patient info using ID");
        System.out.println("4) Retrieve patient bill using ID");
        System.out.println("5) Edit patient info");
        System.out.println("6) Edit bill info");
        System.out.println("7) Quit");
        System.out.print("Please select an option: ");
    }

    /**
     * method to search for a patient
     */
    static void searchPatient()
    {
        if(patientList.isEmpty()== true)
        {
            System.out.println("Patient list is empty");
        }
        else
        {
            System.out.println("Enter patient ID: ");
            int tmp1 = in.nextInt();
            for(Patient z : patientList)
            {
                if(z.getID() == tmp1)
                {
                    System.out.println("Found");
                    System.out.println(z.toString());
                }
            }
        }
    }

    /**
     * method to search for a bill
     */
    static void searchBill()
    {
        if(billList.isEmpty()== true)
        {
            System.out.println("Bill list is empty");
        }
        else
        {
            System.out.println("Enter patient ID: ");
            int tmp1 = in.nextInt();
            for(Bill z : billList)
            {
                if(z.getID() == tmp1)
                {
                    System.out.println("Found");
                    System.out.println(z.toString());
                }
            }
        }
    }

    /**
     * method to edit patient info
     */
    static void editPatientInfo()
    {
        if(patientList.isEmpty()== true)
        {
            System.out.println("Patient list is empty");
        }
        else
        {
            System.out.print("Enter patient ID: ");
            int tmp1 = in.nextInt();
            for(int i = 0; i < patientList.size();i++)
            {
                if(patientList.get(i).getID() == tmp1)
                {
                    System.out.println("Patient found.");
                    System.out.println("1) Edit Patient First Name: ");
                    System.out.println("2) Edit Patient Last Name");
                    System.out.println("3) Edit Patient's age");
                    System.out.println("4) Edit Patient's Date of Birth");
                    System.out.println("5) Edit Patient's admission Date");
                    System.out.println("6) Edit Patient's discharge Date");
                    System.out.println("7) Edit Patient ID");
                    System.out.println("8) Re-enter Doctor information");

                    System.out.println("Select and option");
                    int input = in.nextInt();
                    switch (input)
                    {
                        case 1:
                        {
                            System.out.println("Enter new Patient First name");
                            String newName = in.next();
                            patientList.get(i).setFirstName(newName);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter new Patient Last name");
                            String newName = in.next();
                            patientList.get(i).setLastName(newName);
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter new Patient Age");
                            int newAge  = in.nextInt();
                            patientList.get(i).setAge(newAge);
                            break;
                        }
                        case 4:
                        {
                            Date dob2 = dobE();
                            patientList.get(i).setDob(dob2);
                            break;
                        }
                        case 5:
                        {
                            Date dob3 = admissionE();
                            patientList.get(i).setAdmissionDate(dob3);
                            break;
                        }
                        case 6:
                        {
                            Date dob4 = dischargeE();
                            patientList.get(i).setDischargeDate(dob4);
                            break;
                        }
                        case 7:
                        {
                            System.out.println("Enter new id");
                            int tmp2 = in.nextInt();
                            patientList.get(i).setID(tmp2);
                            break;
                        }
                        case 8:
                        {
                            Doctor d1 = dE();
                            patientList.get(i).setD1(d1);
                            break;
                        }
                        default:
                        {
                            System.out.println("Wrong input");
                            break;
                        }

                    }
                    break;
                }
            }
        }
    }

    /**
     * method to edit bill info
     */
    static void editBillInfo()
    {
        if(billList.isEmpty()== true)
        {
            System.out.println("Bill list is empty");
        }
        else
        {
            System.out.print("Enter patient ID: ");
            int tmp1 = in.nextInt();
            for(int k =0;k<billList.size();k++)
            {
                if(billList.get(k).getID() == tmp1)
                {
                    System.out.println("Found");
                    System.out.println("1) Edit Patient ID: ");
                    System.out.println("2) Edit Doctor's fee");
                    System.out.println("3) Edit Room's Fee");
                    System.out.println("4) Edit Medicine Fee");
                    int inp = in.nextInt();
                    switch (inp)
                    {
                        case 1:
                        {
                            System.out.println("Enter new id");
                            int tmp2 = in.nextInt();
                            billList.get(k).setID(tmp2);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter new doctor's Fee");
                            int tmp3 = in.nextInt();
                            billList.get(k).setDoctorFee(tmp3);
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter new Room's Fee");
                            int tmp4 = in.nextInt();
                            billList.get(k).setRoomFee(tmp4);
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter new Medicine Fee");
                            int tmp5 = in.nextInt();
                            billList.get(k).setMedicineFee(tmp5);
                            break;
                        }
                        default:
                        {
                            System.out.println("Wrong input");
                        }
                    }
                }

            }
        }
    }

    /**
     * method to edit Date of birth
     * @return returns the edited dob to be entered into the system
     */
    static Date dobE()
    {
        System.out.print("\nEnter patient date of birth (date then space then month then space then year): ");
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int t3 = in.nextInt();
        return new Date(t1,t2,t3);
    }

    /**
     * method to edit Admission Date
     * @return returns the edited admission date to be entered into the system
     */
    static Date admissionE()
    {
        System.out.print("\nEnter patient admission date (date then space then month then space then year): ");
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int t3 = in.nextInt();
        return new Date(t1,t2,t3);
    }

    /**
     * method to edit discharge date
     * @return returns the edited discharge date to be entered into the system
     */
    static Date dischargeE()
    {
        System.out.print("\nEnter patient discharge date (date then space then month then space then year): ");
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int t3 = in.nextInt();
        return new Date(t1,t2,t3);
    }

    /**
     * method to edit the doctor info
     * @return returns the doctor info to be entered into the system
     */
    static Doctor dE()
    {
        System.out.print("\nEnter Doctor's first name: ");
        String dFN = in.next();
        System.out.print("\nEnter Doctor's last name: ");
        String dLN = in.next();
        System.out.print("\nEnter Doctor's speciality: ");
        String sp = in.next();
        return new Doctor(dFN,dLN,sp);
    }
}
