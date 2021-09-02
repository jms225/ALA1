
/**
* Faculty.java - a class to generate an object Faculty
* @author Joey Saponaro
* @see Employee
*/


public class Faculty extends Employee {

    private String rank;

    //constructors

    /**
    * Default constructor
    */
    public Faculty() {
        super();
        rank = "undeclared";
    }

    /**
    * Constructor to set variables for object Faculty
    * @param name The String name of the faculty
    * @param address The String address of the faculty
    * @param phone The String phone number of the faculty
    * @param email The String email of the faculty
    * @param id The int id of the faculty
    * @param position The String position of the faculty
    * @param salary The double salary of the faculty
    * @param rank The String rank of the faculty
    */
    public Faculty(String name, String address, String phone, String email, int id, String position, double salary, String rank) {
        super(name, address, phone, email, id, position, salary);
        this.rank = rank;
    }

    //getters

    /**
    * Gets the rank of the faculty member
    * @return String rank of faculty
    */
    public String getRank() { return rank; }

    //setters

    /**
    * Sets the rank of the faculty member
    * @param String rank that will be the faculty member's rank
    */
    public void setRank(String rank) { this.rank = rank; }


    //toString
    /**
    * toString method for object Faculty
    * @return String output of object Faculty
    */
    public String toString() {
        String str = String.format("\nRank: " + rank);
        return super.toString() + str;
    }
}
