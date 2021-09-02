/**
* Employee.java - a class to generate an object Employee
* @author Joey Saponaro
* @see Person
*/



public class Employee extends Person {
    private int id;
    private String position;
    private double salary;

    //constructors

    /**
    * Default constructor
    */
    public Employee() {
        super();
        id = 0; position = "undeclared"; salary = 0.0;
    }

    /**
    * Constructor to set variables for object Employee
    * @param name The String name of the employee
    * @param address The String address of the employee
    * @param phone The String phone number of the employee
    * @param email The String email of the employee
    * @param id The int id of the employee
    * @param position The String position of the employee
    * @param salary The double salary of the employee
    */
    public Employee(String name, String address, String phone, String email, int id, String position, double salary) {
        super(name, address, phone, email);
        this.id = id; this.position = position; this.salary = salary;
    }

    //getters

    /**
    * Gets the ID of the employee
    * @return int id of employee
    */
    public int getID() { return id; }

    /**
    * Gets the position of the employee
    * @return String position of employee
    */
    public String getPosition() { return position; }

    /**
    * Gets the salary of the employee
    * @return double salary of employee
    */
    public double getSalary() { return salary; }

    //setters

    /**
    * Sets the ID of the employee
    * @param int id that will be the employee's id
    */
    public void setID(int id) { this.id = id; }

    /**
    * Sets the position of the employee
    * @param String p that will be the employee's position
    */
    public void setPosition(String p) { this.position = p; }

    /**
    * Sets the salary of the employee
    * @param double s that will be the employee's salary
    */
    public void setSalary(double s) { this.salary = s; }

    //toString
    /**
    * toString method for object Employee
    * @return String output of object Employee
    */
    public String toString() {
        String str = String.format("\nID: %s\nPosition: %s\nSalary: $" + salary, id, position);
        return super.toString() + str;
    }
}
