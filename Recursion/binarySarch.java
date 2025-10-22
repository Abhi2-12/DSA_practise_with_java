package Recursion;

public class binarySarch {

    static int binarySarchRecursive(int arr[],int low,int high,int x){
        if(high >= low) {
            int mid = low + (high - low) / 2;

            //if element in the middle 
            if(arr[mid] == x)
            return mid;

            //if eklement smaller than mid ,then it olny present in mid 
            if(arr[mid] > x)
            return binarySarchRecursive(arr, low, mid - 1, x);

            return binarySarchRecursive(arr, mid + 1, high, x);
        }

        return -1;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8};
        int x = 7;
        int n = arr.length;

        int result = binarySarchRecursive(arr, 0, n-1, x);
        if (result == -1)
            System.out.println("element not present ");

        else 
            System.out.println("element is present at index "+ result);


    }

    
}