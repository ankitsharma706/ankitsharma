
import java.util.Scanner;

public class input_statement_sc {

    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        //float a = sc.nextFloat();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        //float b = sc.nextFloat();

        int sum = a + b;
        //float sum = a +b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        String str = sc.next();
        //String str = sc.nextLine();
        System.out.println(str);
        sc.close();
        }


}
/*

import java.util.Scanner;


public class input_statement_sc {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);

        // Input for number 1
        System.out.println("Enter number 1 (integer):");
        int a = sc.nextInt();

        // Input for number 2
        System.out.println("Enter number 2 (float):");
        float b = sc.nextFloat();

        // Sum of the numbers
        float sum = a + b;
        System.out.println("The sum of these numbers is: " + sum);

        // Consuming the newline character left after reading the float
        sc.nextLine();

        // Input for a string
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("You entered: " + str);

        // Close the scanner to free resources
        sc.close();
    }
}
*/
