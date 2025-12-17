import java.util.Scanner;
package jar;
import jar.App;
public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
       
        App app = new App();
        int result = app.add(num1, num2);
        scanner.close();
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }

}
