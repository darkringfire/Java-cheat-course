package module_1.lesson_1.task_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextBigInteger().subtract(in.nextBigInteger()));
    }
}
