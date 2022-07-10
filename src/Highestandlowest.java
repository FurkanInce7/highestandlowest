import java.util.Scanner;
import static java.lang.System.out;
public class Highestandlowest {
    public static void main(String[] args) {
        int firstNumber, secondNumber, highest1 = 0, lowest1 = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("How much numbers you will put?");
        firstNumber = input.nextInt();

        for (int i = 0; i <= firstNumber; i++) {
            System.out.println("Enter a number: ");
            secondNumber = input.nextInt();
            if (secondNumber > highest1) {
                highest1 = secondNumber;
            } else if (secondNumber < lowest1) {
                lowest1 = secondNumber;
            }
        }
        System.out.println("Highest number is " + highest1);
        System.out.println("Lowest number is " + lowest1);


    }}