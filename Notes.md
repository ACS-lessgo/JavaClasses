# Java Programming Notes

## Object-Oriented Programming (OOP) Concepts

Object-Oriented Programming (OOP) is a programming paradigm that organizes code into objects, which are instances of classes. OOP allows you to model real-world entities and their interactions, making the code more organized, modular, and maintainable. Java is a popular programming language that fully supports OOP principles.

### 1. Classes and Objects

A class is a blueprint for creating objects with similar attributes and behaviors. An object is an instance of a class.

```java
// Class definition
class Car {
    // Attributes
    String make;
    String model;
    int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method
    public void start() {
        System.out.println("The car is starting...");
    }
}

// Creating objects of the class
Car car1 = new Car("Toyota", "Camry", 2022);
Car car2 = new Car("Honda", "Civic", 2023);
```
---
### 2. Inheritance

Inheritance allows one class to inherit properties and methods from another class. It promotes code reuse and helps create a hierarchy of classes.

```java

class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
```
---
#### 2.1. Types of Inheritance

##### 1.  Single Inheritance

A class inherits from only one superclass.

```java

class Animal {
    // Animal class implementation
}

class Dog extends Animal {
    // Dog class implementation
}
```
##### 2. Multiple Inheritance (using Interfaces)

A class implements multiple interfaces, allowing it to inherit from multiple sources.

```java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

class FlyingFish implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Flying fish is flying");
    }

    @Override
    public void swim() {
        System.out.println("Flying fish is swimming");
    }
}
```
##### 3. Multilevel Inheritance

A class inherits from a superclass, which in turn inherits from another superclass.

``` javaCopy 
class Animal {
    // Animal class implementation
}

class Mammal extends Animal {
    // Mammal class implementation
}

class Dog extends Mammal {
    // Dog class implementation
}
```
##### 4. Hierarchical Inheritance

Multiple classes inherit from the same superclass.

```java

class Animal {
    // Animal class implementation
}

class Dog extends Animal {
    // Dog class implementation
}

class Cat extends Animal {
    // Cat class implementation
}
```
---
### 3. Encapsulation

Encapsulation is a concept that bundles the data (attributes) and methods (behavior) within a single unit (class). It hides the internal implementation details of an object from the outside world, which is achieved through access modifiers.

```java

class BankAccount {
    private double balance; // Encapsulated attribute

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Encapsulated method to access balance
    public double getBalance() {
        return balance;
    }

    // Encapsulated method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Encapsulated method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
```
---
### 4. Polymorphism

Polymorphism allows objects of different classes to be treated as objects of a common superclass. It enables dynamic method binding.

```java

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
``` 

#### 4.1. Types of Polymorphism

#### 1. Compile-time (Static) Polymorphism

Compile-time polymorphism is achieved through method overloading and operator overloading.

###### Method Overloading

Method overloading allows defining multiple methods with the same name in the same class but with different parameter lists.

```java

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String str1, String str2) {
        return str1 + str2;
    }
}
``` 

####  2.Operator Overloading (using '+' for custom class)

Operator overloading allows defining the behavior of operators for custom classes.

```java

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Operator overloading for '+' operator
    public ComplexNumber add(ComplexNumber other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
``` 

#### 3. Runtime (Dynamic) Polymorphism

Runtime polymorphism is achieved through method overriding.

##### Method Overriding

Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass.

```java

class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
```
---
## Packages

Packages help in organizing classes and prevent naming conflicts.

### 1. Creating Packages

Java packages are used to organize classes into different namespaces to avoid naming conflicts. A package is a directory that contains related classes and interfaces.

```java

// Define a package
package com.example.mypackage;

// Import classes from another package
import java.util.ArrayList;
import java.util.List;

public class MyClass {
    // Class implementation
}
``` 

### 2. Access Modifiers and Packages

Java provides access modifiers to control the accessibility of classes, interfaces, and their members.

#### 2.1. Access Modifiers

1.  `public`: The member can be accessed from any other class.
2.  `protected`: The member can be accessed within the same package and by subclasses (even if they are in different packages).
3.  `default` (no modifier): The member can be accessed only within the same package.
4.  `private`: The member can be accessed only within the same class.

### 3. Package Access and Importing

In Java, classes from the same package are accessible without importing, but classes from other packages need to be imported.

```java

package com.example.myapp;

import com.example.util.MyUtilityClass;

public class MyClass {
    public static void main(String[] args) {
        MyUtilityClass.doSomething(); // Accessing a class from another package
    }
}
``` 
---
## Exception Handling

Exception handling deals with errors that occur during program execution. It allows graceful handling of errors and provides a way to recover from them.

### 1. Types of Exceptions

There are two types of exceptions in Java: checked exceptions and unchecked exceptions.

#### 1.1. Checked Exceptions

Checked exceptions are checked by the compiler during compilation, and the programmer must handle them using try-catch blocks or declare them using the `throws` keyword.

```java

import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            // Other code to read from the file
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
``` 

#### 1.2. Unchecked Exceptions

Unchecked exceptions (also known as runtime exceptions) are not checked by the compiler, and the programmer is not required to handle them explicitly.

```java

public class DivisionExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int result = num1 / num2; // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
``` 

### 2. Exception Hierarchy

All exceptions in Java are subclasses of the `java.lang.Exception` class.

### 3. try-catch-finally Block

The try-catch-finally block is used for exception handling. The code that might throw an exception is placed inside the try block, and the code to handle the exception is placed inside the catch block.

```java

try {
    // Code that might cause an exception
} catch (ExceptionType e) {
    // Handle the exception
} finally {
    // Code that will always be executed, regardless of whether an exception occurred or not
}
``` 

### 4. throws Keyword

The `throws` keyword is used in method signatures to declare that a method may throw a checked exception. It is used to propagate the exception to the calling method, which should handle the exception.

```java

`void someMethod() throws SomeCheckedException {
    // Method implementation that may throw SomeCheckedException
}
``` 

### 5. Custom Exceptions

Java allows you to create your own custom exceptions by extending the `Exception` class or one of its subclasses.

```java

`class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void someMethod() throws MyCustomException {
        throw new MyCustomException("This is a custom exception.");
    }
}
``` 

## Multithreading

Multithreading allows running multiple threads simultaneously for concurrent execution. Threads are lightweight processes within a process.

### 1. Thread Creation

There are two ways to create threads in Java: by extending the `Thread` class or by implementing the `Runnable` interface.

#### 1.1. Extending the Thread Class

``` java

class MyThread extends Thread {
    public void run() {
        // Code to be executed by the thread
    }
}

// Creating and starting the thread
MyThread thread = new MyThread();
thread.start();` 
```
#### 1.2. Implementing the Runnable Interface

```java

`class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed by the thread
    }
}

// Creating a thread using the runnable object
MyRunnable runnable = new MyRunnable();
Thread thread = new Thread(runnable);
thread.start();
```
### 2. Thread States

Threads can be in various states during their lifecycle. The main thread is created automatically when the program starts, and you can create additional threads as needed.

1.  New: The thread is in the process of being created but has not yet started.
2.  Runnable: The thread is executing its run() method.
3.  Blocked: The thread is blocked and waiting for a monitor lock to be released.
4.  Waiting: The thread is waiting indefinitely for another thread to perform a particular action.
5.  Timed Waiting: The thread is waiting for another thread to perform a particular action, but with a timeout.
6.  Terminated: The thread has finished its execution.

### 3. Thread Methods

Threads have various methods to control their execution and behavior.

-   `start()`: Starts the execution of the thread by invoking the run() method.
-   `run()`: Contains the code that will be executed by the thread.
-   `sleep()`: Causes the currently executing thread to sleep for a specified amount of time.
-   `join()`: Waits for the thread to die.
-   `interrupt()`: Interrupts the thread, causing it to stop if it's not handling the interrupt.
-   `yield()`: Makes the currently executing thread yield to other threads of the same priority.

### 4. Thread Synchronization

Thread synchronization is used to prevent multiple threads from accessing shared resources simultaneously. It is achieved using the `synchronized` keyword or using locks from the `java.util.concurrent` package.

```java

class Counter {
    private int count;

    // Synchronized method
    public synchronized void increment() {
        count++;
    }
}
```

### 5. Thread Intercommunication

Threads can communicate with each other using methods such as `wait()`, `notify()`, and `notifyAll()`.

```java

class MyThread extends Thread {
    private Object lock;

    public MyThread(Object lock) {
        this.lock = lock;`
```
---
