import java.util.Arrays;

class Student{
    int id;
    String name;
    double cgpa;

    Student(int id,String name,double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}
public class Main {
    public static void main(String[] args) {

        int[] arrr;
        arrr = new int[5];

        //initialize array 
        arrr[0] = 2;
        arrr[1] = 4;
        arrr[2] = 8;
        arrr[3] = 12;
        arrr[4] = 16;

        //accessing all the arrays 

        for(int i = 0; i < arrr.length; i++){
            System.out.println("Element at index " + i + " is "+arrr[i] );
        }
        //-----------------------------------------------------------------------//
        //    Arrays of object   
        //----------------------------------------------------------------------//


        ///////declear array of student
        Student[] arr;

        /////alocate memory for 5 object type of student 
        arr = new Student[3];

        ///initialize the element of array 
        
        arr[0] = new Student(1, "Fuad", 3.50);
        arr[1] = new Student(2, "Alamin", 3.60);
        arr[2] = new Student(3, "Abhi", 3.49);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i].name + " has id " + arr[i].id + " with a cgpa " + arr[i].cgpa);
        }

}
}