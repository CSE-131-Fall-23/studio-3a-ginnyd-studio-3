package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = in.nextInt();

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int j = 2; j <= n; j++) {
            if (isPrime[j]) {
                System.out.print(j + " ");
            }
        }
    }
}
