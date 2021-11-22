package miscellanea;

public class Random {

    public static int pageCount(int n, int p) {
        // Write your code here
        if(n==p || p==1){
            return 0;
        }
        int fromFirst = p/2;
        int fromLast = (n-p)/2;
        System.out.println(fromLast+" "+fromFirst);
        return Math.min(fromFirst,fromLast);
    }
    public static void main(String[] args){
        pageCount(6,4);
    }
}


