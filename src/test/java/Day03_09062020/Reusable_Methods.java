package Day03_09062020;

public class Reusable_Methods
{
    public static void add(int a, int b)
    {
        System.out.println("My result of (a + b) is: " + (a+b));
    }

    public static void subtraction(int a, int b)
    {
        System.out.println("My result of (a - b) is: " + (a-b));
    }

    public static void multiplication(int a, int b)
    {
        System.out.println("My result of (a * b) is: " + (a*b));
    }

    public static void division(int a, int b)
    {
        System.out.println("My result of (a / b) is: " + (a/b));
    }


    public static int returnAdd(int a, int b)
    {
        int result = a+b;
        System.out.println("My result of a+b is: " + result);
        return result;
    }
}






