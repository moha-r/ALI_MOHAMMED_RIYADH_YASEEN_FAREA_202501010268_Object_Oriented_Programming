# OOP Tutorials 1–10 Completion Design

## Objective

Complete and professionally organize all Java tutorial work required for BIT1123 Assignment 1 while preserving the instructor's beginner-friendly coding style and the repository's existing history.

## Source of truth

- Tutorial screenshots supplied for Weeks 1, 2, 3–4, 5, 6, 7, 8–9, and 10.
- The assignment brief requiring one repository, consistent folder naming, complete tutorial source files, and supporting files.
- Existing repository code is preserved where it already compiles and matches the expected output.

## Repository structure

Use one consistent tutorial-based convention:

```text
tutorial_1/
tutorial_2/
tutorial_3-4/
tutorial_5/
tutorial_6/
tutorial_7/
tutorial_8-9/
tutorial_10/
```

Renames retain Git history. Java class and file names follow standard matching capitalization where required by the compiler.

## Tutorial work

### Tutorial 1

Add `HelloWorld.java` and `StudentGrade.java`. Keep the code introductory: basic output, variables, conditional grading, and a clear `main` entry point.

### Tutorial 2

Preserve the existing `Student` example and its constructor, information display, `study`, and `takeExam` methods. Normalize only folder and main-class naming where needed.

### Tutorials 3–4

Preserve the existing inheritance and overriding example using `Person`, `Student`, and `Lecturer`, because it compiles and matches the instructor's expected three-line output.

### Tutorial 5

Implement the supplied encapsulation template with private student ID, name, CGPA, and programme fields; public getters and setters; a main program matching the expected output; and `documentation.txt` answering all three required questions.

### Tutorial 6

Implement `Employee`, `Lecturer`, and `Main` using inheritance. Include the required department variable and match the expected employee, lecturer subject, and department output.

### Tutorial 7

Preserve the current abstraction example with the abstract `Appliance` class and the two required concrete appliances, `WashingMachine` and `Refrigerator`.

### Tutorials 8–9

Preserve the working ArrayList and file I/O exercise. Verify task entry, list display, save, and reload behavior without allowing verification runs to overwrite committed sample data.

### Tutorial 10

Bring the existing completed Swing quiz from `codex/week10` into the completion branch. Preserve its instructor-template structure and verify compilation. GUI behavior will be checked through focused model tests and a safe launch smoke test where the environment permits.

## Verification

- Compile every tutorial independently with `javac` into temporary output directories.
- Execute every console tutorial and compare key output with the supplied expected output.
- Test Week 8–9 in a temporary working directory so `task.txt` in the repository is unchanged.
- Test `Questions.isCorrect` independently for Week 10 and compile the Swing GUI.
- Confirm the final tree contains all tutorials and no generated `.class` files.
- Review the final diff before any merge or push to `main`.

## Git safety

- Work only on `codex/complete-tutorials` until verification succeeds.
- Do not force-push, rewrite history, or remove unrelated user content.
- Merge into `main` only after all tutorial verification passes.
- Internal planning documents will not be included in the final assignment tree.

## Out of scope for this phase

- Writing the self-reflective PDF report.
- Adding personal identity numbers to the public repository.
- Unrelated refactoring or advanced Java patterns not shown in the tutorial material.
