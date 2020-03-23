package diagonal.line;

import java.util.Scanner;

public class SumDiagonalLineInSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of Square Matrix: ");
        int size = scanner.nextInt();
        int[][] matrixSquare = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                matrixSquare[i][j] = (int) Math.floor(Math.random()*1000);
            }
        }
        System.out.println("List index in Matrix Square: ");

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%-7d", matrixSquare[i][j]);
            }
            System.out.println();
        }

        int sumDiagonalLine = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                if (i == j)
                    sumDiagonalLine += matrixSquare[i][j];
            }
        }
        System.out.println("Sum Diagonal Line in Matrix Square is: " + sumDiagonalLine);
    }
}
