import java.util.Scanner;
public class RowColumnSum {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = obj.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = obj.nextInt();
        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                arr[i][j] = obj.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Row sums:");
        for (int i=0;i<rows;i++) {
            int rowSum =0;
            for (int j=0;j<cols;j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Sum of row " + (i+1) + " = " + rowSum);
        }
        System.out.println("Column sums:");
        for (int j=0;j<cols;j++) {
            int colSum = 0;
            for (int i=0;i<rows;i++) {
                colSum += arr[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " = " + colSum);
        }
        obj.close();
    }
}

