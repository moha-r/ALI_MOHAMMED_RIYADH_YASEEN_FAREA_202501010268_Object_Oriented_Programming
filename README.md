# Assignment 1: Object-Oriented Programming Fundamentals in Java

## Student Information

- **Student Name:** Ali Mohammed Riyadh Yaseen Farea
- **Student ID:** 202501010286

## Course Information

- **Course Code:** BIT1123
- **Course Name:** Object Oriented Programming
- **Programming Language:** Java
- **Assignment:** Assignment 1 – Individual

## Brief Course Description

This course introduces the fundamental concepts of object-oriented programming using Java. The weekly practical work covers Java syntax, classes and objects, encapsulation, inheritance, polymorphism, abstraction, collections, file handling, and graphical user interface development. This repository contains the practical work completed from Week 1 to Week 10.

## Repository Structure

```text
.
├── .gitignore
├── LICENSE
├── README.md
├── myreport.pdf
├── week1/
│   ├── HelloWorld.java
│   └── StudentGrade.java
├── week2/
│   ├── Main.java
│   └── Student.java
├── week3-4/
│   ├── Lecturer.java
│   ├── Main.java
│   ├── Person.java
│   └── Student.java
├── week5/
│   ├── Main.java
│   ├── Student.java
│   └── documentation.txt
├── week6/
│   ├── Employee.java
│   ├── Lecturer.java
│   └── Main.java
├── week7/
│   ├── Appliance.java
│   ├── Main.java
│   ├── Refrigerator.java
│   └── WashingMachine.java
├── week8-9/
│   ├── Main.java
│   └── task.txt
└── week10/
    ├── Questions.java
    └── QuizBattleGUI.java
```

## Weekly Work Summary (Week 1–10)

| Week | Topic | Summary |
|---|---|---|
| [Week 1](week1/) | Java Basics | Created basic Java programs to display output and determine a student's grade using variables and conditional statements. |
| [Week 2](week2/) | Classes and Objects | Created a `Student` class with attributes, a constructor, and methods to display information, study, and take an exam. |
| [Weeks 3–4](week3-4/) | Inheritance and Polymorphism | Used `Person` as a parent class and overrode the `introduce()` method in the `Student` and `Lecturer` subclasses. |
| [Week 5](week5/) | Encapsulation | Protected student information with private attributes and provided controlled access through getters and setters. |
| [Week 6](week6/) | Inheritance | Extended the `Employee` class with a `Lecturer` class containing subject and department information. |
| [Week 7](week7/) | Abstraction | Created an abstract `Appliance` class and implemented different appliance operations using `WashingMachine` and `Refrigerator`. |
| [Weeks 8–9](week8-9/) | ArrayList and File Handling | Built a to-do list using `ArrayList`, accepted user input, saved tasks to a text file, and loaded them again. |
| [Week 10](week10/) | Java Swing GUI | Developed a programming quiz interface using Swing components and event handling. |

## Technologies Used

- Java
- Java Development Kit (JDK)
- Java Swing
- Java Collections Framework (`ArrayList`)
- Java File I/O
- Git
- GitHub
- GitHub Codespaces

## How to Run the Projects

### 1. Clone the Repository

```bash
git clone https://github.com/moha-r/ALI_MOHAMMED_RIYADH_YASEEN_FAREA_202501010268_Object_Oriented_Programming.git
cd ALI_MOHAMMED_RIYADH_YASEEN_FAREA_202501010268_Object_Oriented_Programming
```

### 2. Open a Week Folder

For example:

```bash
cd week5
```

### 3. Compile the Java Files

```bash
javac *.java
```

### 4. Run the Project

Most week folders use the `Main` class:

```bash
java Main
```

Week 1 contains two independent programs:

```bash
java HelloWorld
java StudentGrade
```

Week 10 starts the Swing graphical interface with:

```bash
java QuizBattleGUI
```

## Reflection Summary

Across these ten weeks, I improved my understanding of Java and object-oriented programming. I learned how to create classes and objects, protect data using encapsulation, reuse code through inheritance, override methods to support polymorphism, and hide implementation details through abstraction. I also gained practical experience with collections, file handling, Swing interfaces, Git, and GitHub. Completing the weekly exercises helped me become more confident in organizing Java projects, identifying errors, and writing clear and reusable code.

## Self-Reflective Report

The completed self-reflective report is available as a PDF: [View `myreport.pdf`](myreport.pdf).
