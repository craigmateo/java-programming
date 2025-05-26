# Module 8: Loops and Arrays

## Introduction

Loops are used to execute a set of statements repeatedly until a particular condition is satisfied.  
Arrays in Java, as in other languages, provide a way to store collections of items as a single unit.  
In this module, we will introduce arrays and loops in Java using example code for creating and accessing them.

---

### Learning Outcomes

Upon completion of this module, you will be able to:

- Distinguish between `for`, `while`, and `do...while` loops  
- Construct Java programs using `for`, `while`, and `do...while` loops  
- Explain Java `break` statements  
- Explain Java `continue` statements  
- Interpret and use arrays in Java programming

---

### Key Terms and Concepts

| Term              | Description                                                                 |
|-------------------|-----------------------------------------------------------------------------|
| **Increment**     | Increasing a variable by a constant value (often `+1`)                      |
| **Decrement**     | Decreasing a variable by a constant value (often `-1`)                      |
| **Counter**       | A numeric variable used to count loop iterations                            |
| **Indefinite loop** | A loop for which the number of executions is not known in advance        |
| **Nested loops**  | Loops placed inside other loops                                              |
| **Outer loop**    | The external loop that contains another loop                                |
| **Inner loop**    | The loop that is nested inside another loop                                 |
| **For loop**      | A loop that uses a control variable with automatic initialization, condition check, and update |
| **For-each loop** | An alternative `for` syntax for iterating through arrays and collections    |
| **While loop**    | A pre-test loop where the condition is evaluated before each iteration      |
| **Do-while loop** | A post-test loop that executes the body at least once before testing the condition |

## Loops

In Java programming, loops are used to repeat a block of code efficiently instead of writing it multiple times.
Java supports three types of loops:

1. **For loop** – Repeats a block of code a specific number of times using the structure:
`for (initialExpression; testExpression; updateExpression) { /* loop body */ }`
2. **While loop**
3. **Do...while loop**

The `for` loop is typically used when the number of iterations is known in advance.

### Example #1: Java For Loop

If you want to display a Text Five Times, you can do the following.

Program to print a text 5 times

    class Main {

            public static void main(String[] args) {

        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }
    }
    }

    Output

    Java is fun
    Java is fun
    Java is fun
    Java is fun
    Java is fun

### Example #2: Java Infinite for Loop

If we set the test expression in such a way that it never evaluates a false, the loop will run forever. This is called infinite for loop.

An example of this is seen here:

    // Infinite for Loop

    class Infinite {
        public static void main(String[] args) {

            int sum = 0;

            for (int i = 1; i <= 10; --i) {
                    System.out.println("Hello");
        }
    }
    }

### Java for-each Loop (Enhanced for Loop)

Used to iterate over elements in arrays or collections more simply than a traditional `for` loop.

    for (dataType item : arrayOrCollection) {
        // loop body
    }

- `item`: temporarily holds each element
- `arrayOrCollection`: the source being iterated over

**Example:**
Prints each element of an integer array:
    int[] numbers = {3, 9, 5, -5};
    for (int number : numbers) {
        System.out.println(number);
    }

Output:

    3
    9
    5
    -5

### Java while Loop
Used to repeatedly execute a block of code as long as a condition is true.

Useful when the number of iterations is not known in advance.

    while (condition) {
    // code to execute
    }

- The condition is evaluated before the loop body runs.
- If the condition is false at the start, the loop body will not execute at all.

**Example:**

    // Program to display numbers from 1 to 5

    class Main {
    public static void main(String[] args) {

    // declare variables
    int i = 1, n = 5;

    // while loop from 1 to 5
    while(i <= n) {
        System.out.println(i);
        i++;
        }
    }
    }

### Java do...while loop

The `do...while` loop is similar to the `while` loop, but executes the loop body at least once before checking the condition.

    do {
    // loop body
    } while (testExpression);

The loop:

- Executes the body first.
- Then checks testExpression.
- Repeats the body as long as the expression is true.
- Stops when the expression evaluates to false.

Useful when the loop body must **run at least once**, regardless of the condition.

**Example:**

    // Java Program to display numbers from 1 to 5

    import java.util.Scanner;

    // Program to find the sum of natural numbers from 1 to 100.

    class Main {
        public static void main(String[] args) {

        int i = 1, n = 5;

        // do...while loop from 1 to 5
        do {
            System.out.println(i);
            i++;
        } while(i <= n);
    }
    }

### Infinite Loops and Loop Usage in Java

Infinite Loops: Occur when a loop's condition is always `true`, causing the loop to run indefinitely (until the program is manually stopped or memory runs out).

    while(true) {
    // runs forever
    }

    do {
    // runs forever
    } while(count == 1);  // if condition never becomes false

### Choosing the Right Loop:

- **for loop**: Use when the number of iterations is known.
- **while and do...while loops**: Use when the number of iterations is unknown (e.g., waiting for user input or an external event).

    while (condition) {
        // unknown iteration count
    }

### Break Statement

- The `break` statement immediately exits a loop, skipping the rest of its code and continuing with the next statement after the loop.
- It’s commonly used with if...else to exit a loop based on a condition.

### Java continue Statement

- The continue statement skips the current iteration of a loop and moves to the next iteration.
- It is used in `for`, `while`, and `do...while` loops.
- After `continue`, the loop's update or test expression is evaluated.

## Arrays

- An array is a collection of elements of the same type (e.g., int, String, double).
- Arrays have a fixed size defined at the time of creation.

**Declaring and Creating Arrays**
    dataType[] arrayName;           // Declaration
    arrayName = new dataType[size]; // Memory allocation

Or combined:

    dataType[] arrayName = new dataType[size];

**Initializing Arrays**

At declaration:
    int[] age = {12, 4, 5, 2, 5};  // Compiler sets the size automatically

By index:
    int[] age = new int[5];
    age[0] = 12;
    age[1] = 4;

**Accessing Array Elements**

Use index (starting at 0):

    System.out.println(age[0]); // Access first element

Example Output

    First Element: 12
    Second Element: 4
    Third Element: 5
    Fourth Element: 2
    Fifth Element: 5

