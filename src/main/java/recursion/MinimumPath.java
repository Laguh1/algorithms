package recursion;

public class MinimumPath {

    static int getMinimumPath(int n , int m){

        if (n == 0 || m == 0){
            return 0;
        }
        if (n == 1 || m == 1){
            return 1;
        }

        return getMinimumPath(n-1, m)+getMinimumPath(n, m-1);
    }
}
