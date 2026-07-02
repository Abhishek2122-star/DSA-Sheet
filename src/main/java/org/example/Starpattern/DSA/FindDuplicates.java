package org.example.Starpattern.DSA;
import java.util.*;

public class FindDuplicates {

    public static void main(String args[]){
        int []arr = { 2,3,4,5,6,7,8,2,4,5};

        // we use HashSet for store the elements
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0 ; i < arr.length ; i++){
            if (!seen.add(arr[i])){
                duplicates.add(arr[i]);
            }
        }
        System.out.println(duplicates);

    }
}
