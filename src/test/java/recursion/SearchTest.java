package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SearchTest {

    static List<String> repository;
    static List<List<String>> result = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        repository = Stream.of("banana","banshee", "banned", "barbacoa", "binder", "banter", "baccio", "ball").collect(Collectors.toList());
        result.add(Stream.of("baccio", "ball", "banana").collect(Collectors.toList()));

    }


    @Test
    public void getCorrectSuggestions(){

        Search search = new Search();
        List<List<String>> suggestions = search.findSuggestions(repository, "banana");
        Assertions.assertEquals(result, suggestions);
    }


}