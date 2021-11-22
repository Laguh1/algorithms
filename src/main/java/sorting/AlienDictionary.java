package sorting;

public class AlienDictionary {

    public boolean isAlienSorted( String[] words, String order){
        int currentMaxValue = 0;
        int wordValue= 0;
        for(String word: words){
            char[] charArray = word.toCharArray();
            for (char character: charArray){
                wordValue += order.indexOf(character);
            }
            if(currentMaxValue<=wordValue){
                currentMaxValue=wordValue;
                wordValue=0;
            } else {
                return false;
            }
        }

        return true;
    }
}
