package strings;

public class Allchars {

    public int countCharacters(String[] words, String chars) {
        int totalLength = 0;

        for(String word : words){
            for (int index = 0; index<word.length(); index++ ){
                if(!chars.contains(word.substring(index, index+1))){
                    break;
                } else {
                    chars = chars.replace(word.substring(index, index+1),"");
                    totalLength++;
                }
            }
        }
        return totalLength;
    }
}
