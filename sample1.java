import java.util.InputMismatchException;
import java.util.Scanner;
    public class sample1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n1, n2;
            boolean validInput = false;
        
            do {
                try {
                System.out.print("First number: ");
                n1 = scanner.nextInt();
                System.out.print("Second number: ");
                n2 = scanner.nextInt();
                int sum = n1 + n2;
                System.out.println("sum " + sum);
                validInput = true;
                } catch (InputMismatchException e) {
                System.out.println("Input number");
                scanner.nextLine();
            }
        } while(!validInput);
        scanner.close();
    }
}