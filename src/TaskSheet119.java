import java.util.Scanner;
public class TaskSheet119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first number: ");
        double num1 = input.nextDouble();
        System.out.print("Input your second number: ");
        double num2 = input.nextDouble();

        System.out.println(num1 + " + " + num2 + " = " + addition(num1,num2));
        System.out.println(num1 + " - " + num2 + " = " + subtraction(num1,num2));
        System.out.println(num1 + " * " + num2 + " = " + multiplication(num1,num2));
        System.out.println(num1 + " / " + num2 + " = " + division(num1,num2));
    }
    public static double addition(double num1, double num2){
        return num1+num2;
    }
    public static double subtraction(double num1, double num2){
        return num1-num2;
    }
    public static double multiplication(double num1, double num2){
        return num1*num2;
    }
    public static double division(double num1, double num2){
        if(num2 == 0){
            System.out.println("cannot divide by 0");
        }
        return num1/num2;
    }
}
