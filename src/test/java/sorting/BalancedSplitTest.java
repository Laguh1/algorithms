package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalancedSplitTest {

    @Test
    public void ThereIsBalancedSplit() {
        int arr_1[] = {2, 1, 2, 5};
        boolean expected_1 = true;
        boolean output_1 = new BalancedSplit().balancedSplitExists(arr_1);
        Assertions.assertEquals(expected_1, output_1);
    }

    @Test
    public void ThereIsNotBalancedSplit() {
        int arr_2[] = {3, 6, 3, 4, 4};
        boolean expected_2 = false;
        boolean output_2 = new BalancedSplit().balancedSplitExists(arr_2);
        Assertions.assertEquals(expected_2, output_2);
    }

}