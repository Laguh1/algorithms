package practiceam;

import java.io.BufferedReader;
import java.io.BufferedWriter;

public class freshPromo {
}
class Result {

    /*
     * Complete the 'foo' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY codeList
     *  2. STRING_ARRAY shoppingCart
     */

    public static int foo(List<String> codeList, List<String> shoppingCart) {
        // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int codeListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> codeList = IntStream.range(0, codeListCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int shoppingCartCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> shoppingCart = IntStream.range(0, shoppingCartCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int result = Result.foo(codeList, shoppingCart);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

