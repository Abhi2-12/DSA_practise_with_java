package Sorting;

public class bubble {

    static class BubbleSort{

        void bubbleSort(int arr[]){
            for(int i = 0; i < arr.length -1; i++){
                for (int j = 0; j < arr.length -i -1;j++){
                    if (arr[j] > arr[j + 1]) {

                        ///swap arr[j] and arr[j+1] 
                        
                        int temp = arr[j];
                        arr[j] = arr[j+ 1];
                        arr[j + 1] = temp;
                    }
                }

            }
        }
    }



    public static void main(String args[]){

        BubbleSort ob = new BubbleSort();
        int a[] = {25,55,65,87,5,7};

        ob.bubbleSort(a);

        for(int i = 0; i< a.length; ++i)
        System.out.print(a[i] + "  ");

    
}
}