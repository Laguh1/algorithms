package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumPathTest {

    @Test
    public void path_one() {
        int n_1 = 4;
        int expected_1 = 10;
        int output_1 = new NonNegativeSum().getNonNegativeSum(n_1);
        Assertions.assertEquals(expected_1, output_1);
    }

    @Test
    public void path_two() {
        int n_2 = 7;
        int expected_2 = 28;
        int output_2 = new NonNegativeSum().getNonNegativeSum(n_2);
        Assertions.assertEquals(expected_2, output_2);
    }

}