# Complete OOP Tutorials 1–10 Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Complete, standardize, and verify every Java tutorial required for BIT1123 Assignment 1 without losing existing work or diverging from the instructor's templates.

**Architecture:** Each tutorial remains a self-contained folder with plain Java source files and no external dependencies. A repository-level shell verification script compiles each folder into a temporary directory, executes console tutorials, checks expected output, exercises Week 8–9 file I/O in a temporary copy, and tests the Week 10 question model without launching Swing.

**Tech Stack:** Java/JDK, Swing, Bash, Git, GitHub.

---

### Task 1: Create the automated verification harness

**Files:**
- Create: `tests/verify_tutorials.sh`
- Create: `tests/QuestionsTest.java`

- [ ] **Step 1: Add a Week 10 model test**

```java
public class QuestionsTest {
    public static void main(String[] args) {
        Questions question = new Questions();

        if (!"Which keyword creates an object?".equals(question.getQuestion())) {
            throw new AssertionError("Unexpected quiz question");
        }
        if (!question.isCorrect("new")) {
            throw new AssertionError("The correct answer must be accepted");
        }
        if (question.isCorrect("class")) {
            throw new AssertionError("The wrong answer must be rejected");
        }

        System.out.println("Questions test passed");
    }
}
```

- [ ] **Step 2: Add a repository verification script**

The script must create a temporary build directory, compile each tutorial separately, run the console programs, compare key output lines, test file persistence outside the repository, and run `QuestionsTest`.

```bash
#!/usr/bin/env bash
set -euo pipefail

repo_root="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
verify_root="$(mktemp -d)"
trap 'rm -rf "$verify_root"' EXIT

compile_tutorial() {
    local tutorial="$1"
    local output="$verify_root/${tutorial//\//_}"
    mkdir -p "$output"
    javac -d "$output" "$repo_root/$tutorial"/*.java
}

compile_tutorial tutorial_1
compile_tutorial tutorial_2
compile_tutorial tutorial_3-4
compile_tutorial tutorial_5
compile_tutorial tutorial_6
compile_tutorial tutorial_7
compile_tutorial tutorial_8-9
compile_tutorial tutorial_10

java -cp "$verify_root/tutorial_1" HelloWorld | grep -F "Hello, World!"
java -cp "$verify_root/tutorial_1" StudentGrade | grep -F "Grade: A"
java -cp "$verify_root/tutorial_2" Main | grep -F "MOHAMMED is taking an exam."
java -cp "$verify_root/tutorial_3-4" tutorial_3_4.Main | grep -F "I am a lecturer."
java -cp "$verify_root/tutorial_5" Main | grep -F "Programme : BIT"
java -cp "$verify_root/tutorial_6" Main | grep -F "Department  : Faculty of Information Technology"
java -cp "$verify_root/tutorial_7" Main | grep -F "Store food & beverages..."

cp "$repo_root/tutorial_8-9/Main.java" "$verify_root/Main.java"
(cd "$verify_root" && javac Main.java && printf 'drink water\ncompleting AI course\ndrink water again\n' | java Main) \
    | grep -F "Tasks saved successfully."
grep -F "drink water" "$verify_root/task.txt"

javac -cp "$verify_root/tutorial_10" -d "$verify_root/tutorial_10" "$repo_root/tests/QuestionsTest.java"
java -cp "$verify_root/tutorial_10" QuestionsTest

if find "$repo_root" -name '*.class' -print -quit | grep -q .; then
    echo "Generated .class file found in repository" >&2
    exit 1
fi

echo "All tutorials verified successfully."
```

- [ ] **Step 3: Run the harness and verify RED**

Run: `bash tests/verify_tutorials.sh`

Expected: FAIL because `tutorial_1` and other standardized tutorial paths do not exist yet.

- [ ] **Step 4: Commit the failing verification harness**

```bash
git add tests/verify_tutorials.sh tests/QuestionsTest.java
git commit -m "test: add tutorial verification harness"
```

### Task 2: Normalize existing tutorial folders

**Files:**
- Rename: `Tutorial_2/` to `tutorial_2/`
- Rename: `Tutorial_2/main.java` to `tutorial_2/Main.java`
- Modify: `tutorial_2/Main.java`
- Rename: `tutorial_3/` to `tutorial_3-4/`
- Modify: `tutorial_3-4/*.java`
- Rename: `week_7/` to `tutorial_7/`
- Rename: `week_8-9/` to `tutorial_8-9/`

- [ ] **Step 1: Rename folders with Git-aware moves**

```bash
git mv Tutorial_2 tutorial_2_tmp
git mv tutorial_2_tmp tutorial_2
git mv tutorial_2/main.java tutorial_2/Main.java
git mv tutorial_3 tutorial_3-4
git mv week_7 tutorial_7
git mv week_8-9 tutorial_8-9
```

- [ ] **Step 2: Correct the Week 2 public class name**

```java
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("MOHAMMED", 20, 3.8);

        s1.displayInfo();
        s1.study();
        s1.takeExam();
    }
}
```

- [ ] **Step 3: Rename the Tutorials 3–4 package consistently**

Change the first line in all four files from `package tutorial_3;` to:

```java
package tutorial_3_4;
```

- [ ] **Step 4: Run the harness and confirm it advances to the first genuinely missing tutorial**

Run: `bash tests/verify_tutorials.sh`

Expected: FAIL at `tutorial_1/*.java`, proving existing renames are recognized.

- [ ] **Step 5: Commit normalized existing work**

```bash
git add tutorial_2 tutorial_3-4 tutorial_7 tutorial_8-9
git commit -m "refactor: standardize tutorial folder names"
```

### Task 3: Implement Tutorial 1

**Files:**
- Create: `tutorial_1/HelloWorld.java`
- Create: `tutorial_1/StudentGrade.java`

- [ ] **Step 1: Confirm the harness currently fails because Tutorial 1 is missing**

Run: `bash tests/verify_tutorials.sh`

Expected: FAIL with `tutorial_1/*.java` not found.

- [ ] **Step 2: Add the introductory Hello World module**

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- [ ] **Step 3: Add the introductory student grade module**

```java
public class StudentGrade {
    public static void main(String[] args) {
        String studentName = "Ali";
        int mark = 85;
        char grade;

        if (mark >= 80) {
            grade = 'A';
        } else if (mark >= 70) {
            grade = 'B';
        } else if (mark >= 60) {
            grade = 'C';
        } else if (mark >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Student: " + studentName);
        System.out.println("Mark: " + mark);
        System.out.println("Grade: " + grade);
    }
}
```

- [ ] **Step 4: Run the harness**

Run: `bash tests/verify_tutorials.sh`

Expected: Tutorial 1 checks pass; the harness then fails at the next missing tutorial.

- [ ] **Step 5: Commit Tutorial 1**

```bash
git add tutorial_1
git commit -m "feat: complete tutorial 1 basics"
```

### Task 4: Implement Tutorial 5 encapsulation

**Files:**
- Create: `tutorial_5/Student.java`
- Create: `tutorial_5/Main.java`
- Create: `tutorial_5/documentation.txt`

- [ ] **Step 1: Confirm the harness fails because Tutorial 5 is missing**

Run: `bash tests/verify_tutorials.sh`

Expected: FAIL with `tutorial_5/*.java` not found.

- [ ] **Step 2: Add the encapsulated Student class**

```java
public class Student {
    private String studentID;
    private String name;
    private double cgpa;
    private String programme;

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    public String getProgramme() {
        return programme;
    }
}
```

- [ ] **Step 3: Add the expected-output main program**

```java
public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setStudentID("CU12345");
        student.setName("Ali");
        student.setCGPA(3.75);
        student.setProgramme("BIT");

        System.out.println("Student ID : " + student.getStudentID());
        System.out.println("Name       : " + student.getName());
        System.out.println("CGPA       : " + student.getCGPA());
        System.out.println("Programme : " + student.getProgramme());
    }
}
```

- [ ] **Step 4: Answer the required documentation questions**

```text
1. Why are the variables declared as private?
The variables are private to protect the student's data from direct access and modification outside the Student class. This applies encapsulation.

2. What happens if the variables are declared public?
Other classes could read or change the values directly without using controlled methods, which makes the data less secure and harder to validate.

3. Why do we use getters and setters?
Getters provide controlled read access, while setters provide controlled write access. They also allow validation to be added later without changing the code that uses the class.
```

- [ ] **Step 5: Run the harness**

Run: `bash tests/verify_tutorials.sh`

Expected: Tutorial 5 output check passes; the harness fails next at Tutorial 6.

- [ ] **Step 6: Commit Tutorial 5**

```bash
git add tutorial_5
git commit -m "feat: complete tutorial 5 encapsulation"
```

### Task 5: Implement Tutorial 6 inheritance

**Files:**
- Create: `tutorial_6/Employee.java`
- Create: `tutorial_6/Lecturer.java`
- Create: `tutorial_6/Main.java`

- [ ] **Step 1: Confirm the harness fails because Tutorial 6 is missing**

Run: `bash tests/verify_tutorials.sh`

Expected: FAIL with `tutorial_6/*.java` not found.

- [ ] **Step 2: Add the Employee base class**

```java
public class Employee {
    protected String id;
    protected String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
    }
}
```

- [ ] **Step 3: Add the Lecturer subclass with the required department**

```java
public class Lecturer extends Employee {
    private String subject;
    private String department;

    public Lecturer(String id, String name, String subject, String department) {
        super(id, name);
        this.subject = subject;
        this.department = department;
    }

    public void displaySubject() {
        System.out.println("Subject     : " + subject);
        System.out.println("Department  : " + department);
    }
}
```

- [ ] **Step 4: Add the expected-output main program**

```java
public class Main {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer(
                "L100",
                "Dr Ahmad",
                "Java Programming",
                "Faculty of Information Technology"
        );

        lecturer.displayInfo();
        lecturer.displaySubject();
    }
}
```

- [ ] **Step 5: Run the harness**

Run: `bash tests/verify_tutorials.sh`

Expected: Tutorial 6 output passes; the harness fails only because Tutorial 10 is not on this branch yet.

- [ ] **Step 6: Commit Tutorial 6**

```bash
git add tutorial_6
git commit -m "feat: complete tutorial 6 inheritance"
```

### Task 6: Integrate Tutorial 10

**Files:**
- Create from `origin/codex/week10`: `tutorial_10/Questions.java`
- Create from `origin/codex/week10`: `tutorial_10/QuizBattleGUI.java`

- [ ] **Step 1: Confirm the harness fails because Tutorial 10 is absent**

Run: `bash tests/verify_tutorials.sh`

Expected: FAIL with `tutorial_10/*.java` not found.

- [ ] **Step 2: Restore the already completed Week 10 files into the standardized path**

```bash
git show origin/codex/week10:week_10/Questions.java > tutorial_10/Questions.java
git show origin/codex/week10:week_10/QuizBattleGUI.java > tutorial_10/QuizBattleGUI.java
```

When executing, create the target files through the approved patch mechanism rather than shell redirection.

- [ ] **Step 3: Run the full harness**

Run: `bash tests/verify_tutorials.sh`

Expected: `All tutorials verified successfully.` with exit code 0.

- [ ] **Step 4: Commit Tutorial 10**

```bash
git add tutorial_10
git commit -m "feat: integrate tutorial 10 quiz battle"
```

### Task 7: Final repository and Git verification

**Files:**
- Review: all tutorial folders
- Remove before final assignment merge: `docs/superpowers/`

- [ ] **Step 1: Run the verification suite from a clean status**

Run: `bash tests/verify_tutorials.sh`

Expected: all tutorials compile and all checks pass.

- [ ] **Step 2: Check the final assignment tree**

Run: `find tutorial_* -maxdepth 2 -type f | sort`

Expected: all eight required tutorial groups exist with their source/supporting files.

- [ ] **Step 3: Check for generated or accidental files**

Run: `find . -name '*.class' -o -name '.DS_Store'`

Expected: no output outside `.git` internals.

- [ ] **Step 4: Remove internal planning documents from the assignment tree**

Use an approved patch deletion for `docs/superpowers/specs/2026-08-11-complete-oop-tutorials-design.md` and `docs/superpowers/plans/2026-08-11-complete-oop-tutorials.md`, then commit:

```bash
git add -A docs/superpowers
git commit -m "chore: remove internal planning documents"
```

- [ ] **Step 5: Review the final diff against main**

Run: `git diff --check origin/main...HEAD` and `git diff --stat origin/main...HEAD`

Expected: no whitespace errors; only intended tutorial normalization, tutorial additions, and verification files.

- [ ] **Step 6: Push the feature branch, merge safely, and verify remote main**

```bash
git push -u origin codex/complete-tutorials
git switch main
git pull --ff-only origin main
git merge --no-ff codex/complete-tutorials -m "Complete and organize OOP tutorials 1-10"
git push origin main
git fetch origin
git rev-parse main
git rev-parse origin/main
```

Expected: the local and remote `main` commit IDs match. Do not force-push.
