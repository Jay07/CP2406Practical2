import java.util.Scanner;
public class Eggs
{
    public static void main(String[] args)
    {
        int eggs;
        int dozens;
        int remainder;
        double total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter eggs needed >> ");
        eggs = input.nextInt();
        dozens = eggs / 12;
        remainder = eggs % 12;
        total = dozens*3.25 + remainder*0.45;
        System.out.println(" You ordered " + eggs + " eggs. That's " + dozens + " dozen at $3.25 per dozen and " + remainder + " loose eggs at 45 cents each for a total of " + total + ".");
    }
}