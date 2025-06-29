# Module 11: Test Data Generation

## Introduction
Test generation involves creating test data or test cases to assess the adequacy of new or updated software. It is a complex and critical part of software testing, which can consume up to one-third of total development costs. Automating quality test data generation is key to efficiency and accuracy.

### Learning Outcomes
By the end of this module, you should be able to:
- Install and use the JUnit testing framework in Eclipse.
- Explain types of testing (positive and negative) and identify valid and invalid data sets.
- Use JUnit assertions to test pre-conditions and post-conditions.

### Key Terms and Concepts

**Test Data**  
Data identified specifically for use in testing.

**JUnit**  
A unit testing framework for Java, essential for test-driven development.

**Assertion**  
A Java statement that checks program assumptions for correctness.

**Pre-Condition**  
A condition that must be true before executing a section of code. If false, behavior is undefined.

**Post-Condition**  
A condition that must be true after a section of code has executed, often tested with assertions.

## What is Test Data?

Test data is the input provided to a system to execute test cases. It is essential for verifying expected outputs and for testing application behavior under various conditions. Test data may be:

- **Valid**: Meets expected input criteria.
- **Invalid**: Used to test error handling.
- **Large in volume**: Used in load or stress testing scenarios.

**Example:**  
Testing a mobile app requires various types of test data—images (JPG, PNG), audio files (MP3, unsupported formats), video files, contacts, and emails.

Without test data, meaningful testing and accurate results are impossible.

---

### Why is Test Data Important?

Test data:
- Enables effective execution of test cases.
- Supports testing for multiple use cases.
- Helps uncover edge cases and application limits.
- Is crucial for stress and load testing.

---

### Creating a JUnit Test Case in Eclipse

Learn how to create JUnit test cases using Eclipse here:  
🔗 [Eclipse JUnit Tutorial (University of Washington)](https://courses.cs.washington.edu/courses/cse143/11wi/eclipse-tutorial/junit.shtml)

---

### What is JUnit?

JUnit is an open-source **unit testing framework** for the Java programming language. It's essential for **regression testing** and supports writing repeatable, automated tests.

#### Key Features:
- Part of the xUnit family.
- Introduced **annotations** in JUnit 4 (e.g., `@Test`, `@Before`, `@After`), improving readability and organization.
- JUnit 5 further modularized and improved the framework.

JUnit helps developers:
- Verify individual units of code.
- Prevent regression bugs.
- Automate testing in CI/CD pipelines.

## Types of Testing

Software testing is the process of **verification and validation** to ensure a software application works as expected. It involves providing inputs and verifying that outputs meet the specified requirements. The goal is to find defects and improve software quality.

There are two main types of testing:

---

### Positive Testing

**Positive Testing** validates a system with valid input data. It checks whether the application behaves as expected under normal conditions.

- Ensures the software works with **expected/valid inputs**.
- Proves that the system meets requirements.
- Often covers **day-to-day scenarios**.

**Example:**  
If a textbox expects an integer for age, entering values like `25` or `30` would be positive testing. The system should accept and process these inputs correctly.

---

### Negative Testing

**Negative Testing** checks how the system handles **invalid input** or unexpected conditions.

- Helps ensure the application **fails gracefully**.
- Focuses on **robustness** and **error handling**.
- Validates input validation mechanisms.

**Example:**  
Entering `abcd` or special characters in the age textbox, which only accepts integers. The system should reject such input and show a validation error.

---

### Key Differences

| Feature               | Positive Testing                        | Negative Testing                           |
|-----------------------|-----------------------------------------|--------------------------------------------|
| Purpose               | Validate correct inputs                 | Validate incorrect inputs                  |
| Input Type            | Valid data                              | Invalid/Unexpected data                    |
| Focus                 | Meets requirements                      | Handles exceptions                         |
| Example               | Age = 25                                | Age = "abcd"                               |
| Goal                  | Confirm proper behavior                 | Ensure proper error handling               |

---

🔗 [Positive vs Negative Testing – Test IO](https://test.io/blog/negative-vs-positive-testing)  
🔗 [More on Positive vs Negative Testing – ProfessionalQA](http://www.professionalqa.com/positive-testing-vs-negative-testing)

## JUnit Assertion

An assertion is a statement in Java that ensures the correctness of assumptions made in the program. When an assertion is executed, it is expected to be true. If it is false, the JVM throws an `AssertionError`. Assertions are mainly used for testing purposes and are written with boolean expressions.

### Syntax

There are two ways to use the `assert` statement:

    assert expression;
    assert expression1 : expression2;

### JUnit Assertions

All assertions in JUnit are part of the `Assert` class:

    public class Assert extends java.lang.Object

This class provides a set of assertion methods useful for writing tests. Only failed assertions are recorded.

### Common Methods of the `Assert` Class

| Method Signature                            | Description                                                 |
|--------------------------------------------|-------------------------------------------------------------|
| `assertEquals(expected, actual)`           | Checks that two values (primitives or objects) are equal    |
| `assertTrue(condition)`                    | Checks that a condition is true                             |
| `assertFalse(condition)`                   | Checks that a condition is false                            |
| `assertNotNull(object)`                    | Checks that an object is not null                           |
| `assertNull(object)`                       | Checks that an object is null                               |
| `assertSame(object1, object2)`             | Checks that two references point to the same object         |
| `assertNotSame(object1, object2)`          | Checks that two references point to different objects       |
| `assertArrayEquals(expected, result)`      | Checks that two arrays are equal                            |

### Example

    import static org.junit.Assert.*;
    import org.junit.Test;

    public class AssertionTest {

        @Test
        public void testNumbers() {
            int sum = 2 + 2;
            assertEquals(4, sum);
            assertTrue(sum == 4);
            assertFalse(sum == 5);
        }

        @Test
        public void testNullCheck() {
            Object obj = null;
            assertNull(obj);
            obj = new Object();
            assertNotNull(obj);
        }

        @Test
        public void testArrays() {
            int[] expected = {1, 2, 3};
            int[] actual = {1, 2, 3};
            assertArrayEquals(expected, actual);
        }
    }

## Pre-Conditions and Post-Conditions

### Pre-Condition
Pre-Conditions are conditions that must be true before a method runs for it to work.

### Post-Condition
Post-Conditions are conditions that can be guaranteed after a method has finished.

## Summary

- This module covered how test data is generated.
- Explored implementation of positive and negative testing with examples.
- Provided explanations of JUnit and JUnit Assertions.
- Used examples to demonstrate how assertions help verify program correctness.
