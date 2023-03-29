package module_1.lesson_1.task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> primes = new ArrayList<>(n);
        int x = 1;
        primes.add(2);
        while (n > primes.size()) {
            x += 2;
            boolean isPrime = true;
            for (Integer prime : primes) {
                if (prime > Math.sqrt(x)) {
                    break;
                }
                if (x % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(x);
            }
        }
        System.out.println(primes.get(n-1));
    }
}
