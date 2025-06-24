# Module 10: Generic Classes and Methods

## Introduction
Generic methods and generic classes (and interfaces) enable you to specify with a single method declaration, a set of related methods or a single class declaration, a set of related types. Generics also provide a compile-time type safety that allows you to catch invalid types at compile time.

### Learning Outcomes
By the end of this module, you should be able to complete the following:

- Explain the objective of generic programming.
- Implement generic classes and methods; and
- Explain the limitations of generic programming in Java.

### Key Terms and Concepts
Below are a list of terms and concepts that you will come across throughout this module:

#### Generic Class
Generic classes enable programmers to specify, with a single method declaration, a set of related methods, or with a single class declaration, a set of related types.

#### Generic Method
Generic methods are methods that introduce their own type parameters. This is similar to declaring a generic type, but the type parameter's scope is limited to the method where it is declared.

#### Generic Interface
Generics also work with interfaces. Thus, you can also have generic interfaces. Generic interfaces are specified just like generic classes.

## Generics in Java

- Java Generics: language features related to defining and using generic types and methods.
- Generic types/methods differ from regular ones by having type parameters.
- Generics allow creation of parameterized types by supplying actual type arguments that replace formal type parameters.

## Why Generics?

- Original Java collections use `Object` type for arguments and return values, making them heterogeneous.
- Homogeneous collections required extra runtime checks in the original framework.
- Generics introduce compile-time type checking to enforce type safety.
- Generics reduce the need for unnecessary runtime code and checks.
- Generics improve code stability by catching more bugs at compile time.
- Understanding how generics work internally is the next step after knowing why they exist.

## How Can You Use Generics?

- Generics define type parameters in class/interface signatures using angle brackets `< >`.
- Example: `public class GenericContainer<T> { ... }`
- Type parameters (type variables) act as placeholders assigned at runtime.
- Common type parameter conventions:
  - `E`: Element
  - `K`: Key
  - `N`: Number
  - `T`: Type
  - `V`: Value
  - `S, U, V, ...`: Additional types for multiple parameters
- Example of usage:
  - `GenericContainer<String> stringContainer = new GenericContainer<String>();`
  - Here, `T` is replaced by `String`.
- Constructors can also use generics for initializing fields:
  - `GenericContainer gc1 = new GenericContainer(3);`
  - `GenericContainer gc2 = new GenericContainer("Hello");`
- **Raw types** are generics without a specified type parameter:
  - Example: `GenericContainer rawContainer = new GenericContainer();`
  - Raw types disable compile-time type checking, making code error-prone at runtime.
- Avoid using raw types in everyday code; useful mainly for backward compatibility.

## Types of Generics

### Generic Type Class or Interface

- A **generic class** declares one or more type variables (type parameters).
- These type parameters allow the class to enforce type safety during compile time.

#### Example: Without Generics
```java
class DemoClass {
   private Object t;
   public void set(Object t) { this.t = t; }
   public Object get() { return t; }
}
```

- Any type can be passed; type safety is not enforced.

**Example:** With Generics

```java
class DemoClass<T> {
   private T t;
   public void set(T t) { this.t = t; }
   public T get() { return t; }
}
```

- Enforces type safety (e.g., `DemoClass<String>` will only accept String values).

**Generic Interface Example**

```java
interface DemoInterface<T1, T2> {
   T2 doSomeOperation(T1 t);
   T1 doReverseOperation(T2 t);
}

class DemoClass implements DemoInterface<String, Integer> {
   public Integer doSomeOperation(String t) { ... }
   public String doReverseOperation(Integer t) { ... }
}
```

### Generic Type Method or Constructor

- Generic methods introduce their own type parameters, used only within that method.
- Declared with type parameter syntax: `<T> returnType methodName(...)`

**Generic Method Example**

```java
public static <T> int countAllOccurrences(T[] list, T item) {
   int count = 0;
   for (T listItem : list) {
      if ((item == null && listItem == null) || (item != null && item.equals(listItem))) {
         count++;
      }
   }
   return count;
}
```

- Works only when both list and item are of the same type `T`.
- Compile-time error if mismatched types are used.

**Generic Constructor Example**

```java
class Dimension<T> {
   private T length, width, height;

   public Dimension(T length, T width, T height) {
      this.length = length;
      this.width = width;
      this.height = height;
   }
}
```

- Ensures all values passed to the constructor are of the same type `T`.

## Java Generic Methods

### Defining Generic Methods

- Generic methods allow a single method declaration to operate on different types.
- Syntax includes a type parameter section before the return type: `<E>`.
- Type parameters (like `E`, `T`, etc.) act as placeholders for actual types.
- Generic methods can return or take parameters of the generic type.
- Type parameters **must be reference types** (not primitives like `int`, `double`, etc.).

#### Example: Printing Arrays of Different Types

    public class GenericMethodTest {

       // generic method printArray
       public static <E> void printArray(E[] inputArray) {
          for (E element : inputArray) {
             System.out.printf("%s ", element);
          }
          System.out.println();
       }

       public static void main(String args[]) {
          // Create arrays of Integer, Double and Character
          Integer[] intArray = { 1, 2, 3, 4, 5 };
          Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
          Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

          System.out.println("Array integerArray contains:");
          printArray(intArray); // pass an Integer array

          System.out.println("\nArray doubleArray contains:");
          printArray(doubleArray); // pass a Double array

          System.out.println("\nArray characterArray contains:");
          printArray(charArray); // pass a Character array
       }
    }

#### Output:

    Array integerArray contains:
    1 2 3 4 5

    Array doubleArray contains:
    1.1 2.2 3.3 4.4

    Array characterArray contains:
    H E L L O

---

### Bounded Type Parameters

- Sometimes, you may want to restrict the types that can be passed to a generic method.
- Use **bounded type parameters** with the `extends` keyword.
- `T extends Comparable<T>` means T must implement `Comparable<T>`.

#### Example: Finding the Maximum of Three Values

    public class MaximumTest {

       // determines the largest of three Comparable objects
       public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
          T max = x; // assume x is initially the largest

          if (y.compareTo(max) > 0) {
             max = y; // y is the largest so far
          }

          if (z.compareTo(max) > 0) {
             max = z; // z is the largest now
          }

          return max; // returns the largest object
       }

       public static void main(String args[]) {
          System.out.printf("Max of %d, %d and %d is %d\n\n",
             3, 4, 5, maximum(3, 4, 5));

          System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n\n",
             6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

          System.out.printf("Max of %s, %s and %s is %s\n",
             "pear", "apple", "orange", maximum("pear", "apple", "orange"));
       }
    }

#### Output:

    Max of 3, 4 and 5 is 5

    Max of 6.6, 8.8 and 7.7 is 8.8

    Max of pear, apple and orange is pear

## Java Generic Class

A generic class declaration looks like a non-generic class declaration, except that the class name is followed by a type parameter section.

- The type parameter section can have one or more parameters separated by commas.
- These are known as **parameterized classes** or **parameterized types**.

### Syntax:

    public class Box<T> {
       private T t;
    }

**Where:**

- `Box` – the generic class name.
- `T` – a type parameter that can be any Object type.
- `t` – instance of generic type `T`.

---

### Description

- `T` is a **type parameter** passed to the class.
- The type must be specified when a `Box` object is created.
- It allows type-safe operations without casting.

---

### Example: GenericsTester.java

    package com.tutorialspoint;

    public class GenericsTester {

       public static void main(String[] args) {

          Box<Integer> integerBox = new Box<Integer>();
          Box<String> stringBox = new Box<String>();

          integerBox.add(new Integer(10));
          stringBox.add(new String("Hello World"));

          System.out.printf("Integer Value :%d\n", integerBox.get());
          System.out.printf("String Value :%s\n", stringBox.get());
       }
    }

    class Box<T> {

       private T t;

       public void add(T t) {
          this.t = t;
       }

       public T get() {
          return t;
       }
    }

---

### Output:

    Integer Value :10
    String Value :Hello World

## Restrictions in Java Generics

The following list will describe the restrictions in Java Generics: These restrictions are as follows:

- Cannot Instantiate Generic Types with Primitive Types.
- Cannot Create Instances of Type Parameters.
- Cannot Declare Static Fields Whose Types are Type Parameters.
- Cannot Use Casts or `instanceof` With Parameterized Types.
- Cannot Create Arrays of Parameterized Types.
- Cannot Create, Catch, or Throw Objects of Parameterized Types.
- Cannot Overload a Method Where the Formal Parameter Types of Each Overload Erase to the Same Raw Type.

## Advantages of Generics in Java

- **Reusability**: Define classes/interfaces without fixed data types.
- **Type Safety**: Enforces strong typing at compile time.
- **Flexibility**: One generic interface can handle multiple data types (e.g., String, Integer).
- **Less Code Duplication**: Avoids writing separate classes/methods for each type.
- **Better Performance**: Reduces the need for casting and improves runtime efficiency.

## Summary

Generics were introduced in Java 5 (J2SE 5.0) to enable generic programming. They extend Java's type system, allowing types or methods to operate on various object types while ensuring compile-time type safety. The Java Collections Framework uses generics to specify the type of objects stored in collections. This module covered basic concepts and examples of generic classes and methods.
