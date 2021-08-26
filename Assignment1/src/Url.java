import java.util.*;
import java.lang.*;

public class Url {
    Map<String, Integer> wordFrequencyMap = new HashMap<>();

    //getter and setter methods
    public Map<String, Integer> getWordFrequencyMap() {
        return wordFrequencyMap;
    }

    public void setWordFrequencyMap(String url) {
        wordFrequencyMap = makeWordFrequencyMap(url);
    }

    //This function takes url as an input and stores the frequency of given words in words.txt file
    public Map<String, Integer> makeWordFrequencyMap(String url) {
        HashMap<String, Integer> hm = new HashMap<>();
        Fetcher ft = new Fetcher();//for fetching data
        Reader rd = new Reader();//for reading data
        Count ct = new Count();//for counting word count
        rd.setAllWords();
        ft.setContent(url);
        String str = ft.getContent();
        for (String word : rd.getAllWords()) {
            ct.setWordOccurrence(word, str);
            hm.put(word, ct.getWordOccurrence());
        }
        return hm;
    }

}
