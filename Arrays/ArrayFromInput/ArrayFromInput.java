package Projects;
import java.util.Scanner;

public class ArrayFromInput {
    private final String[] names;
    private final int[] age;
    private final String[] job;

    public ArrayFromInput() {
        names = new String[3];
        age = new int[3];
        job = new String[3];
    }

    public void populateArrays() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println("Enter age:");
        for (int i = 0; i < age.length; i++) {
            age[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Enter job:");
        for (int i = 0; i < job.length; i++) {
            job[i] = scanner.nextLine();
        }

        scanner.close();
    }

    public void printArrays() {
        System.out.println("Name\tAge\tCity");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "\t" + age[i] + "\t" + job[i]);
        }
    }
        public static class ArrayDemo {
            public static void main(String[] args) {
                ArrayFromInput arr = new ArrayFromInput();
                arr.populateArrays();
                arr.printArrays();
            }
        }
    }


