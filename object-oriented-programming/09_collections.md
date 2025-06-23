# Module 9: Collection Classes

## Introduction

The **Collection** in Java is a framework that provides architecture to store and manipulate groups of objects. Java Collections can perform operations such as searching, sorting, insertion, manipulation, and deletion. A Java Collection means a single unit of objects. The Java Collections Framework provides many interfaces and classes:

- **Interfaces**: `Set`, `List`, `Queue`, `Deque`
- **Classes**: `ArrayList`, `Vector`, `LinkedList`, `PriorityQueue`, `HashSet`, `LinkedHashSet`, `TreeSet`

### Learning Outcomes

By the end of this module, you should be able to:

- Explain the concept of the collection framework in Java
- Illustrate the functionality of Java interfaces such as `Set`, `List`, `Queue`, and `Deque`
- Explain the classes such as `ArrayList`, `Vector`, `LinkedList`, `PriorityQueue`, `HashSet`, `LinkedHashSet`, and `TreeSet` provided by the Java Collection Framework

### Key Terms and Concepts

#### Collection Framework

The **Java Collections Framework** is a collection of interfaces and classes that helps in storing and processing data efficiently.

#### Set

A `Set` is a collection that **doesn’t allow duplicates** and **doesn’t allow element access by index**. Instead, it provides methods to check if elements exist.

#### List

A `List` is a collection that **allows duplicates** and **behaves like an array** (indexing elements with integers). The first element has index `0`; the last element has index `length - 1`.

#### Queue

A `Queue` is a collection where elements are **added (pushed)** and **removed (popped)** in the order they were added — this is called **FIFO** (First In, First Out).

#### Deque

A `Deque` allows elements to be **added and removed from both ends**. The term “deque” (pronounced “deck”) is short for **double-ended queue**.

#### Vector

The `Vector` class provides capabilities similar to arrays but can **dynamically resize** itself as elements are added or removed.

#### Stack

A `Stack` is a collection where elements are **added and removed from the top**. This follows the **LIFO** (Last In, First Out) principle.
