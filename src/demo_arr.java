import java.util.Scanner;

public class demo_arr {
    static int[][] matrix= new int[3][3];

    public static void main(String[] args) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column]+= (int) (Math.random()*100);
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println(" ");
        }
    }
}
