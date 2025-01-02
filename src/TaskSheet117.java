import java.util.Scanner;
public class TaskSheet117{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = in.nextInt();
        System.out.print("Input the Second number: ");
        int num2 = in.nextInt();
        System.out.print("Input the third number: ");
        int num3 = in.nextInt();

            if(equal(num1, num2, num3)){
            System.out.println("All numbers are equal!");
            }
            else System.out.print("The largest number is " + biggest(num1, num2, num3)+"\n" );
    }
    public static int biggest(int num1, int num2, int num3)
    {
        return Math.max(Math.max(num1, num2), num3);
    }
    public static boolean equal(int num1, int num2, int num3){
        return num1 == num2 && num2 == num3;
        }
    }
