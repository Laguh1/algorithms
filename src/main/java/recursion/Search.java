package recursion;


import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* given a reppsitory of key words and a search query
 * starying from the first two characters of the serahc query find up to three best matches in the repository
 * soted alpahbeticalcyy*/

public class Search {

    List<List<String>> findSuggestions(List<String> repository, String query) {
        List<List<String>> result = new ArrayList<>();

        Collections.sort(repository);
        int indexInRepo;
        int originalIndexInRepo = 0;

        for (int charIndex = 0; charIndex < query.length(); charIndex++) {
            List<String> matches = new ArrayList<>();
            indexInRepo = originalIndexInRepo;
            while (matches.size() < 4 && indexInRepo < repository.size()) {
                if (charIndex < repository.get(indexInRepo).length() && repository.get(indexInRepo).charAt(charIndex) == query.charAt(charIndex)) {
                    matches.add(repository.get(indexInRepo));
                    System.out.println(repository.get(indexInRepo)+" matches size: "+matches.size());
                    if (matches.size() == 1 && charIndex == 0) {
                        originalIndexInRepo = indexInRepo;
                        System.out.println(originalIndexInRepo);
                    }

                    if (charIndex >= repository.get(indexInRepo).length() || repository.get(indexInRepo).charAt(charIndex) > query.charAt(charIndex)) {
                        System.out.println("break");
                        break;
                    }
                    indexInRepo++;

                }

            }
            result.add(matches);
        }
        return result;
    }
}



        /*

        List<String> matches = new ArrayList<>();
        for (int index = indexInRepo; index < repository.size(); index++) {
            while (matches.size() < 4) {
                if (repository.get(index).charAt(0) == query.charAt(0) && repository.get(index).charAt(1) == query.charAt(1)) {

                    matches.add(repository.get(index));
                    result.add(matches);
                    indexInRepo = index;
                }
                if (repository.get(index).charAt(0) > query.charAt(0) || repository.get(index).charAt(1) > query.charAt(1)) {
                    break;
                }
            }
        }
        for (int charIndex = 3; charIndex < query.length(); charIndex++) {
            List<String> matches2 = new ArrayList<>();
            while (matches2.size() < 4) {
                for (int index = indexInRepo; index < repository.size(); index++) {
                    if (repository.get(index).charAt(charIndex) == query.charAt(charIndex)) {
                        matches2.add(repository.get(index));
                        result.add(matches2);
                        indexInRepo = index;
                        break;
                    }

                    if (repository.get(index).charAt(charIndex) > query.charAt(charIndex)) {
                        break;
                    }
                }
            }
        }

        return result;
    }

    int binarySearch(List<String> repository, char x, int initialIndex, int finalIndex) {

        if (repository.get((finalIndex - initialIndex) / 2).charAt(0) == x) {
            return finalIndex - initialIndex / 2;
        }

        if (repository.get(finalIndex - initialIndex / 2).charAt(0) > x) {
            return binarySearch(repository, x, initialIndex, (finalIndex - initialIndex) / 2);
        }

        if (repository.get(finalIndex - initialIndex / 2).charAt(0) < x) {
            return binarySearch(repository, x, initialIndex, (finalIndex - initialIndex) / 2);
        }

        return -1;

    }
}*/
