package geekbrains.java2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] array = new int[]{6, 1, 7, 6, 9, 0};
	Arrays.sort(array);
	    System.out.println("min = " + array[0]);
	    System.out.println("max= " + array[5]);
    }
}
