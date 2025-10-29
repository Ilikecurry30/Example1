
//Jayanth Johnson
//Oct-29-25
import java.util.Scanner;

public class Hailstone {
    public static void main(String[] args) {
        int num = 0;
        int iterations = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a guess from 0-200: ");
        num = scan.nextInt();
        System.out.println(num);
        while (num != 1) {
            System.out.println(num);
            if (num % 2 == 0) {
                num = num / 2;
                iterations++;
            } else {
                num = (num * 3) + 1;
                iterations++;
            }
        }
        System.out.println("There was this many iterations: " + iterations);
    }
}
