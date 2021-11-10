package heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class CandyBags {

    int maxCandies(int[] arr, int k) {

        int solution = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.addAll(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        while (k>0) {
            int x = queue.poll();
            solution = solution + x;
           k--;

        }

        return solution;

    }
}

