import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = "";
        Complex_Numbers complexNumbers = new Complex_Numbers();

        while(!input.equals("5")) {

            System.out.print("Complex Number Operations\n\n" +
                    "   1.  Addition\n" +
                    "   2.  Subtraction\n" +
                    "   3.  Multiplication\n" +
                    "   4.  Division\n" +
                    "   5.  Exit\n\n" +
                    "Command: ");
            input = reader.nextLine();

            switch (input) {
                case "1":
                    complexNumbers.addition();
                    break;
                case "2":
                    complexNumbers.subtraction();
                    break;
                case "3":
                    complexNumbers.multiplication();
                    break;
                case "4":
                    complexNumbers.division();
                    break;
            }
        }
    }


}