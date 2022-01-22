package heap;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueExercise {


        public static void main(String[] args) {
            // Write your code here

            List<String> listOfValues = List.of("10","5","2","90","56","3","33","12","95");
            PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
            priorityQueue.addAll(listOfValues);

            while(!priorityQueue.isEmpty()){
                System.out.print(priorityQueue.poll() +" ");
            }
        }
    }

