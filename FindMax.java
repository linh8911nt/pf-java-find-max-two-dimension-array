import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
//        int[][] matrix = {
//                {2,6,2},
//                {8,3,6},
//                {1,5,3}
//        };
//        int max = matrix[0][0];
//        int row, col;
//        for (row = 0; row < matrix.length; row++){
//            for (col = 0; col < matrix[row].length; col++) {
//                if (max < matrix[row][col])
//                    max = matrix[row][col];
//            }
//        }
//        System.out.println("Max: " + max);
        int row,col;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter row: ");
        row = input.nextInt();
        System.out.println("Enter colum: ");
        col = input.nextInt();

        int[][] matrix = new int[row][col];
        for (row = 0; row < matrix.length; row++){
            for (col = 0; col < matrix[row].length; col++){
                System.out.println("Element row " + row + " colum " + col);
                matrix[row][col] = input.nextInt();
            }
        }
        int max = matrix[0][0];
        for (row = 0; row < matrix.length; row++){
            for (col = 0; col < matrix[row].length; col++) {
                if (max < matrix[row][col])
                    max = matrix[row][col];
            }
        }
        for (row = 0; row < matrix.length; row++){
            for (col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Element max = " + max);
    }
}
