# Module 7: Exception Handling

## Introduction
Exception handling in Java is very robust and is easy to understand and use. Exceptions in Java can arise from different kinds of situations such as wrong data entered by the user, hardware failure, network connection failure, database server down, etc. In this module, we will learn how exceptions are handled in Java.

### Learning Outcomes
By the end of this module, you should be able to:

- Explain the various errors generated while executing Java statements.
- Implement the different ways to handle such errors by creating a self-generated block such as `try...catch`, multiple catch blocks, `throw`, `throws`, and `finally` block.

### Key Terms and Concepts

#### Try
The `try` keyword is used to specify a block where we should place exception code. The `try` block must be followed by either `catch` or `finally`. It means we can't use a `try` block alone.

#### Catch
The `catch` block is used to handle the exception. It must be preceded by a `try` block, which means we can't use a `catch` block alone. It can be followed by a `finally` block later.

#### Finally
The `finally` block is used to execute the important code of the program. It is executed whether an exception is handled or not.

#### Throw
The `throw` keyword is used to throw an exception.

#### Throws
The `throws` keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with the method signature.

## Java Exceptions

### Difference between Error and Exception
Read this excellent article for a deeper understanding:  
🔗 [Difference between Error and Exception](https://techdifferences.com/difference-between-error-and-exception.html)

This article provides in-depth definitions and a clear explanation of how errors and exceptions differ. It is highly recommended reading to build the foundational knowledge needed to understand this module.

---

### What Are Exceptions?

Exceptions are events that occur during the execution of programs that disrupt the normal flow of instructions (e.g., divide by zero, array access out of bounds, etc.).

In Java, an **exception** is an object that wraps an error event that occurred within a method and contains:

- Information about the error including its type  
- The state of the program when the error occurred  
- Optionally, other custom information  

Exception objects can be **thrown** and **caught**.

---

### Why Use Exception Handling?

Exception handling ensures that the flow of the program doesn't break when an exception occurs. 

For example, if a program has a bunch of statements and an exception occurs midway:

- Statements after the exception will **not** execute  
- The program will **terminate abruptly**  

By handling exceptions:

- You ensure that all the necessary statements execute  
- The **flow of the program** remains intact  
- It provides better **user experience** and **program stability**

## Java Try and Catch

A method catches an exception using a combination of the `try` and `catch` keywords. A `try/catch` block is placed around the code that might generate an exception. The code within a `try/catch` block is referred to as **protected code**.

### Syntax

```java
try {
    // Protected code
} catch (ExceptionName e1) {
    // Catch block
}
```

- The code which is **prone to exceptions** is placed inside the `try` block.
- When an exception occurs, it is **handled by the corresponding catch block**.
- Every `try` block must be immediately followed by either a `catch` block or a `finally` block.

A `catch` statement involves declaring the type of exception you are trying to catch. If an exception occurs inside the `try` block, the `catch` block (or blocks) are checked. If the type of exception that occurred is listed in a catch block, the exception is passed to that block—just like an argument passed into a method.

**Example**

```java
public class MyClass {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // This will throw an exception
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
```

**Output:**

    Something went wrong.

This example demonstrates how an `ArrayIndexOutOfBoundsException` is caught using a `try-catch` block, preventing the program from crashing abruptly.

## Multiple Catch Blocks in Java

A `try` block can be followed by **multiple catch blocks**. This is useful when different types of exceptions may be thrown from the `try` block, and you want to handle each type differently.

### Syntax

```java
try {
    // Protected code
} catch (ExceptionType1 e1) {
    // Catch block for ExceptionType1
} catch (ExceptionType2 e2) {
    // Catch block for ExceptionType2
} catch (ExceptionType3 e3) {
    // Catch block for ExceptionType3
}
```

- You can have **any number of catch blocks** after a single `try`.
- If an exception occurs, it is checked against each catch block in order.
- The first matching catch block handles the exception.
- If no match is found, the exception is passed to the calling method.

**Example:**

```java
public class MultipleCatchBlock1 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;  // Throws ArithmeticException first
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }

        System.out.println("rest of the code");
    }
}
```

**Output:**

    Arithmetic Exception occurs  
    rest of the code

In this example:

- An `ArithmeticException` occurs due to division by zero.
- It's caught by the first `catch` block.
- The rest of the code executes normally.

## Finally Keyword in Java

The `finally` block in Java follows a `try` block or a `catch` block. It **always executes**, whether an exception occurs or not.

Using a `finally` block is useful for running cleanup code (e.g., closing files, releasing resources) that must happen no matter what occurs in the protected code.

---

### Syntax

```java
try {
    // Protected code
} catch (ExceptionType1 e1) {
    // Catch block
} catch (ExceptionType2 e2) {
    // Catch block
} catch (ExceptionType3 e3) {
    // Catch block
} finally {
    // The finally block always executes
}
```

**Example:**

```java
public class MyClass {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);  // Will throw ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
```

**Output**

    Something went wrong.
    The 'try catch' is finished.

Even though an exception occurs, the `finally` block still runs, ensuring important final steps are completed.

## The `throw` Keyword in Java

The `throw` keyword is used to **explicitly create and throw an exception** in Java, often to signal a custom error condition in your program.

Java provides many built-in exception types such as:

- `ArithmeticException`
- `ClassNotFoundException`
- `ArrayIndexOutOfBoundsException`
- `SecurityException`
- ...and many more.

---

### Example

```java
public class MyClass {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(15); // Set age to 15 (which is below 18...)
    }
}
```

**Output:**

    Exception in thread "main" java.lang.ArithmeticException: Access denied - You must be at least 18 years old.
        at MyClass.checkAge(MyClass.java:4)
        at MyClass.main(MyClass.java:12)

This demonstrates how `throw` is used to interrupt normal program flow and signal that something exceptional has happened.

## The `throws` Keyword in Java

The `throws` keyword in Java is used to **declare exceptions** that a method might throw. It helps inform the caller that it should handle the specified exceptions, allowing for better error handling and more robust programs.

This is especially useful for **checked exceptions**, which must be either caught or declared in the method signature. For **unchecked exceptions** (like `NullPointerException`), it's the programmer’s responsibility to ensure proper code behavior.

---

## Syntax

```java
return_type method_name() throws ExceptionType {
    // method body
}
```

### Common Exception Types
Some examples of exception types in Java:

- `ArithmeticException`
- `ClassNotFoundException`
- `ArrayIndexOutOfBoundsException`
- `IOException`
- `SecurityException`

**Example:**

```java
public class MyClass {

    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(15); // Set age to 15 (which is below 18...)
    }
}
```

**Output:**

    Exception in thread "main" java.lang.ArithmeticException: Access denied - You must be at least 18 years old.
        at MyClass.checkAge(MyClass.java:4)
        at MyClass.main(MyClass.java:12)

### Summary
- Use `throws` in method declarations to signal potential exceptions.
- It promotes better code design by making error scenarios explicit.
- It is mostly used for **checked exceptions** that Java forces you to handle.

## Difference Between `throw` and `throws` in Java

### `throw` Statement
- Used to explicitly throw an exception from a method or block of code.
- Cannot throw multiple exceptions.
- Used inside the method body.
- Syntax: `throw new ExceptionType("message");`

### `throws` Statement
- Used to declare that a method may throw one or more exceptions.
- Can declare multiple exceptions.
- Used in the method signature.
- Syntax: `returnType methodName() throws ExceptionType1, ExceptionType2 { ... }`

### Summary Table

| Feature        | `throw`                                  | `throws`                                       |
|----------------|-------------------------------------------|------------------------------------------------|
| Purpose        | Actually throws an exception              | Declares exceptions a method may throw         |
| Placement      | Inside a method                           | In method signature                            |
| Syntax         | Followed by an exception object           | Followed by one or more exception class names  |
| Multiple?      | ❌ No                                      | ✅ Yes                                          |

## Summary: Exception Handling in Java

Exception handling in Java allows programs to detect and respond to unexpected events (exceptions) without crashing. Its main goals are:

- **Detect the problem**  
- **Report that an error has occurred**  
- **Receive the error information**  
- **Take corrective action**

Java separates error-handling into two key parts:
- **Throwing exceptions**: when an error is detected.
- **Catching exceptions**: handling the error appropriately to maintain normal program flow.

## Summary: Exception Handling in Java

Exception handling in Java allows programs to detect and respond to unexpected events (exceptions) without crashing. Its main goals are:

- **Detect the problem**  
- **Report that an error has occurred**  
- **Receive the error information**  
- **Take corrective action**

Java separates error-handling into two key parts:
- **Throwing exceptions**: when an error is detected.
- **Catching exceptions**: handling the error appropriately to maintain normal program flow.
