import java.util.*;

public class TaskSheet116 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your word (Case sensitive): ");
        String word = input.nextLine();
        StringBuilder rev = new StringBuilder(word);
        rev.reverse();
        if (word.equals(rev.toString())) {
            System.out.println("The input string is a palindrome.");
        }   else
            System.out.println("The input string is not a palindrome.");
    }
}
