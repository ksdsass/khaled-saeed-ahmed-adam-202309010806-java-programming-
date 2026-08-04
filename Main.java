import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("===== ADD TASKS =====");

        // Allow user to enter 3 tasks
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Task " + (i + 1) + ": ");
            String task = scanner.nextLine();
            tasks.add(task);
        }

        // Display tasks
        System.out.println("\n===== TASK LIST =====");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        // Save tasks into task.txt
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("task.txt")
            );

            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }

            writer.close();

            System.out.println("\nTasks saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }

        // Read tasks from task.txt
        System.out.println("\n===== TASKS LOADED FROM FILE =====");

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("task.txt")
            );

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading tasks: " + e.getMessage());
        }

        scanner.close();
    }
}