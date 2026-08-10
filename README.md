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

This course introduces the fundamental concepts of object-oriented programming using Java. The tutorials cover Java syntax, classes and objects, encapsulation, inheritance, polymorphism, abstraction, collections, file handling, and graphical user interface development. This repository contains the practical work completed throughout Tutorials 1–10.

## Repository Structure

```text
.
├── .gitignore
├── LICENSE
├── README.md
├── myreport.pdf
├── tutorial_1/
│   ├── HelloWorld.java
│   └── StudentGrade.java
├── tutorial_2/
│   ├── Main.java
│   └── Student.java
├── tutorial_3-4/
│   ├── Lecturer.java
│   ├── Main.java
│   ├── Person.java
│   └── Student.java
├── tutorial_5/
│   ├── Main.java
│   ├── Student.java
│   └── documentation.txt
├── tutorial_6/
│   ├── Employee.java
│   ├── Lecturer.java
│   └── Main.java
├── tutorial_7/
│   ├── Appliance.java
│   ├── Main.java
│   ├── Refrigerator.java
│   └── WashingMachine.java
├── tutorial_8-9/
│   ├── Main.java
│   └── task.txt
└── tutorial_10/
    ├── Questions.java
    └── QuizBattleGUI.java
```

## Tutorial Summary (Week 1–10)

| Tutorial | Topic | Summary |
|---|---|---|
| [Tutorial 1](tutorial_1/) | Java Basics | Created basic Java programs to display output and determine a student's grade using variables and conditional statements. |
| [Tutorial 2](tutorial_2/) | Classes and Objects | Created a `Student` class with attributes, a constructor, and methods to display information, study, and take an exam. |
| [Tutorials 3–4](tutorial_3-4/) | Inheritance and Polymorphism | Used `Person` as a parent class and overrode the `introduce()` method in the `Student` and `Lecturer` subclasses. |
| [Tutorial 5](tutorial_5/) | Encapsulation | Protected student information with private attributes and provided controlled access through getters and setters. |
| [Tutorial 6](tutorial_6/) | Inheritance | Extended the `Employee` class with a `Lecturer` class containing subject and department information. |
| [Tutorial 7](tutorial_7/) | Abstraction | Created an abstract `Appliance` class and implemented different appliance operations using `WashingMachine` and `Refrigerator`. |
| [Tutorials 8–9](tutorial_8-9/) | ArrayList and File Handling | Built a to-do list using `ArrayList`, accepted user input, saved tasks to a text file, and loaded them again. |
| [Tutorial 10](tutorial_10/) | Java Swing GUI | Developed a programming quiz interface using Swing components and event handling. |

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

### 2. Open a Tutorial Folder

For example:

```bash
cd tutorial_5
```

### 3. Compile the Java Files

```bash
javac *.java
```

### 4. Run the Project

Most tutorial folders use the `Main` class:

```bash
java Main
```

Tutorial 1 contains two independent programs:

```bash
java HelloWorld
java StudentGrade
```

Tutorial 10 starts the Swing graphical interface with:

```bash
java QuizBattleGUI
```

## Reflection Summary

Through these tutorials, I improved my understanding of Java and object-oriented programming. I learned how to create classes and objects, protect data using encapsulation, reuse code through inheritance, override methods to support polymorphism, and hide implementation details through abstraction. I also gained practical experience with collections, file handling, Swing interfaces, Git, and GitHub. Completing the exercises helped me become more confident in organizing Java projects, identifying errors, and writing clear and reusable code.

## Self-Reflective Report

The completed self-reflective report is available as a PDF: [View `myreport.pdf`](myreport.pdf).
