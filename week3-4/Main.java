public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ahmed", "1000");
        Person p2 = new Student("Ali", "2000");
        Person p3 = new Lecturer("Dr Khalid", "3000");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
