package org.example.Starpattern.DSA;

public class Minmax {

    public static void main(String args[] ){
        int []arr = { 3,5,3,1,6,8,0,9};

        int min = arr [0];
        int max = arr[0];

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max ){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}





//pseudocode
//
//min = arr[0];
//max = arr[0];
//
//for (i = 0 ; i < n ; i++)
//    if arr[i]< min;
//        min = arr[i];
//
//    if arr[i]>max
//        max = arr[i]