package search;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void find10(){
        int[] array = {3,8,1,78,3, 8, 54, 3, 2, 2, 28, 65,10,55,23,7,92};
        Arrays.sort(array);
        int result = BinarySearch.findCorrectValue(array, 10, 0, array.length);
        assertEquals(10, result);
    }

    @Test
    public void find104(){
        int[] array = {3,8,1,104,78,3, 8, 54, 3, 2, 2, 28, 65,10,55,23,7,92, 7, 5, 45, 3, 2, 6, 66,89};
        Arrays.sort(array);
        int result = BinarySearch.findCorrectValue(array, 104, 0, array.length);
        assertEquals(104, result);
    }

    @Test
    public void donNotFind106(){
        int[] array = {3,8,1,104,78,3, 8, 54, 3, 2, 2, 28, 65,10,55,23,7,92, 7, 5, 45, 3, 2, 6, 66,89};
        Arrays.sort(array);
        int result = BinarySearch.findCorrectValue(array, 106, 0, array.length-1);
        assertEquals(-1, result);
    }

    @Test
    public void enhancedDoNotFind106(){
        int[] array = {3,8,1,104,78,3, 8, 54, 3, 2, 2, 28, 65,10,55,23,7,92, 7, 5, 45, 3, 2, 6, 66,89};
        Arrays.sort(array);
        int result = BinarySearch.enhancedFindCorrectValue(array, 106, 0, array.length-1);
        assertEquals(-1, result);
    }

    @Test
    public void enhancedFind104(){
        int[] array = {3,8,1,104,78,3, 8, 54, 3, 2, 2, 28, 65,10,55,23,7,92, 7, 5, 45, 3, 2, 6, 66,89};
        Arrays.sort(array);
        int result = BinarySearch.enhancedFindCorrectValue(array, 104, 0, array.length-1);
        assertEquals(104, result);
    }

}