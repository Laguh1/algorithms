package sorting;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BalancedSplit {

    boolean findIndex(int totalSum, int[] arr, int index) {

        int rightSum = 0;
        boolean isSplit = false;

        while (totalSum - rightSum > rightSum) {
            rightSum = rightSum + arr[index];

            if (totalSum - rightSum == rightSum) {
                isSplit = true;
                break;
            }

            index--;
        }
        return isSplit;

    }

    boolean balancedSplitExists(int[] arr) {

        if (arr[0] == arr.length - 1) {
            return false;
        }

        int totalSum = 0;
        for (int i : arr) {
            totalSum = totalSum + i;
        }

        return findIndex(totalSum, arr, arr.length - 1);

    }
}
