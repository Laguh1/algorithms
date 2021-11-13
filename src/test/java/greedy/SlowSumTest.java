package greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SlowSumTest {

    @Test
    public void ArrayOne() {
        int[] arr_1 = {4, 2, 1, 3};
        int expected_1 = 26;
        int output_1 = new SlowSum().getTotalTime(arr_1);
        Assertions.assertEquals(expected_1, output_1);
    }

    @Test
    public void ArrayTwo() {
        int[] arr_2 = {2, 3, 9, 8, 4};
        int expected_2 = 88;
        int output_2 = new SlowSum().getTotalTime(arr_2);
        Assertions.assertEquals(expected_2, output_2);
    }

}