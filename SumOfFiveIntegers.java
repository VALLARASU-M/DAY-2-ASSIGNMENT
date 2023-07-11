import java.util.Scanner;

public class SumOfFiveIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] integers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            integers[i] = scanner.nextInt();
        }
        for (int integer : integers) {
            sum += integer;
        }
        System.out.println("The sum of the five integers is " + sum);
    }
}