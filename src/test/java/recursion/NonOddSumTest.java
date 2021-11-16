package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NonOddSumTest {
    @Test
    public void integer_one() {
        int n_1 = 4;
        int expected_1 = 6;
        int output_1 = new NonOddSum().getNonOddSum(n_1);
        Assertions.assertEquals(expected_1, output_1);
    }

    @Test
    public void integer_two() {
        int n_2 = 7;
        int expected_2 = 12;
        int output_2 = new NonOddSum().getNonOddSum(n_2);
        Assertions.assertEquals(expected_2, output_2);
    }


}