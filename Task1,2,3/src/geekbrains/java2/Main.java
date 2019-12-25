package geekbrains.java2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] array = new int[20];
	for (int i = 0; i < array.length; i++){
	    array[i] = (int)(Math.random() * 10);
	}
	for (int i = 0; i < array.length; i++){
		if(array[i] == 0){
			array[i] = 1;
		} else if(array[i] == 1) {
			array[i] = 0;
		}
	}
	System.out.println(Arrays.toString(array));

	for(int i = 0; i < array.length; i++){
		if(array[i] == 0) {
			array[i] = array[i-1] + 3;
		}
	}
	System.out.println(Arrays.toString(array));

	for(int i = 0; i < array.length; i++){
		if (array[i] < 6){
			array[i] = array[i] * 2;
		}
	}
	System.out.println(Arrays.toString(array));
	}
}
