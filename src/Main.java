import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the User Input
        System.out.println("Enter a Number : ");
        // Storing User Input
        int intNumber = scanner.nextInt();
        // Displaying the Number
        if((intNumber % 2) == 0) {
            System.out.println("The Number is Even");
        } else {
            System.out.println("The Number is Odd");
        }
    }
}