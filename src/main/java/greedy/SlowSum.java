package greedy;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SlowSum {

        int getTotalTime(int[] arr) {
            // Write your code here

            Arrays.sort(arr);
            List<Integer> result = Arrays.stream(arr).boxed().collect(toList());
            int cost = 0;

            return getSquashedList(result, cost);

        }

        int getSquashedList (List<Integer> list, int cost){
            if(list.size() == 1){
                return cost;

            }else{
                int comodin = list.get(list.size()-1) + list.get(list.size()-2);
                list.remove(list.get(list.size()-1));
                list.remove(list.get(list.size()-1));
                list.add(comodin);
                cost = cost + comodin;
                return getSquashedList(list, cost);
            }

        }
}
