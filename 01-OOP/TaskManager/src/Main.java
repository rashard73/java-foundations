import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> taskList = new ArrayList<>();
        boolean done = false;
        do{
            System.out.println("""
                    \nWelcome to the Task Manager program. Please select form the following options:
                    1 - Add task
                    2 - List tasks
                    3 - Remove task
                    4 - Exit""");
            int userChoice = input.nextInt();
            input.nextLine();

            switch (userChoice) {
                case 1:
                    addTask(input, taskList);
                    break;
                case 2:
                    listTasks(taskList);
                    break;
                case 3:
                    removeTask(input, taskList);
                    break;
                case 4:
                    done = true;
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }
        }while (!done);
    }

    public static void addTask(Scanner input, ArrayList<String> taskList) {
        System.out.println("\nPlease enter the name of the task you would like to add: ");
        String taskName = input.nextLine();
        taskList.add(taskName);
    }
    public static void listTasks(ArrayList<String> taskList) {
        int taskCounter = 1;
        System.out.println("\nList of tasks:");
        for (String taskName : taskList) {
            System.out.println(taskCounter + "." + taskName);
            taskCounter++;
        }
    }
    public static void removeTask(Scanner input, ArrayList<String> taskList) {
        System.out.println("\nPlease enter the name of the task you would like to remove: ");
        String taskName = input.nextLine();
        boolean taskFound = false;

        for (int i = 0; i < taskList.size(); i++) {
            if (taskName.equalsIgnoreCase(taskList.get(i))) {
                taskList.remove(i);
                taskFound = true;
                System.out.println(taskList.size() + "Task removed sucessfully.");
                break;

            }
        }
        if (!taskFound) {
            System.out.println("Task not found");
        }
    }
}
