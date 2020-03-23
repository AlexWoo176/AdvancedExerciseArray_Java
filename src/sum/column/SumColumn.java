package sum.column;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of Matrix: ");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        System.out.print("Enter Column: ");
        int column = scanner.nextInt();

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                arr[i][j] = (int) Math.floor(Math.random()*100);
            }
        }
        System.out.println("List index in Array: ");

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                System.out.printf("%-7d", arr[i][j]);
            }
            System.out.println();
        }
        int sumColumn = 0;
        for (int i = 0; i < size ; i++) {
            sumColumn = sumColumn + arr[i][column];
        }
        System.out.println("Sum number of Column: " + sumColumn);
    }
}
