import java.util.HashSet;

public class WordsChecker {
    private HashSet<String> wordsInPhrase = new HashSet<>();

    public WordsChecker(String phrase){
        String wordInPhraseLowerCase = phrase.toLowerCase();
        String[] words = wordInPhraseLowerCase.split("\\P{IsAlphabetic}+");

        for(String word : words){
            wordsInPhrase.add(word);
        }
    }

    public boolean hasWord(String word){
        return wordsInPhrase.contains(word.toLowerCase());
    }
}