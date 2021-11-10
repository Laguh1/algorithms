package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LargestTripleProducts {

    // Add any helper functions you may need here

    int[] findMaxProduct(int[] arr) {
        int[] solution = new int[arr.length];

        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i <= arr.length - 1; i++) {
            q.add(arr[i]);

            if (i < 2) {
                solution[i] = -1;
            } else {

                int x = q.peek();
                q.remove();
                int y = q.peek();
                q.remove();
                int z = q.peek();

                solution[i] = x * y * z;

                q.add(x);
                q.add(y);

            }
        }

        return solution;

    }
}
