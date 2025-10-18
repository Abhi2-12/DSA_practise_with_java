import java.util.Arrays;
public class Areray_Sum{

    public static void main(String args[]){

        int arr[] = {5,8,2,85,2,58,2};
        sum(arr);

    }

    public static void sum(int[] arr)
    {
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
            sum += arr[i];

         System.out.println("Sum of the array " + sum);
    }
 
}