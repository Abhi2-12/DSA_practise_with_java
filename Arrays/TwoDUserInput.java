package Arrays;
import java.util.Scanner;

public class TwoDUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //////take number form user for row and colum
        
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter number of colum : ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.err.println("Enter element of array ");
        for (int i = 0; i < row; i++){
            for(int j = 0 ; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
            
        }

        for (int i = 0; i < row; i++){
            for(int j = 0 ; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.err.println();
        }
        sc.close();
    

    }
}