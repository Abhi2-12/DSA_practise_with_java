package Searching;

public class Linear {

    // function for linear search
    public static int search(int arr[],int x){

        int n = arr.length;

        ///traverse through array 
        for (int i = 0; i < arr.length;i++){

            if(arr[i] == x)
            return i;
        }
        return -1;
    }


    public static void main(String[] args){

        // given array
        int arr[] ={1,2,3,4,5};
        int n = 3;

        //function call

        int result = search(arr, n);
        
        if (result == -1){
            System.out.println("Not found");
        }else{
            System.out.println("element present at index "+result);
        }


    }

    
}