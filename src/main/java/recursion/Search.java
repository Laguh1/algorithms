package recursion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* given a reppsitory of key words and a search query
* starying from the first two characters of the serahc query find up to three best matches in the repository
* soted alpahbeticalcyy*/

public class Search {

    List<List<String>> findSuggestions (List<String> repository, String query){
        List<List<String>> result = new ArrayList<>() ;

        Collections.sort(repository);



        return result;
    }

    int binarySearch(List<String> repository, char x, int intitialIndex, int finalIndex){

        if(repository.get((finalIndex-intitialIndex)/2).charAt(0)==x){
            return finalIndex-intitialIndex/2;
        }

        if(repository.get(finalIndex-intitialIndex/2).charAt(0)>x){
            return binarySearch(repository, x, intitialIndex, finalIndex-intitialIndex)/2)
        }

        if(repository.get(finalIndex-intitialIndex/2).charAt(0)<x){
            return binarySearch(repository, x, intitialIndex, finalIndex-intitialIndex)/2)
        }

    }
}
