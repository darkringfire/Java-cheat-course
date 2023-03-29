package module_1.lesson_1.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer min1 = null, min2 = null;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (min1 == null || x < min1) {
                min2 = min1;
                min1 = x;
            } else if (min2 == null || x < min2) {
                min2 = x;
            }
        }
        System.out.print(min2);
    }
}
