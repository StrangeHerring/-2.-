package geekbrains.java2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int leftSum = 0, rightSum = 0;
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            for (int j = i; j < array.length; j++) {
                rightSum += array[j];
            }
            if (leftSum == rightSum) {
                System.out.println(true);
            }
        }
    }
}

