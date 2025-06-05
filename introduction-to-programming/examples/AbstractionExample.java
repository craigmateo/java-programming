// Abstract class
abstract class Animal {
    // Abstract method (no body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Concrete subclass
class Dog extends Animal {
    // Implementing the abstract method
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Outputs: Woof! Woof!
        myDog.sleep();     // Outputs: Sleeping...
    }
}
