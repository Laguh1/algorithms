package search;

import java.util.Arrays;

public class BinarySearch {

    public static int findCorrectValue(int[] arrayOfNumbers, int x, int left, int right){

        if (arrayOfNumbers[(right+left)/2] == x){
            return x;
        }

        if(right == left){
            return -1;
        }

        if(arrayOfNumbers[(right+left)/2] > x) {
           right =  (right+left)/2;
        }

        if(arrayOfNumbers[(right+left)/2] < x) {
            left =  (right+left)/2;
        }

        return findCorrectValue(arrayOfNumbers, x, left, right);
    }

}
