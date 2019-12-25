package geekbrains.java2;

public class Main {

    public static void main(String[] args) {
        int N = 5;
        int array[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            array[i][i] = 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.printf("%3d",array[i][j]);
            System.out.println();
        }
    }
}
