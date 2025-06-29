# Module 14: Case Study

## Introduction

This final module involves a **2-hour examination** that assesses both **theoretical understanding** and **practical Java skills** acquired during the course. The exam is structured in two parts:

1. **Question Section** – Answer a series of short and long questions based on Java concepts.
2. **Project Section** – Create a **Java-based project or game** using concepts learned throughout the course.

Demonstrating clear problem-solving ability and conceptual understanding is key to passing.

---

### Learning Outcomes

By the end of this module, you should be able to:

- Answer **short and long-form questions** on core Java topics.
- Design and implement a **Java-based project or game**, demonstrating integrated use of Java principles.

## Java Short Answer Review Notes

---

### **Question 1: List and Explain Various Features of Java**

| **Feature**           | **Description**                                                                 |
|-----------------------|---------------------------------------------------------------------------------|
| **Object-Oriented**   | Everything in Java is treated as an object, supporting OOP principles.         |
| **Platform Independent** | Java code is compiled into **bytecode** which runs on any system via the **JVM**. |
| **Simple**            | Easy to learn with a syntax similar to C/C++, but with reduced complexity.     |
| **Secure**            | Provides security features like bytecode verification and access control.      |
| **Architecture Neutral** | Bytecode format enables execution on any hardware that supports a JVM.        |
| **Portable**          | Java programs can run on different platforms without modification.             |
| **Robust**            | Emphasizes compile-time error checking and runtime exception handling.         |
| **Multithreaded**     | Built-in support for concurrent execution of two or more threads.              |
| **Interpreted**       | Bytecode is interpreted by the JVM at runtime, allowing dynamic execution.     |
| **High Performance**  | **JIT (Just-In-Time)** compiler enhances runtime performance.                  |
| **Distributed**       | Supports networking and remote method invocation (RMI) for distributed apps.   |
| **Dynamic**           | Capable of dynamically loading classes at runtime and adapting to changes.     |

---

### **Question 2: Explain `super`, `static`, and `final` Using Examples**

### `super`
- Refers to **parent class members**.
- Used to call **superclass constructors** or overridden methods.

```java
class Parent {
    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    void show() {
        super.show(); // Calls Parent's show method
        System.out.println("Child show()");
    }
}
```

`static`
- Belongs to the class, not instances.
- Can be accessed without creating an object.

```java
class MyClass {
    static int count = 0;
    static void display() {
        System.out.println("Static method called");
    }
}
```

**Usage:**

```java
MyClass.display(); // No object needed
System.out.println(MyClass.count);
```

`final`
- Used to define constants, or prevent inheritance/overriding.

```java
final int MAX = 100; // Value can't change

final class A {} // Class can't be extended

class B {
    final void show() {
        System.out.println("Can't override this method");
    }
}
```

### Question 3: Output of the Given Program

```java
public class Test {
    public static void main(String args[]) {
        try {
            System.out.println("calling method a");
            a();
            System.out.println("return from method a");
        } catch (ArithmeticException e) {
            System.out.println("main: catch");
        } finally {
            System.out.println("main: finally");
        }
    }

    public static void a() {
        try {
            int x = 8, y = 0;
            int z = x / y; // Exception when y = 0
            System.out.println("value of z=" + z);
        } catch (NumberFormatException e) {
            System.out.println("method a:catch");
        } finally {
            System.out.println("method a:finally");
        }
    }
}
```

#### ✅ Output for `y = 0`

    calling method a
    method a:finally
    main: catch
    main: finally

- Division by zero triggers `ArithmeticException`
- `NumberFormatException` is not caught in method `a()`, so control moves to `main()`

#### ✅ Output for y = 2

    calling method a
    value of z=4
    method a:finally
    return from method a
    main: finally

- No exception thrown
- `z` is successfully calculated and printed
- Both `finally` blocks execute

## Method Overloading and Overriding in Java (Marks: 07)

---

### **Method Overloading**

**Definition**:  
Method overloading allows a class to have more than one method with the **same name**, as long as their **parameter lists differ** (different number, type, or order of parameters). It is a type of **compile-time polymorphism**.

#### ✅ Example:

```java
public class Example {
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void multiply(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String[] args) {
        multiply(2, 3);       // Outputs: 6
        multiply(2, 3, 4);    // Outputs: 24
    }
}
```

### 🔹 Key Points:
- Same method name: `multiply`
- Different parameters (2 vs. 3 arguments)
- Resolved **at compile time**

### Method Overriding
**Definition:**
Method overriding occurs when a child class defines a method that already exists in the parent class with the same name and parameters. It enables run-time polymorphism.

✅ Example:

```java
// Parent class
class Dog {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class
class Puppy extends Dog {
    // Overriding the bark() method
    void bark() {
        System.out.println("Puppy is barking");
    }

    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.bark(); // Calls overridden method in Puppy
    }
}
```

🔹 Key Points:
- Same method name and parameters
- Defined in parent and child classes
- Determined at runtime

### Summary Table

| Feature            | Overloading                          | Overriding                          |
|--------------------|---------------------------------------|-------------------------------------|
| Method Name        | Same                                  | Same                                |
| Parameters         | Must be different                     | Must be same                        |
| Inheritance        | Not required                          | Required                            |
| Polymorphism Type  | Compile-time                          | Run-time                            |
| Access via         | Same class                            | Parent-child class relationship     |

