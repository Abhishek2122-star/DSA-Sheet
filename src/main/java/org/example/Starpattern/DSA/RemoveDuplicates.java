package org.example.Starpattern.DSA;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){
        int [] arr = {2,3,4,5,6,7,3,4};

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++ ){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
