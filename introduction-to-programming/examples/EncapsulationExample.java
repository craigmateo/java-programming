// Class with encapsulated data
class Person {
    // Private fields — cannot be accessed directly outside this class
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String newName) {
        name = newName;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Person p = new Person();

        // Set values using setters
        p.setName("Craig");
        p.setAge(40);

        // Get values using getters
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
