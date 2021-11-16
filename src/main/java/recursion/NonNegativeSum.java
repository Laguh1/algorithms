package recursion;


/* Given an integer n write a function that sums all non-negative integers up to n*/

public class NonNegativeSum {

    int getNonNegativeSum (int n){

        if (n==0){
            return 0;
        }

        return getNonNegativeSum(n-1)+n;

    }

}
