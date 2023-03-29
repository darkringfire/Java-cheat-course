package module_1.lesson_1.task_5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] sumN = new int[n], sumM = new int[m];
        Arrays.fill(sumN, 0);
        Arrays.fill(sumM, 0);
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
                sumN[i] += arr[i][j];
                sumM[j] += arr[i][j];
            }
        }
        int a = 0, b = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (sumN[i] == sumM[j]) {
                    a = i;
                    b = j;
                    cnt++;
                }
            }
        }
        if (cnt == 0) {
            System.out.println("none");
        } else if (cnt == 1) {
            System.out.printf("%1$d %2$d\n", a + 1, b + 1);
        } else {
            System.out.println("ambiguous");
        }
    }
}
