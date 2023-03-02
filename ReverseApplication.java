import java.util.Scanner;

public class ReverseApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int reversed = ReverseDigits.reverse(number);
        System.out.println("The reversed number is: " + reversed);
    }
}