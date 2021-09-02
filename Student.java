
/**
* Student.java - a class to generate an object Student
* @author Joey Saponaro
* @see Person
*/

public class Student extends Person{
    private int id;
    private String major;

    // Constructors

    /**
    * Default constructor
    */
    public Student() {
        super();
        id = 0; major = "undeclared";
    }

    /**
    * Constructor to set variables for object Student
    * @param name The String name of the student
    * @param address The String address of the student
    * @param phone The String phone number of the student
    * @param email The String email of the student
    * @param id The int id of the student
    * @param major The String major of the student
    */
    public Student(String name, String address, String phone, String email, int id, String major) {
        super(name, address, phone, email);
        this.id = id; this.major = major;
    }

    //getters
    /**
    * Gets the ID of the student
    * @return int id of student
    */
    public int getID() { return id; }

    /**
    * Gets the major of the student
    * @return String major of student
    */
    public String getMajor() { return major; }

    //setters

    /**
    * Sets the ID of the student
    * @param int id that will be the student's id
    */
    public void setID(int ID) { this.id = id; }

    /**
    * Sets the major of the student
    * @param String major that will be the student's major
    */
    public void setMajor(String major) { this.major = major; }

    //toString
    /**
    * toString method for object Student
    * @return String output of object Student
    */
    public String toString() {
        String str = String.format("\nID: %s\nMajor: " + major, id);
        return super.toString() + str;
    }
}
