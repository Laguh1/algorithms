package search;

import java.util.Arrays;

public class BinarySearch {

    public static int findCorrectValue(int[] arrayOfNumbers, int x, int left, int right){

        if (arrayOfNumbers[(right+left)/2] == x){
            return x;
        }

        if(right - left <=1){
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

    public static int enhancedFindCorrectValue(int[] arrayOfNumbers, int x, int left, int right){
        int mid = left + (right-left)/2;

        if(right < left){
            return -1;
        }

        if (arrayOfNumbers[mid] == x){
            return mid;
        }
        else if(arrayOfNumbers[mid]<x){
            return enhancedFindCorrectValue(arrayOfNumbers, x, mid+1, right);
        }

        else {
            return enhancedFindCorrectValue(arrayOfNumbers, x, left, mid -1);
        }
    }

}
