import java.util.HashMap;
import java.util.Scanner;

public class Complex_Numbers {

    private HashMap<String, Integer> values;
    private Scanner reader;

    public Complex_Numbers() {
        reader = new Scanner(System.in);
        values = new HashMap<>();
        values.put("a", null);
        values.put("bi", null);
        values.put("c", null);
        values.put("di", null);
    }

    private void getValues() {

        System.out.println("\nEnter value:");
        for(String i : values.keySet()) {
            System.out.print(i +": ");
            values.put(i, reader.nextInt());
            reader.nextLine();
        }

    }

    public void addition() {
        getValues();
        int a = values.get("a");
        int bi = values.get("bi");
        int c = values.get("c");
        int di = values.get("di");
        int real = a + c;
        int imaginary = bi + di;
        System.out.println("\n( "+real+" + "+imaginary+"i )\n");
    }

    public void subtraction() {
        getValues();
        int a = values.get("a");
        int bi = values.get("bi");
        int c = values.get("c");
        int di = values.get("di");
        int real = a - c;
        int imaginary = bi - di;
        System.out.println("\n( "+real+" + "+imaginary+"i )\n");
    }

    public void multiplication() {
        getValues();
        int a = values.get("a");
        int bi = values.get("bi");
        int c = values.get("c");
        int di = values.get("di");
        int real = (a * c) - (bi * di);
        int imaginary = (a * di) + (bi * c);
        System.out.println("\n( "+real+" + "+imaginary+"i )\n");
    }

    public void division() {
        getValues();
        int a = values.get("a");
        int bi = values.get("bi");
        int c = values.get("c");
        int di = values.get("di");
        int real = ((a * c) + (bi * di));
        int divisor = ((c * c) + (di * di));
        int imaginary = ((bi * c) - (a * di));
        System.out.println("\n( "+real+"/"+divisor+" + "+imaginary+"/"+divisor+"i )\n");
    }

}
