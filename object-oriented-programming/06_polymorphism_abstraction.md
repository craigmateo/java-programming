# Module 6: Object Oriented Programming – Polymorphism

## Introduction

Polymorphism in Java is a concept by which we can perform a single action in different ways.  
Polymorphism is derived from two Greek words: *poly* and *morphs*.  
- "Poly" means **many**
- "Morphs" means **forms**

So, polymorphism means **many forms**.

### Learning Outcomes

By the end of this module, you should be able to:

- Explain the concept of **polymorphism** and its implementation through **compile-time** and **run-time polymorphism**.
- Implement the concept of **abstract classes and methods** in Java.
- Implement the concept of **final classes and methods** in Java.

### Key Terms and Concepts

**Polymorphism**  
- The ability of an object to take on many forms.

**Overloading**  
- Occurs when two or more methods in the same class have the **same method name** but **different parameters**.

**Overriding**  
- Means having two methods with the **same method name and parameters** (i.e., the same method signature) in **different classes** (typically in superclass and subclass).

**Abstract**  
- A method **without a body** (no implementation) is known as an **abstract method**.
- If a class contains at least one abstract method, it must be declared as an **abstract class**.

**Final**  
- When a variable is declared with the `final` keyword, its value **cannot be modified**.
- A `final` method **cannot be overridden**.
- A `final` class **cannot be subclassed**.

## Polymorphism in Java

The word *polymorphism* means **having many forms**. In simple terms, polymorphism is the ability of a message to be displayed in more than one form.

### Real-Life Example

A real-life example of polymorphism is how one person can have different characteristics at the same time:

- A man can be a **father**, a **husband**, and an **employee**—all at once.
- One person displays different behaviors depending on the situation.

This is called **polymorphism**.

### Importance in OOP

Polymorphism is considered one of the most important features of **Object Oriented Programming**.  
It allows us to perform a single action in different ways.

In other words:

- Polymorphism allows you to define **one interface** and have **multiple implementations**.
- "Poly" means **many** and "morphs" means **forms**, so polymorphism literally means **many forms**.

## Types of Polymorphism

In Java, polymorphism is mainly divided into two types:

- **Compile Time Polymorphism**
- **Runtime Polymorphism**

### 1. Compile Time Polymorphism

Also known as **static polymorphism**. This type of polymorphism is achieved by:

- Method Overloading
- Operator Overloading

#### Method Overloading

When there are multiple methods with the same name but different parameters, they are said to be overloaded. Overloading can happen by changing the number or type of arguments.

**Example:**
```java
class MultiplyFun {

    // Method with 2 parameters
    static int Multiply(int a, int b) {
        return a * b;
    }

    // Method with the same name but 3 parameters
    static int Multiply(int a, int b, int c) {
        return a * b * c;
    }
}

class Main {

    public static void main(String[] args) {
        System.out.println(MultiplyFun.Multiply(2, 4));
        System.out.println(MultiplyFun.Multiply(2, 7, 3));
    }
}
```

**Output:**

    8
    42

#### Operator Overloading
Java supports limited operator overloading. Only the + operator is overloaded to work with both numbers and strings.

**Example:**
```java
class OperatorOVERDDN {

    void operator(String str1, String str2) {
        String s = str1 + str2;
        System.out.println("Concatenated String - " + s);
    }

    void operator(int a, int b) {
        int c = a + b;
        System.out.println("Sum = " + c);
    }
}

class Main {

    public static void main(String[] args) {
        OperatorOVERDDN obj = new OperatorOVERDDN();
        obj.operator(2, 3);
        obj.operator("joe", "now");
    }
}
```

**Output:**

    Sum = 5
    Concatenated String – joenow

### 2. Runtime Polymorphism
Also known as Dynamic Method Dispatch. This is where a call to an overridden method is resolved at runtime, allowing one interface to have multiple implementations.

#### Method Overriding
Occurs when a subclass provides a specific implementation of a method already defined in its superclass.


**Example:**
```java
class Parent {
    void Print() {
        System.out.println("parent class");
    }
}

class subclass1 extends Parent {
    void Print() {
        System.out.println("subclass1");
    }
}

class subclass2 extends Parent {
    void Print() {
        System.out.println("subclass2");
    }
}

class TestPolymorphism3 {
    public static void main(String[] args) {
        Parent a;

        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
}
```

**Output:**

    subclass1
    subclass2

## Abstract Class and Method
Data abstraction is the process of hiding certain details and showing only essential information to the user.

Abstraction can be achieved with either **abstract classes** or **interfaces**.

The `abstract` keyword is a non-access modifier, used for classes and methods:

### Abstract Class
An **abstract class** is a restricted class that cannot be used to create objects. To access it, it must be inherited by another class.

### Abstract Method
An **abstract method** can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (i.e., the class that inherits from it).

An abstract class can have both abstract and regular methods.

**Example: Abstract Class in Java**

```java
// An example abstract class in Java
abstract class Shape {
    int color;

    // An abstract function (like a pure virtual function in C++)
    abstract void draw();
}
```

### Important Observations About Abstract Classes in Java
Like C++, an instance of an abstract class **cannot be created**; however, references of abstract class type can exist.

**Example: Abstract Class with Method Implementation in Derived Class**

```java
abstract class Base {
    abstract void fun();
}

class Derived extends Base {
    void fun() {
        System.out.println("Derived fun() called");
    }
}

class Main {
    public static void main(String args[]) {
        // Uncommenting the following line will cause a compiler error
        // Base b = new Base();

        // We can have references of Base type
        Base b = new Derived();
        b.fun();
    }
}
```

**Output:**

    Derived fun() called

### Abstract Class with Constructor
Like C++, abstract classes in Java **can have constructors**. The constructor of an abstract class is called when an instance of a derived class is created.

```java
abstract class Base {
    Base() {
        System.out.println("Base Constructor Called");
    }

    abstract void fun();
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived Constructor Called");
    }

    void fun() {
        System.out.println("Derived fun() called");
    }
}

class Main {
    public static void main(String args[]) {
        Derived d = new Derived();
    }
}
```

**Output:**

    Base Constructor Called  
    Derived Constructor Called

### Abstract Class Without Any Abstract Method
In Java, an abstract class **can exist without any abstract methods**. This is useful for creating classes that cannot be instantiated, but can be inherited.

```java
abstract class Base {
    void fun() {
        System.out.println("Base fun() called");
    }
}

class Derived extends Base {}

class Main {
    public static void main(String args[]) {
        Derived d = new Derived();
        d.fun();
    }
}
```

**Output:**

    Base fun() called

### Abstract Class with Final Method
Abstract classes can also contain **final methods**, which cannot be overridden by subclasses.

```java
abstract class Base {
    final void fun() {
        System.out.println("Derived fun() called");
    }
}

class Derived extends Base {}

class Main {
    public static void main(String args[]) {
        Base b = new Derived();
        b.fun();
    }
}
```

**Output:**

    Derived fun() called

## Final Class and Method
The `final` keyword prevents inheritance or method overriding.

- **Final class:** cannot be extended
- **Final method:** cannot be overridden

```java
final public class A {
    // code
}

// or

public final class A {
    // code
}
```

**Final Method Example:**

```java
public final void someMethod() {
    // code
}
```

**Attempt to extend final class causes compilation error:**

```java
class B extends A {
    // Error: A is final
}
```

### Why Use Final?
To prevent misuse through subclassing.

**Example:**

```java
public class Car {
    public void move() {
        System.out.println("Moving on road");
    }
}

class MoveAVehicle {
    public static void move(Car c) {
        c.move();
    }
}
```

Now someone else does:

```java
class Aeroplane extends Car {
    public void move() {
        System.out.println("Moving in air");
    }
}

MoveAVehicle.move(new Aeroplane());
```

Which prints "Moving in air"—**logically incorrect** for a `Car`.

To prevent this misuse:

- Declare `Car` as `final`
- Or make `move()` method `final`

## Final Class and Method
Inheritance is one of Java’s powerful features. However, sometimes it's necessary to prevent other classes from extending a given class or overriding its methods to avoid misuse. For this, Java provides the `final` keyword.

- A **final class** cannot be extended.
- A **final method** cannot be overridden in subclasses.
- A final class **can extend** other classes, but **cannot be a superclass**.

### Final Class Example
The `final` keyword can be placed either before or after the access specifier:

```java
final public class A {
    // code
}
```

This is equivalent to:

```java
public final class A {
    // code
}
```

#### Rules:
- No specifiers should appear **between** the class name and the keyword `class`.
- All other specifiers (e.g., `public`, `final`) must appear **before** `class`.

#### Final Method Example
Declare final methods by placing `final` before the return type:

```java
public final void someMethod() {
    // code
}
```

You can combine `public`, `static`, and `final` in any order before the return type.

#### Compilation Errors
Trying to extend a `final` class causes an error:

```java
class B extends A {
    // Compilation error: A is final
}
```

#### Real-World Example
Suppose you're a developer providing classes for others to use. You define the following:

```java
public class Car {
    public void move() {
        System.out.println("Moving on road");
    }
}

class MoveAVehicle {
    public static void move(Car c) {
        c.move();
    }
}
```

Now someone else does this:

```java
class Aeroplane extends Car {
    public void move() {
        System.out.println("Moving in air");
    }
}
```

They call:

    MoveAVehicle.move(new Aeroplane());

**Output:**

    Moving in air

This is logically incorrect—**an Aeroplane is not a Car**. To avoid such issues:

- Mark the `Car` class as `final`
- Or mark the `move()` method as `final`

### Summary:

- Use `final` to **safeguard your code** from being altered in unintended ways.
- `final` prevents incorrect subclassing and method overriding.
- It's especially useful in public APIs or frameworks where logical consistency is critical.

## Summary

In this module, we have learned how polymorphism works in Java programming through the concepts of **method overloading** and **method overriding**. We explored how **abstract classes** and **abstract methods** are used with various examples. Finally, we examined the **`final` keyword** in Java and observed how it affects the behavior of methods and classes when used.
