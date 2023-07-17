/**
 * Objective: Define tester class
 * Algorithm: Serves as tester class
 * Input and Output: Outputs the information of the created objects from other classes
 * Created by: Gary Sun
 * Date: 6/13
 * Version: 1
*/
public class Week2HW {
    public static void main(String[] args) {
        Person p1 = new Person("Gary", "123 Main Street", "123-456-7890", "gary@email.com");
        System.out.println(p1);

        Person p2 = new Student("Gary", "123 Main Street", "123-456-7890", "gary@email.com", "sophomore");
        System.out.println(p2);
        
        Person p3 = new Employee("Gary", "123 Main Street", "123-456-7890", "gary@email.com", "Office 1", 100000);
        System.out.println(p3);

        Person p4 = new Faculty("Gary", "123 Main Street", "123-456-7890", "gary@email.com", "Office 1", 100000, "9-5", "Director");
        System.out.println(p4);

        Person p5 = new Staff("Gary", "123 Main Street", "123-456-7890", "gary@email.com", "Office 1", 100000, "Mr.");
        System.out.println(p5);
    }
}

/**
 * Objective: Define Person class
 * Algorithm: Serves as parent class
 * Input and Output: N/A
 * Created by: Gary Sun
 * Date: 6/13
 * Version: 1
*/
class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //returns name
    public String getName() {
        return name;
    }

    //returns object information
    public String toString() {
        return "Person " + name;
    }
}

/**
 * Objective: Define Student class
 * Algorithm: Serves as child class
 * Input and Output: N/A
 * Created by: Gary Sun
 * Date: 6/13
 * Version: 1
*/
class Student extends Person {
    private final String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    //returns name
    public String getName() {
        return super.getName();
    }

    //returns object information
    public String toString() {
        return "Student " + getName();
    }
}

/**
 * Objective: Define Employee class
 * Algorithm: Serves as child class
 * Input and Output: N/A
 * Created by: Gary Sun
 * Date: 6/13
 * Version: 1
*/
class Employee extends Person {
    private String office;
    private int salary;
    private java.util.Date dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, int salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        dateHired = new java.util.Date();
    }

    //returns name
    public String getName() {
        return super.getName();
    }

    //returns object information
    public String toString() {
        return "Employee " + getName();
    }
}

/**
 * Objective: Define Faculty class
 * Algorithm: Serves as grandchild class
 * Input and Output: N/A
 * Created by: Gary Sun
 * Date: 6/13
 * Version: 1
*/
class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, int salary, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    //returns name
    public String getName() {
        return super.getName();
    }

    //returns object information
    public String toString() {
        return "Faculty " + getName();
    }
}

/**
 * Objective: Define Staff class
 * Algorithm: Serves as grandchild class
 * Input and Output: N/A
 * Created by: Gary Sun
 * Date: 6/13
 * Version: 1
*/
class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, int salary, String title) {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    }

    //returns name
    public String getName() {
        return super.getName();
    }

    //returns object information
    public String toString() {
        return "Staff " + getName();
    }
}