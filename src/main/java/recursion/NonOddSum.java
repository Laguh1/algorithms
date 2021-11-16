package recursion;

/* Given an integer n write a function that sums all non-negative and non odd integers up to n*/

public class NonOddSum {

    int getNonOddSum (int n){

        if (n == 0){
            return 0;
        }


        if (n%2!=0){
            n = n - 1;
        }

        return getNonOddSum(n-2)+n;
    }
}
