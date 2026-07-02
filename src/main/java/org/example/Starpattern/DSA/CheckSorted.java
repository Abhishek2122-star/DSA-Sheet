package org.example.Starpattern.DSA;
import java.util.Arrays;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted);
    }
}





// this code is working with the using sorting technique

//import java.util.Arrays;
//
//public class CheckSorted {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//
//        int[] copy = arr.clone();
//        Arrays.sort(copy);
//
//        boolean isSorted = Arrays.equals(arr, copy);
//
//        System.out.println(isSorted);
//    }
//}
