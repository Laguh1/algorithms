package search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonDuplicateTest {

    @Test
    public void findAInString(){
        char result = FirstNonDuplicate.findFirstNonDuplicate("abacabad");
        char expected = 'c';
        assertEquals(expected, result);
    }

    @Test
    public void findBInString(){
        char result = FirstNonDuplicate.findFirstNonDuplicate("aaabcccdeeef");
        char expected = 'b';
        assertEquals(expected, result);
    }
    @Test
    public void findNoneInString(){
        char result = FirstNonDuplicate.findFirstNonDuplicate("aaabbcccddeeeff");
        char expected = '_';
        assertEquals(expected, result);
    }

}