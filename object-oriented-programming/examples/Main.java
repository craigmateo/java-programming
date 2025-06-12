// Animal.java
// This example demonstrates:
// - Polymorphism: a superclass reference can point to subclass objects
// - Method Overriding: subclasses define their own versions of the speak() method

class Animal {
    public void speak() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("The cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Superclass reference pointing to subclass objects
        Animal myAnimal;

        myAnimal = new Dog();  // Polymorphism in action
        myAnimal.speak();      // Output: The dog barks

        myAnimal = new Cat();
        myAnimal.speak();      // Output: The cat meows
    }
}

