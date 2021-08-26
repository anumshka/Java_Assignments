import java.io.*;
import java.util.ArrayList;

public class Reader {

    //This class is responsible for reading files words.txt and url.txt
    ArrayList<String> allUrls;
    ArrayList<String> allWords;

    //sets all the words in an ArrayList
    public void setAllWords() {
        allWords = readWords();
    }

    //sets all the urls in an arraylist
    public void setAllUrls() {
        allUrls = readUrls();
    }


    public ArrayList<String> getAllWords() {
        return allWords;
    }

    public ArrayList<String> getAllUrls() {
        return allUrls;
    }

    //The function reads urls from the given file(url.txt) and returns the arraylist
    public ArrayList<String> readUrls() {
        ArrayList<String> urls = new ArrayList<>();
        try {
            File myfile = new File("Assignment1/src/url.txt");
            FileReader fileReader = new FileReader(myfile);

            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                urls.add(line);
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return urls;
    }

    //The function reads words from the given file(words.txt) and returns the arraylist
    public ArrayList<String> readWords() {
        ArrayList<String> words = new ArrayList<>();
        try {
            File myfile = new File("Assignment1/src/words.txt");
            FileReader fileReader = new FileReader(myfile);

            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line);
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return words;
    }
}
