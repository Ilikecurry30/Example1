// Jayanth Johnson
// Oct-27-2025

public class example1 {

    public static void main(String[] args) {
        System.out.println(countFactors(24));
        System.out.println(isPrime(27));
        System.out.println(isPrime(47));
        System.out.println(countPrime(1000));

    }

    public static int countFactors(int n) {
        int count = 0;
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static boolean isPrime(int n) {
        return countFactors(n) == 2;
    }

    public static int countPrime(int n) {
        int i = 2;
        int count = 0;
        while (i <= n) {
            if (isPrime(i) == true) {

                count++;
            }
            i++;
        }
        return count;

    }
}
