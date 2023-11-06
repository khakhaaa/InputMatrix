package ProjectLatihan;

import java.util.Scanner;

public class inputOrdoMtx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris,kolom,nilai = 0;
        int matrixA[][];

        System.out.println("Masukkan Ordo Matrix");
        System.out.print("Jumlah baris = ");
        baris = input.nextInt();
        System.out.print("Masukkan kolom = ");
        kolom = input.nextInt();

        int matrix[][] = new int[baris][kolom];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Masukkan nilai matrix baris "+(i+1)+" kolom "+(j+1)+":");
                matrix[i][j] = input.nextInt();
            }
            for (int k = 0; k < matrix.length; k++) {
                for (int l = 0; l < matrix[k].length; l++) {
                    System.out.print(matrix[k][l]+", ");
                }
                System.out.println();
            }
        }
    }
}
