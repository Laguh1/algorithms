package heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CandyBagsTest {

    @Test
    public void BagNumberOne() {
        int n_1 = 5, k_1 = 3;
        int[] arr_1 = {2, 1, 7, 4, 2};
        int expected_1 = 14;
        int output_1 = new CandyBags().maxCandies(arr_1, k_1);
        Assertions.assertEquals(expected_1, output_1);
    }

    @Test
    public void BagNumberTwo() {
        int n_2 = 9, k_2 = 3;
        int[] arr_2 = {19, 78, 76, 72, 48, 8, 24, 74, 29};
        int expected_2 = 228;
        int output_2 = new CandyBags().maxCandies(arr_2, k_2);
        Assertions.assertEquals(expected_2, output_2);
    }

}