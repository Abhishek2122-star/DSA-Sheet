package org.example.Starpattern.DSA;
import java.util.Arrays;

public class SecondLargest{
    public static void main (String args[]){

        int[] arr = { 3,5,6,7,4,2,9};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > first){
                second = first ;
                first = arr[i];

            }else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }

        }
        System.out.println(second);
    }
}








// using sort() method


//public class SecondLargest {
//
//    public static void main(String args[]){
//        int []arr = { 3,4,5,2,1,5,6,7};
//
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length -2 ]);
//    }
//
//}
