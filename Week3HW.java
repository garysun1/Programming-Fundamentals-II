import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Objective: Prompt user for two integers and prints9 their sum
 * Algorithm: Uses try-catch statement to obtain appropriate input
 * Input and Output: Inputs two integers and outputs their sum
 * Created by: Gary Sun
 * Date: 6/15
 * Version: 1
*/
public class Week3HW {
    public static void main(String[] args) throws InputMismatchException {
        Scanner inp = new Scanner(System.in);
        int n1, n2;

        while(true) {
            try {
                System.out.print("Enter the first number: ");
                n1 = inp.nextInt();
                break; //obtained integer
            }
            catch(InputMismatchException ex) {
                System.out.println("Not a valid number"); //input not an integer
                System.out.println();

                inp.nextLine(); //advances to new line
            }
        }

        while(true) {
            try {
                System.out.print("Enter the second number: ");
                n2 = inp.nextInt();
                break; //obtained integer
            }
            catch(InputMismatchException ex) {
                System.out.println("Not a valid number"); //input not an integer
                System.out.println();

                inp.nextLine(); //advances to new line
            }
        }

        System.out.println();
        System.out.println("The sum of the two numbers is " + (n1 + n2));
    }
}
