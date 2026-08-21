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
