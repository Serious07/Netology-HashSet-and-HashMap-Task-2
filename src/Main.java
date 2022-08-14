import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) throws Exception {
        WordsChecker wordsChecker = new WordsChecker(loremIpsum);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("Введите искомое слово во фразе:");
            String wordFromConsole = reader.readLine();

            if(wordsChecker.hasWord(wordFromConsole)){
                System.out.println("Слово " + wordFromConsole + " содержится в строке!");
            } else {
                System.out.println("Слово " + wordFromConsole + " отсутствует в строке!");
            }
        }
    }
}
