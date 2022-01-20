package search;

import java.util.*;

public class FirstNonDuplicate {

    public static char findFirstNonDuplicate (String string) {

        char[] charArr = string.toCharArray();

        Set<Character> present = new HashSet<>();

        Set<Character> unique = new HashSet<>();

        for(char thisChar: charArr){

           if(present.add(thisChar)){
               unique.add(thisChar);
           } else{
               unique.remove(thisChar);
           }

        }

        return unique.stream().findFirst().orElse('_');
    }
}
