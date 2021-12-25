package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AllcharsTest {

    @Test
    public void strings_one() {
        String[] arr_1 = {"cat","bt","hat","tree"};
        String chars_1 = "atach";
        int expected_1 = 6;
        int output_1 = new Allchars().countCharacters(arr_1, chars_1);
        Assertions.assertEquals(expected_1, output_1);
    }

}