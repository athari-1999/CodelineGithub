import java.util.Scanner;

public class MenuBasedProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

      System.out.println("Welcome to the Menu-Based Program!");
      System.out.println("1- Print Pattern");
       System.out.println("2- Rotate Array");
       System.out.println("3- Help");
       System.out.println("4- Exit");
        while (!exit) {
     
            System.out.println("Please select an option:");
         
            int choice = scanner.nextInt();

            switch (choice) {


                case 1:
                    System.out.print("Enter the number of rows for the pattern: ");
                    int n = scanner.nextInt();
                    printPattern(n);
                    break;

                case 2:
                    System.out.print("Enter the number of elements (n): ");
                    int numElements = scanner.nextInt();
                    System.out.print("Enter the number of steps (k): ");
                    int steps = scanner.nextInt();
                    int[] array = new int[numElements];
                    System.out.print("Enter the array elements separated by spaces: ");
                    for (int i = 0; i < numElements; i++) {
                    array[i] = scanner.nextInt();
                        

                    }

                    rotateArray(array, steps);
                    break;

                case 3:
                    displayHelp();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!!");
                    break;

                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    public static void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rotateArray(int[] array, int steps) {
        int n = array.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newPosition = (i + steps) % n;
            rotatedArray[newPosition] = array[i];
        }

        System.out.print("Rotated Array: ");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayHelp() {
        System.out.println("--- Help ---:");
        System.out.println("Option 1: Print a pattern with 'n' rows of decreasing asterisks.");
        System.out.println("Option 2: Rotate an array of 'n' elements to the right by 'k' steps.");
        System.out.println("Option 3: Display this help message");
        System.out.println("Option 4: Exit the program");
    }
}
