import java.io.*;
import java.util.ArrayList;

class Reader {

    ArrayList<String>allUrls;
    ArrayList<String>allWords;

    public void setAllWords()
    {
        allWords=readWords();
    }
    public void setAllUrls()
    {
        allUrls=readUrls();
    }
    public ArrayList<String> getAllWords()
    {
        return allWords;
    }
    public ArrayList<String> getAllUrls()
    {
        return allUrls;
    }

    public ArrayList<String> readUrls()
    {
        ArrayList<String>urls=new ArrayList<>();
        try {
            File myfile= new File("Assignment1/src/url.txt");
            FileReader fileReader=new FileReader(myfile);

            BufferedReader reader=new BufferedReader(fileReader);

            String line;
            while((line = reader.readLine())!=null)
            {
                urls.add(line);
            }
            reader.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return urls;
    }

    public ArrayList<String> readWords()
    {
        ArrayList<String>words=new ArrayList<>();
        try {
            File myfile= new File("Assignment1/src/words.txt");
            FileReader fileReader=new FileReader(myfile);

            BufferedReader reader=new BufferedReader(fileReader);

            String line;
            while((line = reader.readLine())!=null)
            {
                words.add(line);
            }
            reader.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return words;
    }
}
