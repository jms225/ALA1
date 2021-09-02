
  /**
  * Person.java - a class to generate an object person
  * @author Joey Saponaro
  */


public class Person {
    protected String name;
    protected String address;
    protected String phone;
    protected String email;


    // Constructors
    /**
    * Default constructor
    */
    public Person() {
        name = address = phone = email = "none";
    }

    /**
    * Constructor to set variables for object Person
    * @param name The String name of the person
    * @param address The String address of the person
    * @param phone The String phone number of the person
    * @param email The String email of the person
    */
    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    //Getters

    /**
    * Gets the name of the person
    * @return String name of person
    */
    public String getName() { return name; }

    /**
    * Gets the address of the person
    * @return String address of person
    */
    public String getAddress() { return address; }

    /**
    * Gets the phone number of the person
    * @return String phone of person
    */
    public String getPhone() { return phone; }

    /**
    * Gets the email address of the person
    * @return String email of person
    */
    public String getEmail() { return email; }

    //Setters

    /**
    * Sets the name of the person
    * @param String name that will be the person's name
    */
    public void setName(String name) { this.name = name; }

    /**
    * Sets the address of the person
    * @param String address that will be the person's address
    */
    public void setAddress(String address) { this.address = address; }

    /**
    * Sets the phone number of the person
    * @param String phone that will be the person's phone number
    */
    public void setPhone(String phone) { this.phone = phone; }

    /**
    * Sets the email of the person
    * @param String email that will be the person's email
    */
    public void setEmail(String email) { this.email = email; }

    //toString
    /**
    * toString method for object Person
    * @return String output of object Person
    */
    public String toString() {
        return String.format("Name: %s\nAddress: %s\nPhone: %s\nEmail: " +  email, name, address, phone);
    }

    /**
    * Checks if input object is equal to an object Person
    * @param Object that will be compared to an object Person
    * @return boolean true if both objects are the same, and false if they are not
    */
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj; //downcasting
            return p.name.equals(this.name);
        }
        return false;
    }
}
