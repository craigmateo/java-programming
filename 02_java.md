# Module 2: Java

## Introduction

Java has its own structure, syntax, and is based on the object-oriented programming (OOP) paradigm.

### Learning Outcomes  
By the end of this module, you will be able to:  
- Explain the Java language  
- Outline Java program types  
- Understand OOP terminology  
- Summarize Java program structure  
- Explain the Java development cycle  

### Key Terms  
- **Application:** Stand-alone program  
- **Servlet:** Java program running on a web/application server for server-side processing  
- **Applet:** Java program run inside a browser  
- **Procedural Program:** Programming by dividing tasks into procedures  
- **Object-Oriented Program:** Focuses on manipulating objects, not just logic  
- **Bytecode:** Intermediate code between source and machine code  
- **Intermediate Code:** Middle-level code generated during compilation  
- **Machine Code:** CPU-executable instructions  

## The Java Programming Language

- Created by Dr. James Gosling, released in 1995 by Sun Microsystems  
- Used for:  
  - Interactive web pages  
  - Web-based applications (e.g., online bookstores)  
  - Stand-alone enterprise apps  
  - Software for devices (cell phones, e-readers, etc.)  
- Object-oriented language: modular, uses classes, objects, methods  
- Part of the Java Standard Edition Development Kit (JDK)  
- JDK includes reusable packages and developer tools for writing, compiling, and running Java programs  

## Three Types of Java Programs

- **Applications**: Stand-alone programs  
- **Servlets**: Run on web/application servers; handle server-side processing (e.g., database access, e-commerce)  
- **Applets**: Run inside web browsers (e.g., Firefox, Opera, Internet Explorer)  

## Introduction to Object-Oriented Terminology

- **Procedural Programming**:  
  - Older style focusing on sequences of procedures (methods/subroutines).  
  - Code operates on data to produce output.  
  - Changing behavior requires revising code carefully.

- **Object-Oriented Programming (OOP)**:  
  - Focuses on data (objects) and their interactions, not just code steps.  
  - Objects represent real-world things (e.g., car, employee).  
  - Objects have **attributes** (data) and **methods** (behaviors).  
  - Methods are built-in, so code calls methods instead of writing detailed steps.

- **Classes and Objects**:  
  - A **class** is a template defining attributes and methods for objects.  
  - An **object** is an instance of a class (created by instantiation).  
  - Example: A cake recipe = class; each cake baked = object instance.  
  - You can create many objects from the same class.

# The Structure of a Java Program

- The first traditional program is a Hello World program that displays “Hello World” on the screen.  
- It shows that Java can instruct the computer to communicate with the outside world.

## Hello World Java Program Example:

```java
public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World.");
    }
}
```

## Explanation:

- `public` and `class` are keywords reserved by Java:
  - `public` means accessible from anywhere (for running).
  - `class` declares a class.
- The class name `HelloWorld` should be meaningful and without spaces.
- Curly braces `{ }` mark the beginning and end of the class and method.

### The `main()` method:

- The first method executed when a program runs.
- Method header: `public static void main(String args[])`
  - `public`: method is accessible.
  - `static`: required for this method (details to come).
  - `void`: this method returns no value.
  - `main(String args[])` allows passing arguments to the program.

### Inside `main()`:

- The code between `{ }` runs first.
- `System.out.println("Hello World.");` prints the message on the screen:
  - `System` is a class.
  - `out` is an object (standard output).
  - `println()` is a method that prints text with a newline.
  - Text in quotes `"Hello World."` is displayed (quotes not shown).
  - The semicolon `;` ends the statement.

## The Java Development Cycle

The Java development cycle consists of three steps: writing code, compiling code, and executing code.

### 1. Writing Java Source Code
- Write Java programs using a text editor (e.g., Notepad).
- Save the file with the same name as the class and `.java` extension (e.g., `HelloWorld.java`).
- Source code is the human-readable Java statements you write.

### 2. Compiling a Java Program
- Use the Java compiler (`javac`) to convert source code into bytecode.
- Bytecode is platform-independent intermediate code saved as a `.class` file.
- Platform independence allows the same bytecode to run on different operating systems.

### 3. Executing a Java Program
- The Java Virtual Machine (JVM) converts bytecode into machine code for the specific platform.
- JVMs exist for various systems (Windows, Mac, Linux) and browsers.
- Use the `java` utility to run the compiled bytecode.


