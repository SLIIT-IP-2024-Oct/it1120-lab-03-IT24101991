import java.util.Scanner;

public class IT24101991Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        
        // Convert the number to a string
        String numStr = Integer.toString(number);
        
        // Check if the number is five digits long
        if (numStr.length() == 5) {
            // Print each digit separated by a space
            for (int i = 0; i < numStr.length(); i++) {
                System.out.print(numStr.charAt(i) + " ");
            }
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }

        scanner.close(); // Close the scanner
    }
}
