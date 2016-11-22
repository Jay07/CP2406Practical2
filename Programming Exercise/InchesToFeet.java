public class InchesToFeet {
    public static void main (String[] args)
    {
        int inches = 86;
        int feet;
        int remainder;
        feet = inches / 12;
        remainder = inches % 12;
        System.out.println(inches + " inches is " + feet + " feet and " + remainder + " inches.");
    }
}