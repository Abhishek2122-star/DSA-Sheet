package org.example.Starpattern.DSA;
import java.util.Arrays;

public class ReverseArr {
    public static void main (String args[]){

        int []Arr = { 3,5,6,7,2,1};

        int left = 0 ;
        int right = Arr.length-1;

        while (left < right){

            int temp = Arr[left];
            Arr[left] = Arr[right];
            Arr[right] = temp;

            left ++ ;
            right -- ;
        }
        System.out.println(Arrays.toString(Arr));

    }
}







///  solution with using an extra array

//import java.util.Arrays;
//
//public class ReverseArray {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int n = arr.length;
//
//        int[] reversed = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            reversed[i] = arr[n - 1 - i];
//        }
//
//        System.out.println(Arrays.toString(reversed));
//    }
//}