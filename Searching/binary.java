package Searching;

public class binary {

    static int binarySearch(int arr[], int x){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high-low) / 2;

            //check if is in middle 
            if(arr[mid] == x)
            return mid;

            // if x greater ,ignore left 

            if( arr[mid] < x)
            low = mid + 1;

            //if x is smaller ,igmore right 

            else
            high = mid - 1;
        } 

        //if it reach hare its not their
        return -1;
    }

   public static void main(String[] args){
    int arr[] = {1,2,3,4};
    int x = 3;

    int result = binarySearch(arr, x);
    if(result == -1)
    System.out.println("element is not their");
    else
    System.out.print("element is present at index  : "+ result);


   } 

    
}