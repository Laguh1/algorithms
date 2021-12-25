package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AlienDictionaryTest {

    @Test
    public void IsSorted() {
        String arr_1[] = {"hello","leetcode"};
        String order_1 = "hlabcdefgijkmnopqrstuvwxyz";
        boolean expected_1 = true;
        boolean output_1 = new AlienDictionary().isAlienSorted(arr_1, order_1);
        Assertions.assertEquals(expected_1, output_1);
    }

    @Test
    public void IsNotSorted() {
        String arr_2[] = {"word","world","row"};
        String order_2 = "worldabcefghijkmnpqstuvxyz";
        boolean expected_2 = false;
        boolean output_2 = new AlienDictionary().isAlienSorted(arr_2, order_2);
        Assertions.assertEquals(expected_2, output_2);
    }

    @Test
    public void IsNotSortedAgain() {
        String arr_3[] = {"apple","app"};
        String order_3 = "abcdefghijklmnopqrstuvwxyz";
        boolean expected_3 = false;
        boolean output_3 = new AlienDictionary().isAlienSorted(arr_3, order_3);
        Assertions.assertEquals(expected_3, output_3);
    }

    @Test
    public void IsNotSortedAgainAgain() {
        String arr_3[] = {"kuvp","q"};
        String order_3 = "abcdefghijklmnopqrstuvwxyz";
        boolean expected_3 = false;
        boolean output_3 = new AlienDictionary().isAlienSorted(arr_3, order_3);
        Assertions.assertEquals(expected_3, output_3);
    }

}