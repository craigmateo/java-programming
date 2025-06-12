// Dog.java
// This program demonstrates basic Object-Oriented Programming concepts in Java:
// - Classes and Objects
// - Fields (variables) and Methods (functions)
// - Encapsulation and behavior using instance methods

public class Dog {
    String name;
    int age;

    void bark() {
        System.out.println(name + " says: Woof!");
    }

    void displayAge() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Buddy";
        dog1.age = 3;

        Dog dog2 = new Dog();
        dog2.name = "Luna";
        dog2.age = 5;

        dog1.bark();
        dog1.displayAge();

        dog2.bark();
        dog2.displayAge();
    }
}
