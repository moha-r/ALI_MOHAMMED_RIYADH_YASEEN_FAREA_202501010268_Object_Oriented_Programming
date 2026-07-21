import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("===== ADD TASKS =====");

        // Allow user to enter 3 tasks
        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter Task " + i + ": ");

            String task = input.nextLine();

            tasks.add(task);
        }

        // Display tasks
        System.out.println("\n===== TASK LIST =====");

        for (int i = 0; i < tasks.size(); i++) {

            System.out.println((i + 1) + ". " + tasks.get(i));
        }


        // Saving the task to a text file
        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter("task.txt"))) {

            for (String task : tasks) {

                writer.write(task);
                writer.newLine();
            }

            System.out.println("\nTasks saved successfully.");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }


        // Read from file
        System.out.println("\n===== TASKS LOADED FROM FILE =====");

        try (BufferedReader reader =
                new BufferedReader(new FileReader("task.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}