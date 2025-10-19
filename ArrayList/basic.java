package ArrayList;
import java.util.*;

public class basic {

    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println(list);


    ////creating array of string type
    
    ArrayList<String> a = new ArrayList<>();

    //adding element 

    a.add("Abhi");
    a.add("Abhi");
    a.add("Abhi");

    System.out.println("Original list :  "+a);

    //add in aspecific index

    a.add(1,"abir");

    System.out.println("after adding element at import 1 : "+ a );


    //removing using index mumber 

    a.remove(0);

    System.out.println("After removing from index 0 : " + a);

    ///Remove using value
    
    a.remove("Abhi");
    System.out.println("Removing by value : "+ a);

    ///Updating value at index 
    a.set(0, "Jubair");
    System.out.println("Updating value at index 0 : "+ a);

    }
}
