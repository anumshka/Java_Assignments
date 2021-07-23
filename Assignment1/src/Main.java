import java.util.*;

public class Main {

    public static void main(String[] args) {
        Reader rd = new Reader();
        Fetcher ft = new Fetcher();
        Count ct = new Count();
        Url url = new Url();
        rd.setAllUrls();
        rd.setAllWords();
        int wordCount;

        //Output 1: to process each url one by one

        System.out.println("Output #1");
        System.out.println("========");
        for (String eachUrl : rd.getAllUrls()) {
            System.out.println(eachUrl);
            url.setWordFrequencyMap(eachUrl);
            Map<String, Integer> hm = url.getWordFrequencyMap();
            hm = SortByValue.sortByValue(hm);

            //times variable here is used to print top three entries of the map

            int times = 3;
            for (Map.Entry<String, Integer> en : hm.entrySet()) {

                if (times > 0)
                    System.out.println(en.getKey() +
                            "- " + en.getValue());

                else {
                    break;
                }
                times--;
            }
        }
        System.out.println("==============================");

        //Output 2: to process each word in all the given urls
        System.out.println("Output #2");
        System.out.println("========");
        for (String word : rd.getAllWords()) {
            wordCount = 0;
            for (String eachUrl : rd.getAllUrls()) {
                ft.setContent(eachUrl);
                wordCount = wordCount + ct.findWordOccurrence(word, ft.getContent());
            }
            System.out.println(word + "- " + wordCount);
        }
    }


}