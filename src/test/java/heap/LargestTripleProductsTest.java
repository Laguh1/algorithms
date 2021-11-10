package heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestTripleProductsTest {

    @Test
    public void arrayNUmberOne() {
        int[] arr_1 = {1, 2, 3, 4, 5};
        int[] expected_1 = {-1, -1, 6, 24, 60};
        int[] output_1 = new LargestTripleProducts().findMaxProduct(arr_1);
        Assertions.assertArrayEquals(expected_1, output_1);
    }

    @Test
    public void arrayNUmberTwo() {
        int[] arr_2 = {2, 4, 7, 1, 5, 3};
        int[] expected_2 = {-1, -1, 56, 56, 140, 140};
        int[] output_1 = new LargestTripleProducts().findMaxProduct(arr_2);
        Assertions.assertArrayEquals(expected_2, output_1);
    }

}