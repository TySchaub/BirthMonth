import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int birthMonth = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your birth month: ");
        if (in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();

            if (birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("Your birth month is " + birthMonth + ".");
            }
            else
            {
                System.out.println("Invalid month number: " + birthMonth);
                System.out.println("Exiting...");
                System.exit(0);
            }
        }
         else //invalid input
        {
            trash = in.nextLine();
            System.out.println("Invalid month: " + trash);
            System.out.println("Exiting...");
            System.exit(0);
        }
    }
}