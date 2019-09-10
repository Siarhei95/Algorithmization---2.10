package Question_10;

import java.util.Scanner;

public class question_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();
        int[][] a = new int[size][size];
        System.out.println("Enter matrix elements sequentially: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        for(int i=0; i<size;i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Positive dioganal elements: ");
        for(int i=0; i<size;i++) {
            if(a[i][i]>=0) {
                System.out.print(a[i][i] + "\t");
            }else {
                System.out.println();
                System.out.println("-");
            }
            for (int j = 0; j < size; j++) {
            }
            System.out.println();
        }
    }
}
