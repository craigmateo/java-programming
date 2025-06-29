# Module 13: Using the Debugger

## Introduction
- The Java Development Kit (JDK) includes a debugger software.
- The debugger allows monitoring the execution of applications.
- Helps locate and remove logic errors.
- Debugger is a crucial tool in application development.
- Many IDEs offer their own debuggers or graphical interfaces to the JDK debugger.

### Learning Outcomes
By the end of this module, you should be able to:
- Explain the concepts of the Java Debugger.
- Explain the various commands offered by the Java Debugger and their use.

### Key Terms and Concepts

#### Debugger
- A debugger (or debugging tool) is a program used to test and debug other programs (called the "target" program).
- Runs the target program under controlled conditions.
- Allows the programmer to track the program’s operations in progress.
- Monitors changes in computer resources (such as memory) to identify malfunctioning code.

## Breakpoints

- A **breakpoint** is a signal that tells the debugger to temporarily suspend program execution at a specific point in the code.
- Breakpoints can be set on any executable line of code.
- When the program execution reaches a breakpoint:
  - Execution pauses
  - You can examine variable values
  - Helps determine if logic errors exist

## The Print and Set Commands

- **Print Command:**  
  Used to examine the value of complex expressions during debugging.

- **Set Command:**  
  Allows the programmer to assign new values to variables while debugging.

## Controlling Execution Using the Step, Step Up, and Next Commands

- **Step Command:**  
  Executes the next statement in the application.

- **Step Up Command:**  
  Executes the remaining statements in the current method and returns control to the caller (the place where the method was called).

- **Next Command:**  
  Similar to the Step command, but if the next statement contains a method call, it executes the entire method call without stepping into it.

## The Watch Command

- The **Watch Command** tells the debugger to monitor a specific field or variable.
- When the watched field is about to change, the debugger will notify you, allowing you to track variable changes during execution.

## The Clear Command

- The **Clear Command** is used to remove a breakpoint from an application.
- This allows the program to continue running without pausing at that breakpoint.

## Summary

This module covers Java debugging concepts and the different commands along with their uses in Java programming.