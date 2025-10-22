package Sorting;
import java.util.*;
import java.util.Collections;

public class buildIn {

    public static void main(String[] args) {

        //array example

        int[] nums = {2,5,3,65,4,98,3,};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        //list example

        List<Integer> list = new ArrayList<>(Arrays.asList(5,3,8,1));

        Collections.sort(list);
        System.out.println("Shorted list: " + list);

    }
}