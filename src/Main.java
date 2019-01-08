//Дана квадратная матрица A[N, N]. Записать на место отрицательных
// элементов матрицы нули, а на место положительных – единицы.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        System.out.println("Введите  размер матрицы A[N,N]");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                m = (int) (Math.random() * 100 - 50);

                if (m < 0) {
                    mass[i][j] = 0;
                } else if (m > 0) {
                    mass[i][j] = 1;
                }

                System.out.print(" " + mass[i][j]);
            }

        }
    }
}















