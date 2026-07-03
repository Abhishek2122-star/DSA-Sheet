package org.example.Starpattern.DSA;

public class BuySellStock {
    public static void main(String[] args){
        int []arr = {7,1,0,6,4}; // output is 5

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0 ;

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < minprice){
                minprice = arr[i];

            }else{
                int profit = arr[i] - minprice;
                maxprofit = Math.max(maxprofit,profit);
            }

        }
        System.out.println(maxprofit);

    }
}
