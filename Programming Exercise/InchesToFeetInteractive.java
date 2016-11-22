import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main (String[] args)
    {
        int inches;
        int feet;
        int remainder;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter inches >> ");
        inches = input.nextInt();
        feet = inches / 12;
        remainder = inches % 12;
        System.out.println(inches + " inches is " + feet + " feet and " + remainder + " inches.");
    }
}
