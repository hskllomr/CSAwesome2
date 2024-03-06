// 1. Copy your class instance variables, constructor, and print() from 5.2.
//  instance variables
public class Exam        // Add your class name here!
{
    // 1. copy in your instance variables for class from the last lesson
    private String name;
    private String email;
    private String phoneNumber;

    // 2. Add a constructor with 3 parameters to set all of the instance variables to the given parameters.
    public Exam(String name2,String email2,String phoneNumber2)
    {
        name=name2;
        email=email2;
        phoneNumber=phoneNumber2;

    }
    // 3. Write a print() method that uses System.out.println to print out all the instance variables.
    public void printto()
    {
        System.out.println(name);
        System.out.println(email);
        System.out.println(phoneNumber);
    }

    public void setmodel(String Setname)
    {
        name=Setname;
    }

    public void setemail(String Setemail)
    {
        email=Setemail;
    }

    public void setphoneNumber(String SetphoneNumber)
    {
        phoneNumber=SetphoneNumber;
    }

    public String getname()
    {
        return name;
    }

    public String getemail()
    {
        return email;
    }

    public String getnumber()
    {
        return phoneNumber;
    }

    // 2. Create accessor (get) and mutator (set) methods for each of the instance variables.

    // 3. Create a toString() method that returns all the information in the instance variables.


    public String toString()
    {
        return name+":"+email+":"+":"+phoneNumber;
    }

    public void print(String format)
    {
        if(format.equals("plain"));
        {
            printto();
        }

    }


    // 4.  Add a method for your class that takes a parameter.
    // For example, there could be a print method with arguments that indicate
    // how you want to print out the information, print(format) where format is "plain" or "table".

    // 5. Test all the methods in the main method.
    public static void main(String[] args)
    {
        // Construct an object of your class
        Exam exam = new Exam("omer","omeeer@gmail.com","43533");
        System.out.println(exam);
        exam.printto();


        // call the object's methods

    }
}
